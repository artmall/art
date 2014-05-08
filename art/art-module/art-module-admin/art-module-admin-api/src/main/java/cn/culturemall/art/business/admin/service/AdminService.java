package cn.culturemall.art.business.admin.service;

import cn.culturemall.art.business.admin.domain.Admin;
import cn.culturemall.art.common.service.ReturnData;

public interface AdminService {

	ReturnData<Admin> findAdminById(Long adminId);
}
