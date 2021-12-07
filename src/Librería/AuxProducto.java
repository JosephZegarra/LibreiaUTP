/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Librería;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GRM
 */
public class AuxProducto {
  public static void listarProducto(DefaultTableModel dtm,int cantidad){
        Producto pro=new Producto();
        int numFilas = dtm.getRowCount();
        if(numFilas>0){
            for(int i=0;i<numFilas;i++){
                dtm.removeRow(0);
            }
        }
        for(int i=0;i<pro.tamaño();i++){
            Object[] obj =new Object[]{
                pro.obtener(i).getCodigo(),pro.obtener(i).getNombre(),pro.obtener(i).getCategoria(),
                pro.obtener(i).getPrecio(),pro.obtener(i).getMarca(),pro.obtener(i).getDescripcion()
            };
            dtm.addRow(obj);
        }   
    }  
}
