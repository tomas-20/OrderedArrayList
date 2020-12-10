import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super();
  }
  public NoNullArrayList(int n) {
    super(n);
  }
  private void check(T item) {
    if (item == null) {
      throw new IllegalArgumentException("you can't have a null in a NoNullArrayList");
    }
  }
  public boolean add(T item) {
    check(item);
    return super.add(item);
  }
  public void add(int n, T item) {
    check(item);
    super.add(n, item);
  }
  public T set(int n, T item) {
    check(item);
    return super.set(n, item);
  }
}
