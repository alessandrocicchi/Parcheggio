/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produttoreconsumatore;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.Semaphore;
/**
 *
 * @author Alessandro
 */
public class Produttore extends Thread{
    
    public void run(){
        
        while(true){
            try {
                
                ProdConsSem.semaVuoto.acquire();
                ProdConsSem.buffer++;
                System.out.println("Produce: " + ProdConsSem.buffer);
                ProdConsSem.semaPieno.release();
            
            }catch (InterruptedException e){
                
            }
            
            try {
                TimeUnit.SECONDS.sleep(2);
            }catch (InterruptedException e){
                
            }
            
            
                
        }
    }
}

