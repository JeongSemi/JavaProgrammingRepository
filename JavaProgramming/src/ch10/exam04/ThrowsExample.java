package ch10.exam04;

public class ThrowsExample {

	public static void main(String[] args) {
		try{
			Class.forName("");
			System.in.read();
		}
		catch(Exception e){
			//����ó���ڵ�
		}
		
		try{
			divide(10,0);
		}
		catch(ArithmeticException e){
			System.out.println("0���� ������ �ȵ˴ϴ�. �ٽ� �Է��ϼ���.");
		}
	}
	
	static void divide(int x, int y) throws ArithmeticException{
		int result = x / y;
	}

}