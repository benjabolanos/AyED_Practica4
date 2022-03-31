package uabc.ic.benjaminbolanos.practica4;

import java.util.Random;

/**
 * Clase que modela una Lista Simple.
 * @author benjabolanos
 * @param <T>
 */
public class ListaSimple<T> {
    private Nodo<T> inicio;
    
    /**
     * Constructor que inicializa el primer nodo como nulo.
     */
    public ListaSimple(){
        inicio = null;
    }
    
    /**
     * Método que recibe un dato, crea un nodo y lo inserta al inicio de la lista.
     * @param dato Info del nuevo nodo a insertar.
     */
    public void insertarInicio(T dato){
        Nodo<T> n = new Nodo(dato, inicio);
        inicio = n;
    }
    
    /**
     * Método que recibe un dato, crea un nodo y lo inserta al final de la lista.
     * @param dato 
     */
    public void insertarFin(T dato){
        Nodo<T> n = new Nodo(dato, null);
        if(inicio == null){
            n.setSig(inicio);
            inicio = n;
        } else {
            Nodo<T> r = inicio;
            while(r.getSig() != null){
                r = r.getSig();
            }
            r.setSig(n);
            n.setSig(null);
        }
    }
    
    /**
     * Método que obtiene el nodo del inicio de la lista y lo elimina al hacer
     * el siguiente nodo el nuevo inicio. Retorna la info del nodo eliminado.
     * @return Info del nodo eliminado.
     */
    public T eliminarInicio(){
        T dato;
        if(inicio == null){
            dato = null;
        } else {
            dato = inicio.getInfo();
            inicio = inicio.getSig();
        }
        return dato;
    }
    
    /**
     * Método que obtiene el nodo del final de la lista y lo elimina.
     * Retorna la info del nodo eliminado.
     * @return Info del nodo eliminado.
     */
    public T eliminarFin(){
        T dato;
        if(inicio == null){
            dato = null;
        } else {
            if(inicio.getSig() == null){
                dato = inicio.getInfo();
                inicio = null;
            } else {
                Nodo<T> r = inicio, a = r;
                while(r.getSig() != null){
                    a = r;
                    r = r.getSig();
                }
                dato = r.getInfo();
                a.setSig(null);
            }
        }
        return dato;
    }
    
    /**
     * Método para recorrer la lista y retornar un String con toda la info
     * @return String que contiene toda la info de la lista.
     */
    public String recorrer(){
        String cadena = new String();
        if(inicio != null){
            Nodo<T> r = inicio;
            while(r != null){
                cadena += r.toString() + " ";
                r = r.getSig();
            }
        } else {
            cadena = "Lista Vacia";
        }
        return cadena;
    }
    
    /**
     * Método para contar la cantidad de nodos que hay en la lista actual.
     * @return La cantidad de nodos en la lista
     */
    public int size(){
        int size = 0;
        Nodo r = inicio;
        while(r!=null){
            size++;
            r = r.getSig();
        }
        return size;
    }
    
    /**
     * Método para obtener un elemento de la lista en cierta posicion.
     * @param i Posicion del elemento a obtener.
     * @return El elemento en la posicion indicada de la lista.
     */
    public T get(int i){
        if(i < 0 || i >= size()){
            return null;
        } else {
            Nodo<T> r = inicio;
            for(int j = 0; j < i; j++){
                r = r.getSig();
            }
            return r.getInfo();
        }
    }
    
    /**
     * Método para obtener un nodo de la lista en cierta posicion.
     * @param i Posicion del nodo a obtener.
     * @return El nodo en la posicion indicada de la lista.
     */
    public Nodo<T> nodoEn(int i){
        if(i < 0 || i >= size()){
            return null;
        } else {
            Nodo<T> r = inicio;
            for(int j = 0; j < i; j++){
                r = r.getSig();
            }
            return r;
        }
    }
    
    /**
     * Método que mezcla la lista.
     */
    public void mezclar(){
        Random rand = new Random();
        for(int i = 0; i < size(); i++){
            int randInt = rand.nextInt(size());
            T aux = get(randInt);
            nodoEn(randInt).setInfo(get(i));
            nodoEn(i).setInfo(aux);
        }
    }
}
