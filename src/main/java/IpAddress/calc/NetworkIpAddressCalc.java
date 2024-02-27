package IpAddress.calc;

import IpAddress.IpAddress;
import IpAddress.PrefixInOctet;
import IpAddress.Kind;

public class NetworkIpAddressCalc extends IpAddressCalc{
    Kind kind = Kind.NETWORK;

    // constant
    public NetworkIpAddressCalc(IpAddress ipAddress, PrefixInOctet prefixInOctet) {
        super(ipAddress, prefixInOctet);
    }

    @Override
    protected IpAddress calc(IpAddress ipAddress) {
        ipAddress.setOctet(targetOctetIndex, networkValueInOctet);
        ipAddress.setRightAll(targetOctetIndex +1, kind.getValue());
        return ipAddress;
    }

}
