import java.io.BufferedReader;
import java.io.FileReader;

public class CheckedExceptionExample {

	public static void callException()
	{
		try{
			FileReader file = new FileReader("C:\\Users\\hur-admin\\Downloads\\Muhammed Jiswan Java Developer Resume.docx");
		BufferedReader data = new BufferedReader(file);
        for(int i=0;i<3;i++)
        {
        	System.out.println("Inside the file");
        	System.out.println(data.readLine());
        	data.close();
        }
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       callException();
	}

}
