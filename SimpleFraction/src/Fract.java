/**
 * Fraction class renomée en Fract pour confirmer la question de renommer un classe dans l'ensemble du projet
 * @author Melissa HOUAMEL 21806390
 * @version 02.10.20
 *
 */
public class Fract {
	
	private int x;
	private int y;
	private double value;
	
	public Fract(int x,int y) {
		this.x= x;
		this.y= y;
		this.value= (double) x/y;
	}
	
	public int getX() {
		return this.x;
	}
	
	//Je suis une ligne du fichier Fraction.java qui contient uneVariable :D
	
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
