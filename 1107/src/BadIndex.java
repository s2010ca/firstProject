
public class BadIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		
		for(int i = 0; i < array.length; i++)
			array[i] = 0;
		try{
		int result = array[12];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 잘못되었습니다.");
		} finally {
			System.out.println("오류가 발생하던 안 하던 실행되는 영역");
		}
		System.out.println("이 문장이 실행이 될까요?");
		}

}
