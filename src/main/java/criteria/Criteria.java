package criteria;

import item.Item;
import item.Offer;

import java.util.List;

public interface Criteria
{
    public List<Offer> checkCriteria(Item sneaker);
}
