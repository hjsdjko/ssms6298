package com.dao;

import com.entity.JiaoshixiaojiashenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshixiaojiashenqingVO;
import com.entity.view.JiaoshixiaojiashenqingView;


/**
 * 教师销假申请
 * 
 * @author 
 * @email 
 * @date 2021-04-22 16:39:33
 */
public interface JiaoshixiaojiashenqingDao extends BaseMapper<JiaoshixiaojiashenqingEntity> {
	
	List<JiaoshixiaojiashenqingVO> selectListVO(@Param("ew") Wrapper<JiaoshixiaojiashenqingEntity> wrapper);
	
	JiaoshixiaojiashenqingVO selectVO(@Param("ew") Wrapper<JiaoshixiaojiashenqingEntity> wrapper);
	
	List<JiaoshixiaojiashenqingView> selectListView(@Param("ew") Wrapper<JiaoshixiaojiashenqingEntity> wrapper);

	List<JiaoshixiaojiashenqingView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshixiaojiashenqingEntity> wrapper);
	
	JiaoshixiaojiashenqingView selectView(@Param("ew") Wrapper<JiaoshixiaojiashenqingEntity> wrapper);
	
}
