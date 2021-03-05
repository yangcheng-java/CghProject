package cn.ekgc.cgh.driver.service.impl;

import cn.ekgc.cgh.base.pojo.vo.PageVO;
import cn.ekgc.cgh.base.util.IdGenerator;
import cn.ekgc.cgh.base.util.PageUtil;
import cn.ekgc.cgh.driver.dao.DriverLicenseTypeDao;
import cn.ekgc.cgh.driver.service.DriverLicenseTypeService;
import cn.ekgc.cgh.pojo.entity.driver.DriverLicenseType;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <b>智慧公务车信息平台-驾驶证类型功能业务层接口实现类</b>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("driverLicenseTypeService")
@Transactional
public class DriverLicenseTypeServiceImpl implements DriverLicenseTypeService {
	@Autowired
	private DriverLicenseTypeDao dao;
	@Autowired
	private IdGenerator idGenerator;

	/**
	 * <b>根据查询对象分页查询</b>
	 * @param query
	 * @param pageVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public PageVO<DriverLicenseType> getPageByQuery(DriverLicenseType query, PageVO<DriverLicenseType> pageVO)
			throws Exception {
		// 开启 PageHelper 分页过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		// 进行分页列表查询
		List<DriverLicenseType> list = dao.findListByQuery(query);
		// 进行数据的切换
		new PageUtil<DriverLicenseType>().parseFromPageInfoToPageVO(list, pageVO);

		return pageVO;
	}

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<DriverLicenseType> getListByQuery(DriverLicenseType query) throws Exception {
		return dao.findListByQuery(query);
	}

	/**
	 * <b>保存信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean save(DriverLicenseType entity) throws Exception {
		// 设定主键
		entity.setId(idGenerator.createId());
		if (dao.save(entity) > 0) {
			return true;
		}
		return false;
	}

	/**
	 * <b>修改信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean update(DriverLicenseType entity) throws Exception {
		if (dao.update(entity) > 0) {
			return true;
		}
		return false;
	}

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public DriverLicenseType getById(String id) throws Exception {
		// 封装查询对象
		DriverLicenseType query = new DriverLicenseType();
		// 设定查询参数
		query.setId(id);
		// 查询列表
		List<DriverLicenseType> list = dao.findListByQuery(query);
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * <b>根据编码查询对象</b>
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@Override
	public DriverLicenseType getByCode(String code) throws Exception {
		// 封装查询对象
		DriverLicenseType query = new DriverLicenseType();
		// 设定查询参数
		query.setCode(code);
		// 查询列表
		List<DriverLicenseType> list = dao.findListByQuery(query);
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}
}
