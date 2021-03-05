package cn.ekgc.cgh.pojo.entity.car;

import cn.ekgc.cgh.base.pojo.entity.BaseEntity;

/**
 * <b>智慧公务车信息平台-座位数量实体信息</b>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
public class Seat extends BaseEntity {
	private static final long serialVersionUID = 7486875950467356336L;
	private String id;                      // 主键
	private String text;                    // 文本
	private String code;                    // 状态

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
