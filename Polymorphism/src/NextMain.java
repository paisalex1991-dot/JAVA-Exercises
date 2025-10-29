public class NextMain {

    public static void main(String[] args) {


        Movie movie = Movie.getMovie("A", "jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("a", "jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("c", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var aiplane = Movie.getMovie("C", "Airplane");

    }
}
