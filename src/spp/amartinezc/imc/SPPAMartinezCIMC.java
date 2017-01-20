/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.amartinezc.imc;
import java.util.Scanner;
//Librería
/**
 *
 * @author Alumno
 */
public class SPPAMartinezCIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora IMC");
        
        //Paso 1. Declaración de variables (identificadores)
        double l, w, imc;
        String eIMC;
        //En la siguiente línea indico a Java que utilizaré un teclado
        Scanner  teclado = new Scanner (System.in);
        //Paso 2. Asignar valores a las variables.
        System.out.println("Introduce tu peso");
        w=teclado.nextDouble();
        System.out.println("Introduce tu estatura");
        l=teclado.nextDouble();
        //Paso 3. Resolver el problema.
        imc= w / Math.pow (l,2);
         if (imc > 25){
            eIMC="Sobrepeso";
        }else if(imc<19){
            eIMC="Desnutricióm";
        }else{
            eIMC="Normal";
        }
        //Paso 4. Mostrar el resultado.
        System.out.println("Peso=" +w);
        System.out.println("Altura=" +l);
        System.out.println("IMC=" +imc);
        System.out.println(eIMC);
           
    }
    
}
