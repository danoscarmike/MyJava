class Lottery {
  public static void main(String[] args) {
    int[] drawn = new int[6];
    for (int i=0; i<drawn.length; i++) {
      number = (int) Math.ceil(Math.random() * 59);
    }
    for (int j=0; j<drawn.length; j++) {
      System.out.print(drawn[j] + "\t");
    }
    System.out.println("\n");
  }
}
