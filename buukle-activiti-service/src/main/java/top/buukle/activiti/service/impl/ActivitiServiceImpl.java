/**
 * Copyright (C), 2015-2019  http://www.jd.com
 * FileName: ActivitiServiceImpl
 * Author:   zhanglei1102
 * Date:     2019/12/6 11:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.buukle.activiti.service.impl;

import org.activiti.bpmn.model.BpmnModel;
import org.activiti.engine.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.buukle.activiti.service.ActivitiService;
import top.buukle.common.call.CommonRequest;
import top.buukle.common.call.CommonResponse;

import java.io.IOException;

/**
 * @description 〈工作流service〉
 * @author zhanglei1102
 * @create 2019/12/6
 * @since 1.0.0
 */
@Service
public class ActivitiServiceImpl implements ActivitiService {

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
     * @description 启动流程
     * @param request
     * @return top.buukle.common.call.CommonResponse
     * @Author zhanglei1102
     * @Date 2019/12/6
     */
    @Override
    public CommonResponse startProcess(CommonRequest request) {

        return null;
    }

    /**
     * 完成任务
     * @param request
     * @return
     */
    @Override
    public CommonResponse complete(CommonRequest request) {
        return null;
    }

    /**
     * 通过流程id 查询任务
     * @param request
     * @return
     */
    @Override
    public CommonResponse queryTaskByProcessId(CommonRequest request) {
        return null;
    }

    /**
     * 通过任务id，查询任务信息
     * @param request
     * @return
     */
    @Override
    public CommonResponse queryTaskById(CommonRequest request) {
        return null;
    }

    /**
     * 设置任务认领组
     * @param request
     * @return
     */
    @Override
    public CommonResponse addCandidateGroup(CommonRequest request) {
        return null;
    }

    /**
     * 认领任务
     * @param request
     * @return
     */
    @Override
    public CommonResponse claim(CommonRequest request) {
        return null;
    }

    /**
     * 设置认证用户，用于定义流程启动人
     * @param request
     * @return
     */
    @Override
    public CommonResponse setAuthUser(CommonRequest request) {
        return null;
    }

    /**
     * 查看定义的流程图
     * @param request
     * @return
     * @throws IOException
     */
    @Override
    public CommonResponse definitionImage(CommonRequest request) {
        return null;
    }

    /**
     * 查看流程进度图
     * @param request
     * @return
     * @throws Exception
     */
    @Override
    public CommonResponse getProcessImage(CommonRequest request) {
        return null;
    }

    /**
     * 通过任务和变量名称获取变量
     * @param request
     * @return
     */
    @Override
    public CommonResponse queryVariables(CommonRequest request) {
        return null;
    }

    /**
     * 通过流程id 查询流程
     * @param request
     * @return
     */
    @Override
    public CommonResponse queryProcessInstance(CommonRequest request) {
        return null;
    }

    /**
     * 删除流程
     * @param request
     * @return
     * @throws Exception
     */
    @Override
    public CommonResponse deleteProcessInstance(CommonRequest request) {
        return null;
    }

    /**
     * 流程部署
     * @param request
     * @return
     */
    @Override
    public CommonResponse deploy(CommonRequest request) {
        return null;
    }

    /**
     * 删除部署的流程，级联删除流程实例
     * @param request
     */
    @Override
    public void deleteDeployment(CommonRequest request) {

    }

    /**
     * 流程部署列表
     * @param request
     * @return
     */
    @Override
    public CommonResponse deployList(CommonRequest request) {
        return null;
    }

    /**
     * 获取部署流程列表
     * @param request
     * @return
     * @throws Exception
     */
    @Override
    public CommonResponse getProcessList(CommonRequest request) {
        return null;
    }

    /**
     * 挂起流程
     * @param request
     * @return
     * @throws Exception
     */
    @Override
    public CommonResponse suspendProcess(CommonRequest request) {
        return null;
    }

    /**
     * 激活流程
     * @param request
     * @return
     * @throws Exception
     */
    @Override
    public CommonResponse activateProcess(CommonRequest request) {
        return null;
    }

    /**
     * 任务回退
     * @param request
     * @return
     * @throws Exception
     */
    @Override
    public CommonResponse rollBackTask(CommonRequest request) {
        return null;
    }
}