package cn.ekgc.cgh.pojo.entity.car;

import cn.ekgc.cgh.base.pojo.entity.BaseEntity;
import cn.ekgc.cgh.pojo.entity.unit.Unit;

/**
 * <b>智慧公务车信息平台-保险记录实体信息</b>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
public class InsuranceRecord extends BaseEntity {
	private static final long serialVersionUID = -897247456180746709L;
	private String id;                      // 主键
	private Car car;                        // 车辆信息
	private Unit unit;                      // 保险公司
	private Double amount;                  // 保险金额
	private String insuranceDate;           // 投保日期
	private String expireInsuranceDate;     // 保险到期时间

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getInsuranceDate() {
		return insuranceDate;
	}

	public void setInsuranceDate(String insuranceDate) {
		this.insuranceDate = insuranceDate;
	}

	public String getExpireInsuranceDate() {
		return expireInsuranceDate;
	}

	public void setExpireInsuranceDate(String expireInsuranceDate) {
		this.expireInsuranceDate = expireInsuranceDate;
	}
}
