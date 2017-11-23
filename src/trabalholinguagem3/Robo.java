/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholinguagem3;

import java.util.ArrayList;

/**
 *
 * @author Rafa
 */
public class Robo {
    private String nome;
    private String modelo;
    private String fabricante;
    private String descricao;
    private ArrayList<Componente> componentes;
    private ArrayList<Placa> placas;

    public Robo(String nome, String modelo, String fabricante, String descricao, ArrayList<Componente> componentes) {
        this.nome = nome;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.descricao = descricao;
        this.componentes = componentes;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   
    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public ArrayList<Placa> getPlacas() {
        return placas;
    }

    public void setPlacas(ArrayList<Placa> placas) {
        this.placas = placas;
    }
        
}
