package com.alopez.pooexcepciones.ejemplo;

public class DivisionPorCeroExcepcion extends Exception{ //Clase que extiende de Exception

    public DivisionPorCeroExcepcion (String mensaje){ //Constructor para mandar un mensaje
        super(mensaje);
    }

}