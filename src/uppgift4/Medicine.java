/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uppgift4;

import java.util.Scanner;
import javax.swing.JOptionPane;



public class Medicine {
    
    public static void main(String[] arg) throws InterruptedException{
        
        boolean go = true;
        double ggr = 0;
        Scanner sc;
        
        while(go){
            
            String meds = JOptionPane.showInputDialog(null, "Namn på medicin:");
            if(meds == null || meds.length()==0){
                System.exit(0);
            }
            String antalggr = JOptionPane.showInputDialog(null, "Hur många gånger per min:");
            if(antalggr == null || antalggr.length() == 0){
                System.exit(0);
            }
            
            sc = new Scanner(antalggr);
            if(sc.hasNextDouble()){
                ggr = sc.nextDouble();
            }
            else{
                break;
            }
            Med m = new Med(meds, ggr);
            Thread t = new Thread(m);
            t.start();
            
        }
        
        System.exit(0);
    }
    
    
    
}
