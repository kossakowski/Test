
public class ClassesDeckOfCards {
	
	public static void main(String[] args) {
		class PlayingCard {
			int rank;
			int suit;
			String[] typeOfSuit = new String[] {"SPADES","DIAMONS","HEARTS","CLUBS"};
			String[] typeOfRank = new String[] {"TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING","ACE"};
	
			public PlayingCard (int newRank, int newSuit){
			rank = newRank;
			suit = newSuit;
			}
			public String readCard(){
				if ((suit <= 0) || (suit > 4) || (rank < 2) || (rank > 13)){
					return "Wrong input";
				}	
				else
				{
					String output = "The card is a "+typeOfRank[rank-1]+" of "+typeOfSuit[suit-1];
					return output;
				}
				}
			}
		class deckOfPlayingCards{
			public deckOfPlayingCards(){
				for (int i=1; i <=4; i++){
					for (int j=2; j <=13; j++){
						
					}
				}
			}
		}
		PlayingCard aceOfSpades = new PlayingCard(13,1);
		System.out.println(aceOfSpades.readCard());
	}

}
