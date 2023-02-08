package item;

public class Bid implements Offer
{
    private String size;
    private Integer bid;//compareTo<Object>

    public Bid(String size, Integer bid)
    {
        this.size = size;
        this.bid = bid;
    }

    @Override
    public String getSize(){
        return this.size;
    }

    public int getValue(){
        return this.bid.intValue(); //intValue, como en línia 6 es de tipo Integer, tenemos que cojer el valor del objeto.Es decir parsearlo.
    }

    public int compareTo(Offer sneaker){///como hacemos ?? el que tenemos con el que nos viene
        return this.bid.compareTo(sneaker.getValue());
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append( "Size: ").append(size).append(" Bid: ").append(bid).append("\n");
        return sb.toString();
    }

}
