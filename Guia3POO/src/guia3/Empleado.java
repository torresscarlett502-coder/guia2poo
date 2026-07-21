package guia3;

import javax.swing.JOptionPane;

public class Empleado {

    private String nombre;
    private String apellido;

    // Mostrar datos
    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null,
                "Nombre: " + nombre +
                        "\nApellido: " + apellido);
    }

    // Ingresar datos
    public void ingresoDatos() {

        nombre = JOptionPane.showInputDialog("Ingrese el nombre");

        apellido = JOptionPane.showInputDialog("Ingrese el apellido");

    }

}

// Clase Profesor
class Profesor extends Empleado {

    int sueldo;

    public void mostrar2() {

        mostrarDatos();

        JOptionPane.showMessageDialog(null,
                "Sueldo: $" + sueldo);

    }

    public void ingreso2() {

        ingresoDatos();

        String s = JOptionPane.showInputDialog("Ingrese el sueldo");

        sueldo = Integer.parseInt(s);

    }

}
