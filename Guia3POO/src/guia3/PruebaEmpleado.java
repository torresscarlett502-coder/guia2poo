package guia3;

import javax.swing.JOptionPane;

public class PruebaEmpleado {

    public static void main(String[] args) {

        Empleado emp = new Empleado();

        Profesor pro = new Profesor();

        JOptionPane.showMessageDialog(null,
                "Clase Empleado");

        emp.ingresoDatos();

        emp.mostrarDatos();

        JOptionPane.showMessageDialog(null,
                "Clase Profesor");

        pro.ingreso2();

        pro.mostrar2();

    }

}