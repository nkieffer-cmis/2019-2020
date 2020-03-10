public class ConditionalSol
{
    public static void main(String[] argv){
        
    }
    /**
     * Return true if v is between low and high
     */
    public static boolean between(int low, int high, int v){
        return v > low && v < high;
    }
    
    /**
     * Return true if v is not between low and high
     */
    public static boolean notBetween(int low, int high, int v){
        return !between(low, high, v);
    }
    
    /**
     * Return the greatestEven number from a, b, and c
     */
    public static int greatestEven(int a, int b, int c){
        a = a - (a * a%2);  
        b = b - (b * b%2);
        c = c - (c * c%2);
        return Math.max(a, Math.max(b, c));
    }
    
    /**
     * return true if v is a multiple of both a and b
     */
    public static boolean isMultipleOf(int v, int a, int b){
        return v % a == 0 && v % b == 0;
    }
    
    /**
     * return true if s1, s2, and s3 could possibly represent the lengths of the sides of an isoscelese triangle.
     */
    public static boolean isIsoscelese(int s1, int s2, int s3){
        return s1 == s2 || s2 == s3 ||  s3 == s1;
    }
    
    /**
     * Return true if s1, s1, and s3 could represent the lengths of the sides of an equalateral triangle.
     */
    public static boolean isEqualateral(int s1, int s2, int s3){
        return s1 == s2 && s2 == s3 && s3 == s1;
    }
    
    /**
     * Return true if q, x, and c are a valid pythagorean triple (i.e. a^2 + b^2 = c^2)
     * Any combination of the three can make it valid, not necessarily in the order given.
     */
    public static boolean isPythTrip(int q, int x, int c){
        double a2 = Math.pow(q, 2);
        double b2 = Math.pow(x, 2);
        double c2 = Math.pow(c, 2);
        return (a2 + b2 == c2) || (b2 + c2 == a2) || (a2 + c2 == b2);
    }
    
    /**
     * return true if s1, s2, and s3 represent the length of the sides of a triangle.
     */
    public static boolean isTriangle(int s1, int s2, int s3){
        boolean t1 = s1 + s2 >= s3;
        boolean t2 = s2 + s3 >= s1;
        boolean t3 = s3 + s1 >= s2;
        return t1 || t2 || t3;
    }
    
    /**
     * return true if word begins and ends with ps
     */
    public static boolean isPrefixAndSuffix(String ps, String word){
        return word.startsWith(ps) && word.endsWith(ps);
    }
    
    /**
     * split the word at character c.
     * return the shorter of the 2 strings on either side of the split.
     * if they are the same length concatenate them and return
     * example:
     * c -> "c"
     * word -> "racecar"
     * return value -> "ra"
     * 
     * c -> "e"
     * word -> "racecar"
     * return -> "raccar"
     * 
     * c -> "u"
     * word -> "computer"
     * return -> "ter"
     */
    public static String shortSide(String word, String c){
        int cIndex = word.indexOf(c);
        String front = word.substring(0, cIndex);
        String back = word.substring(cIndex + 1);
        if(front.length() > back.length()){
            return front;
        }else if(front.length() < back.length()){
            return back;
        }else{
            return front+back;
        }
    }
    
    /**
     * return true if there are more than 3 occurances of c in the string word.
     * 
     * word -> "banana"
     * c -> "a"
     * return -> false
     * 
     * word -> "alabama"
     * c -> "a"
     * return -> true
     */
    public static boolean tooMany(String word, String c){
        int first = word.indexOf(" ");
        int second = word.indexOf(" ", first);
        int third = word.indexOf(" ", second);
        int fourth = word.indexOf(" ", third);
        return fourth == -1;
        
    }
}
