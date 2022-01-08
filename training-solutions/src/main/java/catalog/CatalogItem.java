package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CatalogItem {
    private final String registrationNumber;
    private final int price;
    private final List<Feature> features = new ArrayList<>();

    public CatalogItem(String registrationNumber, int price, Feature feature, Feature... features) {
        checkRegNumber(registrationNumber);
        this.registrationNumber = registrationNumber;
        checkPrice(price);
        this.price = price;
        this.features.add(feature);
        this.features.addAll(Arrays.asList(features));
    }

    public int fullLengthAtOneItem() {
        int fullLength = 0;
        for (Feature actual : features) {
            if (actual instanceof AudioFeatures af) {
                fullLength += af.getLength();
            }
        }
        return fullLength;
    }

    public List<String> getContributors() {
        List<String> results = new ArrayList<>();
        for (Feature actual : features) {
            results.addAll(actual.getContributors());
        }
        return results;
    }

    public List<String> getTitles() {
        List<String> results = new ArrayList<>();
        for (Feature actual : features) {
            results.add(actual.getTitle());
        }
        return results;
    }

    public boolean hasAudioFeature() {
        for (Feature actual : features) {
            if (actual instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature() {
        for (Feature actual : features) {
            if (actual instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }

    public int numberOfPagesAtOneItem() {
        int numberOfPages = 0;
        for (Feature actual : features) {
            if (actual instanceof PrintedFeatures pf) {
                numberOfPages += pf.getNumberOfPages();
            }
        }
        return numberOfPages;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getPrice() {
        return price;
    }

    public List<Feature> getFeatures() {
        return new ArrayList<>(features);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof CatalogItem ci) {
            return ci.registrationNumber.equals(this.registrationNumber) && ci.price == this.price &&
                    ci.features.equals(this.features);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNumber, price, features);
    }

    private void checkRegNumber(String registrationNumber) {
        if (Validators.isBlank(registrationNumber)) {
            throw new IllegalArgumentException("Empty registration number");
        }
    }

    private void checkPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative: " + price);
        }
    }
}
