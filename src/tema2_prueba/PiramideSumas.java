package tema2_prueba;

import java.util.Scanner;

public class PiramideSumas {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String resp;

    do {
      int num = leerEntero(sc, "Introduzca un número: "); // AOT20251031 - faltaba un punto y coma

      while (num < 0 || num > 20) { // AOT20251031 - cambiar && por || porque cuando me salia del rango ta,bien
        // seguia
        num = leerEntero(sc, "**Valor fuera de rango** Introduzca un número entre 0 y 20: ");
      }

      System.out.println("\nSu pirámide de sumas es la siguiente:\n" + piramide(num));

      System.out.print("¿Quiere hacer otra pirámide? (s/n) ");
      resp = sc.next().trim().toUpperCase(); // AOT20251031- la varible esta duplicada

    } while (resp.equals("S")); // AOT20251031 - faltaba un parentésis no se si hace falta ponerlo tambien pero
    // creo q falta un charAt

    borrarConsola();
    System.out.println("¡¡¡PROGRAMA FINALIZADO!!!");

    sc.close();
  }

  private static int leerEntero(Scanner sc, String mensaje) {
    System.out.print(mensaje);
    while (!sc.hasNextInt()) {
      System.out.print("**Valor no válido** Introduzca un número entero: ");
      sc.next();
    }
    return sc.nextInt();
  }

  public static void borrarConsola() {
    for (int i = 0; i < 50; i++) { // AOT20251031 - en la condicion había puesta una coma en vez de punto y coma
      System.out.println();
    }
  }

  public static String piramide(int num) {
    String res = "";
    int n = num;
    int cont = 1;
    int total = 0;

    while (n >= 0) { // AOT20251031 - me equivique antes tenia q poner 0 en vez de num pq sino no valia y no tenia sentido

      res += n + " => 0 ";

      while (cont <= n) { // AOT20251031 - Hay que poner bien las llaves y quitar el do q puse antes en todo el while
        res += "+ " + cont + " ";
        total += cont;
        cont += 1;
      }
      if (n != 0) {
        res += "= " + total;
      }
      res += "\n";
      n -= 1;
    }

    return res; // AOT20251031 - error al scribir variable, cambio de resultado a res
  }

}
