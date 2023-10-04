package com.etienne.networking;

import java.net.InetAddress;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkingDemo {

    public static void main(String[] args) throws UnknownHostException {
        String url = "www.simplilearn.com";

        InetAddress inetAddress = Inet4Address.getByName(url);
        System.out.println("========================================================");

        System.out.println("Address : " + Arrays.toString(inetAddress.getAddress()));
        System.out.println("========================================================");

        // getHostAddress() method
        System.out.println("Host Address : " + inetAddress.getHostAddress());
        System.out.println("========================================================");

        // isAnyLocalAddress() method
        System.out.println("isAnyLocalAddress : " + inetAddress.isAnyLocalAddress());
        System.out.println("========================================================");

        // isLinkLocalAddress() method
        System.out.println("isLinkLocalAddress : " + inetAddress.isLinkLocalAddress());
        System.out.println("========================================================");

        // isLoopbackAddress() method
        System.out.println("isLoopbackAddress : " + inetAddress.isLoopbackAddress());
        System.out.println("========================================================");

        // isSiteLocalAddress() method
        System.out.println("isLoopbackAddress : " + inetAddress.isSiteLocalAddress());
        System.out.println("========================================================");

        // hashCode() method
        System.out.println("hashCode : " + inetAddress.hashCode());




    }
}
