/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librería;
import FormulariosSwing.JFrame_MantenimientoDeCategorías;
import Librería.GestionCategoría;
/**
 *
 * @author Home
 */
public class PlantillaCategoría 
{
    
    JFrame_MantenimientoDeCategorías Var = new JFrame_MantenimientoDeCategorías();
    private String Nombre;
    private String Código;
    private String Descripción;
    

    public PlantillaCategoría(String Nombre, String Código, String Descripción) {
        this.Nombre = Nombre;Var.getTxtNombre().getText();  //Var.getTxtNombre().getText();
        this.Código = Código;Var.getTxtCódigo().getText(); //Var.getTxtCódigo().getText();
        this.Descripción = Descripción;Var.getTxtDescripción().getText(); //Var.getTxtDescripción().getText();
    }
     //getter and setter

    PlantillaCategoría() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCódigo() {
        return Código;
    }

    public void setCódigo(String Código) {
        this.Código = Código;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String Descripción) {
        this.Descripción = Descripción;
    }
    
    
    
}
