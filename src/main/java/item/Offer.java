package item;

public interface Offer extends Comparable<Offer>
{
    public String getSize();
    public int getValue();
    public int compareTo(Offer sneaker);
}
