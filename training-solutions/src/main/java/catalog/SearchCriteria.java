package catalog;

public class SearchCriteria {
    private final String contributor, title;

    private SearchCriteria(String contributor, String title) {
        checkNullParam(contributor);
        this.contributor = contributor;
        checkNullParam(title);
        this.title = title;
    }

    public static SearchCriteria createByContributor(String contributor) {
        return new SearchCriteria(contributor, "");
    }

    public static SearchCriteria createByTitle(String title) {
        return new SearchCriteria("", title);
    }

    public static SearchCriteria createByBoth(String title, String contributor) {
        return new SearchCriteria(contributor, title);
    }

    public boolean hasContributor() {
        return !Validators.isBlank(contributor);
    }

    public boolean hasTitle() {
        return !Validators.isBlank(title);
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

    private void checkNullParam(String param) {
        if (param == null) {
            throw new IllegalArgumentException("Search parameter must not be null!");
        }
    }
}
