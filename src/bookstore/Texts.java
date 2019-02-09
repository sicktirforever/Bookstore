package bookstore;
import java.io.IOException;
import java.util.Scanner;
public class Texts {
    Scanner sc = new Scanner(System.in);

    public void getMainMenu() {
        System.out.println(MainMenu);
    }

    public void getAddProductsMenu() {
        System.out.println(AddProductsMenu);
    }

    public void getBuyMenu() {
        System.out.println(BuyMenu);
    }

    public void getListProductsMenu() {
        System.out.println(ListProductsMenu);
    }

    public void getSearchMenu(){
        System.out.println(SearchMenu);
    }


    private String MainMenu = "\t1. Adauga Produse\n" +
            "\t2. Vezi Produse.\n" +
            "\t3. Cumparare\n" +
            "\t4. Iesire";
    private String AddProductsMenu = "\t1. Adauga Carte\n" +
            "\t2. Adauga Caiet\n" +
            "\t3. Adauga Pix.\n" +
            "\t4. Inapoi";
    private String BuyMenu = "\t1. Adauga Produs\n" +
            "\t2. Vezi total\n" +
            "\t3. Finalizeaza cumparare\n" +
            "\t4. Inapoi";
    private String ListProductsMenu = "\t1. Arata Carti\n" +
            "\t2. Arata Caiete\n" +
            "\t3. Arata Pixuri.\n" +
            "\t4. Arata toate produsele.\n" +
            "\t5. Inapoi.";
    private String SearchMenu = "\t1. Cautare carte\n" +
            "\t2. Cauta pix\n" +
            "\t3. Cauta caiet\n" +
            "\t4. Inapoi\n";
    public void Meniu(){
        getMainMenu();

        int optiune=0;
        System.out.println("Introduceti optiunea dorita: ");
        while (optiune != 4){
            if (optiune == 1){
                getAddProductsMenu();

            }
        }
    }

}
