/**
 * Copyright (C), 2015-2019  http://www.jd.com
 * FileName: ApiAppController
 * Author:   zhanglei1102
 * Date:     2019/12/6 10:51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.buukle.activiti.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.buukle.activiti.service.ActivitiService;
import top.buukle.common.call.CommonRequest;
import top.buukle.common.call.CommonResponse;
import top.buukle.common.call.PageResponse;

import java.io.IOException;

/**
 * @description 〈〉
 * @author zhanglei1102
 * @create 2019/12/6
 * @since 1.0.0
 */
@Controller
@RequestMapping("/api/app")
public class ApiAppController {


    @Autowired
    private ActivitiService activitiService;
    /**
     * @description 启动流程
     * @param request
     * @return top.buukle.common.call.CommonResponse
     * @Author zhanglei1102
     * @Date 2019/12/6
     */
    @RequestMapping(value = "/startProcess")
    CommonResponse startProcess( CommonRequest request) throws Exception{
        return activitiService.startProcess(request);
    }
    /**
     * 完成任务
     * @param request
     * @return
     */
    @RequestMapping(value = "/complete")
    CommonResponse complete( CommonRequest request){
        return activitiService.complete(request);
    }

    /**
     * 通过流程id 查询任务
     * @param request
     * @return
     */
    @RequestMapping(value = "/queryTaskByProcessId")
    CommonResponse queryTaskByProcessId( CommonRequest request){
        return activitiService.queryTaskByProcessId(request);
    }

    /**
     * 通过任务id，查询任务信息
     * @param request
     * @return
     */
    @RequestMapping(value = "/queryTaskById")
    CommonResponse queryTaskById( CommonRequest request){
        return activitiService.queryTaskById(request);
    }

    /**
     * 设置任务认领组
     * @param request
     * @return
     */
    @RequestMapping(value = "/addCandidateGroup")
    CommonResponse addCandidateGroup( CommonRequest request){
        return activitiService.addCandidateGroup(request);
    }


    /**
     * 认领任务
     * @param request
     * @return
     */
    @RequestMapping(value = "/claim")
    CommonResponse claim( CommonRequest request){
        return activitiService.claim(request);
    }

    /**
     * 设置认证用户，用于定义流程启动人
     * @param request
     * @return
     */
    @RequestMapping(value = "/setAuthUser")
    CommonResponse setAuthUser( CommonRequest request){
        return activitiService.setAuthUser(request);
    }

    /**
     * 查看定义的流程图
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/definitionImage")
    CommonResponse definitionImage( CommonRequest request) throws IOException{
        return activitiService.definitionImage(request);
    }

    /**
     * 查看流程进度图
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/getProcessImage")
    CommonResponse getProcessImage( CommonRequest request) throws Exception{
        return activitiService.getProcessImage(request);
    }


    /**
     * 通过任务和变量名称获取变量
     * @param request
     * @return
     */
    @RequestMapping(value = "/queryVariables")
    public CommonResponse queryVariables( CommonRequest request){
        return activitiService.queryVariables(request);
    }


    /**
     * 通过流程id 查询流程
     * @param request
     * @return
     */
    @RequestMapping(value = "/queryProcessInstance")
    CommonResponse queryProcessInstance( CommonRequest request){
        return activitiService.queryProcessInstance(request);
    }


    /**
     * 删除流程
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/deleteProcessInstance")
    CommonResponse deleteProcessInstance( CommonRequest request) throws Exception{
        return activitiService.deleteProcessInstance(request);
    }

    /**
     * 流程部署
     * @param request
     * @return
     */
    @RequestMapping(value = "/deploy")
    CommonResponse deploy( CommonRequest request){
        return activitiService.deploy(request);
    }

    /**
     * 删除部署的流程，级联删除流程实例
     * @param request
     */
    @RequestMapping(value = "/deleteDeployment")
    void deleteDeployment( CommonRequest request){
        activitiService.deleteDeployment(request);
    }

    /**
     * 流程部署列表
     * @param request
     * @return
     */
    @RequestMapping(value = "/deployList")
    CommonResponse deployList( CommonRequest request){
        return activitiService.deployList(request);
    }

    /**
     * 获取部署流程列表
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/getProcessList")
    PageResponse getProcessList( CommonRequest request) throws Exception{
        return activitiService.getProcessList(request);
    }

    /**
     * 挂起流程
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/suspendProcess")
    CommonResponse suspendProcess( CommonRequest request) throws Exception{
        return activitiService.suspendProcess(request);
    }

    /**
     * 激活流程
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/activateProcess")
    CommonResponse activateProcess( CommonRequest request) throws Exception{
        return activitiService.activateProcess(request);
    }

    /**
     * 任务回退
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/rollBackTask")
    CommonResponse rollBackTask( CommonRequest request) throws Exception{
        return activitiService.rollBackTask(request);
    }

}