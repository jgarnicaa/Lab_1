/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;
import becker.robots.*;
import java.awt.Color;
import java.util.*;
import static unal.poo.practica.RobotBase.objetos;

/**
 *
 * @author jgarn
 */
public class Main {
    
    public static City objetos;
    public static void main(String []args){
    objetos = new City("Field.txt");
    objetos.showThingCounts(true);
        boolean cid=false;
       Granjero g= new Granjero("Eduardo",objetos,6,2,Direction.WEST);
   // while (cid){
   
    
    //}
   
     Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Registrar vacas");
            System.out.println("2. Registrar vitales por defecto");
            System.out.println("3. Consultar estado de vaca");
            System.out.println("4. Solicitar ordeño");
            System.out.println("5. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        g.regVa();
                        break;
                    case 2:
                        g.regVi();
                        break;
                    case 3:
                        g.conVa();
                        break;
                    case 4:
                        g.solO();
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }

    


}
