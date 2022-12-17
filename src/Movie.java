import java.util.ArrayList;

public class Movie {
    public int movieId;
    public String movieName;
    public String genre;
    public int movieYear;
    public String country;
    public String producer;

    public Movie(int movieId, String movieName, String genre, int movieYear, String country, String producer) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
        this.movieYear = movieYear;
        this.country = country;
        this.producer = producer;
    }
    public void bio() {
        System.out.println("==========================****************==============================");
        System.out.printf("Название: %s\n", movieName);
        System.out.printf("Жанр: %s\n", genre);
        System.out.printf("Год: %d\n", movieYear);
        System.out.printf("Страна: %s\n", country);
        System.out.printf("Режиссер: %s\n", producer);
        System.out.println("==========================****************==============================");
    }
    public static void viewAllMovies(ArrayList<Movie> moviesList)
    {
        for(var movies : moviesList){
           movies.bio();
        }
    }
    public static void searchByName(ArrayList<Movie> moviesList, String searchValue){
        for(var movies : moviesList) {
            if(movies.movieName.equalsIgnoreCase(searchValue) || movies.movieName.toLowerCase().contains(searchValue)){
                movies.bio();
            }
        }
    }
    public static void searchByCountry(ArrayList<Movie> moviesList, String searchValue) {
        for(var movies : moviesList) {
            if(movies.country.equalsIgnoreCase(searchValue) || movies.country.toLowerCase().contains(searchValue)){
                movies.bio();
            }
        }

    }
    public static void searchByGenre(ArrayList<Movie> moviesList, String searchValue){
        for(var movies : moviesList){
            if(movies.genre.equalsIgnoreCase(searchValue) || movies.genre.toLowerCase().contains(searchValue)){
                movies.bio();
            }
        }
    }
}
