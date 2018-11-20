package com.franklin.view;

import javax.swing.JPanel;

import com.franklin.dao.OrderDao;
import com.franklin.dao.OrderService;

import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Label;
import java.awt.Color;
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class AddOrderPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public AddOrderPanel() {
		setLayout(null);

		Panel panel = new Panel();
		panel.setBounds(55, 10, 145, 123);
		add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(
				"/Users/franklin919/Documents/workspace-sts-3.9.6.RELEASE/Franklin/resourses/image/2.jpg"));
		lblNewLabel.setBounds(6, 6, 130, 85);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("¥20");
		lblNewLabel_1.setBounds(107, 98, 29, 16);
		panel.add(lblNewLabel_1);

		JCheckBox checkBox = new JCheckBox("赛螃蟹");
		checkBox.setBounds(6, 94, 128, 23);
		panel.add(checkBox);

		Panel panel_1 = new Panel();
		panel_1.setLayout(null);
		panel_1.setBounds(209, 10, 145, 123);
		add(panel_1);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(
				"/Users/franklin919/Documents/workspace-sts-3.9.6.RELEASE/Franklin/resourses/image/1.jpg"));
		label.setBounds(6, 6, 130, 85);
		panel_1.add(label);

		JLabel label_1 = new JLabel("¥20");
		label_1.setBounds(107, 98, 29, 16);
		panel_1.add(label_1);

		JCheckBox checkBox_1 = new JCheckBox("死猪");
		checkBox_1.setBounds(6, 94, 128, 23);
		panel_1.add(checkBox_1);

		Panel panel_2 = new Panel();
		panel_2.setLayout(null);
		panel_2.setBounds(363, 10, 145, 123);
		add(panel_2);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(
				"/Users/franklin919/Documents/workspace-sts-3.9.6.RELEASE/Franklin/resourses/image/3.jpg"));
		label_2.setBounds(6, 6, 130, 85);
		panel_2.add(label_2);

		JLabel label_3 = new JLabel("¥20");
		label_3.setBounds(107, 98, 29, 16);
		panel_2.add(label_3);

		JCheckBox checkBox_2 = new JCheckBox("疯牛");
		checkBox_2.setBounds(6, 94, 128, 23);
		panel_2.add(checkBox_2);

		Panel panel_3 = new Panel();
		panel_3.setLayout(null);
		panel_3.setBounds(517, 10, 145, 123);
		add(panel_3);

		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(
				"/Users/franklin919/Documents/workspace-sts-3.9.6.RELEASE/Franklin/resourses/image/4.jpg"));
		label_4.setBounds(6, 6, 130, 85);
		panel_3.add(label_4);

		JLabel label_5 = new JLabel("¥20");
		label_5.setBounds(107, 98, 29, 16);
		panel_3.add(label_5);

		JCheckBox checkBox_3 = new JCheckBox("清蒸母猪蹄");
		checkBox_3.setBounds(6, 94, 128, 23);
		panel_3.add(checkBox_3);

		Panel panel_4 = new Panel();
		panel_4.setLayout(null);
		panel_4.setBounds(55, 179, 145, 123);
		add(panel_4);

		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(
				"/Users/franklin919/Documents/workspace-sts-3.9.6.RELEASE/Franklin/resourses/image/5.jpg"));
		label_6.setBounds(6, 6, 130, 85);
		panel_4.add(label_6);

		JLabel label_7 = new JLabel("¥20");
		label_7.setBounds(107, 98, 29, 16);
		panel_4.add(label_7);

		JCheckBox checkBox_4 = new JCheckBox("辐射鱼");
		checkBox_4.setBounds(6, 94, 128, 23);
		panel_4.add(checkBox_4);

		Panel panel_5 = new Panel();
		panel_5.setLayout(null);
		panel_5.setBounds(209, 179, 145, 123);
		add(panel_5);

		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(
				"/Users/franklin919/Documents/workspace-sts-3.9.6.RELEASE/Franklin/resourses/image/7.jpg"));
		label_8.setBounds(6, 6, 130, 85);
		panel_5.add(label_8);

		JLabel label_9 = new JLabel("¥20");
		label_9.setBounds(107, 98, 29, 16);
		panel_5.add(label_9);

		JCheckBox checkBox_5 = new JCheckBox("辣鸡");
		checkBox_5.setBounds(6, 94, 128, 23);
		panel_5.add(checkBox_5);

		Panel panel_6 = new Panel();
		panel_6.setLayout(null);
		panel_6.setBounds(363, 179, 145, 123);
		add(panel_6);

		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon(
				"/Users/franklin919/Documents/workspace-sts-3.9.6.RELEASE/Franklin/resourses/image/8.jpg"));
		label_10.setBounds(6, 6, 130, 85);
		panel_6.add(label_10);

		JLabel label_11 = new JLabel("¥20");
		label_11.setBounds(107, 98, 29, 16);
		panel_6.add(label_11);

		JCheckBox checkBox_6 = new JCheckBox("骚羊");
		checkBox_6.setBounds(6, 94, 128, 23);
		panel_6.add(checkBox_6);

		Panel panel_7 = new Panel();
		panel_7.setLayout(null);
		panel_7.setBounds(517, 179, 145, 123);
		add(panel_7);

		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon(
				"/Users/franklin919/Documents/workspace-sts-3.9.6.RELEASE/Franklin/resourses/image/10.jpg"));
		label_12.setBounds(6, 6, 130, 85);
		panel_7.add(label_12);

		JLabel label_13 = new JLabel("¥20");
		label_13.setBounds(107, 98, 29, 16);
		panel_7.add(label_13);

		JCheckBox checkBox_7 = new JCheckBox("酥炸小黄瓜");
		checkBox_7.setBounds(6, 94, 128, 23);
		panel_7.add(checkBox_7);

		Panel panel_8 = new Panel();
		panel_8.setLayout(null);
		panel_8.setBounds(671, 10, 145, 123);
		add(panel_8);

		JLabel label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon(
				"/Users/franklin919/Documents/workspace-sts-3.9.6.RELEASE/Franklin/resourses/image/6.jpg"));
		label_14.setBounds(6, 6, 130, 85);
		panel_8.add(label_14);

		JLabel label_15 = new JLabel("¥20");
		label_15.setBounds(107, 98, 29, 16);
		panel_8.add(label_15);

		JCheckBox checkBox_8 = new JCheckBox("红烧胖大海");
		checkBox_8.setBounds(6, 94, 128, 23);
		panel_8.add(checkBox_8);

		Panel panel_9 = new Panel();
		panel_9.setLayout(null);
		panel_9.setBounds(671, 179, 145, 123);
		add(panel_9);

		JLabel label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon(
				"/Users/franklin919/Documents/workspace-sts-3.9.6.RELEASE/Franklin/resourses/image/9.jpg"));
		label_16.setBounds(6, 6, 130, 85);
		panel_9.add(label_16);

		JLabel label_17 = new JLabel("¥20");
		label_17.setBounds(107, 98, 29, 16);
		panel_9.add(label_17);

		JCheckBox checkBox_9 = new JCheckBox("麻辣鱼鳞");
		checkBox_9.setBounds(6, 94, 128, 23);
		panel_9.add(checkBox_9);

		JButton button = new JButton("生成订单");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> foodNames = new ArrayList<String>();

				// 如果用户没有选中菜品，提示请选择
				Component[] components = AddOrderPanel.this.getComponents();
				for (Component component : components) {
					if (component instanceof Panel) {
						Panel panel = (Panel) component;
						JCheckBox foodCheckBox = (JCheckBox) panel.getComponent(2);
						JLabel foodPrice = (JLabel) panel.getComponent(1);
						if (foodCheckBox.isSelected()) {
							foodNames.add(foodCheckBox.getText());
						}
					}

				}

				// 判断用户是否选择菜品。
				if (foodNames.size() > 0) {
					String tableNo = JOptionPane.showInputDialog(null, "您已选择菜品【" + foodNames + "】请输入您的桌号：", "温馨提示",
							JOptionPane.INFORMATION_MESSAGE);
					if (tableNo == null || "".equals(tableNo)) {
						JOptionPane.showMessageDialog(null, "未选择桌号，生成订单失败", "温馨提示", JOptionPane.INFORMATION_MESSAGE);
					} else {
						OrderService service = new OrderService();
						boolean result = service.saveOrderInfo(foodNames, Integer.valueOf(tableNo));
						if (result) {
							JOptionPane.showMessageDialog(null, "下单成功！", "恭喜你", JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null, "下单失败！请联系管理员:88888888", "抱歉",
									JOptionPane.INFORMATION_MESSAGE);
						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "请选择需要下单的菜品！", "温馨提示", JOptionPane.INFORMATION_MESSAGE);
				}

			}

		});
		button.setBounds(741, 354, 117, 29);
		add(button);

	}
}
