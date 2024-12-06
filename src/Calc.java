import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calc extends JFrame{

    private JTextField display;

    public Calc(){
        initUI();
    }

    private void initUI() {
        setTitle("Kalkulator");
        setSize(400, 300);
        setLocationRelativeTo(null); //wyświetla aplikację na środku ekranu
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(5, 4, 5, 5));

        String[] buttons = {
              "7", "8", "9", "/",
              "4", "5", "6", "*",
              "1", "2", "3", "-",
              "+/-", "0", ",", "+",
              "C", "="
        };

        for (String text : buttons) {
            JButton button = new JButton(text);

            if (text.equals("C")) {
                button.setBackground(Color.GRAY);
                button.setForeground(Color.WHITE);
            } else if (text.equals("=")) {
                button.setBackground(Color.BLUE);
                button.setForeground(Color.WHITE);
            } else {
                button.setBackground(Color.LIGHT_GRAY);
            }

            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }
        add(panel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand(); // Pobiera tekst przycisku

            if (command.equals("=")) {
                try {
                    // Zamień przecinek na kropkę dla wyrażeń
                    String expressionText = display.getText().replace(",", ".");
                    // Oblicz wyrażenie za pomocą exp4j
                    Expression expression = new ExpressionBuilder(expressionText).build();
                    double result = expression.evaluate();
                    display.setText(String.valueOf(result));
                } catch (Exception ex) {
                    ex.printStackTrace();
                    display.setText("Błąd");
                }
            } else if (command.equals("+/-")) {
                String currentText = display.getText();
                if (!currentText.isEmpty()) {
                    if (currentText.startsWith("-")) {
                        display.setText(currentText.substring(1)); // Usuwa znak "-"
                    } else {
                        display.setText("-" + currentText); // Dodaje znak "-"
                    }
                }
            } else if (command.equals("C")) {
                // Czyści ekran
                display.setText("");
            } else {
                // Dodaje kliknięty tekst do wyświetlacza
                display.setText(display.getText() + command);
            }
        }

    }
}
