package com.entity.model;

import com.entity.DingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 订单
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-13 19:48:22
 */
public class DingdanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 客户姓名
	 */
	
	private String kehuxingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 生产物品
	 */
	
	private String shengchanwupin;
		
	/**
	 * 生产数量
	 */
	
	private String shengchanshuliang;
		
	/**
	 * 生产原料
	 */
	
	private String shengchanyuanliao;
		
	/**
	 * 下单时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiadanshijian;
		
	/**
	 * 生产进度
	 */
	
	private String shengchanjindu;
				
	
	/**
	 * 设置：客户姓名
	 */
	 
	public void setKehuxingming(String kehuxingming) {
		this.kehuxingming = kehuxingming;
	}
	
	/**
	 * 获取：客户姓名
	 */
	public String getKehuxingming() {
		return kehuxingming;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：生产物品
	 */
	 
	public void setShengchanwupin(String shengchanwupin) {
		this.shengchanwupin = shengchanwupin;
	}
	
	/**
	 * 获取：生产物品
	 */
	public String getShengchanwupin() {
		return shengchanwupin;
	}
				
	
	/**
	 * 设置：生产数量
	 */
	 
	public void setShengchanshuliang(String shengchanshuliang) {
		this.shengchanshuliang = shengchanshuliang;
	}
	
	/**
	 * 获取：生产数量
	 */
	public String getShengchanshuliang() {
		return shengchanshuliang;
	}
				
	
	/**
	 * 设置：生产原料
	 */
	 
	public void setShengchanyuanliao(String shengchanyuanliao) {
		this.shengchanyuanliao = shengchanyuanliao;
	}
	
	/**
	 * 获取：生产原料
	 */
	public String getShengchanyuanliao() {
		return shengchanyuanliao;
	}
				
	
	/**
	 * 设置：下单时间
	 */
	 
	public void setXiadanshijian(Date xiadanshijian) {
		this.xiadanshijian = xiadanshijian;
	}
	
	/**
	 * 获取：下单时间
	 */
	public Date getXiadanshijian() {
		return xiadanshijian;
	}
				
	
	/**
	 * 设置：生产进度
	 */
	 
	public void setShengchanjindu(String shengchanjindu) {
		this.shengchanjindu = shengchanjindu;
	}
	
	/**
	 * 获取：生产进度
	 */
	public String getShengchanjindu() {
		return shengchanjindu;
	}
			
}
