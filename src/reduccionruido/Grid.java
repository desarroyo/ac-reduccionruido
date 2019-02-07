/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reduccionruido;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author PIXVS-CHEVY
 */
public class Grid extends JPanel {

        private List<MiPunto> fillCells;
        private Color color = Color.BLUE;
        private MiPunto[][] alpuntos = new MiPunto[50][80];

        private boolean useGrid = false;
        private int factor = 10;
        
        public Grid() {
            fillCells = new ArrayList<MiPunto>();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (MiPunto fillCell : fillCells) {
                int cellX = factor + (fillCell.getPunto().x * factor);
                int cellY = factor + (fillCell.getPunto().y * factor);
                g.setColor(fillCell.getColor());
                g.fillRect(cellX, cellY, factor, factor);
            }
            g.setColor(Color.LIGHT_GRAY);
            g.drawRect(factor, factor, 800, 500);

            if(useGrid)
            for (int i = factor; i <= 800; i += factor) {
                g.drawLine(i, factor, i, 510);
            }
                
            if(useGrid)
            for (int i = factor; i <= 500; i += factor) {
                g.drawLine(factor, i, 810, i);
            }
        }

        public void fillCell(int x, int y, Color color) {
            fillCells.add(new MiPunto(new Point(x, y), color));
            alpuntos[y][x] = new MiPunto(new Point(x, y), color);
            repaint();
        }
        
        public void currentColor(Color color){
            this.color = color;
        }

    public List<MiPunto> getFillCells() {
        return fillCells;
    }

    public void setFillCells(List<MiPunto> fillCells) {
        this.fillCells = fillCells;
    }

    public boolean isUseGrid() {
        return useGrid;
    }

    public void setUseGrid(boolean useGrid) {
        this.useGrid = useGrid;
    }

    public MiPunto[][] getAlpuntos() {
        return alpuntos;
    }

    public void setAlpuntos(MiPunto[][] alpuntos) {
        this.alpuntos = alpuntos;
    }

    public int getFactor() {
        return factor;
    }

    public void setFactor(int factor) {
        this.factor = factor;
    }
        
    
        

    }
