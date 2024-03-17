package IpAddress;

public enum Kind {
    NETWORK(0),BROADCAST(255);
    private int value;

    Kind(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}