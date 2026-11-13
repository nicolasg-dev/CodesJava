import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Agenda_telefonica {
    JFrame janela = new JFrame("AGENDA TELEFÔNICA"); //janela
    JLabel titulo = new JLabel("INSIRA OS DADOS"); //titulo
    JButton botaoProcurar = new JButton("Procurar"); //botão procurar
    JButton botaoApagar = new JButton("Apagar"); //botão apagar
    JButton botaoCadastrar = new JButton("Cadastrar"); //botão cadastrar
    JLabel nome = new JLabel("      Nome:"); //texto nome
    JLabel telefone = new JLabel("      Telefone:"); //texto telefone
    JLabel endereco = new JLabel("      Endereço:"); //texto endereco
    JTextField campoNome = new JTextField(0); //nome
    JTextField campoTelefone = new JTextField(0); //telefone
    JTextField campoEndereco = new JTextField(0); //endereco
    JPanel painel = new JPanel(); // adiciona componentes
    JPanel botoes = new JPanel(); // adiciona componentes
    JPanel textos = new JPanel(); // adiciona componentes

    ArrayList<Contato> cadastrados = new ArrayList<>();//Array de cadastrados

    public Agenda_telefonica() {
        janela.setSize(300,400);
        campoNome.setText("");
        campoTelefone.setText("");
        campoEndereco.setText("");
        botoes.add(botaoProcurar);
        botoes.add(botaoApagar);
        botoes.add(botaoCadastrar);
        textos.setLayout(new GridLayout(3, 2));
        textos.add(nome);
        textos.add(campoNome);
        textos.add(telefone);
        textos.add(campoTelefone);
        textos.add(endereco);
        textos.add(campoEndereco);
        
        
        painel.add(titulo);
        janela.getContentPane().add(painel, BorderLayout.NORTH);
        janela.getContentPane().add(botoes, BorderLayout.SOUTH);
        janela.getContentPane().add(textos, BorderLayout.CENTER);
        //Quando o usuário clicar no botao, limpa o campo de texto
        botaoCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Contato n = new Contato();
                n.setNome(campoNome.getText());
                n.setTelefone(campoTelefone.getText());
                n.setEndereco(campoEndereco.getText());
                cadastrados.add(n);

                for (int i = 0; i < cadastrados.size(); i++){
                    System.out.printf("%d° -> Nome: %s; Endereço: %s; Telefone: %s\n", i+1, 
                    cadastrados.get(i).nome, cadastrados.get(i).endereco,cadastrados.get(i).telefone);
                }
            }
        });
        janela.setVisible(true);
    }
}
