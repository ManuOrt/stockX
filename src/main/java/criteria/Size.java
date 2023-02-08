package criteria;

import item.Item;
import item.Offer;

import java.util.List;
import java.util.stream.Collectors;

public class Size implements Criteria
{
    private String size;

    public Size(String size)
    {
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker)
    {
        return sneaker.getOffers().stream().filter(o -> o.getSize().contains(size)).collect(Collectors.toList());
    }
}
