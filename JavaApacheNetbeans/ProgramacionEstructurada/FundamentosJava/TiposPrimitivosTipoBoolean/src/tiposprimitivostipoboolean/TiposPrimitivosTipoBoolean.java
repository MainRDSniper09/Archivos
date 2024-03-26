/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivostipoboolean;

/**
 *
 * @author mainrdsniper09
 */
public class TiposPrimitivosTipoBoolean {

    public static void main(String[] args) {

        boolean varBoolean = false;//Tipo Bandera

        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean) { //Si contiene el valor de verdadero
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa");
        }
        
        var edad = 10;
        //var esAdulto = edad >= 18;//Resultado tipo boolean
        
        if(edad >= 18){//Validacion de datos
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
        
    }

}
