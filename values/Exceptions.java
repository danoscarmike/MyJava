class Exceptions {
  public static void main(String[] args) {
    try {
      int num = Integer.parseInt(args[0]);
      System.out.println("The first argument entered was: " + num);
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Please enter at least one integer argument.");
    }
    catch(NumberFormatException e){
      System.out.println("Arguments must be integers.");
    }
    finally{
      System.out.println("Program ended.");
    }
  }
}
