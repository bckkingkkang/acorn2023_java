package frame07;
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
		
		// 전송 버튼의 참조값을 필드에 저장 (this. 생략 가능)
		JButton sendBtn = new JButton("SEND");
		add(sendBtn);

		JButton deleteBtn = new JButton("DELETE");
		add(deleteBtn);

		JButton updateBtn = new JButton("UPDATE");
		add(updateBtn);
		
		// 전송, 삭제, 수정 버튼 모두 다 하나의 리스너 등록
		sendBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		
		// 각각의 버튼에 action 명령 설정
		sendBtn.setActionCommand("SEND");
		deleteBtn.setActionCommand("DELETE");
		updateBtn.setActionCommand("UPDATE");
		
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
		
		// 눌러진 버튼의 action command 읽어오기
		String cmd = e.getActionCommand();
		
		// 문자열의 내용 비교
		if (cmd.equals("SEND")) {
			JOptionPane.showMessageDialog(this, "SEND");
		} else if (cmd.equals("DELETE")) {
			JOptionPane.showMessageDialog(this, "DELETE");
		} else if (cmd.equals("UPDATE")) {
			JOptionPane.showMessageDialog(this, "UPDATE");
		}
	}
}
