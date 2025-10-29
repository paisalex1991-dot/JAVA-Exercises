public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName(); //.getClass(); method that returns the class.   .getSimpleName() method to return the name of thr class
        System.out.println(title + " is a " + instanceType + " film");


    }

    public static Movie getMovie(String type, String title){

        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScFi(title);
            default -> new Movie(title);

        };

    }
}

class Adventure extends Movie{

        public Adventure(String title){
            super(title);
        }

        @Override
        public void watchMovie() {
            super.watchMovie();
            System.out.printf("..%s%n".repeat(3),
                    "Pleasant scene",
                    "scary music",
                    "Something bad happens");
        }
        public void watchAdventure(){
            System.out.println("Watching an adventure");
        }
    }


class Comedy extends Movie{

    public Comedy(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Funny",
                "Even Funny",
                "Happy ending");
    }

    public void watchComedy(){
        System.out.println("Watching a comedy");
    }
}

class ScFi extends Movie{

    public ScFi(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Bad alien do bad stuff",
                "Space guys chase aliens",
                "Planet blows up");
    }

    public void watchSciFi(){
        System.out.println("Watching an SciFi");
    }
}







