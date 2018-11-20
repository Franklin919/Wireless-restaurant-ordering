package com.franklin.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

//负责增删改查数据的类

public class OrderDao {

	// 新增订单
	public boolean insertOrder(Order order) {

//		1.连接数据库
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/wos?useUnicode=true&characterEncoding=utf8&useSSL=false", "root",
					"960919kai");

//			2.定义sql语句
			String sql = "insert into tab_order(orderTime,tableNo,payStatus) values(now(),?,0)";

//			3.获取执行sql语句的对象
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
//			绑定参数
			statement.setInt(1, order.getTableNo());

//			4.执行数据库操作
			int result = statement.executeUpdate();
			
//			5.获取结果
			if (result > 0) {
				// 获取当前新增订单的编号，并且保存到order对象中
				String sql2 = "select last_insert_id() id";
				statement = connection.prepareStatement(sql2);
				ResultSet rs = statement.executeQuery();
				if (rs.next()) {
					order.setId(rs.getInt("id"));
				}
				return true;
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
	
	//插入订单详情
	public boolean insertOrderDetail(OrderDetail orderDetail) {

//		1.连接数据库
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/wos?useUnicode=true&characterEncoding=utf8&useSSL=false", "root",
					"960919kai");

//			2.定义sql语句
			String sql = "insert into tab_orderDetail(orderId,foodName,foodPrice,foodCount) values(?,?,?,?)";

//			3.获取执行sql语句的对象
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
//			绑定参数
			statement.setInt(1, orderDetail.getOrderId());
			statement.setString(2, orderDetail.getFoodName());
			statement.setDouble(3, orderDetail.getFoodPrice());
			statement.setInt(4, orderDetail.getFoodCount());

//			4.执行数据库操作
			int result = statement.executeUpdate();

//			5.获取结果
			if (result > 0) {
				return true;
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}
