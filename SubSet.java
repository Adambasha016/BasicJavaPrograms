
public class SubSet {
	
	
	public static int countSubset(int[] ar,int sum,int i) {
		if(sum==0) {
			return 1;
		}
		
		
		
		if(sum<0) {
			return 0;
		}
		if(i==ar.length) {
			return 0;
		}
		return countSubset(ar, sum-ar[i], i+1)+countSubset(ar, sum, i+1);
	}
	
	
	
	public static void main(String[] args) {
		int [] ar= {20,10,15,5};
		System.out.println(countSubset(ar, 25, 0));
	}

}
