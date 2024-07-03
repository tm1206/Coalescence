package com.vitproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	ImageIcon ICON = new ImageIcon(MainFrame.class.getResource("icon.jpg"));

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("𝕮𝖔𝖆𝖑𝖊𝖘𝖈𝖊𝖓𝖈𝖊");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 10, 700, 770);
		 
		setIconImage(ICON.getImage()); 
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblJavaApplicationWorld = new JLabel("Welcome to 𝕮𝖔𝖆𝖑𝖊𝖘𝖈𝖊𝖓𝖈𝖊");
		lblJavaApplicationWorld.setFont(new Font("Baskerville", Font.LAYOUT_LEFT_TO_RIGHT, 31));
		lblJavaApplicationWorld.setForeground(new Color(155, 51, 51));

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Notepad.main(new String[]{});
			}
		});
		btnNewButton.setIcon(new ImageIcon(MainFrame.class.getResource("/com/vitproject/notepad.png")));
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyCalculator.main(new String[]{});
			}
		});
		button.setIcon(new ImageIcon(MainFrame.class.getResource("/com/vitproject/calculator.png")));
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IPFinder.main(new String[]{});
			}
		});
		button_1.setIcon(new ImageIcon(MainFrame.class.getResource("/com/vitproject/ip.png")));
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TTT1.main(new String[]{});
			}
		});
		button_2.setIcon(new ImageIcon(MainFrame.class.getResource("/com/vitproject/tictactoe.jpg")));
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				picpuzzle2.main(new String[]{});
			}
		});
		button_3.setIcon(new ImageIcon(MainFrame.class.getResource("/com/vitproject/picturepuzzle.jpg")));
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CharCount.main(new String[]{});
			}
		});
		button_4.setIcon(new ImageIcon(MainFrame.class.getResource("/com/vitproject/wct.png")));
		
		JButton button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Puzzle.main(new String[]{});
			}
		});
		button_5.setIcon(new ImageIcon(MainFrame.class.getResource("/com/vitproject/Puzzle Game.jpg")));
		
		JButton button_6 = new JButton("");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OnlineTest.main(new String[]{});
			}
		});
		button_6.setIcon(new ImageIcon(MainFrame.class.getResource("/com/vitproject/Exam System.jpg")));
		
		JButton button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SourceGetter.main(new String[]{});
			}
		});
		button_7.setIcon(new ImageIcon(MainFrame.class.getResource("/com/vitproject/Source Code Generator.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(200)
							.addComponent(lblJavaApplicationWorld))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(12)
					.addComponent(lblJavaApplicationWorld)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
