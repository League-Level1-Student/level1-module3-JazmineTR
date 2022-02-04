package _01_intro_to_static;

public class Athlete {
	    static int nextBibNumber = ;
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber = ; random

	    Athlete (String name, int speed){
	        this.name = name;
	        this.speed = speed;
	    }

	    public static void main(String[] args) {
	        //create two athletes
	    	Athlete lebro = new Athlete("Lebron", 65);
	    	Athlete nobel = new Athlete("Noel",75);
	        //print their names, bibNumbers, and the location of their race.
	    	
	    	System.out.println(lebro.nextBibNumber);
	    	System.out.println(lebro.name);
	    	System.out.println(lebro.raceLocation);
	    }
	}
