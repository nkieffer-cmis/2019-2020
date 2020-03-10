public class Examples
{
    public static void main(String[] argv){
        String s = "ccaattt";
        longestStreak(s);

    }

    public static void longestStreak(String s){
        String current = s.substring(0,1);
        String longest = "";
        for(int i = 1; i < s.length(); i++){
            String l = s.substring(i, i+1);
            String last = current.substring(current.length() - 1);
            System.out.println(l + " " + last);
            if(l.equals(last)){
                current += l;
            }else{
                if(current.length() > longest.length()){
                    longest = current;
                }
                i++;
                current = s.substring(i, i+1);
            }
        }
        System.out.println(longest.substring(0,1)+ " "+ longest.length());
    }
}
