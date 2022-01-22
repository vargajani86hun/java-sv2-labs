package lambdacomparator.cloud;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Clouds {
    public CloudStorage alphabeticallyFirst(List<CloudStorage> storages) {
        List<CloudStorage> ordered = storages.stream()
                .sorted(Comparator.comparing(CloudStorage::getProvider,
                        Collator.getInstance()))
                .toList();
        return ordered.get(0);
    }

    public CloudStorage bestPriceForShortestPeriod(List<CloudStorage> storages) {
        List<CloudStorage> ordered = new ArrayList<>(storages);
        ordered.sort(Comparator.comparing(CloudStorage::getPeriod,
                        Comparator.nullsFirst(Comparator.naturalOrder()))
                        .thenComparing(CloudStorage::getPrice));
        return ordered.get(0);
    }

    public List<CloudStorage> worstOffers(List<CloudStorage> storages) {
        List<CloudStorage> ordered = new ArrayList<>(storages);
        ordered.sort(Comparator.reverseOrder());
        if (ordered.size() <= 3) {
            return ordered;
        }
        return ordered.subList(0, 3);
    }
}
