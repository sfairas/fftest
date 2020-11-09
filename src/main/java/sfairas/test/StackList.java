package sfairas.test;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class StackList<T> implements Stack<T> {

  private List<T> stack;
  
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

    return stack.remove(stack.size()-1);
  }

  @Override
  public void push(T item) {
    stack.add(item);
  }

}
