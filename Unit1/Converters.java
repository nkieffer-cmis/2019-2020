public class Converters
{
    public static void main(String[] argv){
        String bin = decToBin(0b010110100101);
        System.out.println(bin);
        int dec = binToDec(bin);
        System.out.println(dec);
    }
    
    public static int binToDec(String bin){
        int out = 0;
        for(int i = 0; i < bin.length(); i++){
            String c = bin.substring(i, i+1);
            if(c.equals("1")){
                out += Math.pow(2, bin.length() - 1 - i);
            }
        }
        return out;
    }
    
    public static String decToBin(int dec){
        int exp = 0;
        String out = "";
        while(Math.pow(2, exp) < dec){
            exp++;
        }
        
        while(exp >= 0){
            int p = (int)(Math.pow(2, exp));
            if(dec / p == 1 ){
                out += "1";
                dec = dec % p;          
            }else{
                out += "0";
            }
            exp--;
        }
        return out;
    }
}
