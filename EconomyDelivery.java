class EconomyDelivery extends LogisticsService implements Deliverable {
    EconomyDelivery(){
        super("Economy");
    }

    @Override
    public double calculateShippingCost(double weight) {
        return 20 + (weight*5);
    }

    @Override
    String getServiceName(){
        return "ประหยัด";
    }
}

