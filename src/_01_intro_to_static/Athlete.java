package _01_intro_to_static;





public class Athlete {
	    static int nextBibNumber=1;
	 
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";
	    
	    String name;
	    int speed;
	    int bibNumber;

	    Athlete (String name, int speed){
	        this.name = name;
	        this.speed = speed;
	        bibNumber = nextBibNumber;
	        nextBibNumber +=1;
	    }

	    public static void main(String[] args) {
	    	
	        //create two athletes
	    	Athlete runner = new Athlete("Shiv",20);
	    	Athlete crossCountry = new Athlete("Kish",20);
	        //print their names, bibNumbers, and the location of their race. 
	    
		   
	    	System.out.print(runner.name +runner.bibNumber+raceLocation+crossCountry.name+crossCountry.bibNumber);
	    }
	}

