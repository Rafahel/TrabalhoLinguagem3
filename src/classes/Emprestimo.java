/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author Rafa
 */
public class Emprestimo {
    Aluno aluno;
    ArrayList<Componente> componentes;
    ArrayList<Robo> robos;
    String data;
    boolean status;

    public Emprestimo(Aluno aluno, ArrayList<Componente> componentes, ArrayList<Robo> robos, String data, boolean status) {
        this.aluno = aluno;
        this.componentes = componentes;
        this.robos = robos;
        this.data = data;
        this.status = status;
    }
    
}
