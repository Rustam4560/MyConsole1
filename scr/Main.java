import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static  void main(String[] args){

        System.out.println("Hello world!");

        JTextField smallField = new JTextField("300, 250, 25, 45, 20");
        JTextField numders = new JTextField("0, 1, 2, 3, 4, 5, 6, 7, 8, 9");

        numders.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                String[] parm = smallField.getText().replaceAll(" ","").split(",");
                int[] koords = new int [parm.length];
                if(parm.length != parm.length){
                    JOptionPane.showMessageDialog(null,
                            "Ошибка в количестве параметров");
                }
            };
        });

        JFrame f = new JFrame("Swing Paint Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contents = new JPanel (new FlowLayout(FlowLayout.LEFT));

        MyPanel myPanel = new MyPanel();
        myPanel.repaint();
        myPanel.setSymbols("1, 2, 3");
        f.add(myPanel);
        f.pack();
        f.setVisible(true);
    }
}