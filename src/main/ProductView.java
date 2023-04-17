import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProductView extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField productNameTextField = new JTextField(20);
    private JTextField priceTextField = new JTextField(10);
    private JTextField quantityTextField = new JTextField(5);
    private JLabel totalPriceLabel = new JLabel("");
    private JButton calculateButton = new JButton("Oblicz wartość");

    public ProductView() {
        JPanel panel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 120);
        panel.add(new JLabel("Nazwa produktu:"));
        panel.add(productNameTextField);
        panel.add(new JLabel("Cena:"));
        panel.add(priceTextField);
        panel.add(new JLabel("Ilość:"));
        panel.add(quantityTextField);
        panel.add(calculateButton);
        panel.add(totalPriceLabel);
        this.add(panel);
    }

    public String getProductName() {
        return productNameTextField.getText();
    }

    public double getPrice() {
        return Double.parseDouble(priceTextField.getText());
    }

    public int getQuantity() {
        return Integer.parseInt(quantityTextField.getText());
    }

    public void setTotalPrice(double totalPrice) {
        totalPriceLabel.setText("Wartość całkowita: " + totalPrice + " zł");
    }

    public void addCalculateListener(ActionListener listener) {
        calculateButton.addActionListener(listener);
    }
}
