public class AmbulatoryImpl implements Ambulatory {
  private int legs;
  public AmbulatoryImpl(int legs) {
    this.legs = legs;
  }

  @Override
  public void walk() {
    System.out.println("this animal walks on " + legs + " legs");
  }

}
