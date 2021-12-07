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
{
    
    
    
    JFrame_MantenimientoDeClientes Var = new JFrame_MantenimientoDeClientes();
    private String DNI;
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
    
    //codigo opcional
    PlantillaClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public JFrame_MantenimientoDeClientes getVar() {
        return Var;
    }

    public void setVar(JFrame_MantenimientoDeClientes Var) {
        this.Var = Var;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }
    
    
    
    
    
}
