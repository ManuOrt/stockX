package criteria;

import item.Item;
import item.Offer;
import item.Sale;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LastSale implements Criteria
{
    @Override
    public List<Offer> checkCriteria(Item sneaker)
    {
        return sneaker.getOffers().stream().filter(o -> o instanceof Sale).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
