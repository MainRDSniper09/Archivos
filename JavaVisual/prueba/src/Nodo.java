//Clase que define los elementos que debe tener un nodo en la lista

public class Nodo {
    //Variable en la que se va a guardar el valor
    private int valor;
    //Variable para enlazar nodos
    private Nodo siguiente;

    //Constructor que inicializamos el valor de las variable
    public void Nodo(){
        this.valor = 0;
        this.siguiente = null;
    }

    //Metodos get y set para los atributos

    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
