package res.订单商品po类及sql.po;

import cn.itcast.mybatis.po.*;

import java.util.List;

public class QueryVo {
	
	private cn.itcast.mybatis.po.User user;
	
	//自定义用户扩展类
	private UserCustom userCustom;
	
	//传递多个用户id
	private List<Integer> ids;
	
	public cn.itcast.mybatis.po.User getUser() {
		return user;
	}

	public void setUser(cn.itcast.mybatis.po.User user) {
		this.user = user;
	}

	public UserCustom getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}



}
