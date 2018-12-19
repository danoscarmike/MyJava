class Label {
  public static void main(String[] args) {
    outerLoop: for (int i = 1; i < 4; i++) {
      for (int j = 1; j < 4; j++) {
        if (i==1 && j==1) {
          System.out.println("Continuing outerLoop:\ti="+i+"\tj="+j);
          continue outerLoop;
        }
        if (i==2 && j==3) {
          System.out.println("Breaking outerLoop:\ti="+i+"\tj="+j);
          break outerLoop;
        }
        System.out.println("Running:\t\ti="+i+"\tj="+j);
      }
    }
  }
}
