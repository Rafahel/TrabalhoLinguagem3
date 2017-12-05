/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Rafa
 */
public class Componente implements FileFormater {
    private String nome;
    private String tipo;
    private String modelo;
    private String descricao;
    private static int totalComponentes;

    public Componente(String nome, String tipo, String modelo, String descricao) {
        this.nome = nome;
        this.tipo = tipo;
        this.modelo = modelo;
        this.descricao = descricao;
        addTotalComp();
    }

    private static void addTotalComp(){
        totalComponentes++;
    }

    public static int getTotalComponentes() {
        return totalComponentes;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toFileFormat() {
        return nome + " " + tipo + " " + modelo + " " + descricao ;
    }
    
}
