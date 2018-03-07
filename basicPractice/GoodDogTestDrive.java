class GoodDog {
  private int size;  // if private, instance cannot access it with dot notation
  public int getSize() {
    return size;
  }
  public void setSize(int s) {
    size = s;
  }
  void bark() {
    if (size > 60) {
      System.out.println("Woof! Woof!");
    } else if (size > 14) {
      System.out.println("Ruff, Ruff");
    } else {
      System.out.println("Yip! Yip!");
    }
  }
}

class GoodDogTestDrive {
  public static void main(String[] args) {
    GoodDog one = new GoodDog();
    one.setSize(70);
    System.out.println(one.getSize());
  }
}
