import java.io.PrintWriter;

public class PrintfExample {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);
    double price = 24.99; int quantity = 2; String color = "Blue";
    System.out.printf("We have %03d %s Polo Shirts that cost $%3.2f.\n", quantity, color, price);
  }
}
