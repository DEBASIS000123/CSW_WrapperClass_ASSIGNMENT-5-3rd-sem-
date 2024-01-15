import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the boolean value :");
		boolean b=sc.nextBoolean();
		
		Boolean ob=b;
		Boolean ob1=new Boolean(b);
		Boolean ob2=Boolean.valueOf(b);
		
		System.out.println(ob1);
	}

}
