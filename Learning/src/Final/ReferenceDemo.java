package Final;

class Reference {
	private int number;
	private String text;

	public Reference(int number, String text) {
		this.number = number;
		this.text = text;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}

public class ReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reference ref, ref1;

		final Reference ref3;

		ref = new Reference(1, "this is using the first referecne ");
		int number = ref.getNumber();
		System.out.println(number);

		ref1 = new Reference(2, "using the second referecne ");
		String text = ref1.getText();
		System.out.println(text);

		ref3 = new Reference(3, "Using the third referecne");
		System.out.println(ref3.getText());

		// Already ref3 has already been assigned
		ref3 = new Reference(3, "updated message for third referecne");

	}

}
