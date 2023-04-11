/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author kai_n
 */
public class Servico {
    private String area;
    private double valorquadrado;
    private String descricao;
    private double valortotal;
    
    public Servico(String area, double valorquadrado, String descricao, double valortotal){
        this.area = area;
        this.descricao = descricao;
        this.valorquadrado = valorquadrado;
        this.valortotal = valortotal;
        
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorquadrado(double valorquadrado) {
        this.valorquadrado = valorquadrado;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }

    public String getArea() {
        return area;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorquadrado() {
        return valorquadrado;
    }

    public double getValortotal() {
        return valortotal;
    }
    
            
            
    
            
    
}
