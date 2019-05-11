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


/**
 *
 * @author jgarn
 */
public class Granjero extends Robot {
    public static City objetos;
    String nombre;
Scanner sn = new Scanner(System.in);
  
    public Granjero(String nombre, City city, int i, int i1, Direction drctn) {
        super(city, i, i1, drctn);
        this.nombre = nombre;
    }

    
public void regVa(){
    System.out.println("introduzca el numero deseado de vacas a registrar: ");
    int n=sn.nextInt();
    ArrayList<Vaca> VacaL=new ArrayList<>();
    
    for(int i=0;i<n;i++){
    System.out.println("Por favor ingrese la posición de la vaca(x,y) y el numero de id");
    int x=sn.nextInt();
    int y=sn.nextInt();
    int id=sn.nextInt();
    
    Vaca vaca=new Vaca(id, objetos,y,x,Direction.NORTH);
    VacaL.add(vaca);
   
    }   
}


public void regVi(){

    System.out.println("Por favor ingrese los valores vitales de referencia");

}

public void conVa(){

}
public void solO(){


}
}
