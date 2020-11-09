package sfairas.test;

public interface Stack<T> {

  /**
   * Is stack empty 
   * @return
   */
  boolean empty();
  
  /**
   * Look at and return (but don’t remove) the top of the stack 
   * @return
   */
  T peek();
  
  /**
   * Remove and return the entry at the top of the stack
   * @return
   */
  T pop();
  
  /**
   * pushes item onto the stack top
   * @param item
   */
  void push(T item);
  
}
