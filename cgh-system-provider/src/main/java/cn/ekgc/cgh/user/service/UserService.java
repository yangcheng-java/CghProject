package cn.ekgc.cgh.user.service;

import cn.ekgc.cgh.base.pojo.vo.ResponseVO;
import cn.ekgc.cgh.pojo.entity.user.User;
import cn.ekgc.cgh.pojo.vo.LoginVO;

/**
 * <b>智慧公务车信息平台-用户员功能业务层接口</b>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
public interface UserService {

	/**
	 *用户登录
	 * @param loginVO
	 * @return
	 * @throws Exception
	 */
	ResponseVO login(LoginVO loginVO) throws Exception;
	/**
	 * <b>根据 Token 获得用户信息</b>
	 * @param token
	 * @return
	 * @throws Exception
	 */
	User getUserByToken(String token) throws Exception;
}
