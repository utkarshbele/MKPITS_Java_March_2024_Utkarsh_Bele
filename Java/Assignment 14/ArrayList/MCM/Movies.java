package Assinment14.ArrayList.MCM;

public class Movies {
   private long movieID;
   private String title, director, genre, yearReleased;

   public Movies(long movieID, String title, String director, String yearReleased, String genre) {
      this.yearReleased = yearReleased;
      this.movieID = movieID;
      this.title = title;
      this.director = director;
      this.genre = genre;
   }

   //Getter
   public long getMovieID() {
      return movieID;
   }

   public String getYearReleased() {
      return yearReleased;
   }

   public String getTitle() {
      return title;
   }

   public String getDirector() {
      return director;
   }

   public String getGenre() {
      return genre;
   }
   //Setters

   public void setDirector(String director) {
      this.director = director;
   }

   public void setGenre(String genre) {
      this.genre = genre;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   @Override
   public String toString() {
      return "Movies{" +
              "movieID=" + movieID +
              ", yearReleased=" + yearReleased +
              ", title='" + title + '\'' +
              ", director='" + director + '\'' +
              ", genre='" + genre + '\'' +
              '}';
   }
}

