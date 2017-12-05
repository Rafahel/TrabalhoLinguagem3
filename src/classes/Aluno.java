package classes;

public class Aluno extends Pessoa implements FileFormater {
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

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getIdade() {
        return this.idade;
    }

    @Override
    public char getSexo() {
        return this.sexo;
    }

    @Override
    public void setSexo(char sexo) {
        this.sexo = sexo;
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
    public String toFileFormat() {
        return this.getNome() + " " + this.getIdade() + " " + this.getSexo() +
                " " + this.getCurso() + " " + this.getMatricula() + " "
                + this.getSemestre() + " " + this.getEmail();
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
