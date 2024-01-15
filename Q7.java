import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Double value:");
		String str=sc.next();
		try {
			Double d=Double.parseDouble(str);
			System.out.println("Your Double Entered value is:"+d);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
