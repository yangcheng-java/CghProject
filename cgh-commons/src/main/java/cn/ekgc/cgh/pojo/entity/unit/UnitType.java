package cn.ekgc.cgh.pojo.entity.unit;

import cn.ekgc.cgh.base.pojo.entity.BaseEntity;

/**
 * <b>智慧公务车信息平台-合作单位类型实体信息</b>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
public class UnitType extends BaseEntity {
	private static final long serialVersionUID = -5104373797134807739L;
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
