import java.time.LocalDate;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercises {

    public static void main(String[] args) {
        Exercises exercises = new Exercises();
        System.out.println(exercises.ex1());
        System.out.println(exercises.ex2());
        System.out.println(exercises.ex3());
        System.out.println(exercises.ex4());
        System.out.println(exercises.ex5());
        System.out.println(exercises.ex6());
        System.out.println(exercises.ex7());
        System.out.println(exercises.ex8());
        System.out.println(exercises.ex9());
        System.out.println(exercises.ex10());
        System.out.println(exercises.ex11());
        System.out.println(exercises.ex12());
        System.out.println(exercises.ex13());
        System.out.println(exercises.ex14());
        System.out.println(exercises.ex15());
    }

    public List<Product> ex1() {
        // Obtain a list of products belonging to category “Books” with price > 100
        ProductRepository productRepository = new ProductRepository();
        return productRepository.getAll()
                .stream()
                .filter(getProductPrice -> getProductPrice.getPrice() > 100)
                .collect(Collectors.toList());

    }

    public List<Order> ex2() {
        // Obtain a list of orders with products belonging to category “Baby”
        OrderRepository orderRepository = new OrderRepository();
        return orderRepository.getAll()
                .stream()
                .filter(searchProducts -> searchProducts.getProducts()
                        .stream().anyMatch(searchCategory -> searchCategory.getCategory().equals("Baby")))
                .collect(Collectors.toList())
                ;
    }

    public List<Product> ex3() {
        // Obtain a list of products with category = “Toys” and then apply 10% discount
        double discount = 1.1;
        ProductRepository productRepository = new ProductRepository();
        return productRepository.getAll()
                .stream()
                .filter(searchProductsCategory -> searchProductsCategory.getCategory().equals("Toys"))
                /*
                .map(product -> {
                    product.setPrice(product.getPrice()/discount);
                    return product;
                })
                */
                .peek(product -> product.setPrice(product.getPrice() / discount))
                .collect(Collectors.toList())
                ;
    }

    public List<Product> ex4() {
        // Obtain a list of products ordered by customers of tier 2 between 01-Feb-2021 and 01-Apr-2021
        return null;
    }

    public Optional<Product> ex5() {
        // Obtain the cheapest product from the “Books” category
        return null;
    }

    public List<Order> ex6() {
        // Obtain the 3 most recently placed orders
        // HELPFUL TIP: the method limit() might be useful here ;)
        return null;
    }

    public List<Product> ex7() {
        // Obtain the list of orders which were ordered on 15-Mar-2021,
        // log each order to the console and then return their product list
        // HELPFUL TIP: the methods peek() and flatMap() might be useful here ;)
        return null;
    }

    public Double ex8() {
        // Calculate total sum of all orders placed in Feb 2021
        return null;
    }

    public Double ex9() {
        // Calculate average order payment placed on 14-Mar-2021
        return null;
    }

    public DoubleSummaryStatistics ex10() {
        // Obtain a collection of statistic figures (i.e. sum, average, max, min, count)
        // for all products of category “Books”
        // HELPFUL TIP: the methods mapToDouble() and summaryStatistics() might be useful here ;)
        return null;
    }

    public Map<Long, Integer> ex11() {
        // Obtain a map with order id as key and each order’s product count as value
        // HELPFUL TIP: the method Collectors.toMap() might be useful here
        return null;
    }

    public Map<Customer, List<Order>> ex12() {
        // Obtain a map with orders grouped by customer
        // HELPFUL TIP: the method Collectors.groupingBy() might be useful here ;)
        return null;
    }

    public Map<Order, Double> ex13() {
        // Obtain a map with order as key and the order's products total sum as value
        // HELPFUL TIP: the method Collectors.toMap() might be useful here ;)
        return null;
    }

    public Map<String, List<String>> ex14() {
        // Obtain a map with list of product names by category
        // HELPFUL TIP: the method Collectors.groupingBy() might be useful here ;)
        return null;

    }

    public Map<String, Optional<Product>> ex15() {
        // Obtain the most expensive product by category
        // HELPFUL TIP: the method Collectors.groupingBy() might be useful here ;)
        return null;
    }
}
