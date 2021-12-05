/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librería;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.PrintWriter;
/**
 *
 * @author via1
 */
public class Producto {
   ArrayList<MantenimientoProductos>pro;
   
   public Producto(){
       pro=new ArrayList<>();
   }
   public MantenimientoProductos obtener(int pos){
       return pro.get(pos);
   } 
   public int tamaño(){
       return pro.size();
   }  
   public  void adiconar(MantenimientoProductos x){
       pro.add(x);
   } 
   public void grabar (){
       try {
           PrintWriter pw= new PrintWriter (new FileWriter ("Guardado.txt"));
         
           for(int i = 0; i < tamaño(); i++){
               pw.print(obtener(i).getCodigo()+","+obtener(i).getNombre()+","+obtener(i).getPrecio()+
                       ","+obtener(i).getCategoria()+","+obtener(i).getMarca()+","+obtener(i).getDescripcion());
                    }pw.close();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"SE PRODUJO UN ERROR" );
       }
   }
}
