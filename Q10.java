import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two nubers :");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("Enter the operator :");
		char c=sc.next().charAt(0);
		
		switch(c) {
		case '+':System.out.println("Sum="+(n1+n2));
		break;
		case '-':System.out.println("substraction="+(n1-n2));
		break;
		case '*':System.out.println("mutification="+(n1*n2));
		break;
		case '/':System.out.println("divide="+(n1/n2));
		break;
		}
	}

}
