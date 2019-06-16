package Card;


public class GamePlayer
{
   
   public static void main (String[] args)
   {
      
      CardHand ch = new CardHand();
      
      ch.generateHand();
      for (Card c : ch.cards) {
         System.out.println(c.getRanks() + " of " + c.getColor());
         
      }
      System.out.println("End of the program");
      
   }
   
}
