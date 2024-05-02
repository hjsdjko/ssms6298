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
 * 销假申请
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-22 16:39:33
 */
@TableName("xiaojiashenqing")
public class XiaojiashenqingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaojiashenqingEntity() {
		
	}
	
	public XiaojiashenqingEntity(T t) {
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
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 请假类型
	 */
					
	private String qingjialeixing;
	
	/**
	 * 请假时间
	 */
					
	private String qingjiashijian;
	
	/**
	 * 结束时间
	 */
					
	private String jieshushijian;
	
	/**
	 * 请假天数
	 */
					
	private String qingjiatianshu;
	
	/**
	 * 是否离校
	 */
					
	private String shifoulixiao;
	
	/**
	 * 是否前往疫情中高风险地区
	 */
					
	private String shifouqianwangyiqingzhonggaofengxiandiqu;
	
	/**
	 * 请假理由
	 */
					
	private String qingjialiyou;
	
	/**
	 * 提交时间
	 */
					
	private String tijiaoshijian;
	
	/**
	 * 个人健康状态
	 */
					
	private String gerenjiankangzhuangtai;
	
	/**
	 * 请假期间是否接触感染病毒人员
	 */
					
	private String qingjiaqijianshifoujiechuganranbingdurenyuan;
	
	/**
	 * 状态
	 */
					
	private String zhuangtai;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
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
	/**
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
	/**
	 * 设置：请假类型
	 */
	public void setQingjialeixing(String qingjialeixing) {
		this.qingjialeixing = qingjialeixing;
	}
	/**
	 * 获取：请假类型
	 */
	public String getQingjialeixing() {
		return qingjialeixing;
	}
	/**
	 * 设置：请假时间
	 */
	public void setQingjiashijian(String qingjiashijian) {
		this.qingjiashijian = qingjiashijian;
	}
	/**
	 * 获取：请假时间
	 */
	public String getQingjiashijian() {
		return qingjiashijian;
	}
	/**
	 * 设置：结束时间
	 */
	public void setJieshushijian(String jieshushijian) {
		this.jieshushijian = jieshushijian;
	}
	/**
	 * 获取：结束时间
	 */
	public String getJieshushijian() {
		return jieshushijian;
	}
	/**
	 * 设置：请假天数
	 */
	public void setQingjiatianshu(String qingjiatianshu) {
		this.qingjiatianshu = qingjiatianshu;
	}
	/**
	 * 获取：请假天数
	 */
	public String getQingjiatianshu() {
		return qingjiatianshu;
	}
	/**
	 * 设置：是否离校
	 */
	public void setShifoulixiao(String shifoulixiao) {
		this.shifoulixiao = shifoulixiao;
	}
	/**
	 * 获取：是否离校
	 */
	public String getShifoulixiao() {
		return shifoulixiao;
	}
	/**
	 * 设置：是否前往疫情中高风险地区
	 */
	public void setShifouqianwangyiqingzhonggaofengxiandiqu(String shifouqianwangyiqingzhonggaofengxiandiqu) {
		this.shifouqianwangyiqingzhonggaofengxiandiqu = shifouqianwangyiqingzhonggaofengxiandiqu;
	}
	/**
	 * 获取：是否前往疫情中高风险地区
	 */
	public String getShifouqianwangyiqingzhonggaofengxiandiqu() {
		return shifouqianwangyiqingzhonggaofengxiandiqu;
	}
	/**
	 * 设置：请假理由
	 */
	public void setQingjialiyou(String qingjialiyou) {
		this.qingjialiyou = qingjialiyou;
	}
	/**
	 * 获取：请假理由
	 */
	public String getQingjialiyou() {
		return qingjialiyou;
	}
	/**
	 * 设置：提交时间
	 */
	public void setTijiaoshijian(String tijiaoshijian) {
		this.tijiaoshijian = tijiaoshijian;
	}
	/**
	 * 获取：提交时间
	 */
	public String getTijiaoshijian() {
		return tijiaoshijian;
	}
	/**
	 * 设置：个人健康状态
	 */
	public void setGerenjiankangzhuangtai(String gerenjiankangzhuangtai) {
		this.gerenjiankangzhuangtai = gerenjiankangzhuangtai;
	}
	/**
	 * 获取：个人健康状态
	 */
	public String getGerenjiankangzhuangtai() {
		return gerenjiankangzhuangtai;
	}
	/**
	 * 设置：请假期间是否接触感染病毒人员
	 */
	public void setQingjiaqijianshifoujiechuganranbingdurenyuan(String qingjiaqijianshifoujiechuganranbingdurenyuan) {
		this.qingjiaqijianshifoujiechuganranbingdurenyuan = qingjiaqijianshifoujiechuganranbingdurenyuan;
	}
	/**
	 * 获取：请假期间是否接触感染病毒人员
	 */
	public String getQingjiaqijianshifoujiechuganranbingdurenyuan() {
		return qingjiaqijianshifoujiechuganranbingdurenyuan;
	}
	/**
	 * 设置：状态
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
