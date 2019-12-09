/**
 * Copyright (C), 2015-2019  http://www.jd.com
 * FileName: ActivitiService
 * Author:   zhanglei1102
 * Date:     2019/12/6 11:08
 * Description: 流程service
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.buukle.activiti.service;

import top.buukle.common.call.CommonRequest;
import top.buukle.common.call.CommonResponse;
import top.buukle.common.call.PageResponse;

/**
 * @description 〈流程service〉
 * @author zhanglei1102
 * @create 2019/12/6
 * @since 1.0.0
 */
public interface ActivitiService {

    CommonResponse startProcess(CommonRequest request);

    CommonResponse complete(CommonRequest request);

    CommonResponse queryTaskByProcessId(CommonRequest request);

    CommonResponse queryTaskById(CommonRequest request);

    CommonResponse addCandidateGroup(CommonRequest request);

    CommonResponse claim(CommonRequest request);

    CommonResponse setAuthUser(CommonRequest request);

    CommonResponse definitionImage(CommonRequest request);

    CommonResponse getProcessImage(CommonRequest request);

    CommonResponse queryVariables(CommonRequest request);

    CommonResponse queryProcessInstance(CommonRequest request);

    CommonResponse deleteProcessInstance(CommonRequest request);

    CommonResponse deploy(CommonRequest request);

    void deleteDeployment(CommonRequest request);

    CommonResponse deployList(CommonRequest request);

    PageResponse getProcessList(CommonRequest request);

    CommonResponse suspendProcess(CommonRequest request);

    CommonResponse activateProcess(CommonRequest request);

    CommonResponse rollBackTask(CommonRequest request);
}