class FuelCheckpoint extends Checkpoint {

    public FuelCheckpoint(String id, String loc, double dist, double exp, double act) {
        super(id, loc, dist, exp, act);
    }

    public String getType() {
        return "Fuel";
    }

    public boolean isCritical() {
        return true;
    }

    public double calculatePenalty() {
        return isDelayed() ? 10 : 0;
    }
}
