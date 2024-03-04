import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String usuarioRadio1 = JOptionPane.showInputDialog(null,"Ingrese el radio del primer circulo");
        double radio1 = Double.parseDouble(usuarioRadio1);
        calculoRadio r1 = new calculoRadio(radio1);
        double area1 = r1.calcularArea();

        String usuarioRadio2 = JOptionPane.showInputDialog(null,"Ingrese el radio del primer circulo");
        double radio2 = Double.parseDouble(usuarioRadio2);
        calculoRadio r2 = new calculoRadio(radio2);
        double area2 = r2.calcularArea();

        if (area1 > area2){
            JOptionPane.showMessageDialog(null,"El area del circulo uno: "+area1+" es mayor a comparacion del circulo dos: " + area2 );
        } else if (area1 < area2) {
            JOptionPane.showMessageDialog(null,"El area del circulo dos: "+area2+" es mayor a comparacion del circulo uno: " + area1 );
        }else {
            JOptionPane.showMessageDialog(null,"El area de los dos circulos es igual: " +"\n"+ area1 +"\n"+ area2);

        }
    }
}
