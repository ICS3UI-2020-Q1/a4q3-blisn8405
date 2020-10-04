import java.util.Scanner; 
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   // create a scanner for user input
Scanner input = new Scanner(System.in); 
//create variable for user input
   System.out.println("Enter a integer");
   int number = input.nextInt();
     //create a variable to keep track of what number we are on
     int count = 1;
        // the accumulator to add the count into
     int total = 0;
     while(count <= number){
     total= total + count;
     count= count + 1;
     }
     //print the total to the screen
   System.out.println("The total is " + total);
  }
}
