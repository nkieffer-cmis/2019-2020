public class FRQ
{
    public static void main(String[] argv){
        longestStreak("CCCCAAddddddATTTTT");
    }
    
    public static void longestStreak(String str){
        String c = "";
        int longest = 0;
        for(int i = 0; i < str.length()-1; i++){
            String l = str.substring(i, i+1);
            int j = i;
            int length = 0;
            while(j < str.length() && str.substring(j, j+1).equals(l)){
                length++;
                j++;
            }
            if (length > longest){
                longest = length;
                c = str.substring(j-1, j);
            }
        }
        System.out.println(c + " " + longest);
    }
}
