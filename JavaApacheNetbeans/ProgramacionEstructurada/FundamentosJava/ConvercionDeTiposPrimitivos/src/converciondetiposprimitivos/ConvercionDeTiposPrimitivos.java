/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package converciondetiposprimitivos;

import java.util.Scanner;

public class ConvercionDeTiposPrimitivos {

    public static void main(String[] args) {
        
        //Conversion tipo String a un tipo int
        var edad = Integer.parseInt("20"); //se convierte a un tipo entero
        //var edad = "20"; Si se imprime el string y se le suma algun numero, este lo va a concatenar, mas no 
        //va a realizar una operacion logica
        System.out.println("edad = " + (edad + 1));
        
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //Pedir un valor
        
        Scanner sc = new Scanner(System.in);
//        System.out.println("Proporcione tu edad:");
//        edad = Integer.parseInt(sc.nextLine());
//        System.out.println("edad = " + edad);
        
        var edadTexto = String.valueOf(10);//Convierte este valor a un tipo String
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "Hola".charAt(0);//Sacar un caracter de una cadena
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter:");
        caracter = sc.nextLine().charAt(0);//Coge la cadena y recupera el indice 0 
        
        System.out.println("caracter = " + caracter);
                
        
    }
    
}
