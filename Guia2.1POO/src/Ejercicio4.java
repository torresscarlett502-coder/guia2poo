import javax.swing.JOptionPane;
import java.util.HashMap;

public class Ejercicio4 {

    public static void main(String[] args) {

        HashMap<String, String> estudiantes = new HashMap<>();

        int opcion;

        do {

            String menu = """
                    ===== MENU =====
                    1. Ingresar estudiante
                    2. Ver estudiantes
                    3. Buscar estudiante
                    4. Salir

                    Seleccione una opción:
                    """;

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {

                case 1:

                    String carnet = JOptionPane.showInputDialog("Ingrese el carnet:");

                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");

                    estudiantes.put(carnet, nombre);

                    JOptionPane.showMessageDialog(null,
                            "Estudiante agregado correctamente.");

                    break;

                case 2:

                    if (estudiantes.isEmpty()) {

                        JOptionPane.showMessageDialog(null,
                                "No hay estudiantes registrados.");

                    } else {

                        String lista = "LISTA DE ESTUDIANTES\n\n";

                        for (String carnetEst : estudiantes.keySet()) {

                            lista += "Carnet: " + carnetEst +
                                    "   Nombre: " +
                                    estudiantes.get(carnetEst) + "\n";

                        }

                        JOptionPane.showMessageDialog(null, lista);

                    }

                    break;

                case 3:

                    String buscar = JOptionPane.showInputDialog("Ingrese el carnet a buscar:");

                    if (estudiantes.containsKey(buscar)) {

                        JOptionPane.showMessageDialog(null,
                                "Carnet: " + buscar +
                                        "\nNombre: " +
                                        estudiantes.get(buscar));

                    } else {

                        JOptionPane.showMessageDialog(null,
                                "Estudiante no encontrado.");

                    }

                    break;

                case 4:

                    JOptionPane.showMessageDialog(null,
                            "Gracias por usar el sistema.");

                    break;

                default:

                    JOptionPane.showMessageDialog(null,
                            "Opción inválida.");

            }

        } while (opcion != 4);

    }
}