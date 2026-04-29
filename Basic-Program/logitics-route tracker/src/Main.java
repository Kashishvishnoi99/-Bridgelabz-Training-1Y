public class Main {
    public static void main(String[] args) {

        Driver d = new Driver("D1204", "Kavita Nair");

        d.routeHistory.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 20, 60, 70));
        d.routeHistory.addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 30, 20, 20));
        d.routeHistory.addCheckpoint(new RestCheckpoint("C3", "Motel X", 25, 40, 75));
        d.routeHistory.addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 45, 90, 110));

        System.out.println("Driver: " + d.driverId + " – " + d.name);
        System.out.println("\nRoute Summary:");

        d.routeHistory.printRoute();

        double totalDistance = d.routeHistory.computeTotalDistance();
        double totalPenalty = d.routeHistory.computeTotalPenalty();
        double routeScore = totalDistance - totalPenalty;

        System.out.println("\nTotal Distance: " + totalDistance + " km");
        System.out.println("Total Penalty: " + totalPenalty);
        System.out.println("Route Score: " + routeScore);

        System.out.println("Critical Route Check: " +
                (d.routeHistory.checkCritical() ? "All required checkpoints present"
                        : "Missing critical checkpoints"));

        DBConnection.getConnection();
    }
}
