import java.util.Scanner; 
/**.
* 

* @author  Miguel Duarte
* @version 1.0
* @since   2020-10-29
*/
public class PlanetEnumeration {
  
  /**.
   * This is the main procedure. 
  */
  
  public static void main(String[] args) {
    
    System.out.println(" Enter the planet you would like to go to!");
    System.out.println(" Mercury, ");
    System.out.println(" Venus, ");
    System.out.println(" Earth, ");
    System.out.println(" Mars, ");
    System.out.println(" Jupiter, ");
    System.out.println(" Saturn, ");
    System.out.println(" Uranus, ");
    System.out.println(" Neptune,");
    System.out.println();
    
    // Declare int
    String userChoose;
    
    // Create scanner object
    Scanner userInput = new Scanner(System.in);
    
    // Convert userChoose to 
    userChoose = userInput.next();
    
    if (userChoose.equals("Mercury")) {
      System.out.println(" You will go to Mercury planet #1 ");
      
    } else if (userChoose.equals("Venus")) {
      System.out.println(" You will go to Venus planet #2 ");
      
    } else if (userChoose.equals("Earth")) {
      System.out.println(" You will go to Earth planet #3 "); 
      
    } else if (userChoose.equals("Mars")) {
      System.out.println(" You will go to Mars planet #4 ");
      
    } else if (userChoose.equals("Jupiter")) {
      System.out.println(" You will go to Jupiter planet #5 ");
      
    } else if (userChoose.equals("Saturn")) {
      System.out.println(" You will go to Saturn planet #6 ");
      
    } else if (userChoose.equals("Uranus")) {
      System.out.println(" You will go to Uranus planet #7 ");
      
    } else if (userChoose.equals("Neptune")) {
      System.out.println(" You will go to Neptune planet #8 ");
      
    } else {
      System.out.println(" Error ");
    }
  }
} 