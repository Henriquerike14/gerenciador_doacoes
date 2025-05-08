package gerenciador_doacoes.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import gerenciador_doacoes.domain.Doacao;
import gerenciador_doacoes.domain.Pessoa;

public class CadastroTxt implements CadastroInterface {

    private String nomeArquivo = "doacoes.txt"; // Nome do arquivo para as doações

    @Override
    public ArrayList<Doacao> lerArquivo() {
        ArrayList<Doacao> lista = new ArrayList<>();
        try {
            FileReader arquivo = new FileReader(nomeArquivo);
            BufferedReader entrada = new BufferedReader(arquivo);
            String linha;
            while((linha = entrada.readLine()) != null) {

                // String[] dados = linha.split(" - ");
                // if (dados.length != 2) {
                //     System.out.println("Erro ao ler arquivo: " + linha);
                //     continue;
                // }
                // linhas.add(new Doacao(dados[0], Integer.parseInt(dados[1])));
            }
            arquivo.close();
            entrada.close();
           
           
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo");
        }
       
        return lista;
    }
    
   
    @Override
    public void salvar(Doacao doacao) {
       
        try {
            FileWriter arquivo = new FileWriter(nomeArquivo, true);
            BufferedWriter saida = new BufferedWriter(arquivo);
            saida.write(doacao.toString());
            saida.newLine();
            saida.close();
            
        } catch (Exception e) {
            System.out.println("Erro ao salvar arquivo");
        }

    }

    @Override
    public void salvarLista(ArrayList<Doacao> lista) {
        try {
            FileWriter arquivo = new FileWriter(nomeArquivo);
            BufferedWriter saida = new BufferedWriter(arquivo);
            for (Doacao doacao : lista) {
                saida.write(doacao.toString());
                saida.newLine();
            }
            saida.close();
           
        } catch (Exception e) {
            System.out.println("Erro ao salvar a lista.");
        }
       

   
    }

    @Override
    public void editar(int index, Doacao doacao) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editar'");
    }

    @Override
    public void excluir(int indice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

   
}
    

