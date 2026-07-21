import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {

        double compra;
        double descuento = 0;
        double total;

        // Ingresar monto de la compra
        compra = Double.parseDouble(JOptionPane.showInputDialog(
                "Ingrese el monto de la compra:"));

        // Seleccionar color
        String color = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione el color de la bolita",
                "Descuento",
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Roja", "Verde", "Blanca"},
                "Blanca");

        switch (color) {

            case "Roja":
                descuento = compra * 0.10;
                break;

            case "Verde":
                descuento = compra * 0.05;
                break;

            case "Blanca":
                descuento = 0;
                break;
        }

        total = compra - descuento;

        if (color.equals("Blanca")) {

            JOptionPane.showMessageDialog(
                    null,
                    "Gracias por participar.\n" +
                            "No obtuvo descuento.\n" +
                            "Total a pagar: $" + total);

        } else {

            JOptionPane.showMessageDialog(
                    null,
                    "Color obtenido: " + color +
                            "\nDescuento: $" + descuento +
                            "\nTotal a pagar: $" + total);
        }

    }
}