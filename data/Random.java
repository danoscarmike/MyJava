class Random {
  public static void main(String[] args) {
    //Math.random() returns a double between 0 and 0.999...
    //Multiplying by 10 increases the range from 0 to 9.999...
    //Applying Math.ceil() creates an effective range of 1 to 10 inclusive (int)

    float random = (float) Math.random() * 10;
    System.out.println("Multiplied random float: " + random);
    int num = (int) Math.ceil(random);
    System.out.println("Random integer: " + num);

  }
}
