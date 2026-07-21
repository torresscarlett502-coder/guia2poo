import javax.swing.JOptionPane;

public class SentenciaIf {

    public static void main(String[] args) {

        String datos;
        double sueldo;
        double afp = 0;
        double isss = 0;
        double renta = 0;
        double totalRetenciones;
        double nuevoSueldo;

        datos = JOptionPane.showInputDialog("Ingrese el sueldo del empleado:");
        sueldo = Double.parseDouble(datos);

        // Descuento AFP
        if (sueldo > 300) {
            afp = sueldo * 0.0625;
        }

        JOptionPane.showMessageDialog(
                null,
                "Sueldo: $" + sueldo +
                        "\nAFP: $" + afp
        );

        // Seleccionar sexo
        datos = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione el sexo del empleado",
                "Sexo",
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"M", "F"},
                "F"
        );

        if (datos.equals("M")) {

            isss = sueldo * 0.03;
            renta = sueldo * 0.10;

            totalRetenciones = afp + isss + renta;
            nuevoSueldo = sueldo - totalRetenciones;

            JOptionPane.showMessageDialog(
                    null,
                    "AFP: $" + afp +
                            "\nISSS: $" + isss +
                            "\nRenta: $" + renta +
                            "\nTotal Retenciones: $" + totalRetenciones +
                            "\nNuevo Sueldo: $" + nuevoSueldo
            );

        } else {

            nuevoSueldo = sueldo - afp;

            JOptionPane.showMessageDialog(
                    null,
                    "AFP: $" + afp +
                            "\nNuevo Sueldo: $" + nuevoSueldo
            );
        }
    }
}