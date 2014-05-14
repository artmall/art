package cn.culturemall.art.business.typeHandler.order;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import cn.culturemall.art.business.enums.order.TRADE_MODE;

public class TradeModeTypeHandler extends BaseTypeHandler<TRADE_MODE> {

	@Override
	public TRADE_MODE getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return TRADE_MODE.valueOf(rs.getInt(columnName));
	}

	@Override
	public TRADE_MODE getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return TRADE_MODE.valueOf(rs.getInt(columnIndex));
	}

	@Override
	public TRADE_MODE getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return TRADE_MODE.valueOf(cs.getInt(columnIndex));
	}

	@Override
	public void setNonNullParameter(PreparedStatement ps, int parameterIndex, TRADE_MODE parameter, JdbcType jdbcType) throws SQLException {
		ps.setInt(parameterIndex, parameter.getCode());
	}
}
