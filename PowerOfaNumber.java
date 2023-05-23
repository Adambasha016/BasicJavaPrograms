
public class PowerOfaNumber {
	public static long pow(int x,int y) {
		if(y==0) {
			return 1;
		}
		if(y%2==0) {
			int res=(int) pow(x,y/2);
			return res*res;
		}
		else {
			return pow(x,y-1)*x;
		}
	}
	public static void main(String[] args) {
		System.out.println(pow(2,4));
	}

}
