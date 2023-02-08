package criteria;

import item.Ask;
import item.Item;
import item.Offer;

import java.util.List;
import java.util.stream.Collectors;

public class Asks implements Criteria
{

    @Override
    public List<Offer> checkCriteria(Item sneaker)
    {
        return sneaker.getOffers().stream().filter(o -> o instanceof Ask).collect(Collectors.toList());
    }
}
