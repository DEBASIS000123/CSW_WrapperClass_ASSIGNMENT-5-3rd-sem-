import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Float Number:");
		float n=sc.nextFloat();
		Float ob=n;
		Float ob1=new Float(n);
		Float ob2=Float.valueOf(n);
		
		System.out.println(ob);
	}

}
