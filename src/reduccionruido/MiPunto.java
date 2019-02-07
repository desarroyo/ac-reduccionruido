/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reduccionruido;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author PIXVS-CHEVY
 */
public class MiPunto{
       private Point punto;
       private Color color;

        public MiPunto(Point punto, Color color) {
            this.punto = punto;
            this.color = color;
        }

        public Point getPunto() {
            return punto;
        }

        public void setPunto(Point punto) {
            this.punto = punto;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }
       
       
   }
