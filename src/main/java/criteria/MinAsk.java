package criteria;

import item.Ask;
import item.Item;
import item.Offer;

import java.util.List;
import java.util.Optional;

public class MinAsk implements Criteria
{
    @Override
    public List<Offer> checkCriteria(Item sneaker)
    {
        Optional<Offer> minAsk = sneaker.getOffers().stream().filter(o -> o instanceof Ask).min(Offer::compareTo);
        return minAsk.isPresent()? List.of(minAsk.get()) : List.of();
    }
}
