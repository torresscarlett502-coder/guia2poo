import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {

        int cantidadEmpleados;
        int contador = 1;
        int empleadosMayor300 = 0;

        double sueldo;
        double mayor = 0;
        double menor = Double.MAX_VALUE;

        cantidadEmpleados = Integer.parseInt(
                JOptionPane.showInputDialog("¿Cuántos empleados desea ingresar?")
        );

        while (contador <= cantidadEmpleados) {

            sueldo = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Ingrese el sueldo del empleado " + contador + ":")
            );

            // Validar que el sueldo no sea negativo
            while (sueldo < 0) {

                JOptionPane.showMessageDialog(
                        null,
                        "Error. No se permiten sueldos negativos."
                );

                sueldo = Double.parseDouble(
                        JOptionPane.showInputDialog(
                                "Ingrese nuevamente el sueldo del empleado " + contador + ":")
                );
            }

            if (sueldo > mayor) {
                mayor = sueldo;
            }

            if (sueldo < menor) {
                menor = sueldo;
            }

            if (sueldo > 300) {
                empleadosMayor300++;
            }

            contador++;
        }

        JOptionPane.showMessageDialog(
                null,
                "RESULTADOS\n\n" +
                        "Sueldo mayor: $" + mayor +
                        "\nSueldo menor: $" + menor +
                        "\nEmpleados con sueldo mayor a $300: " + empleadosMayor300
        );
    }
}
