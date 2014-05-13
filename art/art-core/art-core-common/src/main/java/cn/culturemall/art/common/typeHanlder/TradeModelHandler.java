package cn.culturemall.art.common.typeHanlder;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import cn.culturemall.art.common.enums.TRADE_MODEL;

public class TradeModelHandler  extends BaseTypeHandler<TRADE_MODEL>  {

	@Override
	public TRADE_MODEL getNullableResult(ResultSet rs, String columnName)
			throws SQLException {
		return TRADE_MODEL.valueOf(rs.getInt(columnName));
	}

	@Override
	public TRADE_MODEL getNullableResult(ResultSet rs, int columnIndex)
			throws SQLException {
		return TRADE_MODEL.valueOf(rs.getInt(columnIndex));
	}

	@Override
	public TRADE_MODEL getNullableResult(CallableStatement cs, int columnIndex)
			throws SQLException {
		return TRADE_MODEL.valueOf(cs.getInt(columnIndex));
	}

	@Override
	public void setNonNullParameter(PreparedStatement ps, int parameterIndex,
			TRADE_MODEL parameter, JdbcType jdbcType) throws SQLException {
		ps.setInt(parameterIndex, parameter.getCode());
	}

}
