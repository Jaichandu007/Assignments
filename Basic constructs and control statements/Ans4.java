import java.util.Scanner;
public class Ans4{
	public static void main(String[] args){
		Answer4 E1 = new Answer4();
		Answer4 E2 = new Answer4();
		Answer4 E3 = new Answer4();

		Scanner input = new Scanner(System.in);

		System.out.println("Enter first employee name");
		String e1 = input.nextLine();
		E1.setEmployee(e1);	
		System.out.println("Enter hours worked");
		int h1 = input.nextInt();
		E1.setHours(h1);

		System.out.println("Enter second employee name");
		input.nextLine();
		String e2 = input.nextLine();
		E2.setEmployee(e2);	
		System.out.println("Enter hours worked");
		int h2 = input.nextInt();
		E2.setHours(h1);
		
		System.out.println("Enter Third employee name");
		input.nextLine();
		String e3 = input.nextLine();
		E3.setEmployee(e3);	
		System.out.println("Enter hours worked");
		int h3 = input.nextInt();
		E3.setHours(h1);

		System.out.println("Enter hourly rate");
		int r1 = input.nextInt();
		E1.setHourlyrate(r1);
		E2.setHourlyrate(r1);
		E3.setHourlyrate(r1);

		System.out.printf("Employee name is %s\n Employee salary is %d\n", E1.getEmployee(),E1.calcpay(h1));
		System.out.printf("Employee name is %s\n Employee salary is %d\n", E2.getEmployee(),E2.calcpay(h2));
		System.out.printf("Employee name is %s\n Employee salary is %d\n", E3.getEmployee(),E3.calcpay(h3));


	}
}