class SwitchDate {
  public int month = 10;
  public void calculateNumDays() {
    switch (month) {
      case 1:
      case 3:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.println("31 days");
        break;
      default:
        System.out.println("invalid months");
        break;
    }
    System.out.println(123_123);
  }
}

public class SwitchDateDriveTest {
  public static void main(String[] args) {
    SwitchDate newDate = new SwitchDate();
    newDate.calculateNumDays();
  }
}
