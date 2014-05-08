package cn.culturemall.art.business.dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.culturemall.art.business.domain.user.User;
import cn.culturemall.art.common.dao.CrudDao;

public interface UserDao extends CrudDao<Long, User> {

	int findUsersCountLikeNickname(String nickname);

	List<User> findUsersLikeNickname(@Param("nickname") String nickname,
			@Param("startRow") int startRow,
			@Param("onePageSize") int onePageSize);
}
