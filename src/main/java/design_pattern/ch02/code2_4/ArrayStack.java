package design_pattern.ch02.code2_4;

public class ArrayStack {
	public int top;
	public int[] itemArray;
	public int stackSize;
	public ArrayStack(int stackSize) {
		itemArray = new int[stackSize];
		top = -1;
		this.stackSize = stackSize;
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (top == this.stackSize-1);
	}
	
	public void push(int item){
		if(isFull()){
			System.out.println("����");
		}else{
			itemArray[++top] = item;
			System.out.println("�� �� : "+item);
		}
		
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("�����");
			return -1;
		}else{
			System.out.println("���� ��: "+itemArray[top]);
			return itemArray[--top];
		}
	}
	public int peak(){
		if(isEmpty()){
			System.out.println("�����");
			return -1;
		}else{
			return itemArray[top];
		}
	}
	
}
