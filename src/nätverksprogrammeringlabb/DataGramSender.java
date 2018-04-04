/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nätverksprogrammeringlabb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;


public class DataGramSender {
    
    public static void main(String[] args) throws UnknownHostException, SocketException, IOException, InterruptedException{
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        InetAddress toAdr = InetAddress.getLocalHost();
        int toPort = 55555;
        DatagramSocket socket = new DatagramSocket();
        String message;
        
        ArrayList<String> citatlista = new ArrayList<>();
        
        citatlista.add("Tja tjena hallå där!");
        citatlista.add("Vad heter du?");
        citatlista.add("Hur mkt är klockan?");
        
        while(true){
            for( int i = 0; i < citatlista.size(); i++ ){
                message = citatlista.get(i);
                byte[] data = message.getBytes();
                DatagramPacket packet = new DatagramPacket(data, data.length, toAdr, toPort);
                socket.send(packet);
                System.out.println(message);
                Thread.sleep(5000);
            }
        }
         
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
