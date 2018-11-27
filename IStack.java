package stack;
public interface IStack {
	public boolean isEmpty();
	public boolean isFull();
	public void pop();
	public Object top();
	public void push(Object x);
	public int lenght();
}
