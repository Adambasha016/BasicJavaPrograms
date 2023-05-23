
public class RopeCutting {
	public static int maxPieces(int n,int a,int b,int c) {
		if(n==0) {
			return 0;
		}
		else if(n<0) {
			return -1;
		}
		int tepm1=maxPieces(n-a, a, b, c);
		int tepm2=maxPieces(n-b,a,b,c);
		int tepm3=maxPieces(n-c,a,b,c);
		int pieces=Math.max(tepm3,Math.max(tepm1, tepm2));

		if(pieces==-1) {
			return -1;
		}
		return pieces+1;
	}
	public static void main(String[] args) {
		System.out.println(maxPieces(15, 5, 8, 7));
	}
}
