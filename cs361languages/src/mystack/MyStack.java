/**
 * 
 */
package mystack;

/**
 * @author drupit 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		if(theStack == null){
			return null;}
		
		if(theStack.next == null){
			T value0 = theStack.val;
			theStack = null;
			return value0;}
		
		MyNode<T> temp = theStack;
		while(temp.next.next != null){
			temp = temp.next;}
		
		T value = temp.next.val;
		temp.next = null;
		return value;
		
	}

	public void push(T v) {
		// TODO To complete
		if(theStack == null){
			theStack = new MyNode<T>(v, null);
		}else{
			MyNode<T> temp = theStack;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = new MyNode<T>(v, null);}

	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		MyStack<Integer> list = new MyStack<Integer>();
		
		list.push(1);
		list.push(2);

		list.pop();
		list.push(5);
		
		MyStack<Person> list2 = new MyStack<Person>();
		Person p1 = new Person("Drupit", "sharma");
		list.push(p1);
		Person p2 = new Person("Christelle", "Scharff");
		list.push(p2);
	}


}
