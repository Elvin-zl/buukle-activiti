/**
 * Copyright (C), 2015-2019  http://www.jd.com
 * FileName: ModelServiceImpl
 * Author:   zhanglei1102
 * Date:     2019/12/9 21:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.buukle.activiti.service.impl;

import org.activiti.engine.*;
import org.activiti.engine.repository.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.buukle.activiti.entity.vo.ModelQuery;
import top.buukle.activiti.service.ModelService;
import top.buukle.common.call.PageResponse;
import top.buukle.common.mvc.BaseQuery;

import java.util.List;

/**
 * @description 〈〉
 * @author zhanglei1102
 * @create 2019/12/9
 * @since 1.0.0
 */
@Service(value="modelService")
public class ModelServiceImpl implements ModelService {


    @Autowired
    private RepositoryService repositoryService;

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private FormService formService;

    @Autowired
    private HistoryService historyService;

    @Autowired
    private IdentityService identityService;

    /**
     * 分页获取列表
     * @param query 查询对象
     * @return PageResponse
     */
    @Override
    public PageResponse getPage(BaseQuery query) {
        ModelQuery modelQuery = (ModelQuery)query;
        List<Model> resultList =  repositoryService.createModelQuery().orderByCreateTime().desc().listPage((modelQuery.getPage() -1) * modelQuery.getPageSize(),(modelQuery.getPage()) * modelQuery.getPageSize());
        List<Model> totalList =  repositoryService.createModelQuery().orderByCreateTime().desc().list();
        return new PageResponse.Builder().build(resultList,modelQuery.getPage(),modelQuery.getPageSize(),totalList.size());
    }
}