package uabc.ic.benjaminbolanos.practica4;

import javax.swing.ImageIcon;

/**
 * Clase que modela un Estado de México para presentarlo.
 * @author benjabolanos
 */
public class Estado {
    private String nombre;
    private String capital;
    private String añoFundacion;
    private String extensionTerritorial;
    private ImageIcon escudo;

    public Estado(String nombre, String capital, String añoFundacion, String extensionTerritorial, String rutaEscudo) {
        this.nombre = nombre;
        this.capital = capital;
        this.añoFundacion = añoFundacion;
        this.extensionTerritorial = extensionTerritorial;
        this.escudo = new ImageIcon(getClass().getResource(rutaEscudo));
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getAñoFundacion() {
        return añoFundacion;
    }

    public void setAñoFundacion(String añoFundacion) {
        this.añoFundacion = añoFundacion;
    }

    public String getExtensionTerritorial() {
        return extensionTerritorial;
    }

    public void setExtensionTerritorial(String extensionTerritorial) {
        this.extensionTerritorial = extensionTerritorial;
    }

    public ImageIcon getEscudo() {
        return escudo;
    }

    public void setEscudo(ImageIcon escudo) {
        this.escudo = escudo;
    }
}
