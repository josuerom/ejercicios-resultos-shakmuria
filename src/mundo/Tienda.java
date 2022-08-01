package mundo;

import javax.swing.*;

public class Tienda {

   public static void main(String[] args) {
      int total_compra = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el total de la compra?"));
      int importe = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese el importe de la compra."));
      calculoPorCompra(total_compra, importe);
   }

   public static void calculoPorCompra(int total_compra, int importe) {
      if (importe == total_compra) {
         JOptionPane.showMessageDialog(null, "Compra realizada con éxito.");
      } else if (importe > total_compra) {
         int cambio = importe - total_compra;
         JOptionPane.showMessageDialog(null, "Compra realizada con éxito, su cambio es: $" + cambio);
      } else  if (importe != 0 && importe < total_compra) {
         JOptionPane.showMessageDialog(null, "El importe está incompleto, efectue el pago completo por favor.");
      } else if (importe <= 0 || total_compra <= 0) {
         JOptionPane.showMessageDialog(null, "ERROR 404, hemos dectectado fallas en su respuesta.");
      }
   }
}