package _05_netflix;

public class MovieRunner {
public static void main(String[] args) {
	Movie movies = new Movie("Stranger Things", 3);
	Movie movie2 = new Movie("Coding is cool", 5);
	Movie movie3 = new Movie("Coding is bad", 1);
	NetflixQueue Queue = new NetflixQueue();
	movies.getTicketPrice();
	Queue.addMovie(movies);
	Queue.addMovie(movie2);
	Queue.addMovie(movie3);
	Queue.sortMoviesByRating();
	Queue.printMovies();
}
}
