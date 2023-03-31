package Prototype.sub;

public class PrototypePatternTest{
    public static void main(String[] args) throws CloneNotSupportedException {
        Movie moviePrototype = new Movie();
        Movie movie = moviePrototype.clone();
        System.out.println(movie);
 
        Album albumPrototype = new Album();
        Album album = albumPrototype.clone();
        System.out.println(album);
 
        Show showPrototype = new Show();
        Show show = showPrototype.clone();
        System.out.println(show);
    }
}