package com.atguigu.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author zhiwuli
 * @email 398147488@qq.com
 * @date 2024-05-22 23:30:28
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

