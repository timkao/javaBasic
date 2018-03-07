public class Spider extends Animal {

  AmbulatoryImpl ambulatory = new AmbulatoryImpl(8);

  public Spider() {}

  @Override
  public void eat() {
    System.out.println("A spider eats a fly");
  }

  public void walk() {
    ambulatory.walk();
  }

}
