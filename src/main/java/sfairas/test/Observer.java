package sfairas.test;

import java.util.List;

public interface Observer<T> {
  public void update(List<T> stack);
}
