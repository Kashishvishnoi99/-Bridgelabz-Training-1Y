class DeliveryCheckpoint extends Checkpoint {

    public DeliveryCheckpoint(String id, String loc, double dist, double exp, double act) {
        super(id, loc, dist, exp, act);
    }

    public String getType() {
        return "Delivery";
    }

    public boolean isCritical() {
        return true;
    }

    public double calculatePenalty() {
        double delay = actualDuration - expectedDuration;
        if (delay > 0) return delay * 2;
        return 0;
    }
}