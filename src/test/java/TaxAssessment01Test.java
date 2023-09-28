import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Kiểm thử theo phương pháp phân hoạch tương đương
 */

public class TaxAssessment01Test {
    @Test
    public void testFormatTax1() {
        assertEquals("Invalid input", TaxAssessment.formatTax("A", -25000000));
    }

    @Test
    public void testFormatTax2() {
        assertEquals("Invalid input", TaxAssessment.formatTax("A", -1));
    }

    @Test
    public void testFormatTax3() {
        assertEquals("0", TaxAssessment.formatTax("A", 0));
    }

    @Test
    public void testFormatTax4() {
        assertEquals("50,000", TaxAssessment.formatTax("A", 1000000));
    }

    @Test
    public void testFormatTax5() {
        assertEquals("100,000", TaxAssessment.formatTax("A", 1999999));
    }

    @Test
    public void testFormatTax6() {
        assertEquals("100,000", TaxAssessment.formatTax("A", 2000000));
    }

    @Test
    public void testFormatTax7() {
        assertEquals("175,000", TaxAssessment.formatTax("A", 3500000));
    }

    @Test
    public void testFormatTax8() {
        assertEquals("250,000", TaxAssessment.formatTax("A", 5000000));
    }

    @Test
    public void testFormatTax9() {
        assertEquals("250,000", TaxAssessment.formatTax("A", 5000001));
    }

    @Test
    public void testFormatTax10() {
        assertEquals("550,000", TaxAssessment.formatTax("A", 8000000));
    }

    @Test
    public void testFormatTax11() {
        assertEquals("750,000", TaxAssessment.formatTax("A", 10000000));
    }

    @Test
    public void testFormatTax12() {
        assertEquals("750,000", TaxAssessment.formatTax("A", 10000001));
    }

    @Test
    public void testFormatTax13() {
        assertEquals("1,320,000", TaxAssessment.formatTax("A", 13800000));
    }

    @Test
    public void testFormatTax14() {
        assertEquals("1,950,000", TaxAssessment.formatTax("A", 18000000));
    }

    @Test
    public void testFormatTax15() {
        assertEquals("1,950,000", TaxAssessment.formatTax("A", 18000001));
    }

    @Test
    public void testFormatTax16() {
        assertEquals("3,560,000", TaxAssessment.formatTax("A", 26050000));
    }

    @Test
    public void testFormatTax17() {
        assertEquals("4,750,000", TaxAssessment.formatTax("A", 32000000));
    }

    @Test
    public void testFormatTax18() {
        assertEquals("4,750,000", TaxAssessment.formatTax("A", 32000001));
    }

    @Test
    public void testFormatTax19() {
        assertEquals("8,550,000", TaxAssessment.formatTax("A", 47200000));
    }

    @Test
    public void testFormatTax20() {
        assertEquals("9,750,000", TaxAssessment.formatTax("A", 52000000));
    }

    @Test
    public void testFormatTax21() {
        assertEquals("9,750,000", TaxAssessment.formatTax("A", 52000001));
    }

    @Test
    public void testFormatTax22() {
        assertEquals("16,320,000", TaxAssessment.formatTax("A", 73900000));
    }

    @Test
    public void testFormatTax23() {
        assertEquals("18,150,000", TaxAssessment.formatTax("A", 80000000));
    }

    @Test
    public void testFormatTax24() {
        assertEquals("18,150,000", TaxAssessment.formatTax("A", 80000001));
    }

    @Test
    public void testFormatTax25() {
        assertEquals("263,367,000", TaxAssessment.formatTax("A", 780620000));
    }

    @Test
    public void testFormatTax26() {
        assertEquals("Invalid input", TaxAssessment.formatTax("B", -500000));
    }

    @Test
    public void testFormatTax27() {
        assertEquals("Invalid input", TaxAssessment.formatTax("B", -1));
    }

    @Test
    public void testFormatTax28() {
        assertEquals("0", TaxAssessment.formatTax("B", 0));
    }

