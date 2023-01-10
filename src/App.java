import entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("==========================================");

    List<Product> list = new ArrayList<>();
    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    //desse jeito aki e bom que podemos colocar um valor parametrizado
    double min = 100.0;
    //esse valor da vareavel min poderia einclusivel digitado pelo o usuario

    Predicate<Product> pred = p -> p.getPrice() >= min;

    list.removeIf(pred);

    for (Product p : list) {
      System.out.println(p);
    }

    System.out.println("==========================================");
  }
}
