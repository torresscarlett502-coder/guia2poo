package sv.edu.udb.auxiliares;

import sv.edu.udb.escritura.Pantalla;

public class MandaPantalla {

    public static void main(String[] args) {

        Pantalla primera = new Pantalla();

        primera.conSalto("Esto es un renglón CON salto de línea");

        primera.conSalto("Esta línea también tiene salto");

        primera.sinSalto("Línea Continua ");

        primera.sinSalto("Línea Continua");

        primera.conSalto("Esta línea sí tiene salto!");

        primera.sinSalto("Termina sin salto");

        System.out.println(" Se termina el uso de funciones");

    }

}