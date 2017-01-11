
package activitat2.pkg1.m9.uf2;

import Activtat2_2.Ball;
import Activtat2_2.WorldCanvas;
import java.util.Iterator;

/**
 *
 * @author ALUMNEDAM
 */
public class GameWorld implements Runnable{
    WorldCanvas world;
    boolean cicle = true;

    
    public GameWorld (){
       
    }

    public void startSimulation(){
        //Creació del fil que s'executara de forma ciclica.
        Thread hilo = new Thread(new GameWorld());
    }
    
    public void endSimulation(){
        
        cicle = false;
    }

    public void init(WorldCanvas canvas) {
        this.world = canvas;
        
    }

    public void addBall(Ball b) {
        
    }

    public Iterator<Ball> getBalls() {
        Iterator<Ball> balls = null;
        
        
        
        return balls;
    }

    public int getBallCount() {
        int count = 0;
        
        
        
        return count;
    }
    

    public void run(){
       do{
           
           
           
           
       }while(cicle);
    }
}
