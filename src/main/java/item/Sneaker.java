package item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item
{
    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;

    private List<Offer> lOffers = new ArrayList<>();// lista de las offers

    public Sneaker(String style, String name)
    {
        this.style = style;
        this.name = name;
    }


    public String getStyle(){
        return this.style;
    }

    public String getName(){
        return this.name;
    }
    @Override
    public int getSale(){
        return this.sale;
    }

    public void setSale(int sale){ // Para cambiar el valor al que ya tenemos
        this.sale = sale;
    }
    @Override
    public int getBid(){
        return this.bid;
    }

    public void setBid(int bid){
        this.bid = bid;
    }

    @Override
    public int getAsk()
    {
        return this.ask;
    }

    public void setAsk(int ask){
        this.ask = ask;
    }

    @Override
    public void addOffer(Offer offer){
        this.lOffers.add(offer);
    }

    @Override
    public List<Offer> getOffers(){
        return this.lOffers;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(this.style);
        return sb.toString();
    }

}
