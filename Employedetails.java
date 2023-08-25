package globalvariable;

public class Employedetails {
	
	

	public static void main(String[] args) {
		Employee Fresher = new Employee ("surya",71200,01);   // note = ""is used for string // no double cotes for int
		
		Employee intern = new Employee ("jeeva",71300,01);
		
		Employee Experience = new Employee ("vijay",71200,05 );
		
		
		Fresher.displayInfo();
		intern.displayInfo();
		Experience.displayInfo();
		
				
				

	}

}
