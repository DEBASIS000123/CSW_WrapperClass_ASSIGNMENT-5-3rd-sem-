import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Double Number :");
		double n=sc.nextDouble();
		Double ob=n;
		Double ob1=new Double(ob);
		Double ob2=Double.valueOf(n);
		
		System.out.println(ob2);
	}

}
