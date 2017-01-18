
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
    Thread hilo = new Thread(this);
    
    public GameWorld (){
       
    }

    //Metode que inicia la simulació iniciara el metode run de la class.
    public void startSimulation(){
        hilo.start();
    }
    
    //Metode que serveix per a finalitzar la simulació, canvia el boolean que fa
    //funcionar el bucle del metode run.
    public void endSimulation(){
        cicle = false;
    }

    //Aquest metode assigna a la variable world que tenim de tipus WOrldCanvas el canvas
    //que li arriba per parametre per iniciar-lo.
    public void init(WorldCanvas canvas) {
        this.world = canvas;
    }

    //Metode que afegeix una bola a la lista de boles que tenim.
    public void addBall(Ball b) {
        bolas.add(b);
    }

    //Aquest metode el que fa es crear un iterador i el retorna.
    //Serveix per a recorrer tot l'array de boles
    public Iterator<Ball> getBalls() {
        Iterator<Ball> balls = bolas.iterator();
        return balls;
    }

    //Metode que retorna el numero de boles que hi ha actualment, retorna el tamany 
    //de la llista de boles anomenat bolas.
    public int getBallCount() {
        
        return bolas.size();
    }
    
    //El metode run es qui executa el moviment de les boles y refresca la imatge de la pantalla.
    public void run(){
        do{
 
            //Aquest bucle recorre tota la llista de boles i crida al metode move 
            //de cadascuna per a que actualitzin la seva posició.
            for (Ball i : bolas) {
                i.move(world.getSize());
            }
           
            //Metode repaint que s'encarregara de tornar a pintar tota la pantalla amb
            //la posició actualitzada de cada bola.
            world.repaint();
            try{
            //Es pausa el fil durant 30 milisegons
            Thread.sleep(16);
            
            }catch(InterruptedException e){
                
            }
            
        }while(cicle);
    }
}
