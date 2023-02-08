package criteria;

import item.Bid;
import item.Item;
import item.Offer;

import java.util.List;
import java.util.Optional;

public class MaxBid implements Criteria
{

    @Override
    public List<Offer> checkCriteria(Item sneaker)
    {
        Optional<Offer> maxBid = sneaker.getOffers().stream().filter(o -> o instanceof Bid).max(Offer::compareTo);
        return maxBid.isPresent()? List.of(maxBid.get()) : List.of();
    }
}
