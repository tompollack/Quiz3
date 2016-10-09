import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest 
{

	@Test
	public void test() 
	{
		Triangle t = new Triangle(3,4,5);
		assertEquals(t.getArea(),6,0);
		assertEquals(t.getPerimeter(),12,0);
		assertEquals(t.toString(),"This Triangle with sides of 3.0, 4.0, and 5.0 has a perimeter of 12.0 and an area of 6.0.");
	}

}
