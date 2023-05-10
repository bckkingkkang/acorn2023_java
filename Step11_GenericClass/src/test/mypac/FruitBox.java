package test.mypac;

// 가상의 과일 박스
public class FruitBox<T> {
	
	// 필드
	private T item;
	
	// 과일을 포장하는 메소드
	public void pack(T item) {
		this.item = item;
	}
	
	// 과일을 리턴하는 메소드
	public T unPack() {
		return item;
	}
}
