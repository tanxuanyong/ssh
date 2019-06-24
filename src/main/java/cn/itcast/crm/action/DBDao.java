package cn.itcast.crm.action;

import java.sql.SQLException;

public class DBDao {

	public void getConn(){
		try {
			DBUtil.getConn();
		} catch (SQLException e) {
			// TODO
			e.printStackTrace();
		}
	}
}
