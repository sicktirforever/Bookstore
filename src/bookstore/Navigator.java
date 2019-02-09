package bookstore;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
public class Navigator {
    Bookstore store = new Bookstore();
    Scanner sc = new Scanner(System.in);
    Texts text = new Texts();
    Fisier fisier = new Fisier();
    Path produsPath = Paths.get("C:\\Users\\Andrei\\Desktop\\Produs.txt");

    public Navigator(){
        //TODO read contents of file here. and assign into Bookstore.
    }

    public void addProduct() throws IOException {
        System.out.println("Acest meniu este pentru a adauga urmatoarele produse: ");

        text.getAddProductsMenu();
        System.out.print("Alegeti optiunea: ");
        int optiune = sc.nextInt();
        if (optiune == 1){
            store.readBook();
            addProduct();

        }
        if (optiune == 2){
            store.readNotebook();
        addProduct();
        }
        if (optiune == 3){
            store.readPen();
            addProduct();
        }
        if (optiune == 4){
            mainMenu();
        }

    }
    public void listProduct() throws IOException {
        System.out.println("Acest meniu este pentru a vizualiza oferta: ");
        text.getListProductsMenu();
        System.out.print("Alegeti optiunea: ");
        int optiune = sc.nextInt();
        if (optiune == 1){
            List<Produs> produses = fisier.readBook(produsPath);

            //TODO metoda care sa printeze cartile intr-un mod frumos. optiuni : 1. toString in pruds si doare se apeleaza toString. 2. metoda in navigator care primeste o lista de Produse si printeaza prin ele.

            listProduct();
            //lIstBook();
        }
        if (optiune == 2){
            fisier.readNotebook(produsPath);
            listProduct();
        }
        if (optiune == 3){
            fisier.readPen(produsPath);
            listProduct();
        }
        if (optiune == 4){
            fisier.readFisier(produsPath);
            listProduct();
        }
        if (optiune == 5){
            mainMenu();
        }

    }
    public void mainMenu() throws IOException {
        System.out.println("MENIU PRINCIPAL");
        text.getMainMenu();
        System.out.print("Alegeti optiunea: ");
        int optiune = sc.nextInt();
        if (optiune == 1){
            addProduct();
        }
        if (optiune == 2){
            listProduct();
        }
        if (optiune == 3){
            System.out.println("In lucru");
        }
        if (optiune == 4){
            System.exit(0);
        }
    }


}
