package com.entity.model;

import com.entity.JiaoshixiaojiashenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 教师销假申请
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-22 16:39:33
 */
public class JiaoshixiaojiashenqingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 学院
	 */
	
	private String xueyuan;
		
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
	
	private Integer qingjiatianshu;
		
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
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：学院
	 */
	 
	public void setXueyuan(String xueyuan) {
		this.xueyuan = xueyuan;
	}
	
	/**
	 * 获取：学院
	 */
	public String getXueyuan() {
		return xueyuan;
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
	 
	public void setQingjiatianshu(Integer qingjiatianshu) {
		this.qingjiatianshu = qingjiatianshu;
	}
	
	/**
	 * 获取：请假天数
	 */
	public Integer getQingjiatianshu() {
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
