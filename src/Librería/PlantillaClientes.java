/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librería;

import FormulariosSwing.JFrame_MantenimientoDeClientes;
import Librería.GestionClientes;
/**
 *
 * @author Home
 */
public class PlantillaClientes 
{   private String DNI;
    private String Nombre;
    private String Apellidos;
    private String Dirección;
    private String Distrito;
    private String Correo;
    private String Celular;

   
    //Constructor
    
     

    public PlantillaClientes(String DNI, String Nombre, String Apellidos, String Dirección, String Distrito, String Correo, String Celular) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Dirección = Dirección;
        this.Distrito = Distrito;
        this.Correo = Correo;
        this.Celular = Celular;
    }

    
    //getter and setter

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellidos
     */
    public String getApellidos() {
        return Apellidos;
    }

    /**
     * @param Apellidos the Apellidos to set
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    /**
     * @return the Dirección
     */
    public String getDirección() {
        return Dirección;
    }

    /**
     * @param Dirección the Dirección to set
     */
    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    /**
     * @return the Distrito
     */
    public String getDistrito() {
        return Distrito;
    }

    /**
     * @param Distrito the Distrito to set
     */
    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    /**
     * @return the Correo
     */
    public String getCorreo() {
        return Correo;
    }

    /**
     * @param Correo the Correo to set
     */
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    /**
     * @return the Celular
     */
    public String getCelular() {
        return Celular;
    }

    /**
     * @param Celular the Celular to set
     */
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }
    
    
    
    
    
    
}
