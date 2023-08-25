

package InterfaceExe;



interface Drawable{
	void Area();
	void Volume();
}

//circle
class Circle implements Drawable{

	@Override
	public void Area() {
		int r = 5;
		System.out.println("Area of circle:" +3.14 * r * r);
		
	}

	@Override
	public void Volume() {
		int r = 5;
		System.out.println("Volume of circle:" +2 * 3.14 * r);
	
		
	}
}
	
//rectangle

	class rectangle implements Drawable{

		@Override
		public void Area() {
			int l = 5;
			int b = 4;
			System.out.println("Area of rectangle :" + l*b);
			
		}

		@Override
		public void Volume() {
			int l = 5;
			int b = 4;
			System.out.println("Volume of rectangle:" +2 * (l*b));
		
			
		}
		
}

	//square
	
	class square implements Drawable{

		@Override
		public void Area() {
			int a = 5;
			
			System.out.println("area of rectangle:" +2 *a);
		
			
		}

		@Override
		public void Volume() {
		
          int a = 5;
			
			System.out.println("volume of rectangle:" + 4 *a);
		
		}
		
	}
	
//main method - object creation
 class AreaVolume {

	public static void main (String [] args) {
		Drawable d1 = new Circle();
		d1.Area();
		d1.Volume();
		
		
	
		Drawable d2 = new rectangle();
		d2.Area();
		d2.Volume();
		
		square s = new square();
		s.Area();
		s.Volume();

	}

}


	