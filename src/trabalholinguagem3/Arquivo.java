/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholinguagem3;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafa
 */
public class Arquivo {

    ArrayList<Aluno> alunos;
    ArrayList<Componente> componentes;

    public Arquivo(ArrayList<Aluno> alunos, ArrayList<Componente> componentes) {
        this.alunos = alunos;
        this.componentes = componentes;
    }

    Arquivo(Object object, ArrayList<Componente> componentes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void escreveAlunos() throws IOException {
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("Alunos.txt"), "utf-8"));
            for (Aluno aluno : alunos) {
                writer.write(aluno.toString());
                writer.newLine();
            }
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void escreveComponentes() throws IOException {
        Writer writer;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("Componentes.txt"), "utf-8"));
            for (Componente componente : componentes) {
                writer.write(componente.toString() + "\n");
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void loadAlunos(){
        
    }
    
    public void loadComponentes(){
    
    }

}
