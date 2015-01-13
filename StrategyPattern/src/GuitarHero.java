
public class GuitarHero
{
	public static void main(String[] args)
	{
		GameCharacter player1 = new GameCharacterSlash();
		GameCharacter player2 = new GameCharacterHendrix();
		GameCharacter player3 = new GameCharacterYoung();
		System.out.println("Using the default guitars and solos");
		
		System.out.println("Player 1");
		player1.playGuitar();
		player1.playSolo();
		
		System.out.println("Player 2");
		player2.playGuitar();
		player2.playSolo();
		
		System.out.println("Player 3");
		player3.playGuitar();
		player3.playSolo();
		
		player1.setGuitarType(new Fender());
		player2.setGuitarType(new Gibson());
		player3.setGuitarType(new FlyingV());
		
		System.out.println("All players have changed their guitars");
		
		System.out.println("Player 1");
		player1.playGuitar();
		player1.playSolo();
		
		System.out.println("Player 2");
		player2.playGuitar();
		player2.playSolo();
		
		System.out.println("Player 3");
		player3.playGuitar();
		player3.playSolo();
		
		player1.setSoloType(new YoungSolo());
		player2.setSoloType(new SlashSolo());
		player3.setSoloType(new HendrixSolo());
		
		System.out.println("All players have changed their solos");
		
		System.out.println("Player 1");
		player1.playGuitar();
		player1.playSolo();
		
		System.out.println("Player 2");
		player2.playGuitar();
		player2.playSolo();
		
		System.out.println("Player 3");
		player3.playGuitar();
		player3.playSolo();
	}

}
