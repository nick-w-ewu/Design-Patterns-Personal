
public class TestSauronEye
{
    public static void main(String[] args)
    {

        EyeOfSauron eye = new EyeOfSauron();
        BadGuy saruman = new BadGuy(eye, "Saruman");
        BadGuy angmar = new BadGuy(eye, "Angmar");
        eye.setEnemies(1, 1, 2, 0); //hobbits, elves, dwarves, men -- BTW, this is HORRIBLE coding style
        //message should be displayed from Saruman and Angmar that they know about 1 hobbit, 1 elf, 2 dwarves
        System.out.println();
        eye.setEnemies(2, 8, 5, 17);
        System.out.println();
        
        saruman.defeated(); //Saruman is no longer registered with the Eye
        eye.setEnemies(4, 2, 2, 100);
        //only Angmar reports on the enemies

    }//end main
}
