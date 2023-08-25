package globalvariable;

public class Employee {
	
	String name;
	int id;
	int Experience;
	

	public Employee (String name,int id,int Experience) {
		
		this.name = name;
		this.id = id;
		this.Experience = Experience;
		
	}
	public void displayInfo() {
		
		System.out.println("name:" + name );
		System.out.println("id:" +id );
		System.out.println("Experience:" + Experience );
	}
   
	}


