package sfairas.test;

import java.util.ArrayList;
import java.util.List;


public class StackListObserver<T> implements Observer<T>{

  private List<T> sl = new ArrayList<T>();

  @Override
  public void update(List<T> stack) {    
    sl.addAll(stack);
  }

  public List<T> getSl() {
    return sl;
  }

  public void setSl(List<T> sl) {
    this.sl = sl;
  }

}
