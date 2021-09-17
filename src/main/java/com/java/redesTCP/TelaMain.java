package com.java.redesTCP;

// Importação de Conteineres e Componentes 
import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.JLabel; 
import javax.swing.JTextField; 
import javax.swing.JTextArea; 
import javax.swing.JButton; 
 
// Importação geral 
import java.awt.Dimension; 
import java.awt.Toolkit; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.SwingUtilities; 

/**
 * @author Junior Martins
 */
// View Cliente - mVc
public final class TelaMain 
{
    // Atributos de Instância (componentes de tela) 
    private JFrame janela; // Painel Superior - Conteiner 
    private JPanel painelGeral; 
    private JPanel painelNome;  
    private JPanel painelIdade; 
    private JPanel painelRetorno; 
    private JPanel painelBotao; 
    private JLabel lb_nome; 
    private JTextField tx_nome; 
    private JLabel lb_idade; 
    private JTextField tx_idade; 
    private JTextArea ta_retorno; 
    private JButton bt_enviar; 
 
    // Interface
    private ITelaControle iTelaControl; 
     
    // Construtor 
    public TelaMain() 
    { 
        construirTela(); 
        acionarEventos(); 
    }    

    public final void construirTela() 
    { 
        // Criar conteiner com título
        janela = new JFrame("Tela do Cliente"); 
         
        // Definir características para o conteiner 
        janela.setSize(650, 367); // Largura e Altura 
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Encerra fechar a janela 
 
        // Definir posicao da janela na tela do computador do cliente 
        Dimension monitor = Toolkit.getDefaultToolkit().getScreenSize();  
        janela.setLocation((monitor.width - janela.getSize().width) / 2,  (monitor.height - janela.getSize().height) / 2);  
                
        // Cria painéis leves para organizar componentes internamente 
        painelGeral = new JPanel(); 
        painelNome = new JPanel(); 
        painelIdade = new JPanel(); 
        painelRetorno = new JPanel(); 
        painelBotao = new JPanel();

        // Cria conteúdo para painéis 
        lb_nome = new JLabel("Nome: "); 
        tx_nome = new JTextField(50); 
        lb_idade = new JLabel("Idade: "); 
        tx_idade = new JTextField(50); 
        ta_retorno = new JTextArea("Área de feedback ao cliente!", 12, 55); 
        bt_enviar = new JButton("Enviar"); 
         
        // Definir características para painéis
        ta_retorno.setEditable(false); 
 
        // Agrupa componentes 
        painelNome.add(lb_nome); 
        painelNome.add(tx_nome); 
        painelGeral.add(painelNome); 
        painelIdade.add(lb_idade); 
        painelIdade.add(tx_idade); 
        painelGeral.add(painelIdade); 
        painelRetorno.add(ta_retorno); 
        painelGeral.add(painelRetorno); 
        painelBotao.add(bt_enviar); 
        painelGeral.add(painelBotao); 
        janela.add(painelGeral); 
 
        // Determina visibilidade 
        janela.setVisible(true); 
    } 

    // Definir ouvintes e tratadores de eventos 
    public final void acionarEventos() 
    { 
        // Adiciona registro de ouvinte de evento (interface ActionListener) 
        bt_enviar.addActionListener(new ActionListener() 
        { 
            // Método chamado quando botão é pressionado (tratador do eventos ActionEvent) 
            @Override 
            public void actionPerformed(ActionEvent ae) 
            { 
                // Define o envio de nome e idade para o respectivo controle 
                iTelaControl = (ITelaControle) new Controle(); 
                String mensagemDoServidor =  iTelaControl.acionarControle(tx_nome.getText(), tx_idade.getText()); 
 
                // Limpeza das áreas de texto 
                tx_nome.setText(""); 
                tx_idade.setText(""); 
                ta_retorno.setText(""); 
                 
                // Imprime a mensagem de retorno de feedback 
                ta_retorno.setText(mensagemDoServidor); 
            } 
        }); 
    }

    // Método Driver 
    public static void main(String[] args)  
    { 
        // Cria quadro na thread de despacho de evento 
        SwingUtilities.invokeLater(new Runnable()  
        { 
            @Override 
            public void run()  
            {new TelaMain();} 
        }); 
    }     
}