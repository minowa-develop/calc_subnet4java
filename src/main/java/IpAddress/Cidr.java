package IpAddress;

public class Cidr {
    // fields
    private String ipaddress;
    private PrefixInOctet prefixInOctet;

    // constant
    public Cidr(String cidr){
        String[] tmp = cidr.split("/");
        ipaddress = tmp[0];
        prefixInOctet = new PrefixInOctet(Integer.parseInt(tmp[1]));
    }

    // getter methods
    public String getIpaddress() {
        return ipaddress;
    }

    public PrefixInOctet getPrefix() {
        return prefixInOctet;
    }
}
