package com.entity.vo;

import com.entity.ChengyichukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 成衣出库
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-13 19:48:22
 */
public class ChengyichukuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 成品名称
	 */
	
	private String chengpinmingcheng;
		
	/**
	 * 是否合格
	 */
	
	private String shifouhege;
		
	/**
	 * 检验人
	 */
	
	private String jianyanren;
		
	/**
	 * 检验时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jianyanshijian;
		
	/**
	 * 数量
	 */
	
	private String shuliang;
		
	/**
	 * 出库时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chukushijian;
		
	/**
	 * 出库去向
	 */
	
	private String chukuquxiang;
				
	
	/**
	 * 设置：成品名称
	 */
	 
	public void setChengpinmingcheng(String chengpinmingcheng) {
		this.chengpinmingcheng = chengpinmingcheng;
	}
	
	/**
	 * 获取：成品名称
	 */
	public String getChengpinmingcheng() {
		return chengpinmingcheng;
	}
				
	
	/**
	 * 设置：是否合格
	 */
	 
	public void setShifouhege(String shifouhege) {
		this.shifouhege = shifouhege;
	}
	
	/**
	 * 获取：是否合格
	 */
	public String getShifouhege() {
		return shifouhege;
	}
				
	
	/**
	 * 设置：检验人
	 */
	 
	public void setJianyanren(String jianyanren) {
		this.jianyanren = jianyanren;
	}
	
	/**
	 * 获取：检验人
	 */
	public String getJianyanren() {
		return jianyanren;
	}
				
	
	/**
	 * 设置：检验时间
	 */
	 
	public void setJianyanshijian(Date jianyanshijian) {
		this.jianyanshijian = jianyanshijian;
	}
	
	/**
	 * 获取：检验时间
	 */
	public Date getJianyanshijian() {
		return jianyanshijian;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(String shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public String getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：出库时间
	 */
	 
	public void setChukushijian(Date chukushijian) {
		this.chukushijian = chukushijian;
	}
	
	/**
	 * 获取：出库时间
	 */
	public Date getChukushijian() {
		return chukushijian;
	}
				
	
	/**
	 * 设置：出库去向
	 */
	 
	public void setChukuquxiang(String chukuquxiang) {
		this.chukuquxiang = chukuquxiang;
	}
	
	/**
	 * 获取：出库去向
	 */
	public String getChukuquxiang() {
		return chukuquxiang;
	}
			
}
