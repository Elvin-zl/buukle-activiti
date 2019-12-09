/**
 * Copyright (C), 2015-2019  http://www.jd.com
 * FileName: ModelQuery
 * Author:   zhanglei1102
 * Date:     2019/12/9 21:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.buukle.activiti.entity.vo;

import top.buukle.common.mvc.BaseQuery;

/**
 * @description 〈〉
 * @author zhanglei1102
 * @create 2019/12/9
 * @since 1.0.0
 */
public class ModelQuery implements BaseQuery {

    /** 当前页码*/
    private Integer page;
    /** 页长*/
    private Integer pageSize;
    /** 起始时间*/
    private String startTime;
    /** 截止时间*/
    private String endTime;
    /** 状态*/
    private String states;

    public Integer getPage() {
        return null == page ? 1 :page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return null == pageSize ? 1000 : pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }
}