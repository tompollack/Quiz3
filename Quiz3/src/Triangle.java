
public class Triangle extends GeometricObject
{
	double side1;
	double side2;
	double side3;
	
	public Triangle()
	{
		side1 = 0.1;
		side2 = 0.1;
		side3 = 0.1;
	}
	public Triangle(double s1, double s2, double s3)
	{
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	public double getSide1()
	{
		return side1;
	}
	public double getSide2()
	{
		return side2;
	}
	public double getSide3()
	{
		return side3;
	}
	
	@Override
	public double getArea() 
	{
		double s = (getPerimeter())/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}

	@Override
	public double getPerimeter() 
	{
		return side1+side2+side3;
	}
	
	public String toString()
	{
		return "This Triangle with sides of "+side1+", "+side2+", and "+side3+" has a perimeter of "+ getPerimeter()+" and an area of "+getArea()+".";
	}
}
