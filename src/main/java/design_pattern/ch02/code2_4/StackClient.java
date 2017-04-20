package design_pattern.ch02.code2_4;

public class StackClient {
	public static void main(String[] args) {
		ArrayStack st = new ArrayStack(10);
		st.itemArray[++st.top] = 20;			//��ĳ �ٷ� �����ϸ� �ȴ�
		System.out.println(st.itemArray[st.top]);
		
	}
}
