
public class RemoveDuplicate {
	
	
	
	public static void main(String[] args) {
		
		String st="Welcome to  India";
		//char[] a = st.toCharArray();
		String se=removie(st);
		System.out.println(se);
	}
	static String removie(String st){
		//char[] an = st.toLowerCase().toCharArray();
		String[] sp = st.split("\\s");
		//System.out.println(sp);
		for(String a:sp) {
			System.out.println(a);
		}
		String ans="";
		for(int k=sp.length-1;k>=0;k--)
		{
		//	if(sp[k]!=" ") {
			String as=removieOne(sp[k]);
			ans+=as;
			if(k!=0) {
				ans+=" ";
			//}	
			}
		}
		return ans;
	}
	static String removieOne(String sr) {
		
		char[] mkr = sr.toCharArray();
		int i=0,j=mkr.length-1;
		
		while(i<j) {
			char temp=mkr[i];
			mkr[i]=mkr[j];
			mkr[j]=temp;
			i++;
			j--;
		}
		
		
		return new String(mkr);
		}
	
	

}
