/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.rafinha;

/**
 *
 * @author Nuria
 */
public class DUI {
    private String nombre;
    private String direccion;
    private String estadoCivil;
    private String genero;
    private String numeroDui;

    public DUI() {
    }

    public DUI(String nombre, String direccion, String estadoCivil, String genero, String numeroDui) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.genero = genero;
        this.numeroDui = numeroDui;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNumeroDui() {
        return numeroDui;
    }

    public void setNumeroDui(String numeroDui) {
        this.numeroDui = numeroDui;
    }
        
}
