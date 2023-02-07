package item;

import java.util.List;

public interface Item
{
    public int getBid();
    public int getAsk();
    public int getSale();
    public void addOffer(Offer sneaker);
    public List<Offer> getOffers();
    public void setBid(int bid);
    public void setAsk(int ask);
    public void setSale(int sale);
}
