import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int x = 1234; 
            int g;
            int intentos = 0;

            System.out.println("Ingresa la contraseña");

            do {
                g = entrada.nextInt();
                intentos++;
            } while (g != x && intentos < 4);

            if (intentos == 4) {
                System.out.println("Limite de intentos alcanzado");
            } else {
                System.out.println("La contraseña es correcta");
            }
        }
    }

        
      
  
