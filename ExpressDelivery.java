class ExpressDelivery extends LogisticsService implements Deliverable{
    ExpressDelivery(){
        super("Express");
    }

    @Override
    public double calculateShippingCost(double weight) {
        return 50 + (weight*10);
    }

    @Override
    String getServiceName(){
        return "ด่วนพิเศษ";
    }
}
