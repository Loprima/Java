package Fb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fb extends JFrame {
    private int milan = 0;
    private int madrid = 0;
    private String whowin = "DRAW";
    private String whoscored = "N/A";
    private JButton buttonmilan = new JButton("AC Milan");
    private JButton buttonmadrid = new JButton("Real Madrid");
    private JButton detect = new JButton("Detect winner");

    private JLabel result = new JLabel("Result: "+madrid+" x "+milan);
    private JLabel last = new JLabel("Last Scorer: "+whoscored);
    private JLabel winner = new JLabel("Winner: "+whowin);

    public Fb() {
        super("It's a match!");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));

        buttonmilan.addActionListener(new ButtonEventListener1());
        container.add(buttonmilan);
        buttonmadrid.addActionListener(new ButtonEventListener2());
        container.add(buttonmadrid);
        detect.addActionListener(new ButtonEventListener3());
        container.add(detect);

        container.add(result);
        container.add(last);
        container.add(winner);
    }

    class ButtonEventListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            madrid = madrid + 1;
            result.setText("Result: "+madrid+" x "+milan);
            whoscored = "Real Madrid";
            last.setText("Last Scorer: "+whoscored);
        }
    }

    class ButtonEventListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            milan = milan + 1;
            result.setText("Result: "+madrid+" x "+milan);
            whoscored = "AC Milan";
            last.setText("Last Scorer: "+whoscored);
        }
    }

    class ButtonEventListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (milan == madrid){
                whowin = "DRAW";
            } else if (milan > madrid){
                whowin = "AC Milan";
            } else if (madrid > milan) {
                whowin = "Real Madrid";
            }
            winner.setText("Winner: "+whowin);
        }
    }

    public static void main(String[] args) {
        Fb app = new Fb();
        app.setVisible(true);
    }

}
