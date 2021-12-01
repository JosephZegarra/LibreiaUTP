/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librería;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author via1
 */
public class Producto {
   ArrayList<MantenimientodeProductos>pro;
   public Producto(){
       pro= new ArrayList<>();
       
   }
   public MantenimientodeProductos obtener (int pos){
    return pro.get(pos);
    }
   public int tamaño(){
       return.pro.size();
   } 
   public void adiconar(MantenimientodeProductos x){
       pro.add(x);
   }
   public void grabar(){
       PrinWrinter pw=new PrintWinter(new FileWriter("Producto.csc"));
       for (int i=0;i<tamaño();i++){
           pw.print(obtener(i).getCodigo()+","+obtener(i).getNombre()+","+obtener(i).getDescripcion()
                   +","+obtener(i).getPrecio()+","+obtener(i).getCategoria()
                   +","+obtener(i).getMarca()+"\r\n");
           }
       pw.close();
     } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"SE PRODUJO UN ERROR"); 
}
   
   
   
   
   
   
}
