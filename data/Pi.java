class Pi {
  public static void main(String[] args) {
    try {
      float radius = Float.parseFloat(args[0]);
      float shortPi = (float) Math.PI;
      float circ = 2 * shortPi * radius;
      float area = shortPi * (float) Math.pow(radius, 2);

      System.out.print("With Pi commuted from " + Math.PI);
      System.out.println(" to " + shortPi);
      System.out.println("Circle of radius " + radius);
      System.out.println("Has circumference of " + circ + " cm,");
      System.out.println("And area of " + area + " sq.cm.");
    }
    catch(Exception e) {
      System.out.println("Please pass a numeric argument.");
    }
  }
}
