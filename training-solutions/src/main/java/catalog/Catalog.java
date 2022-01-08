package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }

    public double averagePageNumberOver(int minimum) {
        checkMinimumNumber(minimum);
        long sum = 0;
        int counter = 0;
        for (CatalogItem actual : catalogItems) {
            if (actual.numberOfPagesAtOneItem() >= minimum) {
                sum += actual.numberOfPagesAtOneItem();
                counter++;
            }
        }
        if (counter == 0) {
            throw new IllegalArgumentException("No page");
        }
        else {
            return sum * 1. / counter;
        }
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {
        catalogItems.remove(findItemByRegNumber(registrationNumber));
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> results = new ArrayList<>();
        if (searchCriteria.hasContributor()) {
            results.addAll(findItemsByContributor(searchCriteria.getContributor()));
        }
        if (searchCriteria.hasTitle()) {
            for(CatalogItem actual : findItemsByTitle(searchCriteria.getTitle())) {
                if (!results.contains(actual)) {
                    results.add(actual);
                }
            }
        }
        return results;
    }

    public int getAllPageNumber() {
        int sum = 0;
        for (CatalogItem actual : catalogItems) {
            sum += actual.numberOfPagesAtOneItem();
        }
        return sum;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> results = new ArrayList<>();
        for (CatalogItem actual : catalogItems) {
            if (actual.hasAudioFeature()) {
                results.add(actual);
            }
        }
        return results;
    }

    public int getFullLength() {
        int sum = 0;
        for (CatalogItem actual : catalogItems) {
            sum += actual.fullLengthAtOneItem();
        }
        return sum;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> results = new ArrayList<>();
        for (CatalogItem actual : catalogItems) {
            if (actual.hasPrintedFeature()) {
                results.add(actual);
            }
        }
        return results;
    }

    private CatalogItem findItemByRegNumber(String registrationNumber) {
        for (CatalogItem actual : catalogItems) {
            if (actual.getRegistrationNumber().equals(registrationNumber)) {
                return actual;
            }
        }
        throw new IllegalArgumentException("Catalog item cannot find by registration number " + registrationNumber);
    }

    private List<CatalogItem> findItemsByContributor(String contributor) {
        List<CatalogItem> results = new ArrayList<>();
        for (CatalogItem actual : catalogItems) {
            if (actual.getContributors().contains(contributor)) {
                results.add(actual);
            }
        }
        return results;
    }

    private List<CatalogItem> findItemsByTitle(String title) {
        List<CatalogItem> results = new ArrayList<>();
        for (CatalogItem actual : catalogItems) {
            if (actual.getTitles().contains(title)) {
                results.add(actual);
            }
        }
        return results;
    }

    private void checkMinimumNumber(int minimum) {
        if (minimum < 1) {
            throw new IllegalArgumentException("Page number must be positive");
        }
    }
}
