/**
 * Program description : To manage flower shop inventory efficiently
 *
 * Programmer: Adriana
 * Date: 22 February 2024
 */

//Import the respective package
import javax.swing.JOptionPane;

public class Flower
{
    //Declaration of instance variables
    private String name;
    private int quantity;
    private String colour;
    
    //Constructor without parameter
    public Flower()
    {
        this.name = null;  //name = "" //empty string
        this.quantity = 0;
        this.colour = "";
    } //end of constructor
    
    //Normal constructor with paramter
    public Flower(String name, int quantity, String colour)
    {
        this.name = name;
        this.quantity = quantity;
        this.colour = colour;
    } //End of constructor
    
    //Accessor/Getters
    public String getName()
    {
        return name;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public String getColour()
    {
        return colour;
    } //end of accessor
    
    //Mutators (setters) that set all the data members
    public void setFlower(String name, int quantity, String color)
    {
        this.name = name;
        this.quantity = quantity;
        this.colour = colour;
    } //end of mutators
    
    //calcCost method
    public double calcCost(String Colour)
    {
        double flowerColour_cost = 0.00;
        
        if (colour.equalsIgnoreCase("W")) //White colour flower(any type)
            flowerColour_cost = 5.00;
         else if (colour.equalsIgnoreCase("Y")) //Yellow colour flower (any type)
             flowerColour_cost = 4.50;
        //end of if
        
        double cost = (quantity * flowerColour_cost);
        
        return cost;
    } //end of calcCost
    
    //to string() method
    public String toString()
    {
        return ("Flower name = "+name+
                "\nQuantity = "+quantity+
                "\nColour = "+colour+
                "\nCost of Flower = "+calcCost(colour));
    }//end of to string()
} //End of class


