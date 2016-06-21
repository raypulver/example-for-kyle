class App {
  // make it executable
  public static void main(String[] args) {
    Dog myDog = new Dog("ralph");
    Dog otherDog = new Dog("mozart", 1);
    myDog.printAge().growUp().printAge().growUp(3).printAge().barkAt(otherDog.printAge());
  }
}
