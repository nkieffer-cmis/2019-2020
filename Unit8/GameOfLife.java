public class GameOfLife
{

    public static void main(String[] argv){
        int w = 80;
        int h = 30;
        //int[][] board = getBoard(w,h,0.3);

        /*int[][] board = {{0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
                         {0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0},
                         {1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1},
                         {0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0},
                         {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0}};/**/
        int[][] board = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //board[0][board[0].length - 1]
                         {0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0}, //board[1]
                         {0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0}};/**/
        for(int i = 0; i < 100; i++){
            System.out.format("Generation: %d\n", i);
            print(board);
            board = getNextGen(board);
        }
    }

    public static int getNeighborScore(int[][] board, int y, int x){
        int score = 0;
        for(int nx = x - 1; nx < x+2; nx += 1){
            for(int ny = y - 1; ny < y + 2; ny += 1){
                if((nx != x || ny !=y) && 
                (nx >= 0 && nx < board[0].length) && 
                (ny >= 0 && ny < board.length)){
                    score += board[ny][nx];
                }
            }
        }
        return score;
    }

    /*
     * Game Of Life Rules
     * 1. Any live cell with fewer than two live neighbours dies, as if caused by under-population.
     * 2. Any live cell with two or three live neighbours lives on to the next generation.
     * 3. Any live cell with more than three live neighbours dies, as if by over-population.
     * 4. Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
     */
    public static int[][] getNextGen(int[][] board){
        int[][] nextGen = new int[board.length][board[0].length];
        for(int y = 0; y < board.length; y++){
            for(int x = 0; x < board[y].length; x++){
                int score = getNeighborScore(board, y, x);
                int cell = board[y][x];
                if(cell == 1){
                    if(score < 2){
                        nextGen[y][x] = 0;
                    }else if(score < 4){
                        nextGen[y][x] = 1;
                    }else if(score > 3){
                        nextGen[y][x] = 0;
                    }
                }else if (score == 3){
                    nextGen[y][x] = 1;
                }
            }
        }
        return nextGen;
    }

    public static int[][] getBoard(int w, int h, double prob){
        int[][] board = new int[h][w];
        for(int row = 0; row < h; row++){
            for(int col = 0; col < w; col++){
                board[row][col] = Math.random() < prob ? 1 : 0;
            }
        }
        return board;
    }

    public static void print(int[][] board){
        String out = "";
        for(int[] row: board){
            for(int col: row){
                if(col == 1){
                    out += "*";
                }else{
                    out += " ";
                }
            }
            out += "\n";
        }
        System.out.println(out);
        System.out.println("+-----------------------+");
    }

}
