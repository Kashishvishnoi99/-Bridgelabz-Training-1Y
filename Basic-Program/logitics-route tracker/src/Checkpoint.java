abstract class Checkpoint {
    protected String checkpointId;
    protected String locationName;
    protected double distanceFromLast;
    protected double expectedDuration;
    protected double actualDuration;

    public Checkpoint(String id, String loc, double dist, double exp, double act) {
        this.checkpointId = id;
        this.locationName = loc;
        this.distanceFromLast = dist;
        this.expectedDuration = exp;
        this.actualDuration = act;
    }

    public boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    public abstract String getType();
    public abstract boolean isCritical();
    public abstract double calculatePenalty();
}
