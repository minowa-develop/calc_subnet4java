package Main;

import IpAddress.Cidr;
import IpAddress.calc.CalcAddresses;

public class Main {
    public static void main(String[] args){
        final String CIDR = "192.168.0.36/27";
        CalcAddresses addresses = new CalcAddresses(new Cidr(CIDR));

        System.out.println("input address:"+ addresses.getNativeAddress());
        System.out.println("network address:"+ addresses.getNetworkAddress());
        System.out.println("broad address:"+ addresses.getBroadAddress());
    }
}
