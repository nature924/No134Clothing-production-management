package com.entity.vo;

import com.entity.GongziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 工资
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-13 19:48:21
 */
public class GongziVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 基本工资
	 */
	
	private Integer jibengongzi;
		
	/**
	 * 奖金
	 */
	
	private Integer jiangjin;
		
	/**
	 * 罚款
	 */
	
	private Integer fakuan;
		
	/**
	 * 应发工资
	 */
	
	private String yingfagongzi;
		
	/**
	 * 结算日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiesuanriqi;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：基本工资
	 */
	 
	public void setJibengongzi(Integer jibengongzi) {
		this.jibengongzi = jibengongzi;
	}
	
	/**
	 * 获取：基本工资
	 */
	public Integer getJibengongzi() {
		return jibengongzi;
	}
				
	
	/**
	 * 设置：奖金
	 */
	 
	public void setJiangjin(Integer jiangjin) {
		this.jiangjin = jiangjin;
	}
	
	/**
	 * 获取：奖金
	 */
	public Integer getJiangjin() {
		return jiangjin;
	}
				
	
	/**
	 * 设置：罚款
	 */
	 
	public void setFakuan(Integer fakuan) {
		this.fakuan = fakuan;
	}
	
	/**
	 * 获取：罚款
	 */
	public Integer getFakuan() {
		return fakuan;
	}
				
	
	/**
	 * 设置：应发工资
	 */
	 
	public void setYingfagongzi(String yingfagongzi) {
		this.yingfagongzi = yingfagongzi;
	}
	
	/**
	 * 获取：应发工资
	 */
	public String getYingfagongzi() {
		return yingfagongzi;
	}
				
	
	/**
	 * 设置：结算日期
	 */
	 
	public void setJiesuanriqi(Date jiesuanriqi) {
		this.jiesuanriqi = jiesuanriqi;
	}
	
	/**
	 * 获取：结算日期
	 */
	public Date getJiesuanriqi() {
		return jiesuanriqi;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
			
}
