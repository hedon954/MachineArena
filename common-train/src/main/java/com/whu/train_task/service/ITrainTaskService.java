package com.whu.train_task.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.entity.TrainTask;
import com.entity.TrainTaskConf;
import com.results.CommonResult;

import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Hedon
 * @since 2020-07-17
 */
public interface ITrainTaskService extends IService<TrainTask> {
    /**
     * 接口 6.2.1.1 创建训练作业
     * @author Yi Zheng
     * @create 2020-07-17 13:00
     * @updator Yi Zheng
     * @update 2020-7-17 16:00
     * @param trainTask 训练作业
     * @param trainTaskConf  训练作业参数
     * @return  返回通用数据
     */
    int[] addTrainTask(TrainTask trainTask,TrainTaskConf trainTaskConf);


    /**
     * 接口 6.2.1.2 根据ID删除训练作业
     * @author Yi Zheng
     * @create 2020-07-17 14:00
     * @updator
     * @update
     * @param trainTaskID 删除的ID
     * @return  返回删除影响的行数
     */
    int deleteTrainTaskById(Integer trainTaskID);
}
