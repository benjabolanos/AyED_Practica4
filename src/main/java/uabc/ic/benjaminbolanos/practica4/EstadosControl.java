package uabc.ic.benjaminbolanos.practica4;

/**
 * Clase que modela el control de la lista de los Estados de México.
 * @author benjabolanos
 */
public class EstadosControl {
    private final ListaSimple<Estado> estados;
    private int posicionLista;
    
    /**
     * Constructor que inicia la ListaSimple, la posicion de la lista como -1
     * y manda a crear los estados.
     */
    public EstadosControl(){
        estados = new ListaSimple();
        posicionLista = -1;
        crearEstados();
    }
    
    /**
     * Método que inicia los 32 estados de México.
     */
    private void crearEstados(){
        estados.insertarFin(new Estado("Aguascalientes","Aguascalientes","1857", "5,618km^2", "/escudos/aguascalientes.png"));
        estados.insertarFin(new Estado("Baja California","Mexicali", "1952", "71,446km^2", "/escudos/baja_california.png"));
        estados.insertarFin(new Estado("Baja California Sur","La Paz","1974", "73,922km^2", "/escudos/baja_california_sur.png"));
        estados.insertarFin(new Estado("Campeche","Campeche","1863", "57,924km^2", "/escudos/campeche.png"));
        estados.insertarFin(new Estado("Chiapas","Tuxta Gutiérrez","1824", "73,289km^2", "/escudos/chiapas.png"));
        estados.insertarFin(new Estado("Chihuahua","Chihuahua","1824", "247,455km^2", "/escudos/chihuahua.png"));
        estados.insertarFin(new Estado("Ciudad de México","CDMX","2016", "1,485km^2", "/escudos/cdmx.png"));
        estados.insertarFin(new Estado("Coahuila","Saltillo","1824", "151,563km^2", "/escudos/coahuila.png"));
        estados.insertarFin(new Estado("Colima","Colima","1856", "5,625km^2", "/escudos/colima.png"));
        estados.insertarFin(new Estado("Durango","Durango","1824", "123,451km^2", "/escudos/durango.png"));
        estados.insertarFin(new Estado("Guanajuato","Guanajuato","1823", "30,608km^2", "/escudos/guanajuato.png"));
        estados.insertarFin(new Estado("Guerrero","Chilpancingo","1849", "63,621km^2", "/escudos/guerrero.png"));
        estados.insertarFin(new Estado("Hidalgo","Pachuca","1869", "20,813km^2", "/escudos/hidalgo.png"));
        estados.insertarFin(new Estado("Jalisco","Guadalajara","1823", "78,599km^2", "/escudos/jalisco.png"));
        estados.insertarFin(new Estado("Estado de México","Toluca","1823", "22,357km^2", "/escudos/estado_de_mexico.png"));
        estados.insertarFin(new Estado("Michoacán","Morelia","1823", "58,643km^2", "/escudos/michoacan.png"));
        estados.insertarFin(new Estado("Morelos","Cuernavaca","1869", "4,893km^2", "/escudos/morelos.png"));
        estados.insertarFin(new Estado("Nayarit","Tepic","1917", "27,815km^2", "/escudos/nayarit.png"));
        estados.insertarFin(new Estado("Nuevo León","Monterrey","1824", "64,220 km^2", "/escudos/nuevo_leon.png"));
        estados.insertarFin(new Estado("Oaxaca","Oaxaca","1823", "93,793km^2", "/escudos/oaxaca.png"));
        estados.insertarFin(new Estado("Puebla","Puebla","1823 ", "34,290km^2", "/escudos/puebla.png"));
        estados.insertarFin(new Estado("Querétaro","Querétaro","1823", "11,684km^2", "/escudos/queretaro.png"));
        estados.insertarFin(new Estado("Quintana Roo","Chetumal","1974", "42,361km^2", "/escudos/quintana_roo.png"));
        estados.insertarFin(new Estado("San Luis Potosí","San Luis Potosí","1823", "60,983km^2", "/escudos/san_luis_potosi.png"));
        estados.insertarFin(new Estado("Sinaloa","Culiacán","1830", "57,377km^2", "/escudos/sinaloa.png"));
        estados.insertarFin(new Estado("Sonora","Hermosillo","1824", "179,503km^2", "/escudos/sonora.png"));
        estados.insertarFin(new Estado("Tabasco","Villahermosa","1824", "24,738km^2", "/escudos/tabasco.png"));
        estados.insertarFin(new Estado("Tamaulipas","Ciudad Victoria","1824", "80,175km^2", "/escudos/tamaulipas.png"));
        estados.insertarFin(new Estado("Tlaxcala","Tlaxcala","1856", "4,016km^2", "/escudos/tlaxcala.png"));
        estados.insertarFin(new Estado("Veracruz","Xalapa","1823", "71,820km^2", "/escudos/veracruz.png"));
        estados.insertarFin(new Estado("Yucatán","Mérida","1823", "39,612km^2", "/escudos/yucatan.png"));
        estados.insertarFin(new Estado("Zacatecas","Zacatecas","1823", "75,539km^2", "/escudos/zacatecas.png"));
    }
    
    /**
     * Método que avanza la lista y verifica si se ha llegado al final. 
     * @return True si se llegó al final de la lista.
     */
    public boolean avanzarLista(){
        if(estados.size()-1 > posicionLista) posicionLista++;
        return estados.get(posicionLista+1) == null;
    }
    
    /**
     * Método para obtener el estado actual que debe ser mostrado.
     * @return el estado actual a mostrar.
     */
    public Estado getEstadoActual(){
        return estados.get(posicionLista);
    }
    
    /**
     * Método que mezcla la lista y reinicia la posicion
     */
    public void mezclar(){
        posicionLista = -1;
        estados.mezclar();
    }
    
    /**
     * Método para obtener un estado de la lista dependiendo de un índice.
     * @param index Índice del estado a obtener.
     * @return Estado de la lista en la posicion 'index'
     */
    public Estado get(int index){
        return estados.get(index);
    }
    
    /**
     * Método para obtener la cantidad de estados en la lista
     * @return El tamaño de la lista de estados.
     */
    public int getCantidadEstados(){
        return estados.size();
    }
}
