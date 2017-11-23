/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholinguagem3;

import trabalholinguagem3.Componente;

/**
 *
 * @author Rafa
 */
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
    
    
    
   
    
}
