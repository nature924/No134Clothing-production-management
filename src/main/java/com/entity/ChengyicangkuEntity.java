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
 * 成衣仓库
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-13 19:48:22
 */
@TableName("chengyicangku")
public class ChengyicangkuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChengyicangkuEntity() {
		
	}
	
	public ChengyicangkuEntity(T t) {
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
	 * 成品编号
	 */
					
	private String chengpinbianhao;
	
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
	 * 入库时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date rukushijian;
	
	
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
	 * 设置：成品编号
	 */
	public void setChengpinbianhao(String chengpinbianhao) {
		this.chengpinbianhao = chengpinbianhao;
	}
	/**
	 * 获取：成品编号
	 */
	public String getChengpinbianhao() {
		return chengpinbianhao;
	}
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
	 * 设置：入库时间
	 */
	public void setRukushijian(Date rukushijian) {
		this.rukushijian = rukushijian;
	}
	/**
	 * 获取：入库时间
	 */
	public Date getRukushijian() {
		return rukushijian;
	}

}
