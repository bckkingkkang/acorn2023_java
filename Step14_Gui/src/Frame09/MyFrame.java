package Frame09;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {

	// 필드
	JTextField tf_num1, tf_num2;
	JLabel la2;
	JLabel la3;
	
	// 생성자
	public MyFrame(String title) {
		super(title);
		setBounds(100, 100, 900, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		// JTextField 2개
		tf_num1 = new JTextField(10);
		tf_num2 = new JTextField(10);
		
		// JButton 4개
		JButton plusBtn = new JButton("+");
		JButton minusBtn = new JButton("-");
		JButton multiBtn = new JButton("*");
		JButton divideBtn = new JButton("%");
		
		// JLabel 2개
		JLabel la1 = new JLabel("=");
		la2 = new JLabel("0");
		la3 = new JLabel("예외 발생 시 표시");
		
		// UI를 프레임에 배치
		add(tf_num1);
		add(plusBtn);
		add(minusBtn);
		add(multiBtn);
		add(divideBtn);
		add(tf_num2);
		add(la1);
		add(la2);

		add(la3, BorderLayout.SOUTH);
		
		// 버튼에 ActionListener 등록
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		multiBtn.addActionListener(this);
		divideBtn.addActionListener(this);
		
		// 버튼에 action command 설정
		plusBtn.setActionCommand("plus");
		minusBtn.setActionCommand("minus");
		multiBtn.setActionCommand("multi");
		divideBtn.setActionCommand("divide");
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame("계산기");
	}

	// ActionListener 인터페이스를 구현했기 때문에 강제 오버라이드된 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			// 입력한 문자열 읽어오기
			String strNum1 = tf_num1.getText();
			String strNum2 = tf_num2.getText();
			
			// 입력한 문자열을 실수(double)로 변경하기
			double num1 = Double.parseDouble(strNum1);
			double num2 = Double.parseDouble(strNum2);
			
			// 눌린 버튼의 command 읽어오기
			String cmd = e.getActionCommand();
			
			double result = 0;
			
			if (cmd.equals("plus")) {
				result = num1 + num2;
			} else if (cmd.equals("minus")) {
				result = num1 - num2;
			} else if (cmd.equals("multi")) {
				result = num1 * num2;
			} else {
				result = num1 / num2;
				if (num2 == 0) {
					JOptionPane.showMessageDialog(this, "0으로 나눌 수 없습니다.");
				}
			}

			// 숫자를 (double) 문자열(String)로 바꾸기
			String resultText = Double.toString(result);
			
			// 결과값을 JLabel에 출력하기
			la2.setText(resultText);
			
		} catch (NumberFormatException nfe) {
			la3.setText("숫자 형식으로 입력해주세요");
		}
	}
}
