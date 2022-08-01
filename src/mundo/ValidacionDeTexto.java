package mundo;

import javax.swing.JOptionPane;

/**
 * @program Solución al ejercicio práctico #73 -> https://www.youtube.com/watch?v=mFAtW_UxAXc&list=PLDfQIFbmwhremI6UYsjY5jTmu1usrvTJW&index=74
 * @date 26/07/2022 21:04 COL
 * @author https://github.com/josuerom
 */
public class ValidacionDeTexto {

   public static void main(String[] args) {
      String palabra = "";
      do {
         palabra = JOptionPane.showInputDialog("Por favor, ingrese una cadena de texto.");
      } while (convertirPalabra(palabra) == false);
   }

   public static boolean convertirPalabra(String palabra) {
      String[] vector = palabra.split("");
      boolean letras = true;

      for (int i = 0; i < vector.length; i++) {
         char item = vector[i].charAt(0);
         boolean condicion = ((item >= 65 && item <= 90) || (item >= 97 && item <= 122) || item == 32) ? true : false;

         if (condicion == false) {
            letras = false;
         }
      }

      if (letras == false) {
         JOptionPane.showMessageDialog(null, "La cadena (" + palabra + ") no cumple el requisito, debido a que tiene carácteres especiales. Intentelo de nuevo.");
      } else {
         JOptionPane.showMessageDialog(null, "La cadena de texto (" + palabra + ") cumple el requisito.");
      }
      return letras;
   }
}