/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematransito.modelo;

/**
 *
 * @author RYZEN 5
 */
public class Persona {
    
    private Integer cedula;
    private String nombre;
    private String apellido;
    private Integer contacto;

    public Persona() {
    }

    public Persona(Integer cedula, String nombre, String apellido, Integer contacto) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contacto = contacto;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getContacto() {
        return contacto;
    }

    public void setContacto(Integer contacto) {
        this.contacto = contacto;
    }
    
    
}
