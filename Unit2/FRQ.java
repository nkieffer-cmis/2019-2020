
/**
 * Write a description of class FRQ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FRQ
{
    public static void main(String[] argv){
        String oldSeq = "11111";
        String segment = "00";
        int idx = oldSeq.indexOf(segment);
        String newSeq = oldSeq.substring(0, idx) + oldSeq.substring(idx + segment.length());
        System.out.println(newSeq);
    }
}
