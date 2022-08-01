package mundo;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class MayorDeTres {

   public static void main(String[] args) {
      MayorDeTres interfaz = new MayorDeTres();
      interfaz.enterNumber();
   }

   public void enterNumber() {
      boolean threeDigit = false;
      String strNumber = "";

      while (threeDigit == false) {
         strNumber = JOptionPane.showInputDialog("Please, enter a three digit number.");
         threeDigit = (strNumber.length() == 3) ? true : false;

         if (threeDigit == false) {
            JOptionPane.showMessageDialog(null, "Your registration does not meet the requirements. Try again.");
         }
      }
      biggerNumber(strNumber);
   }
   public static void biggerNumber(String number) {
      String[] strNumber = number.split("");
      int[] vector = new int[3];

      for (int i = 0; i < 3; i++) {
         vector[i] = Integer.valueOf(strNumber[i]);
      }
      Arrays.sort(vector);
      JOptionPane.showMessageDialog(null, "El número mayor de la cifra (" + number + ") es = " + vector[2]);
   }
}