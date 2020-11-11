package sfairas.test;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import sfairas.test.Observer;

public class StackList<T> implements Stack<T> {

  private List<T> stack;
  private List<Observer> obs = new ArrayList<>();
  
  public void addObserver(Observer obs) {
      this.obs.add(obs);
  }
  
  public void removeObserver(Observer obs) {
      this.obs.remove(obs);
  }

  public StackList() {
    this.stack = new ArrayList<T>();
  }

  @Override
  public boolean empty() {    
    return stack.isEmpty();
  }

  @Override
  public T peek() {
    if(this.empty())
      throw new EmptyStackException();
    
    return stack.get(stack.size()-1);
  }

  @Override
  public T pop() {

    if(this.empty())
      throw new EmptyStackException();

    T t = stack.remove(stack.size()-1);
    for (Observer<T> o : this.obs) {
      o.update(this.stack);
    }

    return t;
  }

  @Override
  public void push(T item) {
    stack.add(item);
    for (Observer<T> o : this.obs) {
      o.update(this.stack);
    }
  }

}
