import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Kiểm thử theo phương pháp bảng quyết định
 */

public class TaxAssessment02Test {
    @Test
    public void testFormatTax1() {
        assertEquals("Invalid input", TaxAssessment.formatTax("A", -100000));
    }

    @Test
    public void testFormatTax2() {
        assertEquals("62,500", TaxAssessment.formatTax("A", 1250000));
    }

    @Test
    public void testFormatTax3() {
        assertEquals("235,000", TaxAssessment.formatTax("A", 4700000));
    }

    @Test
    public void testFormatTax4() {
        assertEquals("560,000", TaxAssessment.formatTax("A", 8100000));
    }

    @Test
    public void testFormatTax5() {
        assertEquals("1,560,000", TaxAssessment.formatTax("A", 15400000));
    }

    @Test
    public void testFormatTax6() {
        assertEquals("3,150,000", TaxAssessment.formatTax("A", 24000000));
    }

    @Test
    public void testFormatTax7() {
        assertEquals("6,125,000", TaxAssessment.formatTax("A", 37500000));
    }

    @Test
    public void testFormatTax8() {
        assertEquals("13,350,000", TaxAssessment.formatTax("A", 64000000));
    }

    @Test
    public void testFormatTax9() {
        assertEquals("84,650,000", TaxAssessment.formatTax("A", 270000000));
    }

    @Test
    public void testFormatTax10() {
        assertEquals("Invalid input", TaxAssessment.formatTax("B", -100000));
    }

    @Test
    public void testFormatTax11() {
        assertEquals("0", TaxAssessment.formatTax("B", 1250000));
    }

    @Test
    public void testFormatTax12() {
        assertEquals("470,000", TaxAssessment.formatTax("B", 4700000));
    }

    @Test
    public void testFormatTax13() {
        assertEquals("810,000", TaxAssessment.formatTax("B", 8100000));
    }

    @Test
    public void testFormatTax14() {
        assertEquals("1,540,000", TaxAssessment.formatTax("B", 15400000));
    }

    @Test
    public void testFormatTax15() {
        assertEquals("2,400,000", TaxAssessment.formatTax("B", 24000000));
    }

    @Test
    public void testFormatTax16() {
        assertEquals("3,750,000", TaxAssessment.formatTax("B", 37500000));
    }

    @Test
    public void testFormatTax17() {
        assertEquals("6,400,000", TaxAssessment.formatTax("B", 64000000));
    }

    @Test
    public void testFormatTax18() {
        assertEquals("27,000,000", TaxAssessment.formatTax("B", 270000000));
    }

    @Test
    public void testFormatTax19() {
        assertEquals("Invalid input", TaxAssessment.formatTax("C", -100000));
    }

    @Test
    public void testFormatTax20() {
        assertEquals("250,000", TaxAssessment.formatTax("C", 1250000));
    }

    @Test
    public void testFormatTax21() {
        assertEquals("940,000", TaxAssessment.formatTax("C", 4700000));
    }

    @Test
    public void testFormatTax22() {
        assertEquals("1,620,000", TaxAssessment.formatTax("C", 8100000));
    }

    @Test
    public void testFormatTax23() {
        assertEquals("3,080,000", TaxAssessment.formatTax("C", 15400000));
    }

    @Test
    public void testFormatTax24() {
        assertEquals("4,800,000", TaxAssessment.formatTax("C", 24000000));
    }

    @Test
    public void testFormatTax25() {
        assertEquals("7,500,000", TaxAssessment.formatTax("C", 37500000));
    }

    @Test
    public void testFormatTax26() {
        assertEquals("12,800,000", TaxAssessment.formatTax("C", 64000000));
    }

    @Test
    public void testFormatTax27() {
        assertEquals("54,000,000", TaxAssessment.formatTax("C", 270000000));
    }

    @Test
    public void testFormatTax28() {
        assertEquals("Invalid input", TaxAssessment.formatTax("8", -100000));
    }

    @Test
    public void testFormatTax29() {
        assertEquals("Invalid input", TaxAssessment.formatTax("10", 1250000));
    }

    @Test
    public void testFormatTax30() {
        assertEquals("Invalid input", TaxAssessment.formatTax("1.5", 4700000));
    }

    @Test
    public void testFormatTax31() {
        assertEquals("Invalid input", TaxAssessment.formatTax("doituongA", 8100000));
    }

    @Test
    public void testFormatTax32() {
        assertEquals("Invalid input", TaxAssessment.formatTax("#", 15400000));
    }

    @Test
    public void testFormatTax33() {
        assertEquals("Invalid input", TaxAssessment.formatTax("abc", 24000000));
    }

    @Test
    public void testFormatTax34() {
        assertEquals("Invalid input", TaxAssessment.formatTax("/", 37500000));
    }

    @Test
    public void testFormatTax35() {
        assertEquals("Invalid input", TaxAssessment.formatTax("ABC", 64000000));
    }

    @Test
    public void testFormatTax36() {
        assertEquals("Invalid input", TaxAssessment.formatTax("Doi Tuong B", 270000000));
    }
}

