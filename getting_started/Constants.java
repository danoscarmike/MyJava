/*
  Practice constant variables.
*/

class Constants {
  public static void main(String[] args) {
    // A touchdown is six points etc etc.
    final int TOUCHDOWN = 6;
    final int CONVERSION = 1;
    final int FIELDGOAL = 3;

    // Initialize subtotals and grand total.
    int td, pat, fg, total;

    // Calculate points scored.
    td = 4 * TOUCHDOWN;
    pat = 3 * CONVERSION;
    fg = 3 * FIELDGOAL;
    total = (td + pat + fg);

    // Output the total.
    System.out.println("Score: " + total);
  }
}
