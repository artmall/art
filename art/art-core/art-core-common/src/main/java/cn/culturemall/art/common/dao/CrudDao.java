package cn.culturemall.art.common.dao;

import cn.culturemall.art.common.domain.DomainObject;

public interface CrudDao<ID, E extends DomainObject> {

	int save(E e);

	int deleteById(ID id);
	
	int update(E e);
	
	E findById(ID id);
}
