package com.entity.vo;

import com.entity.ChengpinjianyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 成品检验
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-13 19:48:21
 */
public class ChengpinjianyanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 成品名称
	 */
	
	private String chengpinmingcheng;
		
	/**
	 * 款式是否符合样衣
	 */
	
	private String kuanshishifoufuheyangyi;
		
	/**
	 * 尺寸规格符合要求
	 */
	
	private String chicunguigefuheyaoqiu;
		
	/**
	 * 缝合是否规整平服
	 */
	
	private String fengheshifouguizhengpingfu;
		
	/**
	 * 面料是否有坏
	 */
	
	private String mianliaoshifouyouhuai;
		
	/**
	 * 线头是否修净
	 */
	
	private String xiantoushifouxiujing;
		
	/**
	 * 是否合格
	 */
	
	private String shifouhege;
		
	/**
	 * 检验时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jianyanshijian;
		
	/**
	 * 检验人
	 */
	
	private String jianyanren;
				
	
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
	 * 设置：款式是否符合样衣
	 */
	 
	public void setKuanshishifoufuheyangyi(String kuanshishifoufuheyangyi) {
		this.kuanshishifoufuheyangyi = kuanshishifoufuheyangyi;
	}
	
	/**
	 * 获取：款式是否符合样衣
	 */
	public String getKuanshishifoufuheyangyi() {
		return kuanshishifoufuheyangyi;
	}
				
	
	/**
	 * 设置：尺寸规格符合要求
	 */
	 
	public void setChicunguigefuheyaoqiu(String chicunguigefuheyaoqiu) {
		this.chicunguigefuheyaoqiu = chicunguigefuheyaoqiu;
	}
	
	/**
	 * 获取：尺寸规格符合要求
	 */
	public String getChicunguigefuheyaoqiu() {
		return chicunguigefuheyaoqiu;
	}
				
	
	/**
	 * 设置：缝合是否规整平服
	 */
	 
	public void setFengheshifouguizhengpingfu(String fengheshifouguizhengpingfu) {
		this.fengheshifouguizhengpingfu = fengheshifouguizhengpingfu;
	}
	
	/**
	 * 获取：缝合是否规整平服
	 */
	public String getFengheshifouguizhengpingfu() {
		return fengheshifouguizhengpingfu;
	}
				
	
	/**
	 * 设置：面料是否有坏
	 */
	 
	public void setMianliaoshifouyouhuai(String mianliaoshifouyouhuai) {
		this.mianliaoshifouyouhuai = mianliaoshifouyouhuai;
	}
	
	/**
	 * 获取：面料是否有坏
	 */
	public String getMianliaoshifouyouhuai() {
		return mianliaoshifouyouhuai;
	}
				
	
	/**
	 * 设置：线头是否修净
	 */
	 
	public void setXiantoushifouxiujing(String xiantoushifouxiujing) {
		this.xiantoushifouxiujing = xiantoushifouxiujing;
	}
	
	/**
	 * 获取：线头是否修净
	 */
	public String getXiantoushifouxiujing() {
		return xiantoushifouxiujing;
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
			
}
