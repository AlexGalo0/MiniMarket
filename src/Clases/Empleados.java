/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author ACalix
 */
public class Empleados extends Persona {
    
    private String direccion;
    private String telefono;
    private int edad;

    public Empleados() {
    }

    public Empleados(String direccion, String telefono, int edad, int id, String nombre, String apellidos) {
        super(id, nombre, apellidos);
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleados{" + "direccion=" + direccion + ", telefono=" + telefono + ", edad=" + edad + '}';
    }
    
    
    
}
