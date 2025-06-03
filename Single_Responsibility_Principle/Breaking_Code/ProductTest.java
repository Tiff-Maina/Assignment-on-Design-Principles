package Single_Responsibility_Principle.Breaking_Code;
public class ProductTest {
        public static void main(String[] args) {
            Product product1 = new Product("Pen", 1.50);
            Product product2 = new Product("Notebook", 3.75);

            System.out.println("Testing SRP-violating BadProduct class:");
            product1.displayPriceInfo();
            System.out.println("---");
            product2.displayPriceInfo();
        }
    }