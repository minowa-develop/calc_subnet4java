package IpAddress.calc;

import IpAddress.IpAddress;
import IpAddress.Cidr;
import IpAddress.Kind;

public class CalcAddresses {
    // fields
    private IpAddress nativeAddress;
    private IpAddress networkAddress;
    private IpAddress broadAddress;

    // constant
    public CalcAddresses(Cidr cidr){
        nativeAddress = cidr.getIpaddress();

        // make calc
        IpAddressCalc networkCalc = IpAddressCalcFactory.create(nativeAddress,cidr.getPrefix(), Kind.NETWORK);
        IpAddressCalc broadcastCalc = IpAddressCalcFactory.create(nativeAddress,cidr.getPrefix(), Kind.BROADCAST);

        // calculation
        networkAddress = networkCalc.calc(nativeAddress.clone());
        broadAddress = broadcastCalc.calc(nativeAddress.clone());
    }

    // getter methods
    public IpAddress getNativeAddress() {
        return nativeAddress;
    }
    public IpAddress getNetworkAddress() {
        return networkAddress;
    }
    public IpAddress getBroadAddress() {
        return broadAddress;
    }
}
