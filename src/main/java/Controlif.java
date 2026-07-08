import java.util.*;
public class Controlif {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        int Var1,Var2;
        System.out.println("Ingrese numero1:");
        Var1=reader.nextInt();
        System.out.println("Ingrese numero2");
        Var2=reader.nextInt();
        if(Var1==Var2) {
            System.out.println("Los numeros ingresados son iguales");
        }
        else{
            System.out.println("Los numeros ingresados No son iguales");
        }

    }



}
