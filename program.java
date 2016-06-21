class Program {
  public static void main(String[] args) {
    System.out.println(generateHelloWorldString());
    for (int i = 0; i < args.length; ++i) {
      System.out.print(args[i] + " ");
    }
    System.out.println("");
  }
  public static String generateHelloWorldString() {
    return "hello world";
  }
}
