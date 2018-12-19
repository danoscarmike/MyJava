class For {
  public static void main(String[] args) {
    int num = 0;
    for (int i=1; i<4; i++) {
      System.out.println("Outer loop: i=" + i);
      for (int j=1; j<4; j++) {
        System.out.print("\tInner loop: j=" + j);
        System.out.println("\tTotal: num=" + (++num));
      }
    }
  }
}
