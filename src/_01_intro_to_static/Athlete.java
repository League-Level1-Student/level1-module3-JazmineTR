package _01_intro_to_static;
import java.util.Random;

public class Athlete {
	static Random ran = new Random();
	    static int nextBibNumber = ran.nextInt(21);
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber = ran.nextInt(21);

	    Athlete (String name, int speed){
	        this.name = name;
	        this.speed = speed;
	    }


		public static void main(String[] args) {
	        //create two athletes
	    	Athlete lebro = new Athlete("Lebron", 65);
	    	Athlete nobel = new Athlete("Noel",75);
	        //print their names, bibNumbers, and the location of their race.
	    	
	    	System.out.println(lebro.name);
	    	System.out.println(lebro.bibNumber);
	    	System.out.println(lebro.raceLocation);
	    	System.out.println(nobel.name);
	    	System.out.println(nobel.bibNumber);
	    	System.out.println(nobel.raceLocation);
	    }
	}
