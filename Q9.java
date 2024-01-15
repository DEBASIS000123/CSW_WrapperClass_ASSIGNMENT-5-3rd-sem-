import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the string value :");
		String str=sc.next();
		
		try {
			Integer num=Integer.valueOf(str);
			System.out.println("You have entered a integer and value="+num);
			return;
		}
		catch(Exception e) {
				
		}
		try {
			Double f=Double.valueOf(str);
			System.out.println("You have entered a Double and value="+f);
			return;
		}
		catch(Exception e) {
				
		}
		try {
			Float f=Float.valueOf(str);
			System.out.println("You have entered a Float and value="+f);
			return;
		}
		catch(Exception e) {
				
		}
		
		try {
			Boolean f=Boolean.valueOf(str);
			System.out.println("You have entered a boolean and value="+f);
			return;
		}
		catch(Exception e) {
				
		}
	}

}
