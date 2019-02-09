package bookstore;

public class Produs implements Discountable{
    private String name;
    private int id;
    private double price;
    private boolean isOnOffer = true;
    private double pricefinal;
    private double offerDiscount;
    public Produs(int id, String name, double price, boolean isOnOffer, double offerDiscount){
        this.id = id;
        this.name = name;
        this.price = price;
        this.isOnOffer = isOnOffer;
        this.offerDiscount = offerDiscount;
    }

    public String getName(){
        return name;
    }
    public String getIdAsString(){
        return String.valueOf(id);

    }
    public String getPriceAsString() {
        return String.valueOf(price);
    }

    public String isOnOfferAsString() {
        return String.valueOf(isOnOffer);
    }

    public String getOfferDiscountAsString() {
        return String.valueOf(offerDiscount);
    }


    @Override
    public double priceWithDiscount() {
        return price - (price * offerDiscount / 100);
    }
}
