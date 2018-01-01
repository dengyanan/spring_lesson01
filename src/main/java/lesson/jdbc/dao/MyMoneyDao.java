package lesson.jdbc.dao;

import java.sql.SQLException;

public interface MyMoneyDao {

	void updateAminus(int money) throws SQLException;

	void updateBadd(int money) throws SQLException;

}