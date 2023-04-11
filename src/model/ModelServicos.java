/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kai_n
 */

public class ModelServicos extends AbstractTableModel{

    ArrayList <Servico> servicos = new ArrayList();
    
    String[]colunas = {"Área","ValorM","Descrição","ValorTotal"};
    @Override
    public int getRowCount() {
        return servicos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex ==0){
            return servicos.get(rowIndex).getArea();
        }
        else if(columnIndex ==1){
            return servicos.get(rowIndex).getValorquadrado();
        }
        else if(columnIndex ==2){
            return servicos.get(rowIndex).getDescricao();
        }
        else{
            return servicos.get(rowIndex).getValortotal();
        }
    }
    
    public String getColumName(int column){
        return colunas[column];
    }
}
