import javax.swing.JOptionPane;

public class Switch2 {

    public static void main(String[] args) {

        int respuesta = JOptionPane.showConfirmDialog(
                null,
                "¿Reemplazar la selección existente?"
        );

        String resultado;

        switch (respuesta) {

            case JOptionPane.YES_OPTION:
                resultado = "Yes";
                break;

            case JOptionPane.NO_OPTION:
                resultado = "No";
                break;

            case JOptionPane.CANCEL_OPTION:
                resultado = "Canceled";
                break;

            case JOptionPane.CLOSED_OPTION:
                resultado = "Closed";
                break;

            default:
                resultado = "Desconocido";
        }

        JOptionPane.showMessageDialog(
                null,
                "Respuesta seleccionada: " + resultado
        );

        System.out.println("Respuesta: " + resultado);
    }
}
