
public abstract class GameCharacter
{
	private GuitarBehavior guitarType;
	private  SoloBehavior soloType;
	
	public void playGuitar()
	{
		guitarType.playGuitar();
	}
	
	public void setGuitarType(GuitarBehavior newGuitar)
	{
		this.guitarType = newGuitar;
	}
	
	public void setSoloType(SoloBehavior newSolo)
	{
		this.soloType = newSolo;
	}
	
	public void playSolo()
	{
		soloType.performSolo();
	}
}
