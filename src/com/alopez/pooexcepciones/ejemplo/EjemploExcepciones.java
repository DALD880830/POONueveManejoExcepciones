package com.alopez.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {

    //    public static void main(String[] args) throws DivisionPorCeroExcepcion{ //Podemos manejar la excepcion desde el main
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        String numerador = JOptionPane.showInputDialog("Ingresa un valor: "); //Abrimos una ventana para capturar un valor
        String denominador = JOptionPane.showInputDialog("Ingresa un valor: ");
//        int divisor; //A divisor le asignamos el valor que nos porporcionó el usuario
//        double division;

        try{ //Intentamos un código
//            divisor = Integer.parseInt(valor); //Para manejar la Excepción, debe estar dentro del try la problematica
//            division = cal.dividir(10, divisor);
//            System.out.println("El resultado es: " + division);

            double division2 = cal.dividir(numerador, denominador);
            System.out.println("division2 = " + division2);

//        }catch (Exception e){ //Si encuentra un error la aplicación se captura aquí | Exception e Es una excepción genérica
        }catch (NumberFormatException nfe){
            System.out.println("No se ingreso un valor numerico: " + nfe.getMessage()); //Objeto e
            main(args); //Retornamos al inicio del metodo main
        }catch (FormatoNumeroExcepcion fne){
            System.out.println("Ingrese numeros validos: " + fne.getMessage());
            fne.printStackTrace(System.out); //Imprime toda la ruta del error, desde donde se origina y donde se invoca
        }
//        catch (ArithmeticException ae){
        catch (DivisionPorCeroExcepcion dpce){
            System.out.println("No se puede dividir entre 0: " + dpce.getMessage()); //Objeto e
            // getMessage() Contiene el resumen del error
            main(args); //Retornamos al inicio del metodo main
        }finally { //finally puede o no implementarse, regularmente se usa para cerrar conexiones con la base de datos o
            // el archivo en el que nos encontremos trabajando
            System.out.println("Se ejecuta siempre con o sin excepcion");
        }

        System.out.println("Continuamos con el flujo de la aplicación");

    }

}
