/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reduccionruido;

import java.awt.Point;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author PIXVS-CHEVY
 */
public class main extends javax.swing.JFrame {

    int filas = 49;
    int columnas = 79;
    int cont = 0;
    
    
    Integer[][] img = new Integer[50][80];
        String[][] imgTmp = {
            {"49", "6d", "6d", "6d", "6e", "92", "b7", "b7", "b7", "92", "6d", "49", "6d", "6e", "6e", "6e", "6e", "6e", "92", "92", "92", "92", "6e", "92", "92", "92", "92", "92", "92", "92", "92", "92", "92", "92", "b6", "b6", "b6", "b7", "db", "ff", "db", "db", "db", "db", "db", "db", "ff", "ff", "db", "6d", "49", "6e", "92", "b6", "b6", "b6", "92", "6d", "25", "6d", "92", "b6", "b6", "92", "b6", "b7", "6e", "25", "25", "49", "49", "25", "49", "25", "49", "49", "6e", "b6", "92", "db"},
            {"49", "6d", "6d", "6d", "6e", "92", "b7", "b7", "b7", "92", "6d", "49", "6d", "6e", "6d", "6e", "6e", "6e", "92", "6e", "92", "92", "6e", "6e", "92", "92", "92", "92", "92", "92", "92", "92", "92", "92", "92", "92", "b7", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "ff", "ff", "db", "6d", "6d", "92", "b6", "b7", "b6", "b6", "6d", "25", "49", "6e", "92", "92", "92", "b6", "92", "49", "25", "49", "49", "25", "49", "49", "25", "49", "6e", "92", "b6", "b6", "db"},
            {"49", "6d", "6d", "6d", "6e", "92", "b6", "b7", "b7", "92", "6d", "49", "6d", "6d", "6d", "6e", "6e", "6e", "92", "6e", "b6", "92", "6e", "6e", "92", "92", "92", "92", "92", "92", "92", "92", "92", "92", "92", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "ff", "ff", "b7", "49", "92", "b6", "b6", "b6", "92", "6e", "25", "25", "25", "92", "db", "b6", "b6", "6d", "25", "25", "49", "49", "49", "49", "49", "25", "49", "92", "b6", "b6", "b6", "db"},
            {"49", "6d", "6d", "6d", "6e", "92", "b6", "b7", "b7", "92", "6d", "49", "6d", "6e", "6d", "6e", "6e", "6e", "6e", "6e", "b7", "6e", "6e", "6e", "92", "92", "92", "92", "92", "92", "92", "92", "92", "b6", "db", "db", "db", "b7", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "ff", "ff", "6e", "6e", "b6", "b6", "b6", "b6", "6d", "25", "24", "6d", "db", "db", "ff", "db", "49", "25", "49", "49", "49", "25", "49", "25", "49", "92", "b6", "b6", "b7", "b6", "b7"},
            {"49", "6d", "6d", "6d", "6e", "92", "b7", "b7", "b7", "92", "6d", "49", "6d", "6e", "6e", "6e", "6e", "6e", "6e", "92", "b7", "6e", "6e", "6e", "92", "92", "92", "92", "92", "92", "92", "92", "b6", "b7", "db", "b7", "b7", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "ff", "ff", "db", "6e", "b6", "b6", "b6", "92", "49", "24", "92", "db", "db", "ff", "ff", "ff", "6d", "25", "49", "49", "49", "25", "49", "25", "6e", "b6", "b6", "b6", "b7", "b6", "db"},
            {"49", "6e", "6e", "6d", "6e", "92", "b7", "b7", "b7", "92", "6d", "49", "6d", "6e", "6e", "6e", "6e", "6e", "6e", "92", "b7", "6e", "6e", "6e", "92", "92", "92", "92", "92", "92", "92", "b6", "b7", "b7", "b7", "b7", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "ff", "ff", "b6", "92", "b6", "b6", "92", "49", "92", "db", "db", "db", "db", "ff", "ff", "6e", "25", "49", "25", "25", "49", "25", "49", "b6", "b6", "b6", "b6", "b6", "b6", "db"},
            {"49", "6e", "6e", "6d", "6e", "92", "b7", "b7", "b7", "b6", "6d", "49", "6d", "6e", "6e", "6e", "6e", "6e", "6e", "b6", "b7", "6e", "6e", "6e", "6e", "92", "92", "92", "92", "92", "b6", "b6", "92", "b7", "db", "b7", "db", "db", "db", "b7", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "b7", "b6", "b6", "b7", "db", "db", "db", "db", "db", "db", "ff", "ff", "6d", "25", "49", "25", "25", "49", "25", "92", "b6", "b6", "b7", "b6", "b6", "b6", "b7"},
            {"49", "6e", "6e", "6d", "6e", "92", "b7", "b7", "b7", "b6", "6d", "49", "6d", "6e", "6e", "6e", "6e", "6e", "6e", "b7", "b7", "6e", "6e", "6e", "6e", "92", "92", "92", "92", "92", "b6", "92", "b6", "b7", "b7", "b7", "b7", "b7", "b7", "b7", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "ff", "b7", "b7", "db", "db", "db", "db", "db", "db", "db", "db", "ff", "ff", "49", "25", "25", "49", "49", "25", "6e", "b6", "92", "b6", "b7", "b6", "b6", "b6", "b7"},
            {"49", "6e", "6e", "6d", "6e", "92", "b7", "b7", "b7", "b6", "6d", "49", "6d", "6e", "6e", "6e", "6e", "6e", "6e", "db", "b7", "92", "6e", "6e", "6e", "92", "92", "92", "92", "92", "92", "b6", "b6", "b6", "b7", "b7", "b7", "b7", "b7", "b7", "b7", "b7", "db", "db", "b7", "db", "db", "db", "db", "db", "db", "b7", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "ff", "db", "49", "25", "49", "25", "25", "49", "92", "b6", "b6", "b7", "b6", "b6", "b6", "b6", "b7"},
            {"49", "6e", "6d", "6d", "6e", "92", "b7", "b7", "b7", "b6", "6d", "49", "6d", "6e", "6e", "6e", "6d", "6e", "6e", "db", "b7", "92", "92", "6e", "6e", "6e", "92", "92", "92", "92", "92", "b6", "b6", "b6", "b6", "b7", "b7", "b7", "b7", "b7", "b7", "b7", "b7", "b7", "b7", "db", "db", "db", "db", "b7", "b7", "b7", "db", "db", "db", "db", "db", "db", "db", "db", "ff", "b7", "b7", "ff", "92", "25", "49", "25", "25", "49", "92", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b7"},
            {"49", "6e", "6d", "6d", "6e", "92", "b7", "b7", "b7", "b6", "6e", "49", "6d", "6e", "6e", "6e", "6d", "6e", "6e", "db", "b7", "b6", "92", "6e", "6e", "92", "92", "92", "92", "92", "b6", "92", "b6", "b6", "b6", "b6", "b7", "b7", "b6", "b7", "b7", "b7", "b7", "b7", "b7", "b7", "b7", "b7", "b7", "b7", "b7", "db", "db", "db", "db", "db", "db", "db", "ff", "ff", "db", "b7", "b6", "db", "6d", "25", "49", "25", "25", "6d", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b7"},
            {"49", "6e", "6d", "6d", "6e", "b6", "b7", "db", "b7", "b6", "6e", "49", "6d", "6e", "6e", "6e", "6e", "6d", "6e", "db", "b7", "b6", "92", "6e", "6e", "92", "92", "92", "92", "92", "92", "92", "92", "b6", "b6", "b6", "b6", "b6", "b6", "92", "b6", "b7", "b6", "b7", "b7", "b6", "b7", "b6", "b7", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "ff", "b6", "92", "b6", "b7", "25", "25", "49", "49", "49", "92", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b7"},
            {"49", "6e", "6e", "6e", "92", "b6", "b7", "db", "b7", "b6", "6e", "49", "6d", "6e", "6e", "6e", "6e", "6d", "6d", "db", "db", "b6", "92", "92", "92", "92", "92", "92", "92", "92", "92", "92", "b6", "92", "92", "92", "6e", "92", "b6", "92", "92", "92", "92", "92", "6e", "92", "b6", "b7", "db", "db", "db", "db", "db", "db", "db", "db", "db", "ff", "ff", "b7", "6d", "6d", "db", "92", "24", "49", "25", "25", "49", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b7"},
            {"49", "6e", "6e", "6e", "92", "b6", "b7", "b7", "b7", "b6", "6e", "49", "6d", "6e", "6e", "6e", "6e", "6d", "6d", "db", "db", "b6", "92", "92", "92", "92", "92", "92", "92", "92", "92", "92", "92", "92", "92", "92", "6d", "6d", "92", "6e", "49", "6d", "49", "25", "49", "6e", "b7", "db", "db", "db", "db", "db", "db", "db", "db", "db", "ff", "b6", "92", "6d", "6d", "b7", "b7", "25", "25", "25", "49", "25", "92", "b6", "b6", "b7", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b7"},
            {"49", "6e", "6e", "6e", "92", "b6", "b7", "b7", "b7", "b6", "6e", "49", "6d", "6e", "6e", "6e", "6e", "6e", "6d", "b7", "ff", "b6", "92", "92", "6e", "92", "92", "92", "92", "92", "92", "92", "92", "92", "92", "6d", "49", "49", "6d", "6d", "6e", "49", "49", "49", "6e", "b6", "db", "db", "db", "db", "db", "db", "db", "db", "db", "db", "6e", "6d", "6d", "92", "db", "b6", "25", "25", "49", "25", "49", "49", "b6", "b6", "b7", "b7", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b7"},
            {"49", "6e", "6e", "6e", "6e", "b6", "b7", "b7", "b7", "b6", "6e", "49", "6d", "6d", "6e", "6d", "6d", "6e", "6d", "92", "ff", "b7", "b6", "92", "92", "92", "92", "92", "92", "92", "92", "92", "92", "49", "49", "49", "49", "6d", "6d", "49", "6d", "49", "49", "92", "b7", "db", "db", "db", "db", "db", "db", "db", "db", "b7", "92", "6e", "92", "b6", "b6", "db", "b6", "49", "25", "49", "25", "25", "49", "6e", "b6", "b6", "b7", "b7", "b7", "b7", "b6", "b6", "b6", "b6", "b6", "b7"},
            {"49", "6e", "6e", "6e", "6e", "92", "b7", "db", "b7", "b6", "6e", "49", "6d", "6d", "6d", "6d", "6e", "6e", "6e", "6e", "db", "db", "b6", "92", "92", "92", "92", "92", "92", "92", "6e", "6d", "49", "49", "49", "25", "49", "49", "49", "6d", "49", "6d", "92", "b7", "db", "db", "db", "db", "b7", "db", "db", "db", "92", "49", "6e", "92", "92", "b7", "db", "92", "25", "25", "49", "49", "25", "25", "49", "92", "b6", "b7", "b7", "b7", "b7", "b6", "b6", "b6", "b6", "b6", "b6", "b7"},
            {"49", "6e", "6e", "6e", "6e", "92", "b7", "b7", "b7", "b6", "6e", "49", "6d", "6d", "6d", "6d", "6d", "6e", "6e", "6d", "b6", "db", "b7", "92", "92", "92", "92", "92", "92", "92", "6d", "6d", "6d", "25", "49", "49", "49", "49", "49", "49", "6d", "92", "b6", "db", "db", "db", "db", "b7", "b7", "db", "db", "db", "b6", "6d", "6d", "92", "92", "b7", "92", "49", "25", "49", "49", "25", "25", "25", "6d", "92", "b6", "b7", "b7", "b7", "b7", "b6", "b6", "b6", "b6", "b6", "b6", "b7"},
            {"49", "6e", "6e", "6e", "6e", "92", "b7", "b7", "b7", "b6", "6e", "49", "6d", "6e", "6d", "6e", "6e", "6e", "6e", "6d", "92", "ff", "b7", "92", "92", "92", "92", "92", "6e", "6d", "49", "49", "6d", "49", "49", "49", "49", "25", "25", "49", "6e", "92", "db", "db", "db", "b7", "b7", "b7", "db", "db", "db", "db", "db", "6e", "49", "6d", "92", "92", "49", "24", "25", "49", "49", "25", "25", "49", "92", "92", "b7", "b7", "b6", "b6", "b7", "b7", "b7", "b6", "b6", "b6", "b6", "b7"},
            {"49", "6e", "6e", "6d", "6d", "92", "b7", "b7", "b7", "b6", "6e", "49", "6d", "6e", "6e", "6e", "6e", "6e", "92", "6e", "6e", "ff", "b6", "6e", "92", "92", "92", "92", "6d", "49", "25", "49", "49", "49", "49", "6d", "49", "24", "49", "92", "92", "b7", "db", "db", "b7", "b7", "b7", "b7", "db", "db", "db", "db", "db", "92", "49", "49", "b6", "6e", "25", "49", "49", "49", "49", "25", "25", "6d", "92", "92", "b6", "b7", "b6", "b7", "b7", "b7", "b7", "b6", "b6", "b6", "b6", "b7"},
            {"49", "6e", "6e", "6d", "6d", "92", "b7", "b7", "b7", "b6", "6e", "49", "6d", "6e", "6e", "6e", "6e", "92", "92", "92", "6e", "db", "92", "6e", "92", "92", "6e", "49", "49", "49", "49", "49", "49", "49", "49", "6d", "49", "25", "92", "b6", "b7", "b7", "db", "b7", "b6", "b7", "b7", "db", "db", "db", "db", "ff", "ff", "b6", "49", "24", "92", "92", "25", "49", "49", "49", "49", "25", "25", "6e", "92", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b7"},
            {"49", "6e", "6e", "6d", "6d", "92", "b7", "b7", "b7", "b6", "6e", "49", "6d", "6e", "6e", "6e", "6e", "6e", "92", "92", "6e", "b6", "92", "92", "92", "92", "49", "49", "25", "49", "49", "25", "49", "49", "49", "49", "49", "92", "b6", "db", "b7", "b7", "db", "b7", "b6", "b6", "b7", "db", "db", "db", "db", "ff", "ff", "b7", "49", "25", "6d", "92", "25", "25", "49", "49", "49", "25", "49", "92", "b6", "b7", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b7"},
            {"49", "6e", "6e", "6d", "6d", "92", "b7", "db", "b7", "b6", "6e", "49", "6d", "6e", "6e", "6e", "6e", "6e", "92", "92", "92", "92", "92", "92", "92", "6d", "49", "49", "25", "49", "49", "25", "49", "49", "49", "49", "6e", "b6", "b6", "b7", "db", "b7", "b7", "b6", "b7", "b7", "db", "db", "db", "db", "db", "db", "ff", "db", "6d", "25", "49", "92", "49", "49", "49", "49", "49", "25", "6d", "92", "b6", "b6", "b7", "b6", "b6", "b6", "b6", "b6", "b6", "92", "b6", "b6", "b6", "b6"},
            {"49", "6e", "6e", "6e", "6d", "92", "b7", "db", "b7", "b6", "6e", "49", "6d", "6e", "6e", "6e", "6e", "92", "6e", "92", "92", "49", "6e", "92", "6d", "49", "49", "6d", "49", "49", "49", "25", "49", "49", "49", "49", "92", "b7", "b7", "b7", "db", "92", "92", "92", "92", "b7", "b7", "b7", "db", "db", "db", "db", "db", "b7", "49", "24", "49", "b6", "49", "49", "49", "49", "25", "25", "92", "92", "b7", "b6", "b7", "b6", "b7", "b6", "b6", "b6", "b6", "b6", "b6", "92", "92", "b6"},
            {"49", "6e", "6e", "6d", "6d", "92", "b7", "b7", "db", "b7", "6e", "49", "6d", "6e", "6e", "6e", "6e", "6e", "6e", "b6", "92", "49", "6e", "6e", "49", "49", "49", "49", "49", "49", "49", "25", "49", "49", "49", "92", "b7", "db", "b7", "db", "92", "92", "92", "6e", "49", "6e", "b6", "b7", "db", "db", "db", "b7", "92", "6d", "6e", "49", "49", "b6", "49", "49", "49", "49", "25", "49", "92", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "92", "b6"},
            {"49", "6e", "6e", "6d", "6d", "92", "b7", "db", "b7", "b6", "6e", "49", "6d", "6d", "6d", "6e", "6e", "92", "92", "b6", "b6", "92", "49", "49", "6d", "6d", "49", "49", "49", "49", "49", "49", "25", "25", "6e", "b7", "db", "db", "b7", "6d", "49", "49", "49", "49", "49", "92", "92", "b6", "db", "ff", "b6", "49", "49", "49", "49", "49", "25", "92", "49", "49", "49", "49", "25", "6d", "92", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "92", "b6"},
            {"49", "6e", "6d", "6d", "6d", "92", "b7", "db", "db", "b6", "6e", "49", "6d", "6d", "6e", "6e", "49", "b7", "b6", "b6", "92", "49", "49", "49", "49", "6d", "49", "25", "49", "49", "25", "49", "25", "49", "b6", "db", "db", "db", "6d", "25", "49", "25", "6e", "b6", "6d", "6e", "92", "92", "db", "db", "6d", "25", "6e", "49", "25", "25", "49", "92", "6e", "49", "25", "49", "49", "92", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "92", "92", "92", "b6"},
            {"49", "6e", "6d", "6d", "49", "92", "b7", "db", "db", "b7", "6e", "49", "6d", "6e", "6e", "6d", "49", "92", "db", "92", "25", "49", "49", "49", "49", "6d", "6e", "25", "49", "49", "25", "25", "25", "6e", "b7", "db", "db", "92", "92", "6d", "6d", "6e", "b7", "db", "92", "6e", "92", "92", "db", "b7", "6e", "6e", "b6", "6d", "25", "49", "49", "92", "6e", "49", "25", "49", "49", "92", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "92", "92", "92", "92", "b7"},
            {"49", "6e", "6d", "6d", "49", "92", "b7", "db", "db", "b7", "6e", "6d", "6e", "6e", "6e", "6d", "92", "92", "6e", "49", "6d", "6d", "49", "49", "6d", "6e", "92", "49", "25", "49", "25", "25", "49", "b6", "db", "db", "92", "92", "b6", "92", "92", "92", "92", "b6", "b7", "92", "92", "92", "db", "db", "92", "92", "92", "49", "49", "25", "49", "92", "92", "49", "25", "25", "6d", "92", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "92", "92", "92", "b6", "b7", "db", "db"},
            {"49", "6e", "6d", "49", "49", "92", "b7", "db", "db", "b7", "92", "6d", "6d", "6e", "92", "92", "92", "49", "49", "49", "6d", "6e", "49", "49", "6d", "6e", "6e", "49", "25", "25", "25", "49", "92", "b7", "db", "6e", "6e", "92", "b6", "b6", "b7", "b6", "b6", "b6", "b6", "92", "92", "92", "db", "db", "b7", "92", "92", "6e", "6d", "25", "49", "92", "92", "49", "25", "25", "6e", "92", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "92", "92", "92", "b7", "db", "db", "db", "db"},
            {"49", "6d", "6d", "49", "49", "92", "b7", "db", "db", "b7", "6e", "6d", "6d", "92", "92", "92", "6e", "49", "49", "6d", "6e", "49", "24", "49", "6e", "6e", "6e", "6d", "25", "25", "25", "6e", "b6", "db", "6e", "6d", "92", "b6", "b6", "b7", "b7", "db", "b7", "b7", "b7", "92", "92", "92", "db", "db", "b7", "b6", "92", "92", "49", "25", "49", "6e", "92", "25", "25", "49", "92", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "92", "92", "92", "92", "b7", "db", "db", "db", "db", "db"},
            {"49", "6d", "49", "49", "49", "92", "b7", "db", "db", "b7", "6e", "49", "6e", "92", "92", "6e", "49", "49", "49", "6e", "6e", "49", "25", "49", "49", "49", "49", "92", "49", "25", "49", "92", "db", "92", "49", "6e", "92", "92", "b6", "b7", "b7", "db", "b7", "b7", "92", "b6", "92", "92", "db", "ff", "b7", "b6", "92", "92", "49", "49", "49", "6e", "92", "25", "25", "49", "92", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "92", "92", "92", "b6", "db", "db", "db", "db", "db", "db"},
            {"49", "49", "49", "49", "49", "92", "b7", "db", "b7", "b7", "6e", "6d", "6e", "92", "92", "6e", "6e", "6d", "49", "6d", "6e", "25", "49", "25", "49", "49", "49", "92", "6e", "24", "6d", "b6", "db", "49", "49", "6e", "92", "92", "b6", "b6", "b7", "b7", "b7", "b7", "b6", "92", "92", "92", "b7", "ff", "b7", "b6", "92", "92", "49", "49", "49", "6d", "b6", "49", "25", "6e", "b6", "b7", "b6", "b6", "b6", "b6", "b6", "92", "92", "92", "b6", "db", "db", "db", "db", "db", "db", "db"},
            {"49", "49", "49", "49", "49", "92", "b7", "db", "db", "b6", "6e", "6d", "92", "92", "6e", "6d", "6e", "49", "6d", "6e", "6e", "49", "49", "25", "49", "6d", "6e", "92", "49", "25", "6e", "db", "6d", "25", "49", "6d", "92", "92", "b6", "b6", "b6", "b7", "b7", "b6", "92", "92", "92", "92", "b6", "ff", "b7", "92", "92", "6e", "49", "49", "49", "49", "b6", "49", "25", "92", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "92", "92", "92", "b7", "db", "db", "db", "db", "db", "db", "db"},
            {"49", "6d", "49", "49", "49", "92", "b7", "b7", "db", "b6", "6e", "6d", "6e", "92", "6d", "6d", "6d", "49", "6d", "6d", "6e", "49", "49", "25", "49", "6e", "6e", "49", "24", "92", "b6", "b6", "24", "25", "49", "6d", "92", "92", "92", "b6", "b6", "b6", "b7", "b6", "92", "92", "92", "92", "92", "ff", "b6", "92", "92", "6d", "25", "49", "49", "49", "b6", "49", "49", "92", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "92", "92", "b6", "db", "db", "db", "db", "db", "db", "db", "db"},
            {"49", "6d", "49", "49", "49", "92", "b7", "b7", "db", "b7", "92", "49", "6e", "6e", "49", "6d", "49", "6d", "49", "6d", "92", "6d", "25", "49", "25", "49", "49", "24", "49", "db", "b7", "49", "25", "49", "6d", "6e", "92", "92", "92", "92", "b6", "b6", "b6", "b6", "92", "92", "6e", "6e", "92", "db", "b6", "b6", "92", "49", "25", "49", "49", "49", "b6", "6d", "49", "b6", "b6", "b6", "b6", "b6", "b6", "92", "b6", "92", "92", "b6", "db", "db", "db", "db", "db", "db", "db", "db"},
            {"49", "6d", "49", "49", "49", "92", "b7", "b7", "db", "b7", "6e", "49", "6e", "92", "49", "49", "6d", "49", "6d", "6d", "92", "6e", "49", "6e", "49", "49", "49", "6e", "92", "b7", "6d", "25", "49", "49", "6d", "6e", "92", "92", "92", "92", "92", "b6", "b6", "b6", "92", "92", "92", "92", "b6", "db", "b6", "92", "6d", "25", "49", "49", "49", "25", "92", "6e", "6e", "b6", "b6", "b6", "b6", "b6", "b6", "92", "b6", "92", "92", "b7", "db", "db", "db", "db", "db", "db", "db", "db"},
            {"49", "49", "49", "49", "6d", "92", "b7", "b7", "db", "b7", "6e", "49", "6d", "92", "49", "6d", "6d", "49", "49", "6d", "6d", "92", "6e", "6d", "49", "6d", "92", "b7", "92", "6e", "25", "49", "49", "49", "6d", "6e", "92", "92", "92", "92", "92", "b6", "b6", "b6", "b6", "b6", "b7", "db", "db", "db", "b6", "92", "49", "25", "49", "49", "49", "25", "92", "92", "92", "b6", "b6", "b6", "b6", "b6", "b6", "92", "b6", "92", "92", "db", "db", "db", "db", "db", "db", "ff", "ff", "db"},
            {"25", "49", "49", "49", "6d", "92", "b7", "b7", "db", "b7", "92", "6d", "6e", "92", "6d", "6d", "49", "49", "49", "6d", "49", "6e", "92", "49", "6d", "92", "db", "92", "6e", "49", "49", "49", "49", "49", "6d", "6e", "92", "92", "92", "92", "92", "92", "92", "b6", "b6", "b6", "b7", "db", "db", "b7", "92", "6e", "25", "25", "49", "49", "49", "25", "6e", "92", "92", "b6", "b6", "b6", "b6", "92", "b6", "92", "b6", "92", "92", "db", "db", "db", "db", "db", "ff", "ff", "ff", "db"},
            {"25", "49", "49", "49", "6d", "92", "b7", "db", "db", "b7", "6e", "6d", "6e", "92", "49", "49", "49", "49", "6d", "6d", "49", "6d", "6e", "6d", "b6", "db", "92", "92", "49", "25", "49", "25", "49", "49", "6d", "6d", "92", "92", "92", "92", "92", "92", "6e", "92", "92", "92", "92", "92", "92", "92", "92", "6d", "25", "49", "49", "49", "49", "25", "6e", "92", "b6", "b6", "b6", "b6", "b6", "92", "b6", "b6", "92", "92", "92", "db", "ff", "ff", "db", "db", "ff", "ff", "ff", "ff"},
            {"49", "49", "49", "49", "6d", "92", "b7", "db", "db", "b7", "92", "6e", "6e", "92", "49", "49", "49", "49", "6e", "6d", "6e", "6d", "49", "92", "b6", "b6", "92", "6e", "25", "25", "49", "49", "49", "49", "49", "6d", "6e", "92", "92", "92", "92", "92", "92", "92", "92", "92", "b6", "b7", "92", "b6", "6e", "49", "25", "25", "49", "6d", "49", "49", "49", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "92", "92", "92", "92", "db", "ff", "ff", "ff", "ff", "ff", "ff", "ff", "db"},
            {"49", "49", "49", "49", "6d", "92", "b7", "db", "db", "b7", "92", "49", "92", "6d", "6d", "49", "49", "49", "92", "6e", "6d", "6e", "92", "92", "92", "b7", "92", "49", "49", "49", "25", "49", "49", "49", "49", "49", "6e", "92", "92", "92", "92", "92", "92", "92", "92", "92", "92", "92", "b6", "92", "49", "25", "25", "49", "49", "49", "49", "49", "49", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "92", "92", "92", "b6", "ff", "ff", "ff", "ff", "db", "db", "db", "db", "db"},
            {"25", "49", "25", "49", "6e", "92", "b7", "db", "b7", "b7", "6e", "6d", "6e", "6d", "49", "49", "49", "49", "92", "92", "6e", "6d", "6e", "6e", "b7", "b6", "49", "25", "49", "49", "25", "49", "49", "49", "49", "49", "6d", "6e", "92", "92", "92", "92", "92", "92", "92", "92", "92", "92", "b6", "6d", "25", "25", "49", "49", "49", "6d", "49", "49", "49", "b7", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "b6", "92", "92", "b6", "ff", "ff", "ff", "ff", "ff", "ff", "ff", "db", "ff"},
            {"25", "49", "25", "49", "6e", "92", "b7", "db", "b7", "b7", "92", "49", "6e", "49", "6d", "25", "49", "49", "6e", "6e", "92", "6e", "92", "6e", "92", "6d", "49", "25", "49", "49", "49", "25", "49", "49", "49", "49", "49", "49", "6d", "92", "92", "92", "b6", "b6", "b7", "b7", "b7", "b7", "92", "49", "25", "49", "49", "49", "49", "6d", "49", "49", "49", "b7", "b6", "b6", "b6", "b6", "b6", "b6", "92", "92", "92", "92", "b6", "ff", "ff", "ff", "ff", "db", "db", "db", "db", "ff"},
            {"25", "49", "25", "49", "6e", "92", "b7", "b7", "db", "b6", "6e", "49", "6e", "49", "49", "49", "49", "49", "6e", "49", "6e", "92", "92", "92", "6e", "49", "25", "49", "49", "49", "49", "49", "25", "49", "49", "49", "49", "49", "49", "6d", "6e", "92", "92", "b6", "b7", "b7", "b7", "b6", "6e", "25", "25", "49", "49", "49", "49", "6d", "6d", "49", "6d", "b6", "92", "92", "b6", "b6", "b6", "b6", "92", "92", "92", "92", "b7", "ff", "ff", "ff", "ff", "ff", "ff", "db", "b6", "92"},
            {"25", "49", "24", "49", "6d", "92", "b7", "b7", "db", "b7", "92", "92", "6e", "49", "49", "49", "49", "25", "92", "6e", "49", "92", "92", "92", "92", "6e", "25", "49", "49", "49", "49", "49", "25", "25", "49", "49", "49", "49", "49", "6e", "92", "92", "92", "92", "b6", "b7", "b7", "b7", "92", "49", "49", "49", "49", "49", "49", "6d", "49", "49", "6d", "b6", "92", "92", "92", "92", "92", "b6", "92", "92", "92", "92", "db", "ff", "ff", "db", "ff", "ff", "b7", "6d", "25", "49"},
            {"49", "49", "25", "49", "49", "92", "b7", "b7", "b7", "b7", "92", "6d", "6d", "25", "49", "25", "49", "49", "6e", "92", "6d", "6e", "6e", "92", "6e", "92", "6e", "25", "49", "49", "49", "49", "49", "49", "25", "49", "49", "49", "6e", "92", "92", "92", "92", "92", "b6", "b6", "b6", "b7", "db", "db", "92", "49", "25", "25", "49", "6d", "49", "49", "6d", "b6", "92", "92", "92", "92", "6e", "92", "92", "92", "92", "92", "db", "ff", "db", "db", "ff", "b7", "6d", "25", "25", "92"},
            {"6d", "92", "6d", "49", "49", "6e", "b6", "b7", "b7", "b7", "92", "92", "49", "24", "49", "49", "49", "6d", "49", "6e", "6e", "92", "6e", "6e", "92", "92", "6d", "49", "49", "49", "49", "25", "25", "49", "49", "49", "49", "49", "92", "92", "92", "92", "92", "92", "92", "92", "b6", "db", "db", "db", "ff", "db", "92", "49", "49", "6d", "49", "49", "6d", "b6", "92", "92", "92", "92", "6e", "6e", "6d", "6e", "6e", "6d", "db", "db", "db", "db", "b7", "6d", "49", "49", "6d", "6e"},
            {"49", "b6", "92", "6d", "25", "6d", "b7", "b7", "b7", "b6", "b6", "92", "49", "25", "49", "6d", "6d", "49", "49", "49", "6d", "49", "6d", "92", "92", "6e", "6d", "6e", "49", "49", "49", "49", "49", "49", "49", "49", "49", "49", "6e", "92", "92", "92", "92", "92", "92", "b6", "b7", "db", "db", "db", "db", "db", "ff", "db", "49", "49", "49", "49", "6e", "b6", "b6", "92", "92", "92", "92", "92", "6e", "6e", "92", "6e", "db", "ff", "ff", "db", "49", "49", "6d", "6d", "6d", "6e"},
            {"49", "92", "b6", "92", "49", "6d", "b7", "b7", "b7", "b7", "b6", "6d", "25", "49", "49", "49", "49", "49", "49", "49", "6d", "49", "6d", "6e", "92", "92", "6e", "92", "49", "49", "49", "49", "49", "49", "49", "6d", "6d", "49", "92", "92", "92", "92", "92", "92", "b6", "b6", "b7", "b7", "db", "db", "db", "db", "db", "ff", "db", "49", "49", "49", "6e", "b6", "b6", "92", "92", "92", "92", "92", "92", "92", "92", "92", "ff", "ff", "ff", "92", "49", "6d", "6d", "6e", "6d", "92"}
        };

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        btnImagenActionPerformed(null);
                

    }


     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        grid = new reduccionruido.Grid();
        gridPreview = new reduccionruido.Grid();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        gridOriginal = new reduccionruido.Grid();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        gridRuido = new reduccionruido.Grid();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnImagen = new javax.swing.JButton();
        btnReducirRuido = new javax.swing.JButton();
        btnCrearRuido = new javax.swing.JButton();
        chkGrid = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        btnReducirRuido1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reducción de Ruido en Imagenes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grid.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gridPreview.setFactor(2);

        jPanel4.setBackground(new java.awt.Color(63, 63, 63));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Preview");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout gridPreviewLayout = new javax.swing.GroupLayout(gridPreview);
        gridPreview.setLayout(gridPreviewLayout);
        gridPreviewLayout.setHorizontalGroup(
            gridPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gridPreviewLayout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gridPreviewLayout.setVerticalGroup(
            gridPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gridPreviewLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        grid.add(gridPreview, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 170, 100));

        gridOriginal.setFactor(2);

        jPanel5.setBackground(new java.awt.Color(63, 63, 63));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Original");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout gridOriginalLayout = new javax.swing.GroupLayout(gridOriginal);
        gridOriginal.setLayout(gridOriginalLayout);
        gridOriginalLayout.setHorizontalGroup(
            gridOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gridOriginalLayout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gridOriginalLayout.setVerticalGroup(
            gridOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gridOriginalLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        grid.add(gridOriginal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 170, 100));

        gridRuido.setFactor(2);

        jPanel2.setBackground(new java.awt.Color(63, 63, 63));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ruido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout gridRuidoLayout = new javax.swing.GroupLayout(gridRuido);
        gridRuido.setLayout(gridRuidoLayout);
        gridRuidoLayout.setHorizontalGroup(
            gridRuidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gridRuidoLayout.createSequentialGroup()
                .addGap(0, 123, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        gridRuidoLayout.setVerticalGroup(
            gridRuidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gridRuidoLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        grid.add(gridRuido, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 170, 100));

        jPanel1.add(grid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnImagen.setText("1. Dibujar Imagen");
        btnImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenActionPerformed(evt);
            }
        });
        jPanel1.add(btnImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 567, 229, -1));

        btnReducirRuido.setText("3. Reducir Ruido (por Promedio)");
        btnReducirRuido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReducirRuidoActionPerformed(evt);
            }
        });
        jPanel1.add(btnReducirRuido, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 553, 234, -1));

        btnCrearRuido.setText("2. Agregar Ruido");
        btnCrearRuido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearRuidoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearRuido, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 567, 236, -1));

        chkGrid.setText("Usar Grid");
        chkGrid.setToolTipText("");
        chkGrid.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chkGrid.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGridActionPerformed(evt);
            }
        });
        jPanel1.add(chkGrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 542, 229, -1));

        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("50 x 80 pixeles");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 533, -1, -1));

        btnReducirRuido1.setText("3. Reducir Ruido (por Repetición)");
        btnReducirRuido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReducirRuido1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnReducirRuido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 582, 234, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenActionPerformed

        if ((++cont) % 2 == 0) {
            //int dec = 0;
            for (int dec = 0; dec <= 100; dec = dec + 5) {
                for (int i = dec; i <= filas - dec; i++) {
                    for (int j = dec; j <= columnas - dec; j++) {

                        grid.fillCell(j, i, new Color(100 + (dec * 4), 100 + (dec * 4), 100 + (dec * 4)));
                        gridPreview.fillCell(j, i, new Color(100 + (dec * 4), 100 + (dec * 4), 100 + (dec * 4)));
                        gridOriginal.fillCell(j, i, new Color(100 + (dec * 4), 100 + (dec * 4), 100 + (dec * 4)));
                        gridRuido.fillCell(j, i, new Color(100 + (dec * 4), 100 + (dec * 4), 100 + (dec * 4)));
                    }
                }
            }

        } else {
            img = new Integer[50][80];
            for (int i = 0; i < 50; i++) {
//                System.out.println("\n(" + i + ")\n");
                for (int j = 0; j < 80; j++) {

                    img[i][j] = Integer.parseInt(imgTmp[i][j], 16);
//                    System.out.print(" " + Integer.parseInt(imgTmp[i][j], 16));
                    grid.fillCell(j, i, new Color(Integer.parseInt(imgTmp[i][j], 16), Integer.parseInt(imgTmp[i][j], 16), Integer.parseInt(imgTmp[i][j], 16)));
                    gridPreview.fillCell(j, i, new Color(Integer.parseInt(imgTmp[i][j], 16), Integer.parseInt(imgTmp[i][j], 16), Integer.parseInt(imgTmp[i][j], 16)));
                    gridOriginal.fillCell(j, i, new Color(Integer.parseInt(imgTmp[i][j], 16), Integer.parseInt(imgTmp[i][j], 16), Integer.parseInt(imgTmp[i][j], 16)));
                    gridRuido.fillCell(j, i, new Color(Integer.parseInt(imgTmp[i][j], 16), Integer.parseInt(imgTmp[i][j], 16), Integer.parseInt(imgTmp[i][j], 16)));
                }

            }
        }
        
        

    }//GEN-LAST:event_btnImagenActionPerformed

    private void btnCrearRuidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearRuidoActionPerformed

    int ruido = 100;
    
    

    
