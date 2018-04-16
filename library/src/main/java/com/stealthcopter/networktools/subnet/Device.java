package com.stealthcopter.networktools.subnet;

import java.net.InetAddress;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;

public class Device {
    public String ip = "";
    public String hostname = "";
    public String mac = "";


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

    public String toJSON() {
      return '{' +
        'ip: ' +  ip + ',' +
        'mac: ' + mac + ',' +
        'hostname: ' + hostname +
      '}';
    }

     public WritableMap toMap() {
       private WritableMap deviceMap = WritableNativeMap();
       deviceMap.putString("ip", ip);
       deviceMap.putString("hostname", hostname);
       deviceMap.putString("mac", mac);
       return deviceMap;
     }

}
