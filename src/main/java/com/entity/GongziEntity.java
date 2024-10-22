package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 工资
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-13 19:48:21
 */
@TableName("gongzi")
public class GongziEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongziEntity() {
		
	}
	
	public GongziEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 工资年月
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date gongzinianyue;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：工资年月
	 */
	public void setGongzinianyue(Date gongzinianyue) {
		this.gongzinianyue = gongzinianyue;
	}
	/**
	 * 获取：工资年月
	 */
	public Date getGongzinianyue() {
		return gongzinianyue;
	}
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
