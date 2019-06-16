package Card;


/** One of the object oriented principle is that you are allowed to use Encapsulation wherein *private fields prevent it from being access to public methods. Instance variables are kept private *and accessor methods are made public to be able to achieved this.
 * Cohesion also is a principle that allow groupings of code that contributes to a single task.
 * One feature of the code that allows Card Class to be reused or extended it to become an Uno deck
 * was that Card Class can be used to create objects and instance variables that can be used by other classes in the same package. An object created, points to the address of the class to initialize an array object and generate a code that can be accessed by the GamePlayer.
 * <p>
 */

public class Card
{

   public enum COLOR
   {
      red, yellow, green, blue
   };
   public enum RANKS
   {
      ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, reverse, drawtwo, drawfour, wildcard
   };


   private final COLOR color;
   private final RANKS ranks;



   public Card (COLOR s, RANKS r)
   {
      color = s;
      ranks = r;
   }


   public RANKS getRanks ()
   {
      return this.ranks;
   }

   /**
    * <p>
    */

   public COLOR getColor ()
   {
      return this.color;
   }



}
