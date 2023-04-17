public class Main {
    public static void main(String[] args) {
        ProductView theView = new ProductView();
        ProductModel theModel = new ProductModel();
        ProductController theController = new ProductController(theView, theModel);

        theView.setVisible(true);
    }
}
