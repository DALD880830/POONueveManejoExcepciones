package com.alopez.pooexcepciones.ejemplo;

public class Calculadora {

    public double dividir(int numerador, int divisor) throws DivisionPorCeroExcepcion { //Metodo que recibe dos enteros
        if (divisor == 0){ //Si divisor es igual que cero entonces...
            throw new DivisionPorCeroExcepcion("No se puede dividir entre cero");
            //Con throw new creamos un objeto que lance la exepcion personalizada
        }
        return numerador / (double)divisor; //Retorna numerador entre divisor, realizamos un CAST en el entero divisor
    }

    public double dividir(String numerador, String divisor) throws DivisionPorCeroExcepcion,
            FormatoNumeroExcepcion { //Metodo que recibe dos String y cuenta con dos excepciones personalizadas
        try{
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.dividir(num, div);
        }catch (NumberFormatException e){
            throw new FormatoNumeroExcepcion("Debe ingresar un numero en el numerador y el divisor");
        }
    }

}