package com.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.entity.TrainTask;
import com.responsevo.TrainTaskResponseVo;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author Hedon
 * @since 2020-07-17
 */
public interface TrainTaskMapper extends BaseMapper<TrainTask> {

    //获取当前用户下的所有训练作业
    List<TrainTaskResponseVo> getTrainTasksByUserId(Integer userId, String keyWord);

    //获取所有训练作业
    List<TrainTaskResponseVo> getTrainTasks(String keyWord);
}
