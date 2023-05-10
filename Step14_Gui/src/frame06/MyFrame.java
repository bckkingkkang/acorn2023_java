package frame06;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener {
	
	// 필드
	JButton sendBtn;
	JButton deleteBtn;
	JButton updateBtn;
	
	// 생성자
	public MyFrame(String title) {
		super(title);
		
		// setBounds(x, y, width, height) : 창의 위치와 크기 설정
		this.setBounds(100, 100, 500, 500);
		
		// 이 프레임(MyFrame)의 x 버튼 (close 버튼)을 눌렀을 때 프로세스도 같이 종료되도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		// 전송 버튼의 참조값을 필드에 저장 (this. 생략 가능)
		this.sendBtn = new JButton("SEND");
		add(sendBtn);

		this.deleteBtn = new JButton("DELETE");
		add(deleteBtn);

		this.updateBtn = new JButton("UPDATE");
		add(updateBtn);
		
		// 전송, 삭제, 수정 버튼 모두 다 하나의 리스너 등록
		sendBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		
		// 프레임을 화면 상에 실제 보이게 하기 ( false 하면 화면에 보이지 않음)
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		// MyFrame 객체 생성
		new MyFrame("나의 프레임");
		System.out.println("main 메소드가 종료됩니다.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 메소드의 매개변수로 전달되는 ActionEvent 객체에 이벤트에 대한 정보가 들어있다.
		// 이 객체를 활용하면 어떤 버튼이 눌렸는지 구분할 수 있음
		
		Object which = e.getSource();
		// 눌러진 Button의 참조값이 Object type으로 리턴된다.
		if (which == sendBtn) {
			JOptionPane.showConfirmDialog(this, "SEND");
		} else if (which == deleteBtn) {
			JOptionPane.showConfirmDialog(this, "DELETE");
		} else {
			JOptionPane.showConfirmDialog(this, "UPDATE");
		}
	}
}
