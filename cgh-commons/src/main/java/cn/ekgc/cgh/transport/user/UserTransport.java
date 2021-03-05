package cn.ekgc.cgh.transport.user;

import cn.ekgc.cgh.base.pojo.vo.ResponseVO;
import cn.ekgc.cgh.pojo.entity.user.User;
import cn.ekgc.cgh.pojo.vo.LoginVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <b>智慧公务车信息平台-用户员功能传输层接口</b>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
@FeignClient(name = "cgh-system-provider")
@RequestMapping("/trans/user")
public interface UserTransport {
	/**
	 * <b>进行用户登录</b>
	 * @param loginVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/loqin")
	ResponseVO loginUser(@RequestBody LoginVO loginVO) throws Exception;


	/**
	 * <b>根据 Token 获得当前登录用户信息</b>
	 * @param token
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/token")
	User getUserByToken(@RequestParam String token) throws Exception;
}
