
package Activtat2_2;

import Activtat2_2.Ball;
import Activtat2_2.WorldCanvas;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ALUMNEDAM
 */
public class GameWorld implements Runnable{
    ArrayList<Ball> bolas;
    WorldCanvas world;
    boolean cicle = true;

    
    public GameWorld (){
        this.bolas = new ArrayList<>();
       
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
        bolas.add(b);
    }

    public Iterator<Ball> getBalls() {
        Iterator<Ball> balls = bolas.iterator();
        
        
        
        return balls;
    }

    public int getBallCount() {
        int count = 0;
        
        bolas.size();
        
        return count;
    }
    

    public void run(){
       do{
           
                   
       }while(cicle);
    }
}
