/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.VeccUsuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author u10549640177
 */
public class UsuarioControle extends AbstractTableModel {

   private List lista;


   public void setLista(List lista){
       this.lista = lista;
   }
   public void setList(List lista){
this.lista=lista;
}
   
public VeccUsuario getbean(int linha){
return (VeccUsuario) lista.get(linha);
}
   
    @Override
    public int getRowCount() {
        return 4;
    }

    @Override
    public int getColumnCount() {
      return lista.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         VeccUsuario usuario = (VeccUsuario) lista.get(rowIndex);
      if (columnIndex == 0) {
             return usuario.getVeccIdusuario();
        }
        if (columnIndex == 1) {
             return usuario.getVeccNome();
        }
        if (columnIndex == 2) {
              return usuario.getVeccNome();
        }
        if (columnIndex == 3) {
              return usuario.getVeccCpf();
        
        }
       return null;
    }
    @Override
    public String getColumnName(int columnIndex){
        if (columnIndex == 0) {
             return "ID";
        }
        if (columnIndex == 1) {
             return "Nome";
        }
        if (columnIndex == 2) {
             return "Apelido";
        }
        if (columnIndex == 3) {
             return "CPF";
        }
       
    return null;
    }
}