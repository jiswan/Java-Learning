package String;

public class StringLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "jiswan";
		System.out.println(s1.hashCode());
		s1 = s1+"muhammed";
		System.out.println(s1.hashCode());
		
		
		String s2 = "jiswan";
		System.out.println(s2.hashCode());
		
		String s3 = new String("jiswan");
		System.out.println(s3.hashCode());
		s3 =s3+"world";
		System.out.println(s3.hashCode());		
	}

}
