package com.glory.service.study.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by yangch on 2017/4/10 0010.
 */
public class SocketClient {
    public static void main(String[] args) throws Exception {
        String cont = null;
        InetAddress inetAddress = InetAddress.getLocalHost();
        Socket socket = new Socket(inetAddress.getHostAddress(), 10000);
        while (true) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = bufferedReader.readLine();
            if (cont != line) {
                cont = line;
                System.out.println("get data from server..." + line);
            }
            bufferedReader.close();
            socket.close();
            Thread.sleep(5);
        }
    }
}
