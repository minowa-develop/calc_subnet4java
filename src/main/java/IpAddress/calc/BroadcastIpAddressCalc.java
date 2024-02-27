package IpAddress.calc;

import IpAddress.IpAddress;
import IpAddress.PrefixInOctet;
import IpAddress.Kind;

public class BroadcastIpAddressCalc extends IpAddressCalc{
    Kind kind = Kind.BROADCAST;

    // constant
    public BroadcastIpAddressCalc(IpAddress ipAddress, PrefixInOctet prefixInOctet) {
        super(ipAddress, prefixInOctet);
    }

    @Override
    protected IpAddress calc(IpAddress ipAddress) {
        int tmp = networkValueInOctet+hostCount-1;
        ipAddress.setOctet(targetOctetIndex, tmp);
        ipAddress.setRightAll(targetOctetIndex +1, kind.getValue());
        return ipAddress;
    }


}
