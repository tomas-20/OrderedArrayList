public class Test {
  public static void main(String[] args) {
    int length = args.length;
    OrderedArrayList<String> bob = new OrderedArrayList<String>(length);
    for (int i = 0; i < length; i ++) {
      bob.add(args[i]);
    }
    System.out.println();
    for (int i = 0; i < length; i ++) {
      System.out.println(bob.get(i));
    }
  }
}
