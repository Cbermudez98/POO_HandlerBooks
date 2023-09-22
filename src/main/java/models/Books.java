package models;

public class Books {
    // Abstraccion
    private int id;
    private String titulo;
    private String autor;
    
    //Encapsulamiento
    // La definiion de los metodos getter y setters

    public Books() {
    }

    public Books(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public String QuienSoy() {
        return "Soy el libro " + this.getTitulo() + " y me escribio " + this.getAutor();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    
    
}
