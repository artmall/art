package cn.culturemall.art.business.admin.dao;

import org.springframework.stereotype.Service;

import cn.culturemall.art.business.admin.domain.Admin;
import cn.culturemall.art.common.dao.CrudDao;

@Service
public interface AdminDao extends CrudDao<Long, Admin> {

}
