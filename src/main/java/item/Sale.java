package item;

public class Sale implements Offer
{
    private String size;
    private Integer price;

    public Sale(String size, Integer price)
    {
        this.size = size;
        this.price = price;
    }
    @Override
    public String getSize(){
        return this.size;
    }
    @Override
    public int getValue(){
        return price.intValue();
    }

    @Override
    public int compareTo(Offer sneaker){
        return this.price.compareTo(sneaker.getValue());
    }
}
