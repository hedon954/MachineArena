package com.whu.service;

import com.entity.Model;
import com.results.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

/**
 * @author Hedon Wang
 * @create 2020-07-17 21:58
 */

@Service
@FeignClient(value = "common-model")
public interface ModelFeignService {

    /**
     * 接口6.3.1.1  导入模型
     * @description 导入模型
     * @author Yi Zheng
     * @create 2020-7-21 13:00
     * @updator
     * @update
     * @param model
     * @return
     */
    @PostMapping("/model")
    CommonResult importModel(@RequestBody Model model);


    /**
     * 接口6.3.1.2  根据id查询模型
     * @description 根据id查询模型
     * @author Yi Zheng
     * @create 2020-7-21 13:10
     * @updator
     * @update
     * @param id
     * @return
     */
    @GetMapping("/model/{id}")
    CommonResult selectModelById(@PathVariable("id") Integer id);


    /**
     * 接口6.3.1.23 根据id删除模型
     * @description 根据id删除模型
     * @author Yi Zheng
     * @create 2020-7-21 13:10
     * @updator
     * @update
     * @param id
     * @return
     */
    @DeleteMapping("/model/{id}")
    CommonResult deleteModelById(@PathVariable("id") Integer id);

    /**
     * 接口6.3.1.23 根据id更改模型
     * @description 根据id更改模型
     * @author Yi Zheng
     * @create 2020-7-21 13:10
     * @updator
     * @update
     * @param model  需要更改的墨香
     * @return int 更改印象的行数
     */
    @PutMapping("/model/")
    CommonResult updateModelById(@RequestBody Model model);
}
