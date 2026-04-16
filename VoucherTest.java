public class VoucherTest {
    public static void main(String[] args) {

        VoucherCalculator calc = new VoucherCalculator();

        // Kịch bản biên gây ra sự cố 11/11:
        // voucherValue (200) > cartTotal + shippingFee (50 + 10 = 60)
        double gia = calc.calculateFinalPrice(50, 10, 200);

        System.out.println("Gia tinh ra: " + gia);

        if (gia < 0) {
            System.out.println("FAIL - Gia am = " + gia + " (loi nghiem trong!)");
            System.exit(1); // <- báo GitHub Actions màu ĐỎ
        } else {
            System.out.println("PASS - Gia hop le = " + gia);
        }
    }
}
