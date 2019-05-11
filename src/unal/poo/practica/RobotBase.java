package unal.poo.practica;

import becker.robots.*;
import java.awt.Color;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot Vaca;
        public static Robot Granjero;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
        Vaca v1=new Vaca(1,objetos,1,1,Direction.NORTH);
        
	    //Mover una interseccion en el sentido al cual este apuntando el objeto.
            v1.setColor(Color.green);
            
            
            //Girar a la izquierda
            
            v1.move();
            v1.move();
           
            //Tomando decisiones, Si puedo tomar un Thing
            boolean puedeTomar = Vaca.canPickThing();
            
            //Tomar un Thing
            if(puedeTomar == true)
               Vaca.pickThing();
            
            //Especifica el numero de Thing que tiene en robot en el bolso
            int numeroThings = Vaca.countThingsInBackpack();
            
            //Poner Thing, se debe validar que tenga things en el bolso
            Vaca.putThing();
                       
            //Si el frente esta libre de Wall
            Vaca.frontIsClear();
            
            //Invocando una funcion
            creacionFuncion(4);
            
            //Toman un Thing
            Vaca.pickThing();
            
            
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                Vaca.move();
        }

   
}

