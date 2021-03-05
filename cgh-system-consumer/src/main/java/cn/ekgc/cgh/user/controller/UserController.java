package cn.ekgc.cgh.user.controller;

import cn.ekgc.cgh.base.controller.BaseController;
import cn.ekgc.cgh.base.pojo.vo.ResponseVO;
import cn.ekgc.cgh.pojo.vo.LoginVO;
import cn.ekgc.cgh.transport.user.UserTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>智慧公务车信息平台-用户信息功能控制层类</b>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("userController")
@RequestMapping("/user")
public class UserController extends BaseController {
	@Autowired
	private UserTransport transport;

	/**
	 * <b>用户登录</b>
	 * @param loginVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/login")
	public ResponseVO loginUser(@RequestBody LoginVO loginVO) throws Exception {
		return transport.loginUser(loginVO);
	}
}
