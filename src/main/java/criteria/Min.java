package criteria;

import item.Item;
import item.Offer;

import java.util.List;

public class Min implements Criteria
{
    //dos criteria

    Criteria criteria;
    Criteria otherCriteria;

    public Min(Criteria criteria, Criteria otherCriteria)
    {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker)
    {

    }
}
