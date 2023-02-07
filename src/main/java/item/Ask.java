package item;

public class Ask implements Offer
{
    private String size;
    private Integer ask;

    public Ask(String size, Integer ask)
    {
        this.size = size;
        this.ask = ask;
    }
    @Override
    public String getSize(){
        return this.size;
    }
    @Override
    public int getValue(){
        return this.ask.intValue();
    }
    @Override
    public int compareTo(Offer sneaker){
        return this.ask.compareTo(sneaker.getValue());
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.size).append(this.ask);
        return sb.toString();
    }
}
