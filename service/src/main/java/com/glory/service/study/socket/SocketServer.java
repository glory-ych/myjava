package com.glory.service.study.socket;

import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by yangch on 2017/4/10 0010.
 */
public class SocketServer {
    public static void main(String[] args) throws Exception {
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println("本机地址..." + inetAddress.getHostAddress());
        ServerSocket serverSocket = new ServerSocket(10000);
        while (true) {
            Socket socket = serverSocket.accept();
            PrintStream printStream = new PrintStream(socket.getOutputStream());
            printStream.print("hello world");
            printStream.close();
            socket.close();
            Thread.sleep(10);
        }
    }
}
