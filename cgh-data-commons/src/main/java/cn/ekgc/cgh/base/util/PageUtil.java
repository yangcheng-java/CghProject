package cn.ekgc.cgh.base.util;

import cn.ekgc.cgh.base.pojo.vo.PageVO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * <b>智慧公务车信息平台-分页工具类</b>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
public class PageUtil<E> {
	public void parseFromPageInfoToPageVO(List<E> list, PageVO<E> pageVO) {
		// 创建 PageInfo 对象
		PageInfo<E> pageInfo = new PageInfo<E>(list);
		// 从 PageInfo 中提取数据
		pageVO.setList(pageInfo.getList());
		pageVO.setTotalCount(pageInfo.getTotal());
		pageVO.setTotalPage(pageInfo.getPages());
	}
}
