package com.dao;

import com.entity.JiaoshiqingjiashenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshiqingjiashenqingVO;
import com.entity.view.JiaoshiqingjiashenqingView;


/**
 * 教师请假申请
 * 
 * @author 
 * @email 
 * @date 2021-04-22 16:39:33
 */
public interface JiaoshiqingjiashenqingDao extends BaseMapper<JiaoshiqingjiashenqingEntity> {
	
	List<JiaoshiqingjiashenqingVO> selectListVO(@Param("ew") Wrapper<JiaoshiqingjiashenqingEntity> wrapper);
	
	JiaoshiqingjiashenqingVO selectVO(@Param("ew") Wrapper<JiaoshiqingjiashenqingEntity> wrapper);
	
	List<JiaoshiqingjiashenqingView> selectListView(@Param("ew") Wrapper<JiaoshiqingjiashenqingEntity> wrapper);

	List<JiaoshiqingjiashenqingView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshiqingjiashenqingEntity> wrapper);
	
	JiaoshiqingjiashenqingView selectView(@Param("ew") Wrapper<JiaoshiqingjiashenqingEntity> wrapper);
	
}
