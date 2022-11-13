import java.util.Scanner;

public class Condicionales2 {
    public static void main(String[] args) {
        String opcion ="Y";
        Scanner ingreso = new Scanner(System.in);
        
        while(opcion == "Y"){
            System.out.println("Quiere salir Y/N");
            opcion = ingreso.nextLine();

        }
    }
}
