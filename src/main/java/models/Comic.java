package models;
// Herencia
public class Comic extends Books {
    private int cantidadDeimangens;

    public Comic() {
    }

    public Comic(int id, String titulo, String autor, int cantidadDeimangens) {
        super(id, titulo, autor);
        this.cantidadDeimangens = cantidadDeimangens;
    }
    
    // Metodos override
    
    @Override
    public String QuienSoy() {
        return "Soy el Commic " + this.getTitulo() + " y me escribio " + this.getAutor() + " Y tengo " + this.cantidadDeimangens + " de imagenes.";
    }

    /**
     * @return the cantidadDeimangens
     */
    public int getCantidadDeimangens() {
        return cantidadDeimangens;
    }

    /**
     * @param cantidadDeimangens the cantidadDeimangens to set
     */
    public void setCantidadDeimangens(int cantidadDeimangens) {
        this.cantidadDeimangens = cantidadDeimangens;
    }
    
    
    
    
}
