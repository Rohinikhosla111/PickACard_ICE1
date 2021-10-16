
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Rohini Khosla - 991625011
 */
public class CardTrick {
    public static void main(String[] args)
    {
       //Creating Card class object
       Card card = new Card();
       
       //Setting values for Card class object
       card.setSuit("Hearts");
       card.setValue(1);
       
       //Printing Card class object values
       System.out.println("Suit : " + card.getSuit());
       System.out.println("Value : " + card.getValue());
       
       //Creating another Card class object
       Card card1 = new Card();
    }
    
}
