package criteria;

import item.Item;
import item.Offer;

import java.util.List;
import java.util.Optional;

public class Max implements Criteria
{
    //dos criteria

    Criteria criteria;
    Criteria otherCriteria;

    public Max(Criteria criteria, Criteria otherCriteria)
    {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker)
    {
        Criteria andCriteria = new AndCriteria(criteria,otherCriteria);
        Optional<Offer> offers = andCriteria.checkCriteria(sneaker)
                .stream().max(Offer::compareTo);
        return offers.isPresent()?List.of(offers.get()) : List.of();
    }
}
