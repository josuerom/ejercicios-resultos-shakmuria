package mundo;

import javax.swing.JOptionPane;

public class DosDelCentro {

   public static void main(String[] args) {
      condicion();
   }

   public static void condicion(){
      boolean condicion = false;
      String numero = "";

      while (condicion == false) {
         numero = JOptionPane.showInputDialog("Por favor ingrese un número de 4 a 12 digitos.");

         if (numero.length() >= 4 && numero.length() <= 12) {
            condicion = true;
         } else if (numero == null) {
            JOptionPane.showMessageDialog(null, "ERROR, ingrese datos válidos.");
         } else if (numero.length() < 4 || numero.length() > 12) {
            JOptionPane.showMessageDialog(null, "La cantidad de digitos no está dentro del rango exigido.");
         }
      }

      if (numero.length() % 2 == 0) {
         encontrarCentro(numero);
      } else {
         JOptionPane.showMessageDialog(null, "No hemos podido encontrarle el centro al número registrado," +
           " debido a que la cantidad de digitos es impar. Por favor intentelo de nuevo.");
         condicion();
      }
   }

   public static void encontrarCentro(String numero) {
      String[] vector = numero.split("");
      String resultado = "[";
      int item = (numero.length() / 2) - 1, i = 0;

      while (i < 2) {
         if (i == 1) {
            resultado += vector[item++] + "]";
         } else {
            resultado += vector[item++] + " y ";
         }
         i++;
      }
      JOptionPane.showMessageDialog(null, "Los 2 elementos del centro son: " + resultado);
   }
}