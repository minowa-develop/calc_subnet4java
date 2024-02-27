package IpAddress.calc;

import IpAddress.IpAddress;
import IpAddress.PrefixInOctet;

public abstract class IpAddressCalc {
    // make parts
    protected PrefixInOctet prefixInOctet;
    protected int hostCount;
    protected int targetOctetIndex;
    protected int octetValue;
    protected int networkValueInOctet;

    // constant
    IpAddressCalc(IpAddress ipAddress, PrefixInOctet prefixInOctet){
        this.prefixInOctet = prefixInOctet;
        hostCount = convertHostCount(prefixInOctet.getPrefix());
        targetOctetIndex = prefixInOctet.getIndex();
        octetValue = ipAddress.getOctet(targetOctetIndex);
        networkValueInOctet = (octetValue /hostCount) *hostCount;
    }

    // methods
    private int convertHostCount(int prefixInOctet){
        int hostBit = 8-prefixInOctet;
        return (int) Math.pow(2, hostBit);
    }


    // abstract methods
    protected abstract IpAddress calc(IpAddress ipAddress);
}
