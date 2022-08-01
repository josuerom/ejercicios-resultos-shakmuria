package mundo;

import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 * Este pequeño programa encuentra el mínimo común múltiplo de dos números, se puede extender a un númera más.
 * @author josuerom
 * @see 23/07/2022 COL
 */
public class MinimoComunMultiplo {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un número entero positivo."));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número entero positivo."));
        int[] vec1 = new int[9]; vec1[0] = num1;
        int[] vec2 = new int[9]; vec2[0] = num2;
        int result = 0;

        for (int i = 1; i <= 8; i++) {
            vec1[i] = (vec1[i-1] + num1);
            vec2[i] = (vec2[i-1] + num2);
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                if (vec1[i] == vec2[j]) {
                    if (result == 0) {
                        result = vec2[j];
                        break;
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "El MCM de (" + num1 + ", " + num2 + ") es = " + result);
        //JOptionPane.showMessageDialog(null, Arrays.toString(vec1) + "\n" + Arrays.toString(vec2));
    }
}