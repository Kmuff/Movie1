import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {


    @Test
    public void testAddMovie1() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film One");
        String[] expected = {"Film One"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testAddMovie2() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film One");
        manager.addMovie("Film Two");
        manager.addMovie("Film Three");

        String[] expected = {"Film One", "Film Two", "Film Three"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddMovie3() {
        MovieManager manager = new MovieManager();


        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film One");
        String[] expected = {"Film One"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastMovie1() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film One");
        manager.addMovie("Film Two");
        manager.addMovie("Film Three");

        String[] expected = {"Film Three", "Film Two", "Film One"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastMovie3() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film One");
        manager.addMovie("Film Two");
        manager.addMovie("Film Three");
        manager.addMovie("Film Four");
        manager.addMovie("Film Five");
        String[] actual = manager.findLast();
        String[] expected = {"Film Five", "Film Four", "Film Three", "Film Two", "Film One"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoviesLessLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film One");
        manager.addMovie("Film Two");
        manager.addMovie("Film Three");
        String[] actual = manager.findLast();
        String[] expected = {"Film Three", "Film Two", "Film One"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoviesMoreLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film One");
        manager.addMovie("Film Two");
        manager.addMovie("Film Three");
        manager.addMovie("Film Four");
        manager.addMovie("Film Five");
        manager.addMovie("Film Six");
        String[] actual = manager.findLast();
        String[] expected = {"Film Six","Film Five","Film Four", "Film Three", "Film Two"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddNewMovie() {
        MovieManager manager = new MovieManager();
        Movie movie7 = new Movie(123, "Погоня", 1979, "Триллер");
        manager.addMovie("Film Seven");
        String[] expected = {"Film Seven"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddSomeMovies() {
        MovieManager manager = new MovieManager();
        Movie movie8 = new Movie(127, "Слежка", 1981, "Детектив");
        Movie movie9 = new Movie(129, "Падение", 1986, "Комедия");
        manager.addMovie("Film 8");
        manager.addMovie("Film 9");
        String[] expected = {"Film 8", "Film 9"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


}


