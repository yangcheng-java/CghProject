package cn.ekgc.cgh.transport.apply;

import cn.ekgc.cgh.base.pojo.vo.PageVO;
import cn.ekgc.cgh.base.pojo.vo.QueryVO;
import cn.ekgc.cgh.pojo.entity.apply.ApplyStatus;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <b>智慧公务车信息平台-用车申请状态传输层接口</b>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
@FeignClient(name = "socip-apply-provider")
@RequestMapping("/trans/applystatus")
public interface ApplyStatusTransport {
	/**
	 * <b>根据查询对象分页查询</b>
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	PageVO<ApplyStatus> getPageByQuery(@RequestBody QueryVO<ApplyStatus> queryVO) throws Exception;

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/list")
	List<ApplyStatus> getListByQuery(@RequestBody ApplyStatus query) throws Exception;

	/**
	 * <b>保存信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	boolean save(@RequestBody ApplyStatus entity) throws Exception;

	/**
	 * <b>修改信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	boolean update(@RequestBody ApplyStatus entity) throws Exception;

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	ApplyStatus getById(@RequestParam String id) throws Exception;

	/**
	 * <b>根据编码查询对象</b>
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	ApplyStatus getByCode(@RequestParam String code) throws Exception;
}
