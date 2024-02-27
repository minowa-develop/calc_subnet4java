package IpAddress;

import java.util.ArrayList;
import java.util.List;

public class IpAddress {
    private List<Integer> octets;

    public IpAddress(String ipaddress){
        octets = new ArrayList<>();
        for(String octetStr : ipaddress.split("\\.")){
            octets.add(Integer.parseInt(octetStr));
        }
    }
    public IpAddress(List<Integer> octets){
        this.octets = new ArrayList<>();
        for(int octetStr : octets){
            this.octets.add(octetStr);
        }
    }

    public void setOctet(int octetIndex, int value){
        octets.set(octetIndex, value);
    }
    public int getOctet(int octetIndex){
        return octets.get(octetIndex);
    }

    public void setRightAll(int index, int value){
        for(int i=index;i<4;i++){
            octets.set(i,value);
        }
    }

    @Override
    public String toString(){
        StringBuilder tmp = new StringBuilder();
        boolean isFirstOctet = true;
        for(int octet : octets){
            if(!isFirstOctet){
                tmp.append(".");
            }
            tmp.append(octet);
            isFirstOctet = false;
        }
        return tmp.toString();
    }

    @Override
    public IpAddress clone(){
        return new IpAddress(this.octets);
    }
}
