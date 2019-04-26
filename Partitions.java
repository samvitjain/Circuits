import java.util.*;
class Partitions{
	public static int[] arr;
	public static int num,low,high,count=0;
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		low=in.nextInt();
		high=in.nextInt();
		arr=new int[num];
		for(int i=0;i<num;i++){
			arr[i]=in.nextInt();
		}

		//Flag Iteration:
		for(int i=0;i<num;i++){
			int[] xyz=new int[i+1];
			test(0,i,num-1,0,xyz);
		}
		System.out.println(count);
		int[] testFlag={1};
	}

	private static void test(int d,int md,int h,int v,int[] xyz){
		int maxVal=h-(md-d);
		if(d>md){
			if(checkValid(xyz))count++;
			return;
		}
		for(int i=v+1;i<=maxVal;i++){
			xyz[d]=i;
			test(d+1,md,h,i,xyz);
		}
	}
	private static boolean checkValid(int flags[]){
		boolean ans=true;
		int sum=0;

		for(int i=0;i<flags.length-1;i++){
			sum=0;
			for(int j=flags[i];j<flags[i+1];j++){
				sum+=arr[j];
			}
			if (sum<low||sum>high)return false;
		}
		sum=0;
		for(int i=0;i<flags[0];i++){sum+=arr[i];}
			if (sum<low||sum>high){return false;}
		sum=0;
		for(int i=flags[flags.length-1];i<arr.length;i++){sum+=arr[i];}
			if (sum<low||sum>high){return false;}
		return true;
	}
}