package criteria;

import item.Bid;
import item.Item;
import item.Offer;

import java.util.List;
import java.util.stream.Collectors;

public class Bids implements Criteria
{
    @Override
    public List<Offer> checkCriteria(Item sneaker)
    {
        return sneaker.getOffers().stream().filter(o -> o instanceof Bid).collect(Collectors.toList());
    }
}
