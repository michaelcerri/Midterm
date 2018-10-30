package pkgShape;


import java.util.Comparator;

public class Cuboid extends Rectangle implements Comparable<Object>{
	
	private int iDepth;
	
	public Cuboid(int width, int length, int depth) {
		super(width, length);
		this.iDepth=depth;
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume() {
		return super.area()*iDepth;
	}
	
	@Override
	public double area() {
		return 2*super.area()+2*getiWidth()*iDepth+2*getiLength()*iDepth;
	}
	
	@Override
	public double perimeter() throws UnsupportedOperationException {//throws
		throw new UnsupportedOperationException();
	}
	
	
	public int compareTo(Object o) {
		Cuboid c = (Cuboid) o;
		if ((new SortByArea()).compare(this,c)!=0) 
			return (new SortByArea().compare(this,c));
			
			else
				return (new SortByVolume().compare(this, c)); 
		}
		//this will sort first by area, and then by volume if areas are equal. I'm not sure if this is what you wanted	
		
	}
	
	 class SortByArea implements Comparator<Cuboid>{
		//java will give default constructor
		
		
		public int compare(Cuboid c1, Cuboid c2) {
			return Double.compare(c1.area(),c2.area()); 
		}
	}
	
	 class SortByVolume implements Comparator<Cuboid>{
		//java will give default constructor 
		
		
		public int compare(Cuboid c1, Cuboid c2) {
			return Double.compare(c1.volume(),c2.volume());
		}
}
	