//    gridPreview.fillCell(20, 30, Color.WHITE);
    for (int i = 0; i <= filas; i++) {
            for (int j = 0; j <= columnas; j++) {
                
                if(new Random().nextInt(ruido) + 1 == 1){
                    grid.fillCell(j, i, Color.WHITE);
                    gridPreview.fillCell(j, i, Color.WHITE);
                    gridRuido.fillCell(j, i, Color.WHITE);
                }
            }

        }
    
    
    for (int i = 0; i <= filas; i++) {
            for (int j = 0; j <= columnas; j++) {
                
                if(new Random().nextInt(ruido) + 1 == 1){
                    grid.fillCell(j, i, Color.BLACK);
                    gridPreview.fillCell(j, i, Color.BLACK);
                    gridRuido.fillCell(j, i, Color.BLACK);
                }
            }

        }
    
   
        
    }//GEN-LAST:event_btnCrearRuidoActionPerformed

    private void chkGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGridActionPerformed
        grid.setUseGrid(chkGrid.isSelected());
        grid.repaint();
    }//GEN-LAST:event_chkGridActionPerformed

    private void btnReducirRuidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReducirRuidoActionPerformed
        
        for (int i = 0; i <= filas; i++) {
            for (int j = 0; j <= columnas; j++) {
                try{
                //Si el pixel es SALT OR PEPPER (Blanco o Negro)
                if (grid.getAlpuntos()[i][j].getColor().equals(Color.BLACK) || grid.getAlpuntos()[i][j].getColor().equals(Color.WHITE)) {
//                    System.out.println("SALT or PEPPER");
                    
//                    System.out.println(""+getNumVecinos(grid.getAlpuntos()[i][j].getPunto()));
                    
                    int enteroColor = getColPromVecinos(grid.getAlpuntos()[i][j].getPunto());
                    //int enteroColor = getColMayorVecinos(grid.getAlpuntos()[i][j].getPunto());
                    
//                    System.out.println(""+getColPromVecinos(grid.getAlpuntos()[i][j].getPunto()));
                    
                    grid.fillCell(j, i, new Color(enteroColor,enteroColor,enteroColor));
                    gridPreview.fillCell(j, i, new Color(enteroColor,enteroColor,enteroColor));
                    
                    
                }
            }catch(Exception ex){}
            }
        }
            
    }//GEN-LAST:event_btnReducirRuidoActionPerformed

    private void btnReducirRuido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReducirRuido1ActionPerformed
        for (int i = 0; i <= filas; i++) {
            for (int j = 0; j <= columnas; j++) {
                try{
                //Si el pixel es SALT OR PEPPER (Blanco o Negro)
                if (grid.getAlpuntos()[i][j].getColor().equals(Color.BLACK) || grid.getAlpuntos()[i][j].getColor().equals(Color.WHITE)) {
//                    System.out.println("SALT or PEPPER");
                    
//                    System.out.println(""+getNumVecinos(grid.getAlpuntos()[i][j].getPunto()));
                    
                    int enteroColor = getColMayorVecinos(grid.getAlpuntos()[i][j].getPunto());
                    
//                    System.out.println(""+getColPromVecinos(grid.getAlpuntos()[i][j].getPunto()));
                    
                    grid.fillCell(j, i, new Color(enteroColor,enteroColor,enteroColor));
                    gridPreview.fillCell(j, i, new Color(enteroColor,enteroColor,enteroColor));
                    
                    
                }
                }catch(Exception ex){}
            }
                
        }
    }//GEN-LAST:event_btnReducirRuido1ActionPerformed

    
    private int getNumVecinos(Point punto){
        
        int total = 0;
        MiPunto miPunto = null;
        try{ miPunto = grid.getAlpuntos()[punto.y+1][punto.x]; total++; }catch(Exception ex){}
        try{ miPunto = grid.getAlpuntos()[punto.y+1][punto.x+1]; total++; }catch(Exception ex){}
        try{ miPunto = grid.getAlpuntos()[punto.y+1][punto.x-1]; total++; }catch(Exception ex){}
        try{ miPunto = grid.getAlpuntos()[punto.y-1][punto.x]; total++; }catch(Exception ex){}
        try{ miPunto = grid.getAlpuntos()[punto.y-1][punto.x+1]; total++; }catch(Exception ex){}
        try{ miPunto = grid.getAlpuntos()[punto.y-1][punto.x-1]; total++; }catch(Exception ex){}
        try{ miPunto = grid.getAlpuntos()[punto.y][punto.x-1]; total++; }catch(Exception ex){}
        try{ miPunto = grid.getAlpuntos()[punto.y][punto.x+1]; total++; }catch(Exception ex){}
        
        
        
        return total;
    }
    
    
    private int getColPromVecinos(Point punto){
        
        int total = 0;
        int totalColor = 0;
        int colorActual = 0;
        MiPunto miPunto = null;
        try{ 
            colorActual = grid.getAlpuntos()[punto.y+1][punto.x].getColor().getBlue();
            if (colorActual != 0 && colorActual != 255) {
                totalColor = totalColor + colorActual;
                total++;
            }
        }catch(Exception ex){}
        try{ 
            colorActual = grid.getAlpuntos()[punto.y+1][punto.x+1].getColor().getBlue();
            if (colorActual != 0 && colorActual != 255) {
            totalColor =  totalColor + colorActual; total++; 
            }}catch(Exception ex){}
        try{ 
            colorActual =grid.getAlpuntos()[punto.y+1][punto.x-1].getColor().getBlue();
            if (colorActual != 0 && colorActual != 255) {
            totalColor = totalColor + colorActual; total++; }}catch(Exception ex){}
        try{ 
            colorActual = grid.getAlpuntos()[punto.y-1][punto.x].getColor().getBlue();
            if (colorActual != 0 && colorActual != 255) {
            totalColor = totalColor + colorActual; total++;} }catch(Exception ex){}
        try{ 
            colorActual = grid.getAlpuntos()[punto.y-1][punto.x+1].getColor().getBlue();
            if (colorActual != 0 && colorActual != 255) {
            totalColor = totalColor + colorActual; total++;} }catch(Exception ex){}
        try{ 
            colorActual = grid.getAlpuntos()[punto.y-1][punto.x-1].getColor().getBlue();
            if (colorActual != 0 && colorActual != 255) {
            totalColor = totalColor + colorActual; total++; }}catch(Exception ex){}
        try{ 
            colorActual = grid.getAlpuntos()[punto.y][punto.x-1].getColor().getBlue();
            if (colorActual != 0 && colorActual != 255) {
            totalColor = totalColor + colorActual; total++;} }catch(Exception ex){}
        try{ 
            colorActual = grid.getAlpuntos()[punto.y][punto.x+1].getColor().getBlue();
            if (colorActual != 0 && colorActual != 255) {
            totalColor = totalColor + colorActual; total++;} }catch(Exception ex){}
        
        
        
        return totalColor / total;
    }
    
    
     private int getColMayorVecinos(Point punto){
        
        int total = 0;
        int totalColor = 0;
        int colorActual = 0;
        MiPunto miPunto = null;
        
         HashMap<Integer, Integer> hmColor = new HashMap();
        
        try{ 
            colorActual = grid.getAlpuntos()[punto.y+1][punto.x].getColor().getBlue();
            if (colorActual != 0 && colorActual != 255) {
                totalColor = totalColor + colorActual;                
                total++;
                if(hmColor.containsKey(colorActual)){
                    hmColor.put(colorActual, hmColor.get(colorActual)+1);
                }else{
                    hmColor.put(colorActual, 1);
                }
            }
        }catch(Exception ex){}
        try{ 
            colorActual = grid.getAlpuntos()[punto.y+1][punto.x+1].getColor().getBlue();
            if (colorActual != 0 && colorActual != 255) {
            totalColor =  totalColor + colorActual; total++; 
            if(hmColor.containsKey(colorActual)){
                    hmColor.put(colorActual, hmColor.get(colorActual)+1);
                }else{
                    hmColor.put(colorActual, 1);
                }
            }}catch(Exception ex){}
        try{ 
            colorActual =grid.getAlpuntos()[punto.y+1][punto.x-1].getColor().getBlue();
            if (colorActual != 0 && colorActual != 255) {
            totalColor = totalColor + colorActual; total++;
            if(hmColor.containsKey(colorActual)){
                    hmColor.put(colorActual, hmColor.get(colorActual)+1);
                }else{
                    hmColor.put(colorActual, 1);
                }}}catch(Exception ex){}
        try{ 
            colorActual = grid.getAlpuntos()[punto.y-1][punto.x].getColor().getBlue();
            if (colorActual != 0 && colorActual != 255) {
            totalColor = totalColor + colorActual; total++;
            if(hmColor.containsKey(colorActual)){
                    hmColor.put(colorActual, hmColor.get(colorActual)+1);
                }else{
                    hmColor.put(colorActual, 1);
                }} }catch(Exception ex){}
        try{ 
            colorActual = grid.getAlpuntos()[punto.y-1][punto.x+1].getColor().getBlue();
            if (colorActual != 0 && colorActual != 255) {
            totalColor = totalColor + colorActual; total++;
            if(hmColor.containsKey(colorActual)){
                    hmColor.put(colorActual, hmColor.get(colorActual)+1);
                }else{
                    hmColor.put(colorActual, 1);
                }} }catch(Exception ex){}
        try{ 
            colorActual = grid.getAlpuntos()[punto.y-1][punto.x-1].getColor().getBlue();
            if (colorActual != 0 && colorActual != 255) {
            totalColor = totalColor + colorActual; total++;
            if(hmColor.containsKey(colorActual)){
                    hmColor.put(colorActual, hmColor.get(colorActual)+1);
                }else{
                    hmColor.put(colorActual, 1);
                }}}catch(Exception ex){}
        try{ 
            colorActual = grid.getAlpuntos()[punto.y][punto.x-1].getColor().getBlue();
            if (colorActual != 0 && colorActual != 255) {
            totalColor = totalColor + colorActual; total++;
            if(hmColor.containsKey(colorActual)){
                    hmColor.put(colorActual, hmColor.get(colorActual)+1);
                }else{
                    hmColor.put(colorActual, 1);
                }} }catch(Exception ex){}
        try{ 
            colorActual = grid.getAlpuntos()[punto.y][punto.x+1].getColor().getBlue();
            if (colorActual != 0 && colorActual != 255) {
            totalColor = totalColor + colorActual; total++;
            if(hmColor.containsKey(colorActual)){
                    hmColor.put(colorActual, hmColor.get(colorActual)+1);
                }else{
                    hmColor.put(colorActual, 1);
                }} }catch(Exception ex){}
        
        
        colorActual = 0;
        int maxRepeticion = -1;
         for (Map.Entry<Integer, Integer> entry : hmColor.entrySet()) {
             Integer color = entry.getKey();
             Integer repeticion = entry.getValue();
             
             if(repeticion >= maxRepeticion){
                 maxRepeticion = repeticion;
                 colorActual = color;
             }
         }
        
        return colorActual;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearRuido;
    private javax.swing.JButton btnImagen;
    private javax.swing.JButton btnReducirRuido;
    private javax.swing.JButton btnReducirRuido1;
    private javax.swing.JCheckBox chkGrid;
    private reduccionruido.Grid grid;
    private reduccionruido.Grid gridOriginal;
    private reduccionruido.Grid gridPreview;
    private reduccionruido.Grid gridRuido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
