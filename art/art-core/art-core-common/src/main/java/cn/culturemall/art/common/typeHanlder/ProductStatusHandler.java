package cn.culturemall.art.common.typeHanlder;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import cn.culturemall.art.common.enums.PRODUCT_STATUS;

public class ProductStatusHandler extends BaseTypeHandler<PRODUCT_STATUS> {

	@Override
	public PRODUCT_STATUS getNullableResult(ResultSet rs, String columnName)
			throws SQLException {
		return PRODUCT_STATUS.valueOf(rs.getInt(columnName));
	}

	@Override
	public PRODUCT_STATUS getNullableResult(ResultSet rs, int columnName)
			throws SQLException {
		return PRODUCT_STATUS.valueOf(rs.getInt(columnName));
	}

	@Override
	public PRODUCT_STATUS getNullableResult(CallableStatement cs, int columnIndex)
			throws SQLException {
		return PRODUCT_STATUS.valueOf(cs.getInt(columnIndex));
	}

	@Override
	public void setNonNullParameter(PreparedStatement ps, int parameterIndex,
			PRODUCT_STATUS parameter, JdbcType jdbcType) throws SQLException {
		ps.setInt(parameterIndex, parameter.getCode());
	}

}
