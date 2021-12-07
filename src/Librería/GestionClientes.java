/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librería;
import FormulariosSwing.JFrame_MantenimientoDeClientes;
import Librería.PlantillaClientes;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
/**
 *
 * @author Home
 */
public class GestionClientes
{
     ArrayList<PlantillaClientes>pro;
   
    
    
    public GestionClientes() 
    {
    pro=new ArrayList<>();
    
    
    }
    //Metodo de relleno cargar();
    
    
   
    public PlantillaClientes obtener(int pos)
    {
    return pro.get (pos);
    }
    public int tamaño() 
    {
    return pro.size ();
    }
    public void adicionar(PlantillaClientes x) 
    {
    pro.add(x); 
    }
    
    
    
    
    
    
    public void grabar()
    {
        
   try {
       PrintWriter pw=new PrintWriter(new FileWriter ("Clientes.txt"));
           for (int i=0;i<tamaño ();i++) 
           {
              pw.print (obtener (i).getDNI()+","+obtener (i).getNombre()+", "+obtener (i).getApellidos()
                      +","+obtener (i).getDirección()+","+obtener (i).getDistrito()+","+obtener (i).getCorreo()
                      +","+obtener (i).getCelular()+"\r\n");
               
           }
           pw.close ();
   }catch (Exception e){
       JOptionPane.showMessageDialog(null, "Se producjo un error al grabar el Cliente");
       
               }
    }
    
    
    
    
    
}
