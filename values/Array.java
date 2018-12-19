class Array {
  public static void main(String[] args) {
    String[] strArray = {"Much", "More", "Java"};
    int[] intArray = new int[3];

    intArray[0] = 100;
    intArray[1] = 200;
    strArray[1] = "Better";

    System.out.println("String array length is: " + strArray.length);
    System.out.println("Integer array length is: " + intArray.length);

    for (int i=0; i < strArray.length; i++) {
      if (i == strArray.length - 1) {
        System.out.println(strArray[i]);
      }
      else {
        System.out.print(strArray[i] + " ");
      }
    }

    System.out.println(intArray[0] + ", " + intArray[1] + ", " + intArray[2]);
  }
}
