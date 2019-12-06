package top.buukle.activiti.plugin.invoker;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import top.buukle.common.call.CommonRequest;
import top.buukle.common.call.CommonResponse;

import java.io.IOException;

/**
 * @Author elvin
 * @Date Created by elvin on 2018/10/1.
 * @Description : activiti FeignClient代理执行层对象
 */
@FeignClient(name = "${spring.activiti.server.name}")
public interface ActivitiInvoker {

    /**
     * @description 启动流程
     * @param request
     * @return top.buukle.common.call.CommonResponse
     * @Author zhanglei1102
     * @Date 2019/12/6
     */
    @PostMapping(value = "/api/app/startProcess")
    CommonResponse startProcess(@RequestBody CommonRequest request) throws Exception;

    /**
     * 完成任务
     * @param request
     * @return
     */
    @PostMapping(value = "/api/app/complete")
    CommonResponse complete(@RequestBody CommonRequest request);

    /**
     * 通过流程id 查询任务
     * @param request
     * @return
     */
    @PostMapping(value = "/api/app/queryTaskByProcessId")
    CommonResponse queryTaskByProcessId(@RequestBody CommonRequest request);

    /**
     * 通过任务id，查询任务信息
     * @param request
     * @return
     */
    @PostMapping(value = "/api/app/queryTaskById")
    CommonResponse queryTaskById(@RequestBody CommonRequest request);

    /**
     * 设置任务认领组
     * @param request
     * @return
     */
    @PostMapping(value = "/api/app/addCandidateGroup")
    CommonResponse addCandidateGroup(@RequestBody CommonRequest request);


    /**
     * 认领任务
     * @param request
     * @return
     */
    @PostMapping(value = "/api/app/claim")
    CommonResponse claim(@RequestBody CommonRequest request);

    /**
     * 设置认证用户，用于定义流程启动人
     * @param request
     * @return
     */
    @PostMapping(value = "/api/app/setAuthUser")
    CommonResponse setAuthUser(@RequestBody CommonRequest request);

    /**
     * 查看定义的流程图
     * @param request
     * @return
     * @throws IOException
     */
    @PostMapping(value = "/api/app/definitionImage")
    CommonResponse definitionImage(@RequestBody CommonRequest request) throws IOException;

    /**
     * 查看流程进度图
     * @param request
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/api/app/getProcessImage")
    CommonResponse getProcessImage(@RequestBody CommonRequest request) throws Exception;


    /**
     * 通过任务和变量名称获取变量
     * @param request
     * @return
     */
    @PostMapping(value = "/api/app/queryVariables")
    public CommonResponse queryVariables(@RequestBody CommonRequest request);


    /**
     * 通过流程id 查询流程
     * @param request
     * @return
     */
    @PostMapping(value = "/api/app/queryProcessInstance")
    CommonResponse queryProcessInstance(@RequestBody CommonRequest request);


    /**
     * 删除流程
     * @param request
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/api/app/deleteProcessInstance")
    CommonResponse deleteProcessInstance(@RequestBody CommonRequest request) throws Exception;

    /**
     * 流程部署
     * @param request
     * @return
     */
    @PostMapping(value = "/api/app/deploy")
    CommonResponse deploy(@RequestBody CommonRequest request);

    /**
     * 删除部署的流程，级联删除流程实例
     * @param request
     */
    @PostMapping(value = "/api/app/deleteDeployment")
    void deleteDeployment(@RequestBody CommonRequest request);

    /**
     * 流程部署列表
     * @param request
     * @return
     */
    @PostMapping(value = "/api/app/deployList")
    CommonResponse deployList(@RequestBody CommonRequest request);

    /**
     * 获取部署流程列表
     * @param request
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/api/app/getProcessList")
    CommonResponse getProcessList(@RequestBody CommonRequest request) throws Exception;

    /**
     * 挂起流程
     * @param request
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/api/app/suspendProcess")
    CommonResponse suspendProcess(@RequestBody CommonRequest request) throws Exception;

    /**
     * 激活流程
     * @param request
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/api/app/activateProcess")
    CommonResponse activateProcess(@RequestBody CommonRequest request) throws Exception;

    /**
     * 任务回退
     * @param request
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/api/app/rollBackTask")
     CommonResponse rollBackTask(@RequestBody CommonRequest request) throws Exception;

}
