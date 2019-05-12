/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;
import becker.robots.*;
import java.awt.Color;

import java.util.*;
import static unal.poo.practica.Granjero.objetos;




/**
 *
 * @author jgarn
 */
public class Main {
    
    public static City objetos;
    public static void menu(int opcion){
        Scanner sn = new Scanner(System.in);
Vaca va[];
switch (opcion) {

       
            case 1:  
                      System.out.println("introduzca el numero deseado de vacas a registrar: ");
                      int  n=sn.nextInt();
                      va=new Vaca[n];   System.out.println("1.1");
                        System.out.println("Introduzca los valores de referencia:");
                System.out.println("Pulso:");
                int  pref=sn.nextInt();
                System.out.println("Ritmo Cardiaco:");
                int  rref=sn.nextInt();
                System.out.println("Temperatura");
                int  tref=sn.nextInt();
                       for(int i=0;i<n;i++){
            int x=0;
            int y=0;
            System.out.println("En que parcela la quiere ubicar: ");
            int p=sn.nextInt();
                 if (p==1){
                    x=1;
                    y=i;
                 }
                 else if (p==2){
                    x=3;
                    y=i;
                 }
                 else  if (p==3){
                    x=5;
                    y=i;   
            }
             va[i]=new Vaca(i,pref,rref,tref,objetos,x,y,Direction.NORTH);}
             
                       System.out.println("1.2");
     break;
     
            case 2:
               // System.out.println("Ingrese el id de la vaca a consultar: ");
             Vaca va1[]=new Vaca[1];
             va=va1;
               // int idv=sn.nextInt();
              int d=va1[0].getPulso();
                System.out.println(d);
            
              
                
       
    }
}
    public static void main(String []args){
         Scanner sn = new Scanner(System.in);
          
            
    objetos = new City("Field.txt");
    objetos.showThingCounts(true);
    
        boolean cid=false;
       Granjero g= new Granjero("Eduardo",objetos,6,2,Direction.WEST);
       g.setColor(Color.YELLOW);
     
       boolean a=true;
       while(a=true){
            
            System.out.println("1. Registrar vacas y signos vitales por defecto");
            System.out.println("2. Consultar estado de vaca");
            System.out.println("3. Solicitar ordeño");
            System.out.println("4. Salir");
            System.out.println("seleccione opcion: ");
            int opcion=sn.nextInt();
          
           if (opcion==4){
           a=false;
           }else{
            Main.menu(opcion);}
       }
      
 
    
    }
}
   