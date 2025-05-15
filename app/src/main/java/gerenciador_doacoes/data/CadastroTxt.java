package gerenciador_doacoes.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import java.util.ArrayList;

import gerenciador_doacoes.domain.Doacao;
import gerenciador_doacoes.domain.Pessoa;
import gerenciador_doacoes.domain.doacao.Alimento;
import gerenciador_doacoes.domain.doacao.MaterialHigiene;
import gerenciador_doacoes.domain.doacao.MaterialLimpeza;

public class CadastroTxt implements CadastroInterface {

    private String nomeArquivo = "doados.txt"; // Nome do arquivo para as doações

    @Override
    public ArrayList<Doacao> lerArquivo() {
        ArrayList<Doacao> resultado = new ArrayList<>();
        try {
            FileReader arquivo = new FileReader(nomeArquivo);
            BufferedReader entrada = new BufferedReader(arquivo);
            String linha;
            while((linha = entrada.readLine()) != null) {
                
             
                String[] dados = linha.split("'");
              

           
                Pessoa pessoa = new Pessoa(dados[1], dados[3], dados[5]);
                
                
                
                if (dados[7].equals("Alimento")) {
                 resultado.add(new Doacao(pessoa,new Alimento(Integer.parseInt(dados[9]))));
                } else if (dados[7].equals("Material de Higiene")) {
                 resultado.add(new Doacao(pessoa,new MaterialHigiene(Integer.parseInt(dados[9]))));
                } else if (dados[7].equals("Material de Limpeza")) {
                 resultado.add(new Doacao(pessoa,new MaterialLimpeza(Integer.parseInt(dados[9]))));
                }
              
            }
            arquivo.close();
            entrada.close();
           
           
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo");
        }
    
        return resultado;
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
            System.out.println("Erro ao salvar a resultado.");
        }
       

   
    }

    @Override
    public void editar(int index, Doacao doacao) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editar'");
    }

    @Override
    public void excluir(int indice) {
        ArrayList<Doacao> lista = lerArquivo();
        lista.remove(indice);
        salvarLista(lista);
    }

   
}
    

