package test.mypac;

public class MacBook {
	// 외부에서 접근 불가하도록 접근 지정자를 private로 해서 필드 3개 선언하기
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	// 생성자
	public MacBook(Cpu cpu, Memory memory, HardDisk hardDisk) {
		// 생성자의 매개변수에 전달된 값을 필드에 저장하기
		this.cpu = cpu;
		this.memory = memory;
		this.hardDisk = hardDisk;
	}
	
	public void doGame() {
		if (this.cpu == null || memory == null || hardDisk == null) {
			System.out.println("부품 부족 : 게임 진행 불가");
			return;
		} 
		System.out.println("게임을 하다");
	}
}
