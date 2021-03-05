package cn.ekgc.cgh.pojo.vo;

import java.io.Serializable;

/**
 * <b>智慧公务车信息平台-用户登录试图信息</b>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
public class LoginVO implements Serializable {
	private static final long serialVersionUID = -2450870810900293608L;
	private String cellphone;           // 手机号码

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String password;            // 登陆密码
}
