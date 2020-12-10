public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int n) {
    super(n);
  }
  public boolean add(T item) {
    for (int i = 0; i < size(); i ++) {
      if (item.compareTo(get(i)) <= 0) {
        super.add(i, item);
        return true;
      }
    }
    super.add(item);
    return true;
  }
  public void add(int n, T item) {
    add(item);
  }
  public T set(int n, T item) {
    T output = remove(n);
    add(item);
    return output;
  }
}
