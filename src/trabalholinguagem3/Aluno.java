package trabalholinguagem3;

public class Aluno extends Pessoa {
    private String matricula;
    private int semestre;
    private String curso;
    private String email;

    public Aluno(String nome, int idade, char sexo, String matricula, int semestre, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.semestre = semestre;
        this.curso = curso;
        this.email = this.getNome() + "@aluno.uri.com";
        
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

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return this.getNome() + " " + this.getIdade() + " " + this.getSexo() +
                " " + this.getCurso() + " " + this.getMatricula() + " "
                + this.getSemestre() + " " + this.getEmail();
    }

}
