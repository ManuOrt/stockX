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

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append( "Size: ").append(size).append(" Price: ").append(price).append("\n");
        return sb.toString();
    }
}
