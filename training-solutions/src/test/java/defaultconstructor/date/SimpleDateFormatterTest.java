package defaultconstructor.date;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateFormatterTest {

    @Test
    void testPrintFormattedDate() {
        SimpleDate date = new SimpleDate();
        date.setDate(1986, 9, 8);
        SimpleDateFormatter sdf = new SimpleDateFormatter();
        assertEquals("9. 8. 1986.", sdf.printFormattedDate(date, CountryCode.US));
        assertEquals("8. 9. 1986.", sdf.printFormattedDate(date, CountryCode.EN));
        assertEquals("1986. 9. 8.", sdf.printFormattedDate(date, CountryCode.HU));
        assertEquals("1986. 9. 8.", sdf.printFormattedDate(date));
    }

}