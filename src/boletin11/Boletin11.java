/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author klemavilanova
 */
public class Boletin11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tiempo fechainicio = new Tiempo();
        String frase = JOptionPane.showInputDialog("Escribe una frase");
        System.out.println("Frase: "+ frase);
        JOptionPane.showInputDialog("Preme enter para rematar");
        Date fechafin = new Date();
        System.out.println("Tiempo en escribir una frase: "+ fechainicio.diferencia(fechafin)+"s"); 
    }
    
}
