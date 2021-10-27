

import javax.swing.*;
import javax.swing.text.View;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DictionaryApp implements ActionListener {

    private Container container;
    private JPanel panel1, panel2, panel3, panel4;
    private JFrame frame;
    DictionaryManagement dictionaryManagement = new DictionaryManagement();
    Dictionary dictionary = new Dictionary();

    public void View() {
        frame = new JFrame("Dictionary");
        dictionaryManagement.insertFromFile(dictionary);
        int num = dictionary.listWord.size();
        container = frame.getContentPane();

        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(num, 1));
        for (int i = 0; i < dictionary.listWord.size(); i++) {
            JLabel jLabel = new JLabel(dictionary.listWord.get(i).getWord_target());
            panel1.add(jLabel);
        }

        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(num, 1));
        for (int i = 0; i < dictionary.listWord.size(); i++) {
            JLabel jLabel = new JLabel(dictionary.listWord.get(i).getWord_explain());
            panel2.add(jLabel);
        }

        JLabel jLabel = new JLabel("                    ");
        panel3 = new JPanel();
        panel3.setLayout(new GridLayout(num, 1));
        panel4 = new JPanel();
        panel4.setLayout(new GridLayout(num, 1));

        for (int i = 0 ; i < dictionary.listWord.size(); i++) {
            panel3.add(jLabel);
            panel4.add(jLabel);
        }


        container.add(panel1);
        container.add(panel3, "East");
        container.add(panel4, "East");
        container.add(panel2, "East");

        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
