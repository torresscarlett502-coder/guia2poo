package sv.edu.udb.notas;

public class Estudiante {

    String nombre;
    String apellido;

    private double nota1;
    private double nota2;
    private double nota3;

    // Constructor
    public Estudiante(String nombre, String apellido) {

        this.nombre = nombre;
        this.apellido = apellido;

    }

    // Getter y Setter Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter Apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Nota 1
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {

        if (nota1 >= 0 && nota1 <= 10) {

            this.nota1 = nota1;

        } else {

            this.nota1 = 0;

            System.out.println("Nota no válida (" + nota1 + ")");

        }

    }

    // Nota 2
    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {

        if (nota2 >= 0 && nota2 <= 10) {

            this.nota2 = nota2;

        } else {

            this.nota2 = 0;

            System.out.println("Nota no válida (" + nota2 + ")");

        }

    }

    // Nota 3
    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {

        if (nota3 >= 0 && nota3 <= 10) {

            this.nota3 = nota3;

        } else {

            this.nota3 = 0;

            System.out.println("Nota no válida (" + nota3 + ")");

        }

    }

}