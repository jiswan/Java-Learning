
public class StudentLearning {

	int roll;
	String name;
		
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	void display()
	{
		System.out.print(roll+"\n"+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentLearning student = new StudentLearning();
		student.setName("jiswan");
		student.setRoll(1);
		student.display();
		
	}

}
