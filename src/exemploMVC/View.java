package exemploMVC;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class View extends JFrame{
  JTextField textNum1, textNum2;
  JLabel visor;
  JButton botao;

  public View(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

    textNum1 = new JTextField(8);
    add(textNum1);
    JLabel operador = new JLabel("+");
    add(operador);
    textNum2 = new JTextField(8);
    add(textNum2);

    visor = new JLabel(" ");
    add(visor);

    botao = new JButton("calcula");
    add(botao);

    pack();
    setVisible(true);
  }

  public String getNum1(){
    return textNum1.getText();
  }
  public String getNum2(){
    return textNum2.getText();
  }
  public void setBotaoBehavior(ActionListener botaoBehavior){
    botao.addActionListener(botaoBehavior);
  }

  public void setVisor(String result){
    visor.setText(result);
  }

}