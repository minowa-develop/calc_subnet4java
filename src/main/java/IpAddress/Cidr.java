package IpAddress;

public class Cidr {
    // fields
    private IpAddress ipaddress;
    private PrefixInOctet prefixInOctet;

    // constant
    public Cidr(String cidr){
        String[] tmp = cidr.split("/");
        ipaddress = new IpAddress(tmp[0]);
        prefixInOctet = new PrefixInOctet(Integer.parseInt(tmp[1]));
    }

    // getter methods
    public IpAddress getIpaddress() {
        return ipaddress;
    }

    public PrefixInOctet getPrefix() {
        return prefixInOctet;
    }
}
