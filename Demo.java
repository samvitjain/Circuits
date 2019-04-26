import java.io.*;
import java.util.*;
class Demo{
	public static void main(String args[])throws FileNotFoundException{
		FileInputStream fis=new FileInputStream("input.txt");
		Scanner in=new Scanner(fis);
		while(in.hasNextInt())System.out.println(in.nextInt());
	}
}