package com.atguigu.gulimail.product.dao;

import com.atguigu.gulimail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhiwuli
 * @email 398147488@qq.com
 * @date 2024-05-22 08:52:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
