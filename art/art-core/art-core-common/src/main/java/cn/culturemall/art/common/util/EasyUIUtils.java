package cn.culturemall.art.common.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class EasyUIUtils {

	public static <T extends Object> String parseDataGrid(Long total, List<T> list) {
		if(total == null) {
			total = 0L;
		}
		if(list == null) {
			list = Collections.emptyList();
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", total);
		map.put("rows", list);
		String json = JsonUtils.writeValue(map);
		return json;
	}
}
