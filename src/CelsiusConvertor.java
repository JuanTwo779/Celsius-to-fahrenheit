import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConvertor extends JFrame{
    private JPanel mainPanel;
    private JTextField celsiusTextField;
    private JLabel celsiuLabel;
    private JButton convertButton;
    private JLabel farenheitLabel;

    public CelsiusConvertor(String title){
        super(title); //super() calls on super class constructor

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //grab text from celsius text field
                //convert to double
                //update farenheit label
                int tempFar = (int)((Double.parseDouble(celsiusTextField.getText()))
                        * 1.8 + 32);
                farenheitLabel.setText(tempFar + " Fahrenheit");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new CelsiusConvertor("Juan's celsius convertor");
        frame.setVisible(true);

    }
}
