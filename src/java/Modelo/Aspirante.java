/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago199
 */
public class Aspirante implements Serializable{
    public static ArrayList listaA = new ArrayList<Aspirante>();
    private String nombre;
    private String correo;
    private String telefono;
    private List<String> materias;
    private LocalDate fecha;

    public Aspirante() {
    }

    public Aspirante(String nombre, String correo, String telefono, List<String> materias, LocalDate fecha) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.materias = materias;
        this.fecha = fecha;
        listaA.add(this);
    }

    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<String> getMaterias() {
        return materias;
    }

    public void setMaterias(List<String> materias) {
        this.materias = materias;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
}
