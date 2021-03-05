package cn.ekgc.cgh.transport.driver;

import cn.ekgc.cgh.base.pojo.vo.PageVO;
import cn.ekgc.cgh.base.pojo.vo.QueryVO;
import cn.ekgc.cgh.pojo.entity.driver.DriverStatus;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <b>智慧公务车信息平台-驾驶员功能传输层接口</b>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
@FeignClient(name = "socip-system-provider")
@RequestMapping("/trans/driverstatus")
public interface DriverStatusTransport {
	/**
	 * <b>根据查询对象分页查询</b>
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	PageVO<DriverStatus> getPageByQuery(@RequestBody QueryVO<DriverStatus> queryVO) throws Exception;

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/list")
	List<DriverStatus> getListByQuery(@RequestBody DriverStatus query) throws Exception;

	/**
	 * <b>保存信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	boolean save(@RequestBody DriverStatus entity) throws Exception;

	/**
	 * <b>修改信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	boolean update(@RequestBody DriverStatus entity) throws Exception;

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	DriverStatus getById(@RequestParam String id) throws Exception;

	/**
	 * <b>根据编码查询对象</b>
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	DriverStatus getByCode(@RequestParam String code) throws Exception;
}
