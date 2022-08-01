package mundo;

import javax.swing.*;

public class ItemsArray {

   public static void main(String[] args) {
      boolean condicion = false;
      String numero = "";

      while (condicion == false) {
         numero = JOptionPane.showInputDialog("Por favor, ingrese un número de 8 digitos.");

         if (numero.length() == 8) {
            condicion = true;
         } else if (numero.equals("0") || numero == null) {
            JOptionPane.showMessageDialog(null, "ERROR 404, rellene el campo correctamente.");
         } else if (numero.length() > 8) {
            JOptionPane.showMessageDialog(null, "El número supera los 8 digitos.");
         } else if (numero.length() < 8) {
            JOptionPane.showMessageDialog(null, "El número tiene menos de 8 digitos.");
         }
      }
      arrayItems(numero);
   }

   public static void arrayItems(String numero) {
      String[] strVector = numero.split("");
      String resultado = "[";

      // 0 1 2 3 4 5 6 7
      for (int i = 2; i < 6; i++) {
         if (i == 5) {
            resultado += strVector[i] + "].";
         } else {
            resultado += strVector[i] + ", ";
         }
      }
      JOptionPane.showMessageDialog(null, "Los 4 elementos del centro son: " + resultado);
   }
}