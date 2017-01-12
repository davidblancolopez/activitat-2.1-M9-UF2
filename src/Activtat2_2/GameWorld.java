
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

    //Metode que inicia la simulació cridan al metode rn del propi metode.
    public void startSimulation(){
        hilo.start();
    }
    
    //Metode que serveix per a finalitzar la simulació, canvia el boolean que fa
    //funcionar el bucle del metode run.
    public void endSimulation(){
        cicle = false;
    }

    public void init(WorldCanvas canvas) {
        this.world = canvas;
    }

    //Metode que afegeix una bola a la lista de boles que tenim.
    public void addBall(Ball b) {
        bolas.add(b);
    }

    public Iterator<Ball> getBalls() {
        Iterator<Ball> balls = bolas.iterator();
        
//        while(balls.hasNext()){
//            
//        }
         
        return balls;
    }

    //Metode que retorna el numero de boles que hi ha actualment, retorna el tamany 
    //de la llista de boles anomenat bolas.
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
