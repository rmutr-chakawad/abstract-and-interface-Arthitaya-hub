public class TestDelivery {
    public static void main(String[] args){
        double weight = 10;

        Deliverable express = new ExpressDelivery();
        Deliverable economy = new EconomyDelivery();

        double expressCost = express.calculateShippingCost(weight);
        double economyCost = economy.calculateShippingCost(weight);

        System.out.println("น้ำหนักสินค้า: " + (int)weight + "กก.");
        System.out.println("ค่าขนส่งแบบด่วนพืเศษ: " +(int)expressCost + " บาท");
        System.out.println("ค่าขนส่งแบบประหยัด: " + (int)economyCost + " บาท");

        if (expressCost < economyCost){
            System.out.println("ค่าขนส่งแบบด่วนพิเศษถูกกว่า | แนะนำ:แบบด่วนพิเศษ");
        } else if (economyCost < expressCost) {
            System.out.println("ค่าขนส่งแบบประหยัดถูกกว่า | แนะนำ:แบบประหยัด");
        }
        else {
            System.out.println("ค่าขนส่งเท่ากัน");
        }
    }
}
