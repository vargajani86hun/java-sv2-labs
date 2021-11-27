package algorithmsmax.sales;

import java.util.List;

public class Sales {
    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) {
        Salesperson best = null;
        for (Salesperson sp : sales) {
            if (best == null || best.getAmount() < sp.getAmount()) {
                best = sp;
            }
        }
        return best;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales) {
        Salesperson best = null;
        for (Salesperson sp : sales) {
            if (best == null || best.overTarget() < sp.overTarget()) {
                best = sp;
            }
        }
        return best;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {
        Salesperson looser = null;
        for (Salesperson sp : sales) {
            if (looser == null || looser.overTarget() > sp.getTarget()) {
                looser = sp;
            }
        }
        return looser;
    }
}
