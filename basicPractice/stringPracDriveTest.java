class StringPrac {
  StringBuilder name = new StringBuilder(8);

  void displayPersonInfo() {
    name.append("Fernando");
    name.append(" ");
    name.append("Gonzalex");

    System.out.println("Name: " + name.toString());
    System.out.println("Name Object capacity: " + name.capacity());
  }

}

public class stringPracDriveTest {

  public static void main(String[] args) {
    StringPrac personOne = new StringPrac();
    personOne.displayPersonInfo();
  }
}
