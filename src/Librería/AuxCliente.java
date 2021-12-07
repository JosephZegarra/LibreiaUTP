/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Librería;

import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GRM
 */
public class AuxCliente {
     public static void listarCliente(DefaultTableModel dtm,int cantidad){
        GestionClientes pro=new GestionClientes();
        int numFilas = dtm.getRowCount();
        if(numFilas>0){
            for(int i=0;i<numFilas;i++){
                dtm.removeRow(0);
            }
        }
        for(int i=0;i<pro.tamaño();i++){
            Object[] obj =new Object[]{
                pro.obtener(i).getDNI(),pro.obtener(i).getNombre(),pro.obtener(i).getApellidos(),pro.obtener(i).getDirección()
                    ,pro.obtener(i).getDistrito(),pro.obtener(i).getCorreo(),pro.obtener(i).getCelular()
            };
            dtm.addRow(obj);
        }   
    }  
  public static void buscarCliente (KeyEvent tecla,String texto, DefaultTableModel dtm ){
     GestionClientes pro=new GestionClientes();
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
              pro.obtener(i).getDNI(),pro.obtener(i).getNombre(),pro.obtener(i).getApellidos(),pro.obtener(i).getDirección()
                    ,pro.obtener(i).getDistrito(),pro.obtener(i).getCorreo(),pro.obtener(i).getCelular()
          };
          dtm.addRow(obj);
      }
  }
  }
    
    
}
