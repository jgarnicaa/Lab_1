/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;
import java.util.*;
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import static unal.poo.practica.RobotBase.objetos;

/**
 *
 * @author jgarn
 */
public class Vaca extends Robot {
    private int id;
    private int pulso=4;
    private int ritmoC=4;
    private int temperatura=4;
    private int cicloR=0;
    private int gest=0;
    private int cantidadL=0;
    private String estado="sana";
    
int numAle=(int) (Math.random() * 10);

    public Vaca(int id, City city, int i, int i1, Direction drctn) {
        super(city, i, i1, drctn);
        this.id = id;
    }
    
    public void modPulso(){
    this.pulso=pulso+numAle;
    }
    public void modRitmoC(){
    this.ritmoC=ritmoC+numAle;
    }
    public void modTemp(){
    this.temperatura=temperatura+numAle;
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

    public void setPulso(int pulso) {
        this.pulso = pulso;
    }

    public int getRitmoC() {
        return ritmoC;
    }

    public void setRitmoC(int ritmoC) {
        this.ritmoC = ritmoC;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
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
