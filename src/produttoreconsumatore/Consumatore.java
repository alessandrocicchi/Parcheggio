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
public class Consumatore extends Thread{
    
    public void run(){
        
        int j = 0;
        while(true){
            try {
                
                ProdConsSem.semaPieno.acquire();
                 j = ProdConsSem.buffer;
                System.out.println("Consuma: " + j);
                ProdConsSem.semaVuoto.release();
            
            }catch (InterruptedException e){
                
            }
            
            try {
                TimeUnit.SECONDS.sleep(2);
            }catch (InterruptedException e){
                
            }
            
            
                
        }
    }
}

