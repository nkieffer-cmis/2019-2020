import java.util.Scanner;
import java.io.*;
class Mup{
    public static void main(String[] argv) throws FileNotFoundException{
	File f = new File("/home/nkieffer/2019-2020/Scratch/data.txt");
	Scanner input = new Scanner(f);
	while(input.hasNext()) {
	    System.out.format("%1$3d\n", input.nextInt());
	}
	f = new File("/tmp/a/b/c/d/e/f/g");
	f.mkdirs();
    }
}
