import java.util.ArrayList;

public class Molecular1 {
	//write a java program to break input string at every 20 character .if the 20th character happend to be non-space character break till nearest space character
	public static void main(String[] args) {
		String para="We are the largest STM indexing and abstacting company from india.Our 360 solutions help publishing and pharmaceutical companies maximumze the values of their information assets.with expertise spanning across multiple domain include machine learning,text mining,literature curation,ontology development,content analytics and visualization we serve various industries with proprietary services and products.";

		int st=20;
		ArrayList al=new ArrayList<>();
		String s1="";
		int sta=0;
		int index=0;
		while(index<para.length()) {
		for(int i=sta;i<st;i++) {
			//String s1="";
			//System.out.print(para.charAt(i));
			s1=s1+para.charAt(i);
			index++;
			
		}
		char[] cs = s1.toCharArray();
		if(cs[cs.length-1]!=' ') {
			int i=0; int j=cs.length-1;
			while(i<j) {
				if(cs[j]==' ') {
					String ad="";
					for(int k=0;k<j;k++) {
                         ad=ad+cs[k];
                         System.out.print(cs[k]);
					}
					al.add(ad);
					sta=j+1;
					break;
				}
				j--;
			}
		}
		else {
			int i=0; int j=cs.length-1;
			for(int l=0;l<j;l++) {
				al.add(cs[l]);
			}
			sta=j;
		}
		st*=2;
	//  	index++;
		for(Object sd:al) {
			System.out.println(sd);
		}
		System.out.println(al	);
		}
		
		//System.out.println(al);
		
	}
}
//public class Student {
//    String name;
//    int age;
//    String[] subjects;
//    
//    public Student(String name, int age, String[] subjects) {
//        this.name = name;
//        this.age = age;
//        this.subjects = subjects;
//    }
//    
//    public String toString() {
//        return "Name: " + name + ", Age: " + age  + ", Subjects: " + String.join(", ", subjects);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        String student = "name-ram, sita, laxman&age=24, 21, 18&subject-maths | physics science, maths science, english";
//        
//        String[] studentData = student.split("&");
//        Student[] students = new Student[studentData.length];
//        
//        for (int i = 0; i < studentData.length; i++) {
//            String[] fields = studentData[i].split("-");
//            String[] values = fields[1].split(",");
//            
//            String name = values[0].trim();
//            int age = Integer.parseInt(values[1].trim());
//            String[] subjects = values[2].split("\\|");
//            for (int j = 0; j < subjects.length; j++) {
//                subjects[j] = subjects[j].trim();
//            }
//            
//            students[i] = new Student(name, age, subjects);
//        }
//        
//        for (Student s : students) {
//            System.out.println(s);
//        }
//    }
//}