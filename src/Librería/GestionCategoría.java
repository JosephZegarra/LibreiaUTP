/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librería;
import FormulariosSwing.JFrame_MantenimientoDeCategorías;
import Librería.PlantillaCategoría;
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
public class GestionCategoría 
{
    ArrayList<PlantillaCategoría>pro;
   
    
    
    public GestionCategoría() 
    {
    pro=new ArrayList<>();
    
    
    }
    
    private void cargar()
    {   
        try 
        {
            File archivo=new File ("GuardadoClientes.txt");
            if (archivo.exists()){
                BufferedReader br=new BufferedReader (new FileReader (archivo));
                String linea="";
                while ( (linea=br.readLine () )!=null)
                {
                    StringTokenizer st=new StringTokenizer (linea,",");
                    String Nombre=st.nextToken() ;
                    String Código=st.nextToken(); 
                    String Descripción=st.nextToken();
                    
                    PlantillaCategoría x =new PlantillaCategoría(Nombre, Código, Descripción);
                    adicionar(x);
                  }
            }else{
               JOptionPane.showMessageDialog (null,"el archivo no existe");
            }
        } catch (Exception e) {
        }
        
    }
    
   
    public PlantillaCategoría obtener(int pos)
    {
    return pro.get (pos);
    }
    public int tamaño() 
    {
    return pro.size ();
    }
    public void adicionar(PlantillaCategoría x) 
    {
    pro.add(x); 
    }
    
    
    
    
    
    
    public void grabar()
    {
        cargar();
   try {
       PrintWriter pw=new PrintWriter(new FileWriter ("GuardadoClientes.txt"));
           for (int i=0;i<tamaño ();i++) 
           {
              pw.print (obtener (i).getNombre () +","+obtener (i).getCódigo ()+", "+obtener (i).getDescripción ()
              +"\r\n");
               
           }
           pw.close ();
   }catch (Exception e){
       JOptionPane.showMessageDialog(null, "Se producjo un error al grabar la Categoría");
       
               }
    }
    
    
}
