import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        ListaLC  lista = new ListaLC();
        int opcion = 0, elemento;
        boolean eliminado = false;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un Nodo a la Lista Circular \n"+
                        "2. Eliminar un Nodo de la Lista Circular\n"+
                        "3. Mostrar los datos de la Lista Ciruclar\n"+
                        "4. Salir\n"+
                        "Que deseas Hacer?", "Menu de Opciones",
                        JOptionPane.INFORMATION_MESSAGE));
                        switch (opcion){
                            case 1:
                                elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Ingresa el elemento del Nodo", "Agregando Nodo a la Lista Circular"));
                                lista.insertar(elemento);
                                break;
                              case 2:
                                  if (!lista.estaVacia()) {
                                      elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                              "Ingresa el elemento del Nodo a Eliminar", "Eliminando Nodo de la Lista Circular", JOptionPane.INFORMATION_MESSAGE));
                                      eliminado = lista.eliminar(elemento);
                                      if (eliminado) {
                                          JOptionPane.showMessageDialog(null, "El elemento eliminado es " + elemento,
                                                  "Eliminando Nodos.", JOptionPane.INFORMATION_MESSAGE);
                                      } else {
                                          JOptionPane.showMessageDialog(null, "El elemento " + elemento + " No esta en la Lista",
                                                  "Elemento No Encontrado.", JOptionPane.INFORMATION_MESSAGE);

                                      }
                                  }else {
                                      JOptionPane.showMessageDialog(null, "Aun no hay Nodos",
                                              "Lista Vacia.",JOptionPane.INFORMATION_MESSAGE);

                                  }
                                break;
                            case 3:
                                if (!lista.estaVacia()){
                                    lista.mostrarLista();
                                }else {
                                    JOptionPane.showMessageDialog(null, "Aun no hay Nodos",
                                            "Lista Vacia.",JOptionPane.INFORMATION_MESSAGE);
                                }
                              break;
                            case 4:
                                JOptionPane.showMessageDialog(null,"Aplicacion Finalizada",
                                        "Fin.",JOptionPane.INFORMATION_MESSAGE);
                               break;

                            default:
                                JOptionPane.showMessageDialog(null,"La opcion no esta en el Menu",
                                        "Incorrecto", JOptionPane.INFORMATION_MESSAGE);
                        }
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error "+n.getMessage());
            }
        }while (opcion != 4);
    }
}
