public class Fish extends Animal implements Pet {

  private Nameable nameable = new NameableImpl();

  public String getName() {
     System.out.println(nameable.getName());
     return nameable.getName();
  }

  public void setName(String name) {
    nameable.setName(name);
  }

  public Fish() {}

  @Override
  public void eat() {
      System.out.println("Fish eat pond scum.");
  }

  @Override
  public void play() {
      System.out.println("Just keep swimming.");
  }

}
