package classes;

public abstract class Pessoa{
    protected String nome;
    protected int idade;
    protected char sexo;

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    
    
    public abstract String getNome();

    public abstract void setNome(String nome);

    public abstract int getIdade();

    public abstract void setIdade(int idade);

    public abstract char getSexo();

    public abstract void setSexo(char sexo);
    
}

