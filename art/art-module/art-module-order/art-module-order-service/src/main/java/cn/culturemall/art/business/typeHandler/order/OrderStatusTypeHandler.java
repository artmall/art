package cn.culturemall.art.business.typeHandler.order;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import cn.culturemall.art.business.enums.order.ORDER_STATUS;

public class OrderStatusTypeHandler extends BaseTypeHandler<ORDER_STATUS> {

	@Override
	public ORDER_STATUS getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return ORDER_STATUS.valueOf(rs.getInt(columnName));
	}

	@Override
	public ORDER_STATUS getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return ORDER_STATUS.valueOf(rs.getInt(columnIndex));
	}

	@Override
	public ORDER_STATUS getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return ORDER_STATUS.valueOf(cs.getInt(columnIndex));
	}

	@Override
	public void setNonNullParameter(PreparedStatement ps, int parameterIndex, ORDER_STATUS parameter, JdbcType jdbcType) throws SQLException {
		ps.setInt(parameterIndex, parameter.getCode());
	}
}
