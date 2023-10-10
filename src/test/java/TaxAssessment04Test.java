import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Kiểm thử dòng dữ liệu với độ phủ All-uses
 */

public class TaxAssessment04Test {
    /**
     * Test hàm assessTaxA
     * Với độ phủ All-uses của biến income
     */

    @Test
    public void testIncomeAssessTaxA1() {
        assertEquals((double) 150000, TaxAssessment.assessTaxA(3000000));
    }

    @Test
    public void testIncomeAssessTaxA2() {
        assertEquals((double) 500000, TaxAssessment.assessTaxA(7500000));
    }

    @Test
    public void testIncomeAssessTaxA3() {
        assertEquals((double) 650000, TaxAssessment.assessTaxA(9000000));
    }

    @Test
    public void testIncomeAssessTaxA4() {
        assertEquals((double) 1500000, TaxAssessment.assessTaxA(15000000));
    }

    @Test
    public void testIncomeAssessTaxA5() {
        assertEquals((double) 1200000, TaxAssessment.assessTaxA(13000000));
    }

    @Test
    public void testIncomeAssessTaxA6() {
        assertEquals((double) 2950000, TaxAssessment.assessTaxA(23000000));
    }

    @Test
    public void testIncomeAssessTaxA7() {
        assertEquals((double) 4550000, TaxAssessment.assessTaxA(31000000));
    }

    @Test
    public void testIncomeAssessTaxA8() {
        assertEquals((double) 9250000, TaxAssessment.assessTaxA(50000000));
    }

    @Test
    public void testIncomeAssessTaxA9() {
        assertEquals((double) 9750000, TaxAssessment.assessTaxA(52000000));
    }

    @Test
    public void testIncomeAssessTaxA10() {
        assertEquals((double) 15150000, TaxAssessment.assessTaxA(70000000));
    }

    @Test
    public void testIncomeAssessTaxA11() {
        assertEquals((double) 17850000, TaxAssessment.assessTaxA(79000000));
    }

    @Test
    public void testIncomeAssessTaxA12() {
        assertEquals((double) 51400000, TaxAssessment.assessTaxA(175000000));
    }

    @Test
    public void testIncomeAssessTaxA13() {
        assertEquals((double) 250000, TaxAssessment.assessTaxA(5000000));
    }

    @Test
    public void testIncomeAssessTaxA14() {
        assertEquals((double) 550000, TaxAssessment.assessTaxA(8000000));
    }

    @Test
    public void testIncomeAssessTaxA15() {
        assertEquals((double) 1800000, TaxAssessment.assessTaxA(17000000));
    }

    @Test
    public void testIncomeAssessTaxA16() {
        assertEquals((double) 4350000, TaxAssessment.assessTaxA(30000000));
    }

    @Test
    public void testIncomeAssessTaxA17() {
        assertEquals((double) 7000000, TaxAssessment.assessTaxA(41000000));
    }

    @Test
    public void testIncomeAssessTaxA18() {
        assertEquals((double) 10050000, TaxAssessment.assessTaxA(53000000));
    }

    @Test
    public void testIncomeAssessTaxA19() {
        assertEquals((double) 21650000, TaxAssessment.assessTaxA(90000000));
    }

    /**
     * Test hàm assessTaxA
     * Với độ phủ All-uses của biến taxLevel1
     */

    @Test
    public void testTaxLevel1AssessTaxA1() {
        assertEquals((double) 700000, TaxAssessment.assessTaxA(9500000));
    }

    @Test
    public void testTaxLevel1AssessTaxA2() {
        assertEquals((double) 1875000, TaxAssessment.assessTaxA(17500000));
    }

    @Test
    public void testTaxLevel1AssessTaxA3() {
        assertEquals((double) 3150000, TaxAssessment.assessTaxA(24000000));
    }

    @Test
    public void testTaxLevel1AssessTaxA4() {
        assertEquals((double) 8000000, TaxAssessment.assessTaxA(45000000));
    }

    @Test
    public void testTaxLevel1AssessTaxA5() {
        assertEquals((double) 13650000, TaxAssessment.assessTaxA(65000000));
    }

    @Test
    public void testTaxLevel1AssessTaxA6() {
        assertEquals((double) 38100000, TaxAssessment.assessTaxA(137000000));
    }

    /**
     * Test hàm assessTaxA
     * Với độ phủ All-uses của biến taxLevel2
     */

    @Test
    public void testTaxLevel2AssessTaxA1() {
        assertEquals((double) 1350000, TaxAssessment.assessTaxA(14000000));
    }

    @Test
    public void testTaxLevel2AssessTaxA2() {
        assertEquals((double) 2150000, TaxAssessment.assessTaxA(19000000));
    }

    @Test
    public void testTaxLevel2AssessTaxA3() {
        assertEquals((double) 5500000, TaxAssessment.assessTaxA(35000000));
    }

    @Test
    public void testTaxLevel2AssessTaxA4() {
        assertEquals((double) 15450000, TaxAssessment.assessTaxA(71000000));
    }

    @Test
    public void testTaxLevel2AssessTaxA5() {
        assertEquals((double) 60150000, TaxAssessment.assessTaxA(200000000));
    }

    /**
     * Test hàm assessTaxA
     * Với độ phủ All-uses của biến taxLevel3
     */

    @Test
    public void testTaxLevel3AssessTaxA1() {
        assertEquals((double) 3650000, TaxAssessment.assessTaxA(26500000));
    }

