/**
 * Copyright (C), 2015-2019  http://www.jd.com
 * FileName: ActivitiOperateDTO
 * Author:   zhanglei1102
 * Date:     2019/12/6 10:14
 * Description: Activiti 工作流操作包装类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.buukle.activiti.plugin.dto;

import java.util.Map;

/**
 * @description 〈Activiti 工作流操作包装类〉
 * @author zhanglei1102
 * @create 2019/12/6
 * @since 1.0.0
 */
public class ActivitiOperateDTO {

    private String userId;
    private String taskId;
    private String taskParamName;
    private String reason;
    private String groupId;
    private int backNum;
    private String processDefinitionId;
    private String deploymentId;
    private String fileName;
    private String category;
    private String processInstanceId;
    private String deleteReason;
    private String processId;
    private Map<String, Object> paramsMap;
    private Map<String, Object> userInfoMap;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskParamName() {
        return taskParamName;
    }

    public void setTaskParamName(String taskParamName) {
        this.taskParamName = taskParamName;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public int getBackNum() {
        return backNum;
    }

    public void setBackNum(int backNum) {
        this.backNum = backNum;
    }

    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getDeleteReason() {
        return deleteReason;
    }

    public void setDeleteReason(String deleteReason) {
        this.deleteReason = deleteReason;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public Map<String, Object> getParamsMap() {
        return paramsMap;
    }

    public void setParamsMap(Map<String, Object> paramsMap) {
        this.paramsMap = paramsMap;
    }

    public Map<String, Object> getUserInfoMap() {
        return userInfoMap;
    }

    public void setUserInfoMap(Map<String, Object> userInfoMap) {
        this.userInfoMap = userInfoMap;
    }
}