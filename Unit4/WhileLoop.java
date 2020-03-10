public class WhileLoop
{
    public static void main(String[] argv){
        int x = 0;
        int y = 50;
        while( -x < y){
            x -= x + 1;
            x += y - 1;
            y -= y + 1;
        }
       System.out.println(x);
       System.out.println(multTable(5, 4));
    }
    
    public static String multTable(int w, int h){
        int x = 1;
        int y = 1;
        int prod = 0;
        String out = "" ;
        while( x <= w ){
            out += "\t" + x;
            x++;
        }
        out += "\n";
        while( y <= h ){
            out += y;
            x = 1;
            while( x <= w ){
                prod = x * y;
                out += "\t" + prod;
                x++;
            }
            out += "\n";
            y++;
        }
        return out;
    }
}
