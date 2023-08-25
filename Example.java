package AbstractExe;


abstract class Shape{
	
	//implemented method can also use
		//implemented method for square
	abstract void calculateArea();
	
	//implemented method can also use
	//implemented method for square
	
	void SquareArea() {
		int a = 10;
		System.out.println("Area of Square:" + a*a);
		
	}
	
	
}
//subclass
 class Circle extends Shape{

	 //unimplemented
	@Override 
	void calculateArea() {
		
		int r = 5;
		System.out.println("Area of circle:" +3.14 * r * r);
	}
 }
 
 
public class Example {

	public static void main(String[] args) {
		
		Circle c= new Circle();
		c.calculateArea();
		
	//calling square
		Circle s = new Circle();
		s.SquareArea();
		
		
	}

}
