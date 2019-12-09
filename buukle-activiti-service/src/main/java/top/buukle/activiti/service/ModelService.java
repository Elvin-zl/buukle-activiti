/**
 * Copyright (C), 2015-2019  http://www.jd.com
 * FileName: ModelService
 * Author:   zhanglei1102
 * Date:     2019/12/9 21:37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.buukle.activiti.service;

import top.buukle.common.call.PageResponse;
import top.buukle.common.mvc.BaseQuery;

/**
 * @description 〈〉
 * @author zhanglei1102
 * @create 2019/12/9
 * @since 1.0.0
 */
public interface ModelService {

    PageResponse getPage(BaseQuery query);

}