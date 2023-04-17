import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductController {
    private ProductView view;
    private ProductModel model;

    public ProductController(ProductView view, ProductModel model) {
        this.view = view;
        this.model = model;
        this.view.addCalculateListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String productName = view.getProductName();
            double price = view.getPrice();
            int quantity = view.getQuantity();
            model.setProductName(productName);
            model.setPrice(price);
            model.setQuantity(quantity);
            double totalPrice = model.calculateTotalPrice();
            view.setTotalPrice(totalPrice);
        }
    }
}
