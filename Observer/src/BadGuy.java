import java.util.Observable;
import java.util.Observer;



public class BadGuy implements Observer
{

	private EyeOfSauron eye;
	private String name;

	public BadGuy(EyeOfSauron eye, String name)
	{
		this.eye = eye;
		this.name = name;
		eye.addObserver(this);
	}

	public void defeated()
	{
		this.eye.deleteObserver(this);
	}

	public void displayKnowledge()
	{
		System.out.println(this.name + " has become aware of his enemies aproach, there are " + this.eye.getNumHobbits() + " Hobbits, "
				+ this.eye.getNumElves() + " elves, " + this.eye.getNumDwarves() + " Dwarves, and " + this.eye.getNumMen() + " men in the party");
	}

	@Override
	public void update(Observable arg0, Object arg1)
	{
		this.displayKnowledge();
	}

}
