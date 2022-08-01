package mundo;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class MCM3 {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese un número entero positivo."));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número entero positivo."));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el último número entero positivo."));
        int[] vec1 = new int[9]; vec1[0] = num1;
        int[] vec2 = new int[9]; vec2[0] = num2;
        int[] vec3 = new int[9]; vec3[0] = num3;
        int result = 0, comp = 0;

        for (int i = 1; i < 9; i++) {
            vec1[i] = (vec1[i-1] + num1);
            vec2[i] = (vec2[i-1] + num2);
            vec3[i] = (vec3[i-1] + num3);
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                if (vec1[i] == vec2[j]) {
                    if (comp == 0) {
                        comp = vec2[j];
                    }
                }
            }
        }

        for (int l = 0; l < 9; l++) {
            if (vec3[l] == comp) {
                result = comp;
            }
        }
        JOptionPane.showMessageDialog(null, "El MCM de (" + num1 + ", " + num2 + ", " + num3 + ") es = " + result + "\n"
            + Arrays.toString(vec1) + "\n" + Arrays.toString(vec2) + "\n" + Arrays.toString(vec3));
    }
}