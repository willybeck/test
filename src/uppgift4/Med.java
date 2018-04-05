/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uppgift4;




public class Med implements Runnable{
    
    private String medNamn;
    private double interval;
    
    public Med(String namn, double ggrpm){
        this.medNamn = namn;
        this.interval = (60/ggrpm) * 1000;
    }
    
    @Override
    public void run(){
        while(!Thread.interrupted()){
            try{
                Thread.sleep(Math.round(interval));
                System.out.println("Dags att ta " + medNamn);
            }
            catch(InterruptedException e){
                break;
            }
        }
    }
    
}
