package pkgShape;


public class Rectangle extends Shape{
	
	private int iWidth;
	private int iLength;
	
	public Rectangle (int width, int length) {
		this.iWidth=width;
		this.iLength=length;
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}



	@Override
	public double area() {
		return iLength*iWidth;
	}

	@Override
	public double perimeter() {
		return 2*(iLength+iWidth);
	}
	
	public int compareTo(Object o) {
		//TODO
		return 0;
		
	}

}