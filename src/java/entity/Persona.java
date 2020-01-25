package entity;

public class Persona {
    int id;
    String nombres;
    String nacionalidad;
    String correo;

    public Persona() {
    }

    public Persona(int id, String nombres, String nacionalidad, String correo) {
        this.id = id;
        this.nombres = nombres;
        this.nacionalidad = nacionalidad;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
