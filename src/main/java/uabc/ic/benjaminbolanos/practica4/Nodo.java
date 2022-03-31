package uabc.ic.benjaminbolanos.practica4;

/**
 * Clase que modela un nodo de una lista.
 * @author benjabolanos
 * @param <T>
 */
public class Nodo<T> {
    private T info;
    private Nodo<T> sig;
    
    /**
     * Constructor que recibe la info del nodo y el nodo siguiente.
     * @param info
     * @param sig 
     */
    public Nodo(T info, Nodo<T> sig){
        this.info = info;
        this.sig = sig;
    }
    
    /**
     * Constructor que inicializa todo como nulo.
     */
    public Nodo(){
        info = null;
        sig = null;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Nodo<T> getSig() {
        return sig;
    }

    public void setSig(Nodo<T> sig) {
        this.sig = sig;
    }
    
    @Override
    public String toString(){
        return info.toString();
    }
}
