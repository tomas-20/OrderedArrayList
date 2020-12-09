import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super();
  }
  public NoNullArrayList(int n) {
    super(n);
  }
  public boolean add(T item) {
    if (item == null) {
      throw new IllegalArgumentException("you can't have a null in a NoNullArrayList");
    }
    return super.add(item);
  }
}
