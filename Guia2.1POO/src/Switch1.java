public class Switch1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        char op = '+'; // Cambia el operador para probar

        System.out.print("El resultado es: ");

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;

            default:
                System.out.println("Error: Operador no válido");
                break;
        }
    }
}