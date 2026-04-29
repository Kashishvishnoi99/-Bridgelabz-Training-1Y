class RouteLinkedList<T extends Checkpoint> {
    private Node<T> head;

    public void addCheckpoint(T checkpoint) {
        Node<T> newNode = new Node<>(checkpoint);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public boolean removeCheckpoint(String checkpointId) {
        if (head == null) return false;

        if (head.data.checkpointId.equals(checkpointId)) {
            head = head.next;
            return true;
        }

        Node<T> temp = head;
        while (temp.next != null) {
            if (temp.next.data.checkpointId.equals(checkpointId)) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public T findCheckpoint(String checkpointId) {
        Node<T> temp = head;

        while (temp != null) {
            if (temp.data.checkpointId.equals(checkpointId)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    public double computeTotalDistance() {
        double sum = 0;
        Node<T> temp = head;

        while (temp != null) {
            sum += temp.data.distanceFromLast;
            temp = temp.next;
        }
        return sum;
    }

    public double computeTotalPenalty() {
        double sum = 0;
        Node<T> temp = head;

        while (temp != null) {
            sum += temp.data.calculatePenalty();
            temp = temp.next;
        }
        return sum;
    }

    public void printRoute() {
        Node<T> temp = head;
        int i = 1;

        while (temp != null) {
            T c = temp.data;

            System.out.println(i + ". " + c.getType() +
                    "Checkpoint - " + c.locationName +
                    " - " + (c.isDelayed() ? "Delayed" : "On Time") +
                    " - Penalty: " + c.calculatePenalty());

            temp = temp.next;
            i++;
        }
    }

    public boolean checkCritical() {
        Node<T> temp = head;

        boolean delivery = false;
        boolean fuel = false;

        while (temp != null) {
            if (temp.data.getType().equals("Delivery")) delivery = true;
            if (temp.data.getType().equals("Fuel")) fuel = true;
            temp = temp.next;
        }

        return delivery && fuel;
    }
}
