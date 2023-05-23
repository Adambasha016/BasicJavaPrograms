
public class ObjectArray {

	public static void main(String[] args) {
		Object arr[]= {1,2,new Object[] {4,new int[] { 5,6},7},10};
		String s="";
		String st = arr.toString();
		for(int i=0;i<st.length();i++) {
			
		System.out.print(st.charAt(i));
		}
		for(int i=0;i<arr.length;i++) {
			if((Integer)(arr[i])>='1'||(Integer)(arr[i])<='9') {
				
				System.out.println(arr[i]);
			}
		}
		
		
		// TODO Auto-generated method stub

	}

}
