package _04_netflix;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Movie move = new Movie("Twilight",1);
Movie mom = new Movie("The Notebook", 2);
Movie mop = new Movie("Slumdog Millionaire", 4);
Movie moped = new Movie("Big Hero 6",3);
Movie monday = new Movie("Boss Baby", 4);
move.getTicketPrice();
NetflixQueue birdie = new NetflixQueue();
birdie.addMovie(move);
birdie.addMovie(mop);
birdie.addMovie(mom);
birdie.addMovie(moped);
birdie.addMovie(monday);
birdie.sortMoviesByRating();
birdie.printMovies();
System.out.println("The best movie is "+ birdie.getBestMovie());
System.out.println("The second best movie is " + birdie.getMovie(1));
	}

}
