public class calculoRadio {

    private double radio;

    public calculoRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea(){
        double area = Math.PI*(radio*radio);
        return area;
    }
}
