
public class BadIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		
		for(int i = 0; i < array.length; i++)
			array[i] = 0;
		try{
		int result = array[12];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε����� �߸��Ǿ����ϴ�.");
		} finally {
			System.out.println("������ �߻��ϴ� �� �ϴ� ����Ǵ� ����");
		}
		System.out.println("�� ������ ������ �ɱ��?");
		}

}
