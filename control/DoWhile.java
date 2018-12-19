class DoWhile {
  public static void main(String[] args) {
    int num = 10;
    do {
      System.out.println("Doing: " + num);
      num += 10;
    }
    while (num < 100);
  }
}