    @Test
    public void testTaxLevel3AssessTaxA2() {
        assertEquals((double) 8750000, TaxAssessment.assessTaxA(48000000));
    }

    @Test
    public void testTaxLevel3AssessTaxA3() {
        assertEquals((double) 11550000, TaxAssessment.assessTaxA(58000000));
    }

    @Test
    public void testTaxLevel3AssessTaxA4() {
        assertEquals((double) 18500000, TaxAssessment.assessTaxA(81000000));
    }

    /**
     * Test hàm assessTaxA
     * Với độ phủ All-uses của biến taxLevel4
     */

    @Test
    public void testTaxLevel4AssessTaxA1() {
        assertEquals((double) 7250000, TaxAssessment.assessTaxA(42000000));
    }

    @Test
    public void testTaxLevel4AssessTaxA2() {
        assertEquals((double) 12150000, TaxAssessment.assessTaxA(60000000));
    }

    @Test
    public void testTaxLevel4AssessTaxA3() {
        assertEquals((double) 23750000, TaxAssessment.assessTaxA(96000000));
    }

    /**
     * Test hàm assessTaxA
     * Với độ phủ All-uses của biến taxLevel5
     */

    @Test
    public void testTaxLevel5AssessTaxA1() {
        assertEquals((double) 12750000, TaxAssessment.assessTaxA(62000000));
    }
    @Test
    public void testTaxLevel5AssessTaxA2() {
        assertEquals((double) 95150000, TaxAssessment.assessTaxA(300000000));
    }

    /**
     * Test hàm assessTaxA
     * Với độ phủ All-uses của biến taxLevel6
     */

    @Test
    public void testTaxLevel6AssessTaxA1() {
        assertEquals((double) 19900000, TaxAssessment.assessTaxA(85000000));
    }

    /**
     * Test hàm assessTaxB
     * Với độ phủ All-uses của biến income
     */

    @Test
    public void testIncomeAssessTaxB1() {
        assertEquals((double) 0, TaxAssessment.assessTaxB(1500000));
    }

    @Test
    public void testIncomeAssessTaxB2() {
        assertEquals((double) 500000, TaxAssessment.assessTaxB(5000000));
    }

    @Test
    public void testIncomeAssessTaxB3() {
        assertEquals((double) 750000, TaxAssessment.assessTaxB(7500000));
    }

    /**
     * Test hàm assessTaxC
     * Với độ phủ All-uses của biến income
     */

    @Test
    public void testIncomeAssessTaxC1() {
        assertEquals((double) 200000, TaxAssessment.assessTaxC(1000000));
    }

    /**
     * Test hàm assessTax
     * Với độ phủ All-uses của biến person
     */

    @Test
    public void testPersonAssessTax1() {
        assertEquals((double) 2350000, TaxAssessment.assessTax("A", 20000000));
    }

    @Test
    public void testPersonAssessTax2() {
        assertEquals((double) 550000, TaxAssessment.assessTax("A", 8000000));
    }

    @Test
    public void testPersonAssessTax3() {
        assertEquals((double) 900000, TaxAssessment.assessTax("B", 9000000));
    }

    @Test
    public void testPersonAssessTax4() {
        assertEquals((double) 0, TaxAssessment.assessTax("B", 1000000));
    }

    @Test
    public void testPersonAssessTax5() {
        assertEquals((double) -1, TaxAssessment.assessTax("@", 2000000));
    }

    @Test
    public void testPersonAssessTax6() {
        assertEquals((double) 280000, TaxAssessment.assessTax("C", 1400000));
    }

    @Test
    public void testPersonAssessTax7() {
        assertEquals((double) -1, TaxAssessment.assessTax("D", 10000000));
    }

    /**
     * Test hàm assessTax
     * Với độ phủ All-uses của biến income
     */

    @Test
    public void testIncomeAssessTax1() {
        assertEquals((double) -1, TaxAssessment.assessTax("B", -50000));
    }

    @Test
    public void testIncomeAssessTax2() {
        assertEquals((double) 25150000, TaxAssessment.assessTax("A", 100000000));
    }

    @Test
    public void testIncomeAssessTax3() {
        assertEquals((double) 15150000, TaxAssessment.assessTax("A", 70000000));
    }

    @Test
    public void testIncomeAssessTax4() {
        assertEquals((double) 1800000, TaxAssessment.assessTax("B", 18000000));
    }

    @Test
    public void testIncomeAssessTax5() {
        assertEquals((double) 15000000, TaxAssessment.assessTax("C", 75000000));
    }

    /**
     * Test hàm formatTax
     * Với độ phủ All-uses của biến person, biến income và biến tax
     */

    @Test
    public void testPersonFormatTax1() {
        assertEquals("Invalid input", TaxAssessment.formatTax("A", -5));
    }

    @Test
    public void testIncomeFormatTax1() {
        assertEquals("1,500,000", TaxAssessment.formatTax("B", 15000000));
    }

    @Test
    public void testTaxFormatTax1() {
        assertEquals("18,500,000", TaxAssessment.formatTax("A", 81000000));
    }

    @Test
    public void testTaxFormatTax2() {
        assertEquals("Invalid input", TaxAssessment.formatTax("!", 1200000));
    }

    @Test
    public void testTaxFormatTax3() {
        assertEquals("2,800,000", TaxAssessment.formatTax("C", 14000000));
    }
}

