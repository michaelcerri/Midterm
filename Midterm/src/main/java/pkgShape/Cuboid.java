package pkgShape;

import java.util.Collections;
import java.util.Comparator;

public class Cuboid extends Rectangle implements Comparable{
	
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
		Collections.sort(c, SortByArea.compare(this, c));
		
	}
	
	public class SortByArea implements Comparator<Cuboid>{
		
		public int compare(Cuboid c1, Cuboid c2) {
			return (int)(c1.area()-c2.area()); 
		}
	}
	
	public class SortByVolume implements Comparator<Cuboid>{
		
		public int compare(Cuboid c1, Cuboid c2) {
			return (int)(c1.volume()-c2.volume());
		}
	}
	
}
