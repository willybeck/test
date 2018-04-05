/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uppgift3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author willybeck
 */
public class Sender {
    public static void main(String[] args) throws UnknownHostException, SocketException, IOException, InterruptedException{
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        InetAddress toAdr = InetAddress.getByName("172.20.201.77");//getLocalHost();
        int toPort = 55555;
        DatagramSocket socket = new DatagramSocket();
        
        
        
        while(true){
            
            String city = JOptionPane.showInputDialog(null, "City");
            String temp = JOptionPane.showInputDialog(null, "temp");
            String message = (city + " " + temp);
            byte[] data = message.getBytes();
            DatagramPacket packet = new DatagramPacket(data, data.length, toAdr, toPort);
            socket.send(packet);
            System.out.println(message);
            
        }
         
        
    }
}
