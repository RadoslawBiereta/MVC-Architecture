import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;

public class ProductModelTest {
    ProductModel product = new ProductModel();
    @Test //testuje poprawność obliczania całkowitej ceny produktu na podstawie ceny i ilości
    public void testCalculateTotalPrice() {
        product.setPrice(5.50);
        product.setQuantity(4);

        Assertions.assertEquals(22, product.calculateTotalPrice());
    }

    @Test // testuje poprawność pobierania nazwy produktu
    public void testGetProductName() {
        product.setProductName("Chleb");

        Assertions.assertEquals("Chleb", product.getProductName());
    }

    @Test //testuje poprawność pobierania ceny produktu
    public void testGetPrice() {
        product.setPrice(5.50);

        Assertions.assertEquals(5.50, product.getPrice());
    }

    @Test //testuje poprawność pobierania ilości produktu
    public void testGetQuantity() {
        product.setQuantity(4);

        Assertions.assertEquals(4, product.getQuantity());
    }

}