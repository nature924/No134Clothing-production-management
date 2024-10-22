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
 * 样板
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-13 19:48:21
 */
@TableName("yangban")
public class YangbanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YangbanEntity() {
		
	}
	
	public YangbanEntity(T t) {
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
	 * 样板名称
	 */
					
	private String yangbanmingcheng;
	
	/**
	 * 面料
	 */
					
	private String mianliao;
	
	/**
	 * 辅料
	 */
					
	private String fuliao;
	
	/**
	 * 样板尺码
	 */
					
	private String yangbanchima;
	
	/**
	 * 部位尺寸
	 */
					
	private String buweichicun;
	
	/**
	 * 款式信息
	 */
					
	private String kuanshixinxi;
	
	/**
	 * 注意点
	 */
					
	private String zhuyidian;
	
	/**
	 * 制作进度
	 */
					
	private String zhizuojindu;
	
	/**
	 * 样板图片
	 */
					
	private String yangbantupian;
	
	
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
	 * 设置：样板名称
	 */
	public void setYangbanmingcheng(String yangbanmingcheng) {
		this.yangbanmingcheng = yangbanmingcheng;
	}
	/**
	 * 获取：样板名称
	 */
	public String getYangbanmingcheng() {
		return yangbanmingcheng;
	}
	/**
	 * 设置：面料
	 */
	public void setMianliao(String mianliao) {
		this.mianliao = mianliao;
	}
	/**
	 * 获取：面料
	 */
	public String getMianliao() {
		return mianliao;
	}
	/**
	 * 设置：辅料
	 */
	public void setFuliao(String fuliao) {
		this.fuliao = fuliao;
	}
	/**
	 * 获取：辅料
	 */
	public String getFuliao() {
		return fuliao;
	}
	/**
	 * 设置：样板尺码
	 */
	public void setYangbanchima(String yangbanchima) {
		this.yangbanchima = yangbanchima;
	}
	/**
	 * 获取：样板尺码
	 */
	public String getYangbanchima() {
		return yangbanchima;
	}
	/**
	 * 设置：部位尺寸
	 */
	public void setBuweichicun(String buweichicun) {
		this.buweichicun = buweichicun;
	}
	/**
	 * 获取：部位尺寸
	 */
	public String getBuweichicun() {
		return buweichicun;
	}
	/**
	 * 设置：款式信息
	 */
	public void setKuanshixinxi(String kuanshixinxi) {
		this.kuanshixinxi = kuanshixinxi;
	}
	/**
	 * 获取：款式信息
	 */
	public String getKuanshixinxi() {
		return kuanshixinxi;
	}
	/**
	 * 设置：注意点
	 */
	public void setZhuyidian(String zhuyidian) {
		this.zhuyidian = zhuyidian;
	}
	/**
	 * 获取：注意点
	 */
	public String getZhuyidian() {
		return zhuyidian;
	}
	/**
	 * 设置：制作进度
	 */
	public void setZhizuojindu(String zhizuojindu) {
		this.zhizuojindu = zhizuojindu;
	}
	/**
	 * 获取：制作进度
	 */
	public String getZhizuojindu() {
		return zhizuojindu;
	}
	/**
	 * 设置：样板图片
	 */
	public void setYangbantupian(String yangbantupian) {
		this.yangbantupian = yangbantupian;
	}
	/**
	 * 获取：样板图片
	 */
	public String getYangbantupian() {
		return yangbantupian;
	}

}
