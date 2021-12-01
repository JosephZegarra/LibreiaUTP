/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librería;
import Librería.MantenimientoAutentificación;
import FormulariosSwing.JFrame_Autentificacion1;
/**
 *
 * @author Home
 */
public class MantenimientoAutentificación 
{
    //Atributos
    private  String admin, trabajador, contraseñaAdmin,contraseñaTrabajador;
    
    
    //Constructores

    public MantenimientoAutentificación() 
    {
        this.admin="dueño";
        this.contraseñaAdmin="dueño1234";
        this.trabajador="trabajador";
        this.contraseñaTrabajador="trabajador1234";
    }
    
 
    
    //getter and Setter
    public String getAdmin()
    {
        return admin;
    }

    public String getTrabajador() {
        return trabajador;
    }

    public String getContraseñaAdmin() {
        return contraseñaAdmin;
    }

    
    public String getContraseñaTrabajador() {    
        return contraseñaTrabajador;
    }

    //Constructor
    //Metodos
    
    

    
}
