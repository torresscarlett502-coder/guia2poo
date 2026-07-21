package guia3;

import javax.swing.JOptionPane;

public class Persona {

    // Atributos
    private String nombre;
    private String apellido;
    private String edad;

    // Constructor sin parámetros
    public Persona() {
        nombre = "Rafael";
        apellido = "Torres";
        edad = "23";
    }

    // Constructor con parámetros
    public Persona(String nombre, String apellido, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Ingresar datos
    public void ingresoDatos() {
        nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
        apellido = JOptionPane.showInputDialog("Ingrese el Apellido");
        edad = JOptionPane.showInputDialog("Ingrese la edad");
    }

    // Mostrar datos
    public void mostrarDatos() {
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su apellido es: " + apellido);
        System.out.println("Su edad es: " + edad);
        System.out.println("****************************");
    }

    public static void main(String[] args) {

        Persona obj1 = new Persona();

        Persona obj2 = new Persona("Manuel", "Valdez", "25");

        obj1.mostrarDatos();

        obj1.ingresoDatos();

        obj1.mostrarDatos();

        obj2.mostrarDatos();
    }
}
