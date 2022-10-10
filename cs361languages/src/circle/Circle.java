/**
 * 
 */
package circle;

/**
 * @author ADD YOUR NAME
 *
 */

// TODO Complete the code

public class Circle extends GraphicObject {

	// No use of encapsulation
	public double centerX, centerY;
	public double radius;
	public int windowNumber;

	/**
	 * 
	 */
	public Circle() {
	}

	// overloaded method in Circle
	// overridden method from GraphicObject
	@Override
	void draw() {
		System.out.println("Drawing a Circle...");
	}

	// overloaded method in Circle
	// Not overridden as it does follow the signature in GraphicObject
	public void draw(int color) {
		System.out.println("Drawing a Circle in color...");
	}

	public double circumference() {
		return 2.0 * 3.141529 * radius;
	}

	public double area() {
		return 3.141529 * radius * radius;
	}

	public boolean overlaps(Circle other) {
		return ((centerX - other.centerX) * (centerX - other.centerX)
				+ (centerY - other.centerY) * (centerY - other.centerY)) < ((radius + other.radius)
						* (radius + other.radius));
	}

	@Override
	void moveTo(int newX, int newY) {
		

			centerX= newX;
			centerY= newY;
		}
	/**
	 * @return the Circle with this EXACT format Circle: centerX = ... centerY = ... radius = ...
	 */
	@Override
	
	public String toString() {
		return " Circle: CenterX = " + centerX + " Center Y = "+ centerY + " radius = " + radius;
	}
	@Override
	public boolean equals(Object obj) {

			
			Circle otherCircle= (Circle) obj;
			
			if((centerX == otherCircle.centerX) && (centerY == otherCircle.centerY) && (radius == otherCircle.radius))
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}

protected Object clone() throws CloneNotSupportedException {
		
		Circle clonedCircle= new Circle();
		clonedCircle.centerX= centerX;
		clonedCircle.centerY=centerY;
	    clonedCircle.radius=radius;
		return clonedCircle;
	 }

}
