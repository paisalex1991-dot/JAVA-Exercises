import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Movie theMovie = Movie.getMovie("scien", "Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);

        while(true){

            System.out.println("""
                    Enter:
                    A - adventure films
                    C - comedy films
                    S - SiFi films
                    Q - exit progra
                    ----------------""");

            String type = s.nextLine();

            if ("Qq".contains(type)){ //test if Q or q in contained within type;
                break;
            }

            System.out.print("Enter movie title ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();

        }


    }
}
