/**
 * Copyright (C), 2015-2019  http://www.jd.com
 * FileName: ActivitiClient
 * Author:   zhanglei1102
 * Date:     2019/12/6 10:57
 * Description: activiti 客户端
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.buukle.activiti.plugin.client;

import top.buukle.activiti.plugin.invoker.ActivitiInvoker;
import top.buukle.common.call.CommonRequest;
import top.buukle.common.call.CommonResponse;
import top.buukle.util.SpringContextUtil;

import java.io.IOException;

/**
 * @description 〈activiti 客户端〉
 * @author zhanglei1102
 * @create 2019/12/6
 * @since 1.0.0
 * @referce https://github.com/bijialin/spring-boot/blob/master/activiti/src/main/java/com/nickbi/activiti/service/impl/ActivitiServiceImpl.java
 */
public class ActivitiClient {

    /**
     * @description 启动流程
     * @param request
     * @return top.buukle.common.call.CommonResponse
     * @Author zhanglei1102
     * @Date 2019/12/6
     */
    public static CommonResponse startProcess(CommonRequest request) throws Exception{
        return SpringContextUtil.getBean(ActivitiInvoker.class).startProcess(request);
    }

    /**
     * 完成任务
     * @param request
     * @return
     */
    public static CommonResponse complete(CommonRequest request){
        return SpringContextUtil.getBean(ActivitiInvoker.class).complete(request);
    }

    /**
     * 通过流程id 查询任务
     * @param request
     * @return
     */
    public static CommonResponse queryTaskByProcessId(CommonRequest request){
        return SpringContextUtil.getBean(ActivitiInvoker.class).queryTaskByProcessId(request);
    }

    /**
     * 通过任务id，查询任务信息
     * @param request
     * @return
     */
    public static CommonResponse queryTaskById(CommonRequest request){
        return SpringContextUtil.getBean(ActivitiInvoker.class).queryTaskById(request);
    }

    /**
     * 设置任务认领组
     * @param request
     * @return
     */
    public static CommonResponse addCandidateGroup(CommonRequest request){
        return SpringContextUtil.getBean(ActivitiInvoker.class).addCandidateGroup(request);
    }


    /**
     * 认领任务
     * @param request
     * @return
     */
    public static CommonResponse claim(CommonRequest request){
        return SpringContextUtil.getBean(ActivitiInvoker.class).claim(request);
    }

    /**
     * 设置认证用户，用于定义流程启动人
     * @param request
     * @return
     */
    public static CommonResponse setAuthUser(CommonRequest request){
        return SpringContextUtil.getBean(ActivitiInvoker.class).setAuthUser(request);
    }

    /**
     * 查看定义的流程图
     * @param request
     * @return
     * @throws IOException
     */
    public static CommonResponse definitionImage(CommonRequest request) throws IOException{
        return SpringContextUtil.getBean(ActivitiInvoker.class).definitionImage(request);
    }

    /**
     * 查看流程进度图
     * @param request
     * @return
     * @throws Exception
     */
    public static CommonResponse getProcessImage(CommonRequest request) throws Exception{
        return SpringContextUtil.getBean(ActivitiInvoker.class).getProcessImage(request);
    }


    /**
     * 通过任务和变量名称获取变量
     * @param request
     * @return
     */
    public CommonResponse queryVariables(CommonRequest request){
        return SpringContextUtil.getBean(ActivitiInvoker.class).queryVariables(request);
    }


    /**
     * 通过流程id 查询流程
     * @param request
     * @return
     */
    public static CommonResponse queryProcessInstance(CommonRequest request){
        return SpringContextUtil.getBean(ActivitiInvoker.class).queryProcessInstance(request);
    }


    /**
     * 删除流程
     * @param request
     * @return
     * @throws Exception
     */
    public static CommonResponse deleteProcessInstance(CommonRequest request) throws Exception{
        return SpringContextUtil.getBean(ActivitiInvoker.class).deleteProcessInstance(request);
    }

    /**
     * 流程部署
     * @param request
     * @return
     */
    public static CommonResponse deploy(CommonRequest request){
        return SpringContextUtil.getBean(ActivitiInvoker.class).deploy(request);
    }

    /**
     * 删除部署的流程，级联删除流程实例
     * @param request
     */
    void deleteDeployment(CommonRequest request){
          SpringContextUtil.getBean(ActivitiInvoker.class).deleteDeployment(request);
    }

    /**
     * 流程部署列表
     * @param request
     * @return
     */
    public static CommonResponse deployList(CommonRequest request){
        return SpringContextUtil.getBean(ActivitiInvoker.class).deployList(request);
    }

    /**
     * 获取部署流程列表
     * @param request
     * @return
     * @throws Exception
     */
    public static CommonResponse getProcessList(CommonRequest request) throws Exception{
        return SpringContextUtil.getBean(ActivitiInvoker.class).getProcessList(request);
    }

    /**
     * 挂起流程
     * @param request
     * @return
     * @throws Exception
     */
    public static CommonResponse suspendProcess(CommonRequest request) throws Exception{
        return SpringContextUtil.getBean(ActivitiInvoker.class).suspendProcess(request);
    }

    /**
     * 激活流程
     * @param request
     * @return
     * @throws Exception
     */
    public static CommonResponse activateProcess(CommonRequest request) throws Exception{
        return SpringContextUtil.getBean(ActivitiInvoker.class).activateProcess(request);
    }

    /**
     * 任务回退
     * @param request
     * @return
     * @throws Exception
     */
    public static CommonResponse rollBackTask(CommonRequest request) throws Exception{
        return SpringContextUtil.getBean(ActivitiInvoker.class).rollBackTask(request);
    }

}