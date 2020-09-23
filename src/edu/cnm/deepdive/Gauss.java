package edu.cnm.deepdive;

public class Gauss {

  private static final int DEFAULT_UPPER_LIMIT = 100;

  public static void main(String[] args) {
    int upperLimit = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_UPPER_LIMIT;
    int sum = 0;
    for (int i = 1; i <= upperLimit; i++) {
      sum += i;
    }
    System.out.println(sum);
  }
}