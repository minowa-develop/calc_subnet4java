package IpAddress;

public class PrefixInOctet {
    // fields
    private  int prefixful;
    private int prefix;
    private int index;

    // constant
    PrefixInOctet(int prefixful){
        this.prefixful = prefixful;
        prefix = prefixful%8;
        index = prefixful/8;
    }

    // getter

    public int getPrefixful() {
        return prefixful;
    }
    public int getPrefix() {
        return prefix;
    }
    public int getIndex() {
        return index;
    }
}
