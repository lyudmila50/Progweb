public class Contacto {
    private String numero ;
    private String nombre;
    private String email ;

    public Contacto(String numero, String nombre, String email) {
        this.numero = numero;
        this.nombre = nombre;
        this.email = email;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contacto numero(String numero) {
        this.numero = numero;
        return this;
    }

    public Contacto nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Contacto email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Contacto)) {
            return false;
        }
        Contacto contacto = (Contacto) o;
        return Objects.equals(numero, contacto.numero) && Objects.equals(nombre, contacto.nombre) && Objects.equals(email, contacto.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, nombre, email);
    }

    @Override
    public String toString() {
        return "{" +
            " numero='" + getNumero() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }
  
}