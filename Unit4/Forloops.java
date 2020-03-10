public class Forloops
{
    public static void main(String[] argv){
        String m = map(5, 4, "^~.T&jasdf");
        System.out.println(m);
        System.out.println(readMap(5,3, m));
        System.out.println(readMap(0,1, m));
        System.out.println(table(5, 5, 4));

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static String table(int rows, int cols, int op){
        String out = "";
        for(int y = 0; y < rows; y++){
            for(int x = 0; x < cols; x++){
                if(op == 0){
                    out += x + y + " ";
                }else if(op == 1){
                    out += x - y + " ";
                }else if(op == 2){
                    out += x * y + " ";
                }else if(op == 3){
                    if(y == 0){
                        out += "e ";
                    }else{
                        out += x / y + " ";
                    }

                }else if(op == 4){
                    out += Math.pow(x, y) + " ";
                }

            }
            out += "\n";
        }
        return out;
    }

    public static String map(int height, int width, String symbols){
        String out = "";
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                int index = (int)(Math.random() * symbols.length());
                String l = symbols.substring(index, index+1);
                out += l;
            }
            out += "\n";
        }
        return out;
    }

    public static int rowCt(String map){
        int idx = map.indexOf("\n");
        String sm = map.substring(idx);
        int ct = -1;
        while (idx >= 0){

            idx = sm.indexOf("\n");
            sm = sm.substring(idx+1);
            ct++;
        }
        return ct;
    }

    public static int colCt(String map){
        int cols = map.indexOf("\n");
        return cols;
    }

    public static String readMap(int y, int x, String map){
        int rows = rowCt(map);
        int cols = colCt(map);
        if(y < 0 || y >= rows ||
        x < 0 || x >= cols){
            return "error";
        }
        int idx = ((cols + 1) * y) + (x);
        return map.substring(idx, idx + 1);

    }

    public static String limitTable(int rows, int cols, int limit){
        String out = "";
        for(int y = 0; y < cols; y++){
            for(int x = 0; x < rows; x++){
                int product = x * y;
                if(product > limit){
                    x = rows;
                    out += "* ";
                } else {
                    out += product + " ";
                }
            }
            out += "\n";
        }
        return out;
    }

}
