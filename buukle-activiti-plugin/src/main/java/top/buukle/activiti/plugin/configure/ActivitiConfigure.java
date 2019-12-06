/**
 * Copyright (C), 2015-2019  http://www.jd.com
 * FileName: ActivitiConfigure
 * Author:   zhanglei1102
 * Date:     2019/12/6 11:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.buukle.activiti.plugin.configure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import top.buukle.activiti.plugin.invoker.ActivitiInvoker;

/**
 * @description 〈〉
 * @author zhanglei1102
 * @create 2019/12/6
 * @since 1.0.0
 */
@Configuration
public class ActivitiConfigure {

    @Autowired
    private ActivitiInvoker activitiInvoker;

}