import java.io.IOException;
import java.util.Scanner;

public class main {
  public static void main(String[] args) throws IOException {
     Scanner leitor = new Scanner(System.in);

     int positivos = 0;
     double media = 0;
     double somaPositivos = 0;
     double x = 0 ;
        
        for (int contador = 0 ; contador < 6; contador++) {
            x = leitor.nextDouble();

           if (x > 0){
             positivos ++;
             somaPositivos += x;
            }
        	}
            media = somaPositivos / positivos;

            System.out.println("\n" + positivos+" valores positivos\n");
            System.out.println(String.format("%.1f", media));
        }
    }
    
