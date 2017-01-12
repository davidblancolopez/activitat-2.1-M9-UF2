
package Activtat2_2;

import Activtat2_2.Ball;
import Activtat2_2.WorldCanvas;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ALUMNEDAM
 */
public class GameWorld implements Runnable{
    ArrayList<Ball> bolas = new ArrayList<>();
    WorldCanvas world;
    boolean cicle = true;
    //Creació del fil que s'executara de forma ciclica.
    Thread hilo;
    
    public GameWorld (){
        this.hilo = new Thread(new GameWorld());
    }

    public void startSimulation(){
        hilo.start();
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
        
        while(balls.hasNext()){
            
        }
         
        return balls;
    }

    public int getBallCount() {
        int count = 0;
        
        bolas.size();
        
        return count;
    }
    

    public void run(){
        do{
            try{
            for (Ball i : bolas) {
                i.move(world.getSize());
            }
           
            //Metode repaint que s'encarregara de tornar a pintar tota la pantalla amb
            //la posició actualitzada de cada bola.
            world.repaint();
             
            //Es pausa el fil durant 30 milisegons
            Thread.sleep(30);
            }catch(InterruptedException e){
                
            }
            
        }while(cicle);
    }
}
