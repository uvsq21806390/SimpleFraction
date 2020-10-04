/**
 * Main program
 * @author Melissa HOUAMEL 21806390
 * @version 02.10.20
 *
 */
public class Main {

	public static void main(String[] args) {
		
		System.out.println("toString Fraction test:");
		System.out.println("Parametre passé en ligne de commande:" + args[1]);

		//Je suis une ligne du fichier Main.java qui contient uneVariable :)
		
		Fract f1 =new Fract(7,13);
		System.out.println(f1.toString());

	}

}
