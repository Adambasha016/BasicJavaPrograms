
public class BinarySearch {
public static int binarSearch(int [] a,int key) {
	int l=0,h=a.length-1,mid=0;
	while(l<=h) {
		mid=(l+h)/2;
		if(key==a[mid]) {
			return mid;
		}
		else if(key<a[mid]) {
			h=mid-1;
		}
		else {
			l=mid+1;
		}
	}
	return -1;
}
public static void main(String[] args) {
	int []a= {3,5,6,8,12,15,16,19,21};
	int key=21;
	System.out.println(binarSearch(a, key));
}
}
