package Card;

public class CardHand
{

   private int handSize = 60;
   public Card[] cards = new Card[handSize];

   /**
    * Add comments during class to explain what this method does.
    */
   public void generateHand ()
   {

      int countCards = 0;

      for (Card.COLOR s : Card.COLOR.values()) {
         for (Card.RANKS r : Card.RANKS.values()) {
            cards[countCards] = (new Card(s, r));
            countCards++;
         }
      }
   }
}
