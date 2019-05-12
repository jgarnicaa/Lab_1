/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;
import becker.robots.*;
import java.awt.Color;

import java.util.*;


/**
 *
 * @author jgarn
 */
public class Vaca extends Robot {
    private int id;
    private int pulso;
    private int ritmoC;
    private int temperatura;
    private int cicloR=0;
    private int gest=0;
    private int cantidadL=0;
    private String estado="sana";
    


    public Vaca(int id,int pulso, int ritmoC, int temperatura, City city, int i, int i1, Direction drctn) {
        super(city, i, i1, drctn);
        this.id = id;
        
      
        
    }
    
    
    public int modPulso(){
        int numA=(int) (Math.random() * 200)+1;
        this.pulso=pulso+numA;
        return pulso;
    }
    public int modRitmo(){
        int numAleC=(int) (Math.random() * 150)+1;  
        this.ritmoC=ritmoC+numAleC;
        return ritmoC;
    }
    public int modTemp(){
    int numAleT=(int) (Math.random() * 40)+1;
    this.temperatura=temperatura+numAleT;
        return temperatura;
    }
    public void modGest(){
    this.gest=gest+1;
    }
    public void modCicloR(){
    this.cicloR=cicloR+1;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPulso() {
        return pulso;
    }

 

    public int getRitmoC() {
        return ritmoC;
    }

   

    public int getTemperatura() {
        return temperatura;
    }

   

    public int getCicloR() {
        return cicloR;
    }

    public void setCicloR(int cicloR) {
        this.cicloR = cicloR;
    }

    public int getGest() {
        return gest;
    }

    public void setGest(int gest) {
        this.gest = gest;
    }

    public int getCantidadL() {
        return cantidadL;
    }

    public void setCantidadL(int cantidadL) {
        this.cantidadL = cantidadL;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
