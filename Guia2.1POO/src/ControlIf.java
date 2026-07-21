import java.util.Scanner;

public class ControlIf {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int var1, var2;

        System.out.print("Ingrese numero1: ");
        var1 = reader.nextInt();

        System.out.print("Ingrese numero2: ");
        var2 = reader.nextInt();

        if (var1 == var2) {
            System.out.println("Los numeros ingresados son iguales");
        } else {
            System.out.println("Los numeros ingresados NO son iguales");
        }

        reader.close();
    }
}