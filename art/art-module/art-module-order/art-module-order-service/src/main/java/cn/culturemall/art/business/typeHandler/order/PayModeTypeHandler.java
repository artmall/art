package cn.culturemall.art.business.typeHandler.order;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import cn.culturemall.art.business.enums.order.PAY_MODE;

public class PayModeTypeHandler extends BaseTypeHandler<PAY_MODE> {

	@Override
	public PAY_MODE getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return PAY_MODE.valueOf(rs.getInt(columnName));
	}

	@Override
	public PAY_MODE getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return PAY_MODE.valueOf(rs.getInt(columnIndex));
	}

	@Override
	public PAY_MODE getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return PAY_MODE.valueOf(cs.getInt(columnIndex));
	}

	@Override
	public void setNonNullParameter(PreparedStatement ps, int parameterIndex, PAY_MODE parameter, JdbcType jdbcType) throws SQLException {
		ps.setInt(parameterIndex, parameter.getCode());
	}
}
