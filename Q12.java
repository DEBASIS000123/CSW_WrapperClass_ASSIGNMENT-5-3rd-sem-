import java.util.Scanner;
public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Integer value:");
		String str=sc.next();
		try {
			int n=Integer.parseInt(str);
			System.out.println("Your Integer valus is:"+n);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
