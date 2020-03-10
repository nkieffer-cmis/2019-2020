import java.util.Scanner;
import java.lang.*;
public class ClassesInstances
{
    public static void main(String[] argv){
        for(int i = 0; i < 10; i++){
            int a = (int)(Math.random() * 100);
            int b = (int)(Math.random() * 100);
            int c = (int)(Math.random() * 100);
            int d = (int)(Math.random() * 100);
            int e = (int)(Math.random() * 100);
            middleOfFive(a,b,c,d,e);
            System.out.println();
            //System.out.format("%d %d %d %d %d -> %d\n",
            //                    a, b, c, d, e, middleOfFive(a,b,c,d,e));
        }
    }
    
    public static int middleOfFive(int a, int b, int c, int d, int e){
        int max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
        int min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
        int notmax1 = Math.min(max, a) - max;
        int notmax2 = Math.min(max, b) - max;
        int notmax3 = Math.min(max, c) - max;
        int notmax4 = Math.min(max, d) - max;
        int notmax5 = Math.min(max, e) - max;
        System.out.format("start %d %d %d %d %d\n", a,b,c,d,e);
        int temp;
        System.out.println(min + " " + max);
        System.out.format("start %d %d %d %d %d\n", notmax1, notmax2,notmax3, notmax4, notmax5);

        return 0;
    }
    public static String binMaxInt(){
        return Integer.toHexString(Integer.MAX_VALUE);
    }
    
    public static String binDiffMax(Integer i){
        return Integer.toBinaryString(Integer.MAX_VALUE - i);
    }
    
    public static String mutant(String a, String b){
        String c = a.substring(0, a.length() / 2) + b.substring(b.length()/2);
        return c;
    }
    
    public static String triMutant(String a, String b, String c){
        String ta = a.substring(0, (int)(a.length() * 0.33));
        String tb = b.substring((int)(b.length() * 0.33), (int)(b.length() * 0.66));
        String tc = b.substring((int)(c.length() * 0.66));
        return ta + tb + tc;
    }    
    
    public static String swapEnds(String a){
        String s = String.valueOf(a.charAt(0));
        String e = String.valueOf(a.charAt(a.length()-1));
        String m = a.substring(1, a.length()-1);
        return e + m + s;
    }
    
    public static int indexOf2nd(String haystack, String needle){
        int first = haystack.indexOf(needle);
        int second = haystack.indexOf(needle, first+1);
        return second;
    }
        
    public static int indexOf2ndLast(String haystack, String needle){
        return 0;
    }
    
    public static boolean reduplication(String word){
        String firstHalf = word.substring(0, word.length() / 2);
        String secondHalf = word.substring(word.length() / 2);
        return firstHalf.equals(secondHalf);
    }
    
    public static boolean binContains(Integer i, Integer p){
        String bp1 = Integer.toBinaryString(i);
        String bp2 = Integer.toBinaryString(p);
        return bp1.contains(bp2);
        
    }
    
    public static boolean isPalindrome(Integer i){
        Integer r = Integer.reverse(i);
        String bri = Integer.toBinaryString(i);
        String brr = Integer.toBinaryString(r);
        return bri.equals(brr);
    }
    
    public static boolean cubeContainsSelf(Integer i){
        Integer cube = (int)Math.pow(i, 3);
        String is = String.valueOf(i);
        String cs = String.valueOf(cube);
        
        return cs.contains(is); 
    }
    
    public static boolean isAnagram(Integer a, Integer b){
        Integer ac = Integer.bitCount(a);
        Integer bc = Integer.bitCount(b);
        return String.valueOf(ac).equals(String.valueOf(bc));
    }
    
    public static Double maxValue(Double a, Double b, Double c, Double d){
        Double ab = Math.max(a, b);
        Double cd = Math.max(c, d);
        Double max = Math.max(ab, cd);
        return max;
    }
    
    public static Integer middleValue(Integer a, Integer b, Integer c){
        Integer ab = Math.min(a, b);
        Integer bc = Math.min(b, c);
        Integer ac = Math.min(a, c);
        Integer max1 = Math.max(ab, bc);
        Integer middle = Math.max(max1, ac);
        return middle;
    }
    

    public static int distance(int a, int b, int c){
        int dab = Math.abs(a - b);
        int dac = Math.abs(a - c);
        int dbc = Math.abs(b - c);
        return Math.max(dab, Math.max(dac, dbc));
    }
    
    public static String partialCapitalization(String haystack, String start, String stop){
        int startIdx = haystack.indexOf(start);
        int stopIdx = haystack.lastIndexOf(stop);
        System.out.println(startIdx + " " + stopIdx);
        return haystack.substring(0, startIdx + start.length())+haystack.substring(startIdx + start.length(), stopIdx).toUpperCase()+haystack.substring(stopIdx);
    }
    
    public static String capitalizeByIndex(String word, int index){
        String letter = String.valueOf(word.charAt(index));
        return word.replace(letter, letter.toUpperCase());
    }
    
    public static int binJoin(int a, int b){
        String ba = Integer.toBinaryString(a);
        String bb = Integer.toBinaryString(b);
        Integer newNum = Integer.valueOf(ba+bb, 2);
        System.out.println(ba+bb);
        return newNum;
    }
}
