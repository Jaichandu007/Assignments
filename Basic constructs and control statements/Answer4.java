
public class Answer4{
		 String Employee;
		 int hours;
		 int grosspay;
		int hourlyrate;
		// public Employee(String Employee ,int hours)
		// {
		// 	this.Employee = Employee;
		// 	this.hours = hours;
		// }
		public String getEmployee()
		{
			return Employee;
		}
		public void setEmployee(String Employee)
		{
			this.Employee = Employee;
		}
		public int getHours()
		{
			return hours;
		}
		public void setHours(int hours)
		{
			this.hours = hours;
		}
		public int getHourlyrate()
		{
			return hourlyrate;
		}
		public void setHourlyrate(int hourlyrate)
		{
			this.hourlyrate = hourlyrate;
		}

		public int calcpay(int hours){
			if(hours <= 40)
		{
			grosspay = hours*hourlyrate;
		}
		else if(hours>40)
		{
			grosspay = (hourlyrate*40 + (hours-40)*(hourlyrate/2));
		}
		else{
			System.out.println("Invalid input. Shutting down.");
		}
		return grosspay;

		}
		
	} 