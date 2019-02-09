package bookstore;

import com.sun.deploy.util.StringUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Fisier {


    Path produsPath = Paths.get("C:\\Users\\Andrei\\Desktop\\Produs.txt");


    public List<String> readFisier(Path produsPath)throws IOException{

        List<String> produse = Files.readAllLines(produsPath);
        List<String> produsDetails = new ArrayList<>();
        List<Produs> produseList = new ArrayList<>();

        for (String produs : produse) {

            System.out.println(produs);
        }
        return produse;
    }

    public List<Produs> readBook(Path produsPath) throws IOException {
        List<String> productsAsReadString = Files.readAllLines(produsPath);
        List<Produs> products = new ArrayList<>();
        List<String> tempProductList = new ArrayList<>();

        for (String produs : productsAsReadString){
            StringTokenizer tokenizer = new StringTokenizer(produs, ",");
            while (tokenizer.hasMoreTokens()){
                tempProductList.add(tokenizer.nextToken());
            }


            int id = Integer.parseInt(tempProductList.get(0));
            String nume = tempProductList.get(1);
            Double price = Double.valueOf(tempProductList.get(2));
            boolean onDiscount = Boolean.valueOf(tempProductList.get(3));
            double discountAmount = Double.valueOf(tempProductList.get(4));

            Produs tempProduct = new Produs(id,nume,price,onDiscount,discountAmount);

            products.add(tempProduct);
            tempProductList.clear();
        }
        return products;
    }

    public List<String> readPen(Path produsPath) throws IOException {
        List<String> produse= Files.readAllLines(produsPath);

        for (String produs : produse){
            StringTokenizer tokenizer = new StringTokenizer(produs, ",");
            while (tokenizer.hasMoreTokens()){
                if(Integer.valueOf( tokenizer.nextToken()) > 1000 &&Integer.valueOf( tokenizer.nextToken()) < 2000){
                    System.out.println(produs);
                }
            }
        }
        return produse;
    }

    public List<String> readNotebook(Path produsPath) throws IOException {
        List<String> produse= Files.readAllLines(produsPath);

        for (String produs : produse){
            StringTokenizer tokenizer = new StringTokenizer(produs, ",");
            while (tokenizer.hasMoreTokens()){
                if(Integer.valueOf( tokenizer.nextToken()) > 2000 && Integer.valueOf( tokenizer.nextToken()) < 3000){
                    System.out.println(produs);
                }
            }
        }
        return produse;
    }


    public void writeFile(Produs produs) throws IOException{

        Path fisierPath = Paths.get("C:\\Users\\Andrei\\Desktop\\Produs.txt");

        String toInsert =  produs.getIdAsString() + "," + produs.getName() + "," + produs.getPriceAsString() + "," + produs.isOnOfferAsString() + "," + produs.getOfferDiscountAsString() + "\r\n";

        try {

            Files.write(Paths.get("C:\\Users\\Andrei\\Desktop\\Produs.txt"), toInsert.getBytes(), StandardOpenOption.APPEND);

        }
        catch (IOException e) {
        }

        /*
        List<String> inList = Arrays.asList(System.lineSeparator(),produs.getIdAsString(),produs.getName(),produs.getPriceAsString(),produs.isOnOfferAsString(),produs.getOfferDiscountAsString());
        Files.write(fisierPath, inList, StandardOpenOption.APPEND);

        List<String> newString = Files.readAllLines(fisierPath);
        System.out.println(newString);*/

    }
}
