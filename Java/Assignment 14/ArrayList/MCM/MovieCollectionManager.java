package Assinment14.ArrayList.MCM;
import java.util.ArrayList;

public class MovieCollectionManager {
    //Movie collection Manager using Array list
    public static ArrayList<Movies> movies = new ArrayList<Movies>();
    public static void addMovie(long movieId, String movieName, String director,String yearReleased, String genre)
    {
        movies.add(new Movies(movieId,movieName,director,yearReleased,genre));
        System.out.println("Movie added successfully.");
    }

    public static void removeMovie(long movieId) {
        boolean removed = false;
        for (Movies movie : movies) {
            if (movie.getMovieID() == movieId) {
                movies.remove(movie);
                removed = true;
                System.out.println("Movie removed successfully.");
                break;
            }
        }
        if (!removed) {
            System.out.println("Movie not found.");
        }
    }

    public static void searchStudent(String movieName) {
        boolean found = false;
        for (Movies movies1 : movies) {
            if (movies1.getTitle().equals(movieName)) {
                System.out.println("Movie found:");
                System.out.println(movies1);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Movie not found.");
        }
    }

    public static void displayAllMovies(String genre)
    {
        //Display Movies by their genre
        for(Movies movies1 : movies)
        {
            if(movies1.getGenre().equalsIgnoreCase(genre))
            {
                System.out.println("Movies with "+genre+" are");
                System.out.println(movies1);
            }
        }
        System.out.println("Movies with "+genre+" did not found. ");
    }
}