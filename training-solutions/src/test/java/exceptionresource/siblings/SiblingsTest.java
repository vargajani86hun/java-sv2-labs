package exceptionresource.siblings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {

    List<String> familyMezga;
    List<String> familySzabo;

    @BeforeEach
    void init() {
        familyMezga = Arrays.asList("Mézga Géza", "Mézga Paula",
                "Mézga Kriszta", "Mézga Aladár");
        familySzabo = Arrays.asList("Szabó Ernő bácsi", "Szabó Hilda néni",
                "Szabó Bandi", "Szabó Icu", "Szabó Laci", "Szabó Péter", "Szabó Marci",
                "Szabó Évi", "Szabó Jani");
    }

    @Test
    void testGetFullNames() {
        Siblings siblings = new Siblings();
        List<String> results = siblings.getFullNames("Mézga",
                Path.of("src/test/resources/mezga_csalad.txt"));
        assertEquals(familyMezga, results);

        results = siblings.getFullNames("Szabó",
                Path.of("src/test/resources/szabo_csalad.txt"));
        assertEquals(familySzabo, results);
    }

}