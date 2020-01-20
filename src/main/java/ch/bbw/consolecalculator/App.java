package ch.bbw.consolecalculator;

/**
 * @author Loïc Fliege
 * @version 0.0.1
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Calculator calculator = new Calculator();
    	int valueA = 10;
    	int valueB = 20;
    	
    	System.out.println("Console Calculator");
    	System.out.println("==================");
    	System.out.println();
    	
    	System.out.println("Summe " + valueA + " + " + valueB + " = " + calculator.adition(valueA, valueB));
    }
}
