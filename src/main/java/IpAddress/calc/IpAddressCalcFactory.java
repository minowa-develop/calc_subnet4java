package IpAddress.calc;

import IpAddress.IpAddress;
import IpAddress.PrefixInOctet;
import IpAddress.Kind;

public class IpAddressCalcFactory {
    public static IpAddressCalc create(IpAddress ipAddress, PrefixInOctet prefixInOctet, Kind kind){
        if(kind.equals(Kind.NETWORK)){
            return new NetworkIpAddressCalc(ipAddress, prefixInOctet);
        }else{
            return new BroadcastIpAddressCalc(ipAddress, prefixInOctet);
        }
    }
}
