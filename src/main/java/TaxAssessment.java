import java.text.DecimalFormat;
import java.util.Scanner;

public class TaxAssessment {
    public static final int A_THRESHOLD_LEVEL_1 = 5000000;
    public static final int A_THRESHOLD_LEVEL_2 = 10000000;
    public static final int A_THRESHOLD_LEVEL_3 = 18000000;
    public static final int A_THRESHOLD_LEVEL_4 = 32000000;
    public static final int A_THRESHOLD_LEVEL_5 = 52000000;
    public static final int A_THRESHOLD_LEVEL_6 = 80000000;
    public static final int B_THRESHOLD = 2000000;

    public static double assessTaxA(long income) {
        double taxLevel1 = A_THRESHOLD_LEVEL_1 * 0.05;
        double taxLevel2 = (A_THRESHOLD_LEVEL_2 - A_THRESHOLD_LEVEL_1) * 0.1;
        double taxLevel3 = (A_THRESHOLD_LEVEL_3 - A_THRESHOLD_LEVEL_2) * 0.15;
        double taxLevel4 = (A_THRESHOLD_LEVEL_4 - A_THRESHOLD_LEVEL_3) * 0.2;
        double taxLevel5 = (A_THRESHOLD_LEVEL_5 - A_THRESHOLD_LEVEL_4) * 0.25;
        double taxLevel6 = (A_THRESHOLD_LEVEL_6 - A_THRESHOLD_LEVEL_5) * 0.3;

        if (income <= A_THRESHOLD_LEVEL_1) {
            return (income * 0.05);
        } else if (income <= A_THRESHOLD_LEVEL_2) {
            return (taxLevel1 + (income - A_THRESHOLD_LEVEL_1) * 0.1);
        } else if (income <= A_THRESHOLD_LEVEL_3) {
            return (taxLevel1 + taxLevel2 + (income - A_THRESHOLD_LEVEL_2) * 0.15);
        } else if (income <= A_THRESHOLD_LEVEL_4) {
            return (taxLevel1 + taxLevel2 + taxLevel3 + (income - A_THRESHOLD_LEVEL_3) * 0.2);
        } else if (income <= A_THRESHOLD_LEVEL_5) {
            return (taxLevel1 + taxLevel2 + taxLevel3 + taxLevel4 + (income - A_THRESHOLD_LEVEL_4) * 0.25);
        } else if (income <= A_THRESHOLD_LEVEL_6) {
            return (taxLevel1 + taxLevel2 + taxLevel3 + taxLevel4 + taxLevel5 + (income - A_THRESHOLD_LEVEL_5) * 0.3);
        } else {
            return (taxLevel1 + taxLevel2 + taxLevel3 + taxLevel4 + taxLevel5 + taxLevel6 + (income - A_THRESHOLD_LEVEL_6) * 0.35);
        }
    }

    public static double assessTaxB(long income) {
        if (income < B_THRESHOLD) {
            return 0;
        } else {
            return (income * 0.1);
        }
    }

    public static double assessTaxC(long income) {
        return (income * 0.2);
    }

    public static double assessTax(String person, long income) {
        if (income < 0) {
            System.out.println("Thu nhập đã nhập không hợp lệ!");
            return -1;
        } else {
            switch (person) {
                case "A":
                    return assessTaxA(income);
                case "B":
                    return assessTaxB(income);
                case "C":
                    return assessTaxC(income);
                default:
                    System.out.println("Đối tượng đã nhập không hợp lệ!");
                    return -1;
            }
        }
    }

    public static String formatTax(String person, long income) {
        // Tính thuế dựa trên đối tượng và thu nhập

        double tax = assessTax(person, income);

        // Format kết quả trả về

        if (tax >= 0) {
            DecimalFormat decimalFormat = new DecimalFormat("###,###");
            return decimalFormat.format(tax);
        } else {
            return "Invalid input";
        }
    }

    public static void main(String[] args) {
        // Người dùng nhập thông tin đối tượng và thu nhập tính thuế của đối tượng
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hướng dẫn:");
        System.out.println("\tNhập A nếu đối tượng tính thuế là Cá nhân cư trú ký hợp đồng lao động từ 03 tháng trở lên;");
        System.out.println("\tNhập B nếu đối tượng tính thuế là Cá nhân cư trú ký hợp đồng lao động dưới 03 tháng hoặc không ký hợp đồng lao động;");
        System.out.println("\tNhập C nếu đối tượng tính thuế là Cá nhân không cư trú.");
        System.out.print("Nhập đối tượng tính thuế: ");
        String person = scanner.nextLine();

        System.out.print("Nhập thu nhập tính thuế của đối tượng (VNĐ) (làm tròn đến hàng đơn vị): ");
        long income = scanner.nextLong();

        // In kết quả

        String result = formatTax(person, income);

        if (result.equals("Invalid input")) {
            System.out.println(result);
        } else {
            System.out.println("Thuế thu nhập cá nhân phải nộp: " + result + " VNĐ");
        }

        // Đóng đối tượng Scanner
        scanner.close();
    }
}

