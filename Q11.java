import java.util.Scanner;
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Double value:");
		String str=sc.next();
		try {
			double d=Double.parseDouble(str);
			System.out.println("Your Double value is:"+d);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
