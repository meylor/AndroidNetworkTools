package com.stealthcopter.networktools.subnet;

import java.net.InetAddress;
import java.util.HashMap;

public class Device {
    public String ip = "";
    public String hostname = "";
    public String mac = "";
    public HashMap deviceMap = new HashMap();


    public float time = 0;

    public Device(InetAddress ip) {
        this.ip = ip.getHostAddress();
        this.hostname = ip.getCanonicalHostName();
    }

    @Override
    public String toString() {
        return "Device{" +
                "ip='" + ip + '\'' +
                ", hostname='" + hostname + '\'' +
                ", mac='" + mac + '\'' +
                ", time=" + time +
                '}';
    }

    public HashMap toMap() {
       deviceMap.put("ip", ip);
       deviceMap.put("hostname", hostname);
       deviceMap.put("mac", mac);
       return deviceMap;
    }
}
