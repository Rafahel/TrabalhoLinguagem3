/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholinguagem3;

/**
 *
 * @author Rafa
 */
public class Aluno extends Pessoa {
    private String matricula;
    private int semestre;
    private String curso;

    public Aluno(String nome, int idade, char sexo, String matricula, int semestre, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.semestre = semestre;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
