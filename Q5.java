import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Interger :");
		String num=sc.next();
		try {
			Integer n=Integer.parseInt(num);
			System.out.println("The Integer you have entered is:"+n);
		}
		catch(Exception e) {
			System.out.println("Enter a valid Integer.");
		}
	}

}
