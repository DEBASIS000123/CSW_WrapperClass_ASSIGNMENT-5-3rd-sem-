import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		Integer ob=n;
		Integer ob1=new Integer(n);
		Integer ob2=Integer.valueOf(n);
		System.out.println(ob);
		System.out.println(ob1);
		System.out.println(ob2);
	}

}
