package frame05;
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
	
	// 생성자
	public MyFrame(String title) {
		super(title);
		
		// setBounds(x, y, width, height) : 창의 위치와 크기 설정
		this.setBounds(100, 100, 500, 500);
		
		// 이 프레임(MyFrame)의 x 버튼 (close 버튼)을 눌렀을 때 프로세스도 같이 종료되도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JButton sendBtn = new JButton("SEND");
		add(sendBtn);
		
		Component a = this;
		
		//ActionListener 인터페이스 type의 참조값을 얻어내기
		ActionListener listener1 = new ActionListener() {
			// 이 리스너를 등록한 UI에 어떤 액션이 발생하면 호출되는 메소드
			@Override
			public void actionPerformed(ActionEvent e) {
				ActionListener b = this;
				
				System.out.println("SEND");
				// JOptionPane.showMessage(프레임의 참조값, 띄울 메세지);
				// 클래스명.this -> 바깥에 있는 클래스로 생성한 객체의 참조값을 가리킬 수 있다.
				JOptionPane.showMessageDialog(MyFrame.this, "SEND SEND");
			}
		};
		
		// 전송버튼에 등록
		sendBtn.addActionListener(listener1);
		
		JButton deleteBtn = new JButton("DELETE");
		add(deleteBtn);
		
		/*
		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("DELETE");
			}
		});
		*/
		
		// ActionListener 인터페이스 type의 참조값을 함수 형태로 전달 가능
		deleteBtn.addActionListener((e) -> {
			System.out.println("DELETE");
			// 함수 형태의 메소드에서 this는 바깥 클래스로 생성한 객체의 참조값을 가리킬 수 있다.
			JOptionPane.showMessageDialog(this, "DELETE DELETE");
		});
		
		JButton updateBtn = new JButton("UPDATE");
		add(updateBtn);
		
		updateBtn.addActionListener(this);
			
		// 프레임을 화면 상에 실제 보이게 하기 ( false 하면 화면에 보이지 않음)
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new MyFrame("나의 프레임");
		System.out.println("main 메소드가 종료됩니다.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "UPDATE UPDATE");
	}
}