    @Test
    public void testFormatTax29() {
        assertEquals("0", TaxAssessment.formatTax("B", 1500000));
    }

    @Test
    public void testFormatTax30() {
        assertEquals("0", TaxAssessment.formatTax("B", 1999999));
    }

    @Test
    public void testFormatTax31() {
        assertEquals("200,000", TaxAssessment.formatTax("B", 2000000));
    }

    @Test
    public void testFormatTax32() {
        assertEquals("350,000", TaxAssessment.formatTax("B", 3500000));
    }

    @Test
    public void testFormatTax33() {
        assertEquals("800,000", TaxAssessment.formatTax("B", 8000000));
    }

    @Test
    public void testFormatTax34() {
        assertEquals("1,400,000", TaxAssessment.formatTax("B", 14000000));
    }

    @Test
    public void testFormatTax35() {
        assertEquals("2,900,000", TaxAssessment.formatTax("B", 29000000));
    }

    @Test
    public void testFormatTax36() {
        assertEquals("3,750,000", TaxAssessment.formatTax("B", 37500000));
    }

    @Test
    public void testFormatTax37() {
        assertEquals("6,500,000", TaxAssessment.formatTax("B", 65000000));
    }

    @Test
    public void testFormatTax38() {
        assertEquals("12,000,000", TaxAssessment.formatTax("B", 120000000));
    }

    @Test
    public void testFormatTax39() {
        assertEquals("Invalid input", TaxAssessment.formatTax("C", -20000));
    }

    @Test
    public void testFormatTax40() {
        assertEquals("Invalid input", TaxAssessment.formatTax("C", -1));
    }

    @Test
    public void testFormatTax41() {
        assertEquals("0", TaxAssessment.formatTax("C", 0));
    }

    @Test
    public void testFormatTax42() {
        assertEquals("200,000", TaxAssessment.formatTax("C", 1000000));
    }

    @Test
    public void testFormatTax43() {
        assertEquals("800,000", TaxAssessment.formatTax("C", 4000000));
    }

    @Test
    public void testFormatTax44() {
        assertEquals("1,360,000", TaxAssessment.formatTax("C", 6800000));
    }

    @Test
    public void testFormatTax45() {
        assertEquals("3,200,000", TaxAssessment.formatTax("C", 16000000));
    }

    @Test
    public void testFormatTax46() {
        assertEquals("4,700,000", TaxAssessment.formatTax("C", 23500000));
    }

    @Test
    public void testFormatTax47() {
        assertEquals("7,000,000", TaxAssessment.formatTax("C", 35000000));
    }

    @Test
    public void testFormatTax48() {
        assertEquals("14,000,000", TaxAssessment.formatTax("C", 70000000));
    }

    @Test
    public void testFormatTax49() {
        assertEquals("39,700,000", TaxAssessment.formatTax("C", 198500000));
    }

    @Test
    public void testFormatTax50() {
        assertEquals("Invalid input", TaxAssessment.formatTax("1", 0));
    }

    @Test
    public void testFormatTax51() {
        assertEquals("Invalid input", TaxAssessment.formatTax("2", 3000000));
    }

    @Test
    public void testFormatTax52() {
        assertEquals("Invalid input", TaxAssessment.formatTax("3", 6500000));
    }

    @Test
    public void testFormatTax53() {
        assertEquals("Invalid input", TaxAssessment.formatTax("a", 15000000));
    }

    @Test
    public void testFormatTax54() {
        assertEquals("Invalid input", TaxAssessment.formatTax("b", 20000000));
    }

    @Test
    public void testFormatTax55() {
        assertEquals("Invalid input", TaxAssessment.formatTax("c", 39000000));
    }

    @Test
    public void testFormatTax56() {
        assertEquals("Invalid input", TaxAssessment.formatTax("mn", 72000000));
    }

    @Test
    public void testFormatTax57() {
        assertEquals("Invalid input", TaxAssessment.formatTax("@", 900000000));
    }
}
