/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


/**
 *
 * @author Guadalupe
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        try {
            System.out.println("");//declaramos las diferentes variables que usaremos
            Scanner sca = new Scanner(System.in);
            Calendar cal = new GregorianCalendar();
            int mesActual = cal.get(Calendar.MONTH), anyoActual = cal.get(Calendar.YEAR),
                    diaActual = cal.get(Calendar.DAY_OF_MONTH);
            int mes, dia, anyo;
            int mesResultado=0, diaResultado=0, anyResultado=0;


            System.out.println("Calcular cuantos años tienes");//preguntamos dia mes y año de nacimiento
            System.out.println("Dime el día");
            dia = sca.nextInt();
            System.out.println("Dime el mes");
            mes = sca.nextInt();
            System.out.println("Dime el año");
            anyo = sca.nextInt();
            System.out.println("PARA VER LOS CAMBIOS EN GITHUB");

//creamos las excepciones en caso que la fecha de error
            if (dia <= 0 | dia > 31) {
                throw new Exception("el día está mal puesto");

            }
            if (mes <= 0 | mes > 12) {
                throw new Exception("el mes está mal puesto");

            }
            if (anyo <= 0) {
                throw new Exception("el año está mal puesto");

            }
if(mes<=mesActual){
             mesResultado = Math.abs(mesActual-mes);
             diaResultado = 30-dia;
             diaResultado=diaResultado+diaActual;
              anyResultado = Math.abs(anyo - anyoActual);
                                
              System.out.println("Tienes///// " + anyResultado + " años" + ", " + mesResultado
                    + " meses " + " y " + diaResultado + " días");
             }

       if(mes>mesActual){
    mesResultado = Math.abs(mes - mesActual);

            diaResultado = 30-dia;
            diaResultado=diaResultado+diaActual;
            anyResultado = Math.abs(anyo - anyoActual);
              anyResultado=anyResultado-1;
              
               System.out.println("Tienes " + anyResultado + " años" + ", " + mes
                    + " meses " + " y " + diaResultado + " días");
             }

                     
            File archivo;
            FileWriter escribir;
            PrintWriter linea;
            archivo=new File("resultados.txt");
            if(!archivo.exists()){
                try{
                archivo.createNewFile();
                       
               escribir=new FileWriter(archivo, true);
               linea =new PrintWriter(escribir);
               linea.println("Tienes " + anyResultado +"años" +"con " + mes +"meses"+"y " + diaResultado   +"dias");
                linea.println("VALORES DE UNA NUEVA COMPILACION PARA GIT HUB" );
               linea.close();
                }
                catch(IOException ex){
                   System.out.println("Ha habido un error " + ex.toString());
                } 
            }
            else{
                                   
                try{
                archivo.createNewFile();
                       
               escribir=new FileWriter(archivo, true);
               linea =new PrintWriter(escribir);
               linea.println("Tienes " + anyResultado +"años" +"con " + mes +"meses"+"y " + diaResultado   +"dias");
               linea.println("Se muestra los valores de una nueva compilacion " );
               linea.close();
                    
               
                }
                catch(IOException ex){
                   System.out.println("Ha habido un error " + ex.toString());
                }
            }
                    
            
            
        } catch (Exception ex) {
            System.out.println("Ha habido un error " + ex.toString());
        }
        
     
              

    }
    
}
