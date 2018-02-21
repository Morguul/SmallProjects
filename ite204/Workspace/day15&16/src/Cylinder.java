
public class Cylinder extends Circle{
	
	private double length;
	
	public Cylinder(String color, double radius, double length){
		super(color, radius);
		this.length = length;
	}
	
	public Cylinder(){
		super();
		this.length = 1.0;
	}
	
	public double getLength(){
		return this.length;
	}
	
	public double findArea(){
		return super.findPerim() * this.length + 2 * super.findArea();
	}
	
	public double findVolume(){
		return super.findArea() * this.length;
	}
}
