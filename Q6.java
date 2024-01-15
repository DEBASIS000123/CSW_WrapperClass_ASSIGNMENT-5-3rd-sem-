import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Float value:");
		String str=sc.next();
		try {
			Float f=Float.parseFloat(str);
			System.out.println("Your Float value is :"+f);
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("Enter a valid FLoat.");
		}
	}

}
