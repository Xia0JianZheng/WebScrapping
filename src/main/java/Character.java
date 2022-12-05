public class Character {
    String nombre;
    String rareza;
    String descripcion;
    String elemento;
    String region;
    String arma;

    public Character(String nombre, String rareza, String descripcion, String elemento, String region, String arma) {
        this.nombre = nombre;
        this.rareza = rareza;
        this.descripcion = descripcion;
        this.elemento = elemento;
        this.region = region;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(int rareza) {
        rareza = rareza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        descripcion = descripcion;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        elemento = elemento;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        region = region;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        arma = arma;
    }

    @Override
    public String toString() {
        return "Character{" +
                "nombre='" + nombre + '\'' +
                ", Rareza=" + rareza +
                ", Historia='" + descripcion + '\'' +
                ", Elemento='" + elemento + '\'' +
                ", Region='" + region + '\'' +
                ", Arma='" + arma + '\'' +
                '}';
    }
}
