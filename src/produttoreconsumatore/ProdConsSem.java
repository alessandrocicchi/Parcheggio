/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produttoreconsumatore;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author Alessandro
 */
public class ProdConsSem {
    
    public static Semaphore semaVuoto = new Semaphore(1);
    public static Semaphore semaPieno = new Semaphore(0);
    public static int buffer = 0;
}


