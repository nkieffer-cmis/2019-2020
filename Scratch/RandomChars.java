import java.io.*;
class RandomChars extends Reader{
    private final char[] chars;
    private final double prob;
    public static void main(String[] argv){
	RandomChars rc = new RandomChars("abcdefgh".toCharArray(), 0.85);
	char[] c = new char[10];
	System.out.println(rc.read(c, 8, 20));
	String s = new String(c);
	System.out.format("[%s]\n", s);

    }

    public RandomChars(char[] chars, double prob){
	this.chars = chars;
	this.prob = prob;
    }

    @Override
    public int read(char[] c, int off, int len){
	int ct = 0;
	while(Math.random() <= prob && off + ct < c.length && ct + 1 < len){
	    c[off+ct] = chars[(int)(Math.random() * chars.length)];
	    if (off + ct > c.length){
		return -1;
	    }
	    ct++;
	}
	return ct;
    }

    @Override
    public void close(){
	
    }

}
