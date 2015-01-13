import java.util.Observable;


public class EyeOfSauron extends Observable {

	private int numHobbits;
	private int numElves;
	private int numDwarves;
	private int numMen;

	public EyeOfSauron()
	{
		
	}
	
	public int getNumHobbits()
	{
		return this.numHobbits;
	}

	public int getNumElves()
	{
		return this.numElves;
	}

	public int getNumDwarves()
	{
		return this.numDwarves;
	}

	public int getNumMen()
	{
		return this.numMen;
	}

	public void setEnemies(int hobbits, int elves, int dwarves, int men)
	{
		this.numHobbits = hobbits;
		this.numElves = elves;
		this.numDwarves = dwarves;
		this.numMen = men;
		setChanged();
		notifyObservers();
	}

}
