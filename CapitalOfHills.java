import java.util.*;
import java.io.*;
class CapitalOfHills{
	public static void main(String args[])throws FileNotFoundException{
		FileInputStream fis=new FileInputStream("C:/Users/Samvit/Documents/Circuits/input.txt");
		Scanner in=new Scanner(fis);
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int max=0,c=0;
		for(int i=0;i<n-1;i++){
			max=arr[i+1];
			for(int j=i+1;j<n;j++){
				if(arr[j]<max)break;
				c++;
				if(arr[j]>max)max=arr[j];
			}
		}
		System.out.println(c);
	}
}