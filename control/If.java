class If {
  public static void main(String[] args) {
    if (5 > 1) System.out.println("Hell, yes! Five is greater than 1!");
    if (2 < 4) {
      System.out.println("Yep, 2 is indeed less than 4.");
      System.out.println("This will also print, naturally.");
    }
    int num = 11;
    if (((num > 5) && (num < 10)) || (num == 12)) {
      System.out.println("Number is 6-9 inclusive, or 12.");
    }
  }
}
