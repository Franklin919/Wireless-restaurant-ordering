package com.franklin.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame {

	private JFrame frame;
	private JPanel contentPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("无线点餐管理系统");
		frame.setBounds(100, 100, 875, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("登录管理");
		menuBar.add(menu);
		
		JMenu menu_1 = new JMenu("台面管理");
		menuBar.add(menu_1);
		
		JMenuItem menuItem = new JMenuItem("订单管理");
		menu_1.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("桌位管理");
		menu_1.add(menuItem_1);
		
		JMenu menu_2 = new JMenu("客户管理");
		menuBar.add(menu_2);
		
		JMenu menu_3 = new JMenu("系统管理");
		menuBar.add(menu_3);
		frame.getContentPane().setLayout(null);
		
		JPanel Menupanel = new JPanel();
		Menupanel.setBounds(0, 0, 875, 40);
		frame.getContentPane().add(Menupanel);
		Menupanel.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(6, 10, 168, 24);
		Menupanel.add(toolBar);
		
		JButton button = new JButton("生成订单");
		button.addActionListener(new ActionListener() {
			//打开生成订单的页面
			public void actionPerformed(ActionEvent e) {
				AddOrderPanel addOrderPanel = new AddOrderPanel();
				addOrderPanel.setBounds(0,0,859,392);
				addOrderPanel.setVisible(true);
				
				//清空原来contentPanel面板中的内容
				contentPanel.removeAll();
				contentPanel.repaint();
				
				//在原来的contentPanel面板位置添加生成订单的界面
				contentPanel.add(addOrderPanel);
				
			}
		});
		button.setIcon(new ImageIcon("/Users/franklin919/Documents/workspace-sts-3.9.6.RELEASE/Franklin/resourses/image/menuImage/add.png"));
		toolBar.add(button);
		
		JButton button_1 = new JButton("查看订单");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "范凯霖太懒了，还没开发出这个功能呢！", "你碰到了一个问题啊小兄弟！", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		button_1.setIcon(new ImageIcon("/Users/franklin919/Documents/workspace-sts-3.9.6.RELEASE/Franklin/resourses/image/menuImage/query.png"));
		toolBar.add(button_1);
		
		contentPanel = new JPanel();
		contentPanel.setBounds(0, 41, 875, 400);
		frame.getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/Users/franklin919/Documents/workspace-sts-3.9.6.RELEASE/Franklin/resourses/image/menuImage/mainbg.jpg"));
		label.setBounds(6, 6, 869, 383);
		contentPanel.add(label);
	}

}
