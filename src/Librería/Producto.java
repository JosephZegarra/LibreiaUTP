/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librería;
import Librería.MantenimientoProductos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
/**
 *
 * @author via1
 */
public class Producto {
   ArrayList<MantenimientoProductos>pro;
   
   public Producto(){
       pro=new ArrayList<>();
       cargar();
   }
   public void cargar(){ //
       try{
           File archivo = new File("Guardado.txt");
           if(archivo.exists()){ //Condicional de que el archivo Exista
               BufferedReader br =new BufferedReader(new FileReader(archivo));//Clase para leer archivo
               String linea = "";//Linea adopata el valor de cada linea de producto guarada  
               while((linea = br.readLine())!=null){
               StringTokenizer st=new StringTokenizer (linea,",");
               String codigo=st.nextToken();
               String nombre=st.nextToken();
               String precio=st.nextToken();
               String Categoria=st.nextToken();
               String Marca=st.nextToken();
               String Descripcion=st.nextToken();
               MantenimientoProductos x=new MantenimientoProductos (codigo,nombre,precio,Categoria,Marca,Descripcion);
               adiconar(x);
           } 
               
           }else{
               JOptionPane.showMessageDialog(null,"El ARCHIVO NO EXISTE" );
           }
       }catch(Exception e){
           
       }
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
                       ","+obtener(i).getCategoria()+","+obtener(i).getMarca()+
                       ","+obtener(i).getDescripcion()+"\r\n");
                    }
                     pw.close();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"SE PRODUJO UN ERROR" );
       }
   }
}
