import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class TaxAssessment02Test {
    @Test
    public void testFormatTax1() {
        assertEquals(TaxAssessment.formatTax("A", -100000), "Invalid input");
    }

    @Test
    public void testFormatTax2() {
        assertEquals(TaxAssessment.formatTax("A", 1250000), "62,500");
    }

    @Test
    public void testFormatTax3() {
        assertEquals(TaxAssessment.formatTax("A", 4700000), "235,000");
    }

    @Test
    public void testFormatTax4() {
        assertEquals(TaxAssessment.formatTax("A", 8100000), "560,000");
    }

    @Test
    public void testFormatTax5() {
        assertEquals(TaxAssessment.formatTax("A", 15400000), "1,560,000");
    }

    @Test
    public void testFormatTax6() {
        assertEquals(TaxAssessment.formatTax("A", 24000000), "3,150,000");
    }

    @Test
    public void testFormatTax7() {
        assertEquals(TaxAssessment.formatTax("A", 37500000), "6,125,000");
    }

    @Test
    public void testFormatTax8() {
        assertEquals(TaxAssessment.formatTax("A", 64000000), "13,350,000");
    }

    @Test
    public void testFormatTax9() {
        assertEquals(TaxAssessment.formatTax("A", 270000000), "84,650,000");
    }

    @Test
    public void testFormatTax10() {
        assertEquals(TaxAssessment.formatTax("B", -100000), "Invalid input");
    }

    @Test
    public void testFormatTax11() {
        assertEquals(TaxAssessment.formatTax("B", 1250000), "0");
    }

    @Test
    public void testFormatTax12() {
        assertEquals(TaxAssessment.formatTax("B", 4700000), "470,000");
    }

    @Test
    public void testFormatTax13() {
        assertEquals(TaxAssessment.formatTax("B", 8100000), "810,000");
    }

    @Test
    public void testFormatTax14() {
        assertEquals(TaxAssessment.formatTax("B", 15400000), "1,540,000");
    }

    @Test
    public void testFormatTax15() {
        assertEquals(TaxAssessment.formatTax("B", 24000000), "2,400,000");
    }

    @Test
    public void testFormatTax16() {
        assertEquals(TaxAssessment.formatTax("B", 37500000), "3,750,000");
    }

    @Test
    public void testFormatTax17() {
        assertEquals(TaxAssessment.formatTax("B", 64000000), "6,400,000");
    }

    @Test
    public void testFormatTax18() {
        assertEquals(TaxAssessment.formatTax("B", 270000000), "27,000,000");
    }

    @Test
    public void testFormatTax19() {
        assertEquals(TaxAssessment.formatTax("C", -100000), "Invalid input");
    }

    @Test
    public void testFormatTax20() {
        assertEquals(TaxAssessment.formatTax("C", 1250000), "250,000");
    }

    @Test
    public void testFormatTax21() {
        assertEquals(TaxAssessment.formatTax("C", 4700000), "940,000");
    }

    @Test
    public void testFormatTax22() {
        assertEquals(TaxAssessment.formatTax("C", 8100000), "1,620,000");
    }

    @Test
    public void testFormatTax23() {
        assertEquals(TaxAssessment.formatTax("C", 15400000), "3,080,000");
    }

    @Test
    public void testFormatTax24() {
        assertEquals(TaxAssessment.formatTax("C", 24000000), "4,800,000");
    }

    @Test
    public void testFormatTax25() {
        assertEquals(TaxAssessment.formatTax("C", 37500000), "7,500,000");
    }

    @Test
    public void testFormatTax26() {
        assertEquals(TaxAssessment.formatTax("C", 64000000), "12,800,000");
    }

    @Test
    public void testFormatTax27() {
        assertEquals(TaxAssessment.formatTax("C", 270000000), "54,000,000");
    }

    @Test
    public void testFormatTax28() {
        assertEquals(TaxAssessment.formatTax("8", -100000), "Invalid input");
    }

    @Test
    public void testFormatTax29() {
        assertEquals(TaxAssessment.formatTax("10", 1250000), "Invalid input");
    }

    @Test
    public void testFormatTax30() {
        assertEquals(TaxAssessment.formatTax("1.5", 4700000), "Invalid input");
    }

    @Test
    public void testFormatTax31() {
        assertEquals(TaxAssessment.formatTax("doituongA", 8100000), "Invalid input");
    }

    @Test
    public void testFormatTax32() {
        assertEquals(TaxAssessment.formatTax("#", 15400000), "Invalid input");
    }

    @Test
    public void testFormatTax33() {
        assertEquals(TaxAssessment.formatTax("abc", 24000000), "Invalid input");
    }

    @Test
    public void testFormatTax34() {
        assertEquals(TaxAssessment.formatTax("/", 37500000), "Invalid input");
    }

    @Test
    public void testFormatTax35() {
        assertEquals(TaxAssessment.formatTax("ABC", 64000000), "Invalid input");
    }

    @Test
    public void testFormatTax36() {
        assertEquals(TaxAssessment.formatTax("Doi Tuong B", 270000000), "Invalid input");
    }
}

