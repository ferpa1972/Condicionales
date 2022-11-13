import java.util.Scanner;

public class Condicionales1 {
    public static void main(String[] args) {
        int num;
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Multiplicador");
        System.out.println("Ingrese numero a multiplicar");
        num = ingreso.nextInt();
        for(int i = 0; i<10;i++){
            int mult = num * i;
            System.out.println(num+" * "+" "+ i+ " = "+ mult);
        }
    }
}
