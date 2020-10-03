/**
 * Fraction class
 * @author Melissa HOUAMEL 21806390
 * @version 02.10.20
 *
 */
public class Fraction {
	
	private int x;
	private int y;
	private double value;
	
	public Fraction(int x,int y) {
		this.x= x;
		this.y= y;
		this.value= (double) x/y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public double getValue() {
		return this.value;
	}
	
	@Override
	public String toString() {
		
		return this.x+" / "+this.y+" = "+ this.value;
	}

}
