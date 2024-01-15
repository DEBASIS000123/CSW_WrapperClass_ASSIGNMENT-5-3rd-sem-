import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Boolean value :");
		String str=sc.next();
		try {
			Boolean b=Boolean.parseBoolean(str);
			System.out.println("Your Boolean value is:"+b);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
