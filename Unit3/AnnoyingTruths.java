public class AnnoyingTruths
{
    public static void main(String[] argv){
        String a = "asdf";
        String b = "asdfg";
        a += "g";
        System.out.println(a == b);
        System.out.println(a.equals(b));
        
        
        String c = new String("asdf");
        String d = new String("asdf");
        System.out.println(c == d);
        System.out.println(c.equals(d));
        
        
        System.out.println("asdf" == "asdf");
        System.out.println("asdf".equals("asdf"));
        System.out.println(new String("asdf") == new String("asdf"));
        System.out.println((new String("asdf")).equals(new String("asdf")));
        
        
    }
}
