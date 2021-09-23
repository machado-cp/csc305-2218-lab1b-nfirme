package edu.calpoly.csc305.debugging;

public class DebuggerMain {
  /**
   * Creates a new thesaurus entry and a list of alternative words.
   */
  public static void main(String[] args) {
    Thesaurus thesaurus = new Thesaurus();

    thesaurus.addAlternatives("interesting",
         "absorbing", "consuming", "engaging", "fascinating");

    System.out.println(thesaurus.alternatives("interesting"));
  }
}
