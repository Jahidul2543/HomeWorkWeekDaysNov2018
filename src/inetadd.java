
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class inetadd
{

    public static void main(String[] args) throws UnknownHostException
    {

        String url = "www.geeksforgeeks.org";
        byte addr[]={127, 0, 0, 1};
        InetAddress ip1 =  Inet4Address.getByName(url);
        InetAddress ip2 =  InetAddress.getByAddress(addr);

        System.out.println("Address : " + Arrays.toString(ip1.getAddress()));

        System.out.println("Host Address : " + ip1.getHostAddress());

        System.out.println("isAnyLocalAddress : " + ip1.isAnyLocalAddress());

        System.out.println("isLinkLocalAddress : " + ip1.isLinkLocalAddress());

        System.out.println("isLoopbackAddress : " + ip1.isLoopbackAddress());

        System.out.println("isMCGlobal : " + ip1.isMCGlobal());

        System.out.println("isMCLinkLocal : " + ip1.isMCLinkLocal());

        System.out.println("isMCNodeLocal : " + ip1.isMCNodeLocal());

        System.out.println("isMCOrgLocal : " + ip1.isMCOrgLocal());

        System.out.println("isMCSiteLocal : " + ip1.isMCSiteLocal());

        System.out.println("isMulticastAddress : " + ip1.isMulticastAddress());

        System.out.println("isSiteLocalAddress : " + ip1.isSiteLocalAddress());

        System.out.println("hashCode : " + ip1.hashCode());

        System.out.println("ip1==ip2 : " + ip1.equals(ip2));
    }

}

//Networking in Java | Set 1 (Java.net.InetAddress class)