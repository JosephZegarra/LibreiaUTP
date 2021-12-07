/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librería;

import Librería.GestionCategoría;
/**
 *
 * @author Home
 */
public class PlantillaCategoría 
{   private String Nombre;
    private String Código;
    private String Descripción;
    

    public PlantillaCategoría(String Nombre, String Código, String Descripción) {
        this.Nombre = Nombre;
        this.Código = Código;
        this.Descripción = Descripción;
    }
     //getter and setter

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
     * @return the Código
     */
    public String getCódigo() {
        return Código;
    }

    /**
     * @param Código the Código to set
     */
    public void setCódigo(String Código) {
        this.Código = Código;
    }

    /**
     * @return the Descripción
     */
    public String getDescripción() {
        return Descripción;
    }

    /**
     * @param Descripción the Descripción to set
     */
    public void setDescripción(String Descripción) {
        this.Descripción = Descripción;
    }

}
