package uabc.ic.benjaminbolanos.practica4;

import java.util.Random;

/**
 * Clase que modela el control de un juego ludico donde el jugador debe indicar
 * cual es el escudo del estado dado.
 * @author benjabolanos
 */
public class JuegoControl {
    private final EstadosControl estados;
    private int respuesta;
    private int puntaje;
    private final Estado[] opciones;
    
    /**
     * Constructor que inicializa variables y contadores.
     */
    public JuegoControl(){
        estados = new EstadosControl();
        respuesta = -1;
        puntaje = 0;
        opciones = new Estado[3];
    }
    
    /**
     * Método para aumentar en +1 el puntaje del jugador
     */
    public void aumentarPuntaje(){
        puntaje++;
    }
    
    /**
     * Método que crea un nuevo juego, al crear 3 numeros aleatorios y seleccionando
     * los estado de la lista en esas posiciones. Crea un ultimo numero aleatorio
     * que indica cual será la respuesta correcta.
     */
    public void crearJuego(){
        Random rand = new Random();
        int[] indexes = new int[]{-1,-2,-3};
        for(int i = 0; i < 3; i++){
            indexes[i] = rand.nextInt(estados.getCantidadEstados());
            if(indexes[0] == indexes[1] || indexes[0] == indexes[2] || indexes[1] == indexes[2]){
                i = 0;
                indexes = new int[]{-1,-2,-3};
            } else {
                opciones[i] = estados.get(indexes[i]);
            }
            
        }
        respuesta = rand.nextInt(3);
    }
    
    /**
     * Método para checar si la respuesta dada es la correcta
     * @param respuesta Respuesta dada por el jugador
     * @return true si la respuesta es correcta
     */
    public boolean checarRespuesta(int respuesta){
        return this.respuesta == respuesta;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public Estado[] getOpciones() {
        return opciones;
    }
}
