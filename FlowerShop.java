/**
 * Program Purpose: To demonstrate the implementation of instance variables and 
 *                  methods of the class named FlowerShop
 *
 * Programmer: Adriana
 * Date: 22 February 2024
 */

//import the respective package
import javax.swing.JOptionPane;

//Driver class
public class FlowerShop
{
    public static void main(String[] args)
    {
        //Declaration of an array of size 10 named flowerArr
        Flower[]flowerArr = new Flower[10];//{0,0,0}
        
        //Declaration of all variables
        String name, colour, str;
        int quantity;
        
        
        for(int i = 0; i < flowerArr.length;i++)
        {
            name = JOptionPane.showInputDialog("Enter the name of flower " + (i+1) + " : ");
            str = JOptionPane.showInputDialog("Enter the flower quantity ");
            colour= JOptionPane.showInputDialog("Choose colour of the flowers  (Type W = White or Y = Yellow) ==> : ");
            quantity = Integer.parseInt(str); //wrap from string to integer
            
            if (colour.equalsIgnoreCase ("W"))
                colour = "White";
             else if (colour.equalsIgnoreCase ("Y"))
                 colour ="Yellow";
             else 
                 System.out.println("Incorrect input! Please choose the correct Colour!");
            
            //Instantiate each element of the array
            flowerArr[i] = new Flower();
            
            //Call the mutator to change the object state
            flowerArr[i].setFlower(name, quantity, colour);
            
            //Call the toString method
            System.out.println(flowerArr[i].toString());
        }//end of for
        
        int countW = 0, countY = 0;
        
        for (int i =0; i < flowerArr.length; i++)
        {
            if (flowerArr[i].getColour().equalsIgnoreCase("White"))
            countW++; //countW = countW + 1
        else if (flowerArr[i].getColour().equalsIgnoreCase("Yellow"))
            countY++; //countY = countY + 1
        else
            System.out.print("Incorrect color of the flower");   
        }//end of for
        
        JOptionPane.showMessageDialog(null, "Count for White color: " + countW, "OUTPUT", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Count for Yellow color: " + countY, "OUTPUT", JOptionPane.INFORMATION_MESSAGE);
     
        //Search for flower name named Tulip
        boolean found = false;
        for(int i = 0; i < flowerArr.length; i++)

        {
             if(flowerArr[i].getName().equalsIgnoreCase("Tulip"))
        {
              flowerArr[i].setFlower("Tulip", 15, "White");
           found = true;
           break; // No need to continue searching once found
        }
        }//End of for
    
         if (!found) {
         JOptionPane.showMessageDialog(null, "Sorry, the name that you are searching for is not in array", "OUTPUT", JOptionPane.ERROR_MESSAGE);
        }
       } //end of main
}//end of class