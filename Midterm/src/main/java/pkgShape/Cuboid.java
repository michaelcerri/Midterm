package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle{
	
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
	public double perimeter() {//throws
		//TODO
		return 0;
	}
	
	
	@Override
	public int compareTo(Object o) {
		//TODO
		return 0;
		
	}
	
	public class SortByArea implements Comparator<Cuboid>{
		SortByArea(){	
		}
		
		public int compare(Cuboid c1, Cuboid c2) {
			return Double.compare(c1.area(), c2.area()); //found implementation online
		}
	}
	
	public class SortByVolume{
		SortByVolume(){
		}
		
		public int compare(Cuboid c1, Cuboid c2) {
			return Double.compare(c1.volume(), c2.volume());
		}
	}
	
}
