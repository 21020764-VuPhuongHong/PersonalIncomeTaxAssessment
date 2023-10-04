import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Kiểm thử dòng điều khiển với độ đo kiểm thử C2
 */

public class TaxAssessment03Test {
    @Test
    public void testFormatTax1() {
        assertEquals("Invalid input", TaxAssessment.formatTax("A", -10000000));
    }

    @Test
    public void testFormatTax2() {
        assertEquals("125,000", TaxAssessment.formatTax("A", 2500000));
    }

    @Test
    public void testFormatTax3() {
        assertEquals("450,000", TaxAssessment.formatTax("A", 7000000));
    }

    @Test
    public void testFormatTax4() {
        assertEquals("1,275,000", TaxAssessment.formatTax("A", 13500000));
    }

    @Test
    public void testFormatTax5() {
        assertEquals("2,550,000", TaxAssessment.formatTax("A", 21000000));
    }

    @Test
    public void testFormatTax6() {
        assertEquals("7,500,000", TaxAssessment.formatTax("A", 43000000));
    }

    @Test
    public void testFormatTax7() {
        assertEquals("14,850,000", TaxAssessment.formatTax("A", 69000000));
    }

    @Test
    public void testFormatTax8() {
        assertEquals("54,900,000", TaxAssessment.formatTax("A", 185000000));
    }

    @Test
    public void testFormatTax9() {
        assertEquals("0", TaxAssessment.formatTax("B", 1000000));
    }

    @Test
    public void testFormatTax10() {
        assertEquals("1,550,000", TaxAssessment.formatTax("B", 15500000));
    }

    @Test
    public void testFormatTax11() {
        assertEquals("300,000", TaxAssessment.formatTax("C", 1500000));
    }

    @Test
    public void testFormatTax12() {
        assertEquals("Invalid input", TaxAssessment.formatTax("a", 25200000));
    }
}
