/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Point;
import java.awt.Polygon;

/**
 *
 * @author Arlenson
 */
public class Nave {
    private Polygon nave;
    private int coordx[];
    private int coordy[];
    private int dx=1;
    private int bala;

    public Nave(int[] coordx, int[] coordy) {
        this.coordx = coordx;
        this.coordy = coordy;
        nave = new Polygon(coordx, coordy, coordx.length);
    }
    
    // Un método que devuelva un objeto de tipo polígono con las las coordenadas de la nave.
    public Polygon Nave(){
        return nave;
    }
    
    // Un método que devuelva el punto de la nariz de la nave.
    public Point PuntaNave(){
        Point pn = new Point(nave.xpoints[0], nave.ypoints[0]);
        return pn;
    }
    
    public void MoverNave(){
        nave.translate(dx, 0);
    }
}
