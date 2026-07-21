import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {

        double nota;

        String dato = JOptionPane.showInputDialog("Ingrese la nota del alumno:");

        nota = Double.parseDouble(dato);

        if (nota >= 7.0) {

            JOptionPane.showMessageDialog(
                    null,
                    "El alumno APROBÓ la materia.\nNota: " + nota
            );

        } else if (nota >= 6.5 && nota < 7.0) {

            JOptionPane.showMessageDialog(
                    null,
                    "El alumno puede realizar EXAMEN DE SUFICIENCIA.\nNota: " + nota
            );

        } else {

            JOptionPane.showMessageDialog(
                    null,
                    "El alumno REPROBÓ la materia.\nNota: " + nota
            );

        }

    }

}