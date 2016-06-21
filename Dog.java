class Dog {
  private int age;
  private String name;
  public Dog(String name, int age) {
    this.age = age - yearsPassed;
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
  public static int yearsPassed = 0;
  public int getAge() { return yearsPassed + age; }
  public Dog growUp(int years) {
    if (years == 1) {
      System.out.println("1 year goes by");
    }
    else {
      System.out.println(String.format("%d years go by", years));
    }
    yearsPassed += years;
    return this;
  }
  public Dog printAge() {
    System.out.println(String.format("%s is %d years old", name, age + yearsPassed));
    return this;
  }
  public String getName () { return name; }
  public Dog barkAt(Dog d) {
    System.out.println(String.format("%s barks at %s", this.name, d.getName()));
    return this;
  }
  

}
