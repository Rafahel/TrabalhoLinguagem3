package classes;


public class Placa extends Componente {
    
    private String processador;
    private int pinosDigitais;
    private int pinosAnalogicos;

    public Placa(String nome, String modelo, String descricao, String processador, int pinosDigitais, int pinosAnalogicos) {
        super(nome, null, modelo, descricao);
        this.processador = processador;
        this.pinosDigitais = pinosDigitais;
        this.pinosAnalogicos = pinosAnalogicos;
    }

    public String getProcessador() {
        return processador;
    }

    public int getPinosDigitais() {
        return pinosDigitais;
    }

    public int getPinosAnalogicos() {
        return pinosAnalogicos;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setPinosDigitais(int pinosDigitais) {
        this.pinosDigitais = pinosDigitais;
    }

    public void setPinosAnalogicos(int pinosAnalogicos) {
        this.pinosAnalogicos = pinosAnalogicos;
    }
    
    @Override
    public String toFileFormat() {
        return super.toFileFormat() + " " + this.processador + " " + this.pinosAnalogicos + " " + this.pinosDigitais;
    }
}
