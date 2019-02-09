package bookstore;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {

    public static void main(String[] args) throws IOException {

        Produs book = new Book(1, "Lost in Java", 100, true,100);

        Navigator navigator = new Navigator();
        navigator.mainMenu();






    }
}
