package res.订单商品po类及sql.po;

import cn.itcast.mybatis.po.*;

import java.util.Date;

public class UserCustom extends cn.itcast.mybatis.po.User {
	
	//这里添加扩展字段
	private Date birthday_start;//起始日期
	private Date birthday_end;//截止日期
	
	
}
