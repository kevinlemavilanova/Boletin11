/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import java.util.Date;

/**
 *
 * @author klemavilanova
 */
public class Tiempo {
    private final Date fechahoy = new Date();
    
    public long diferencia(Date fechafin){
        return (fechafin.getTime()-fechahoy.getTime())/1000;
    }
}
