/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activtat2_2;

import activitat2.pkg1.m9.uf2.GameWorld;

/**
 *
 * @author Usuario
 */
public class GameApp{
GameFrame frame = new GameFrame();
 
/**
  * @param args the command line arguments
  */
public static void main(String[] args) {
GameApp app = new GameApp();
GameWorld ballWorld = new GameWorld();
app.frame.init(ballWorld);
ballWorld.init(app.frame.getCanvas());
 
app.frame.setVisible(true);
}
}
