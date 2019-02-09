package bookstore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bookstore {
    Fisier fisier = new Fisier();
    Scanner sc = new Scanner(System.in);
    List<Produs> availableProducts = new ArrayList<>();

    public void readBook() throws IOException {
        System.out.println("Care este titlul cartii pe care vrei sa o adaugi?");
        String name = sc.nextLine();
        System.out.println("Care este id-ul cartii pe care vrei sa o adaugi?");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Care este pretul cartii pe care vrei sa o adaugi?");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Este cartea pe care vrei sa o adaugi la oferta?(da/nu)");
        String tempisOnOffer = sc.nextLine();
        boolean isOnOffer = true;
        if (tempisOnOffer.toLowerCase().equals("da")) {
            isOnOffer = true;
        } else if (tempisOnOffer.toLowerCase().equals("nu")) {
            isOnOffer = false;
        }
        int offerDiscount = 0;
        if (isOnOffer) {
            System.out.println("Ce reducere are cartea pe care vrei sa o adaugi? ");
            offerDiscount = sc.nextInt();
            sc.nextLine();
        }
        Produs book = new Book(id, name, price, isOnOffer, offerDiscount);
        fisier.writeFile(book);

    }

    public void readPen() throws IOException {
        System.out.println("Care este numele pixului pe care vrei sa il adaugi?");
        String name = sc.nextLine();
        System.out.println("Care este id-ul pixului pe care vrei sa il adaugi?");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Care este pretul pixului pe care vrei sa il adaugi?");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Este pixul pe care vrei sa il adaugi la oferta?(da/nu)");
        String tempisOnOffer = sc.nextLine();
        boolean isOnOffer = true;
        if (tempisOnOffer.toLowerCase().equals("da")) {
            isOnOffer = true;
        } else if (tempisOnOffer.toLowerCase().equals("nu")) {
            isOnOffer = false;
        }
        int offerDiscount = 0;
        if (isOnOffer) {
            System.out.println("Ce reducere are pixul pe care vrei sa il adaugi? ");
            offerDiscount = sc.nextInt();
            sc.nextLine();
        }
        Produs pen = new Pen(id, name, price, isOnOffer, offerDiscount);
        fisier.writeFile(pen);
    }

    public void readNotebook() throws IOException {
        System.out.println("Care este numele caietului pe care vrei sa il adaugi?");
        String name = sc.nextLine();
        System.out.println("Care este id-ul caietului pe care vrei sa il adaugi?");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Care este pretul caietului pe care vrei sa il adaugi?");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Este caietul pe care vrei sa il adaugi la oferta?(da/nu)");
        String tempisOnOffer = sc.nextLine();
        boolean isOnOffer = true;
        if (tempisOnOffer.toLowerCase().equals("da")) {
            isOnOffer = true;
        } else if (tempisOnOffer.toLowerCase().equals("nu")) {
            isOnOffer = false;
        }
        int offerDiscount = 0;
        if (isOnOffer) {
            System.out.println("Ce reducere are caietul pe care vrei sa il adaugi? ");
            offerDiscount = sc.nextInt();
            sc.nextLine();
        }
        Produs notebook = new Notebook(id, name, price, isOnOffer, offerDiscount);
        fisier.writeFile(notebook);
    }

    public void addToAvailableProducts(List<Produs> produse){
        availableProducts = produse;

    }
}
