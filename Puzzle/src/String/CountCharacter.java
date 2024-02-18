package String;

public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Muhammed Jiswan";
		String s2 = "j";
		s1 = s1.toLowerCase();
		int length = s1.length() - (s1.replaceAll(s2, "").length());
		System.out.print("Count of Caharacter "+s2+" in "+s1+" is "+length);
	}

}
