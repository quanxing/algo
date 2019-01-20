//package stack;
/**
 * 基于链表实现的栈。
 *
 * Author: Zheng
 */
public class StackBasedLinkedList {
  private Node top = null;

  public void push(Object value) {
    Node newNode = new Node(value, null);
    // 判断是否栈空
    if (top == null) {
      top = newNode;
    } else {
      newNode.next = top;
      top = newNode;
    }
  }

  /**
   * 我用-1表示栈中没有数据。
   */
  public boolean isEmpty() {
    if (top == null) return true;
    else return false;
  }

  /**
   * 我用-1表示栈中没有数据。
   */
  public Object pop() {
    if (top == null) return -1;
    Object value = top.data;
    top = top.next;
    return value;
  }

  /**
   * 我用-1表示栈中没有数据。
   */
  public Object peek() {
    if (top == null) return -1;
    Object value = top.data;
    return value;
  }

  public void printAll() {
    Node p = top;
    while (p != null) {
      System.out.print(p.data + " ");
      p = p.next;
    }
    System.out.println();
  }

  private static class Node {
    private Object data;
    private Node next;

    public Node(Object data, Node next) {
      this.data = data;
      this.next = next;
    }

    public Object getData() {
      return data;
    }
  }
  public static void main(String[]args){
      Node n = new Node("+",null);
      System.out.println(n.data);
  }

}
