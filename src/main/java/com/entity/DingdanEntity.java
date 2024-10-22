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
 * 订单
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-13 19:48:22
 */
@TableName("dingdan")
public class DingdanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DingdanEntity() {
		
	}
	
	public DingdanEntity(T t) {
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
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
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
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
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
