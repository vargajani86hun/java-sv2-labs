package catalog;

import java.util.List;

public class Validators {
    private Validators(){

    }

    public static boolean isBlank(String value) {
        return (value == null || value.trim().isEmpty());
    }

    public static boolean isEmpty(List<?> param) {
        return (param == null || param.isEmpty());
    }
}
