package criteria;

import item.Item;
import item.Offer;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria
{
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria)
    {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker)
    {
        List<Offer> lOfferCriteria = criteria.checkCriteria(sneaker);
        List<Offer> lOfferOtherCriteria = otherCriteria.checkCriteria(sneaker);

        List<Offer> items = new ArrayList<>();

        for (Offer itemOffer : lOfferCriteria){
            if (lOfferOtherCriteria.contains(itemOffer)){
                items.add(itemOffer);
            }
        }
        return items;
    }
}
