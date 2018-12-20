class Lottery {
  public static void main(String[] args) {
    int[] allNumbers = new int[59];
    for (int h=0; h<59; h++) {
      allNumbers[h] = h+1;
    }
    
    for (int i=0; i<allNumbers.length; i++) {
      int number = (int) Math.floor(Math.random() * 59);
      int temp = allNumbers[i];
      allNumbers[i] = allNumbers[number];
      allNumbers[number] = temp;
    }

    int j = 0;
    while (j < 6) {
      System.out.print(allNumbers[j] + "\t");
      j++;
    }

    System.out.println("\n");
  }
}
