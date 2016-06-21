class Dog {
  private int age;
  private String name;
  public Dog(String name, int age) {
    this.age = age;
    this.name = name;
  }
  public Dog(String name) {
    // need "this" because "name" in class scope is overshadowed by the local name variable
    this.name = name;
    age = 0;
  }
  public Dog growUp() {
    return growUp(1);
  }
  public Dog growUp(int years) {
    if (years == 1) {
      System.out.println("1 year goes by");
    }
    else {
      System.out.println(String.format("%d years go by", years));
    }
    age += years;
    return this;
  }
  public Dog printAge() {
    System.out.println(String.format("%s is %d years old", name, age));
    return this;
  }

  // make it executable
  public static void main(String[] args) {
    Dog myDog = new Dog("ralph");
    myDog.printAge().growUp().printAge().growUp(3).printAge();
  }
}

