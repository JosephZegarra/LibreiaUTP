/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librería;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Home
 */
public class AuxCategoría 
{
    
    public static void listarCategoría(DefaultTableModel dtm,int cantidad){
        GestionCategoría pro=new GestionCategoría();
        int numFilas = dtm.getRowCount();
        if(numFilas>0){
            for(int i=0;i<numFilas;i++){
                dtm.removeRow(0);
            }
        }
        for(int i=0;i<pro.tamaño();i++){
            Object[] obj =new Object[]{
                pro.obtener(i).getCódigo(),pro.obtener(i).getNombre(),pro.obtener(i).getDescripción()
            };
            dtm.addRow(obj);
        }   
    }  
  public static void buscarCategoría (KeyEvent tecla,String texto, DefaultTableModel dtm ){
     GestionCategoría pro=new GestionCategoría();
     char t=tecla.getKeyChar();
     String cadena=texto+""+t;
     if(t==KeyEvent.VK_BACK_SPACE){ //Este if sirve para quealborrarun caracter no genere error
         cadena=texto.substring(0,cadena.length()-1);
      }
     int numFilas = dtm.getRowCount();
     if(numFilas>0){
            for(int i=0;i<numFilas;i++){
                dtm.removeRow(0);
            }
        }
     for(int i =0 ;i<pro.tamaño();i++){
      if(pro.obtener(i).getNombre().contains(cadena)){
          Object[] obj = new Object[]{
              pro.obtener(i).getCódigo(),pro.obtener(i).getNombre(),pro.obtener(i).getDescripción()
          };
          dtm.addRow(obj);
      }
  }
  }
    
    
    
}
