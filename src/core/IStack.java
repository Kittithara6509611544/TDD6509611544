package core;

public interface IStack {
	boolean isEmpty();
	int getSize();
	boolean isFull();
	int getTop();
	void push(int elm) throws Exception;
	int pop();

}
