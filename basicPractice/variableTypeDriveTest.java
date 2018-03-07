class VariableType {
  int ageYears = 32;
  int price, quantityInStock = 3;

  void calculateAge() {

    int ageDays = ageYears * 365;
    long ageSeconds = ageYears * 365 * 24L * 60 * 60;

    System.out.println(ageDays);
    System.out.println(ageSeconds);
    System.out.println(price);
    System.out.println(quantityInStock);

  }
}

public class variableTypeDriveTest {
  public static void main(String[] args) {
    VariableType firstOne = new VariableType();
    firstOne.calculateAge();
  }
}
