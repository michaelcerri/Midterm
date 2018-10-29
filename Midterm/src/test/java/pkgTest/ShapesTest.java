package pkgTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.Rectangle;

public class ShapesTest {
	//rectangle tests
	
	//test constructor
	@Test
	public void rectangleConstructorTest() {
		Rectangle r1 = new Rectangle(3,5);
		assert(r1 instanceof Rectangle);
	}
	
	//test get/set methods
	@Test
	public void iWidthGetTest() {
		Rectangle r1 = new Rectangle(3,5);
		int expectedWidth = 3;
		assertEquals(r1.getiWidth(),expectedWidth);
	}
	
	@Test
	public void iWidthSetTest() {
		Rectangle r1 = new Rectangle(3,5);
		int expectedWidth = 6;
		r1.setiWidth(6);
		assertEquals(r1.getiWidth(),expectedWidth);
	}
	
	@Test
	public void iLengthGetTest() {
		Rectangle r1 = new Rectangle(3,5);
		int expectedLength = 5;
		assertEquals(r1.getiLength(),expectedLength);
	}
	
	@Test
	public void iLengthSetTest() {
		Rectangle r1 = new Rectangle(3,5);
		int expectedLength = 6;
		r1.setiLength(6);
		assertEquals(r1.getiLength(),expectedLength);
	}
	//area/perimeter tests
	@Test
	public void rectangleAreaTest() {
		Rectangle r1 = new Rectangle(3,5);
		double expectedArea=3*5;
		assertEquals(r1.area(),expectedArea,.001);
	}
	@Test
	public void rectanglePerimeterTest() {
		Rectangle r1 = new Rectangle(3,5);
		double expectedPerimeter=2*(3+5);
		assertEquals(r1.perimeter(),expectedPerimeter,.001);
	}
	
	//TODO Test compareto
	@Test
	public void rectangleCompareToTest() {
		Rectangle r1= new Rectangle(3,5);
		Rectangle r2= new Rectangle(1,1);
		assertEquals(r1.compareTo(r2),1);
	}
	
	
	//Cuboid Tests
	
	//test constructor
	@Test
	public void cuboidConstructorTest() {
		Cuboid c1 = new Cuboid(3,5,7);
		assert(c1 instanceof Cuboid);
	}
	
	//test get/set for depth
	@Test
	public void iDepthGetTest() {
		Cuboid c1 = new Cuboid(3,5,7);
		double expectedDepth = 7;
		assertEquals(c1.getiDepth(),expectedDepth,.001);
	}
	
	@Test
	public void iDepthSetTest() {
		Cuboid c1 = new Cuboid(3,5,7);
		double expectedDepth = 6;
		c1.setiDepth(6);
		assertEquals(c1.getiDepth(),expectedDepth,.001);
	}
	
	//test area/perimeter
	
	@Test
	public void CuboidAreaTest() {
		Cuboid c1 = new Cuboid(1,1,1);
		double expectedArea = 6;
		assertEquals(c1.area(),expectedArea,.001);
	}
	
	//implementation from source given
	@Test
	public void testPerimThrowsUnsupportedOperandException() {
	  boolean thrown = false;
	  Cuboid c1 = new Cuboid(3,5,7);
	  try {
	    c1.perimeter();
	  } catch (UnsupportedOperationException e) {
	    thrown = true;
	  }
	  assertTrue(thrown);
	}
	
	//test compareTo methods
	//TODO compareTo
	
	@Test
	public void CuboidSortByAreaTest() {
		Cuboid c1 = new Cuboid (3,5,7);
		Cuboid c2 = new Cuboid (1,1,1);
		assertEquals(compare(c1,c2),1);
	}
}
