package com.perenc.xh.lsp.controller.admin.urlLog;

import com.perenc.xh.commonUtils.model.DataCodeUtil;
import com.perenc.xh.commonUtils.model.ReturnJsonData;
import com.perenc.xh.commonUtils.model.mongoPage.PageHelper;
import com.perenc.xh.lsp.entity.operLog.OperLog;
import com.perenc.xh.lsp.service.urlLog.UrlLogService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("urlLog")
public class AdminUrlLogController {

    @Autowired(required = false)
    private UrlLogService urlLogService;



    /**
     * 根据Id查询
     * @return
     */
    @ResponseBody
    @RequestMapping("/getById")
    @OperLog(operationType="访问日志",operationName="单个查询")
    public ReturnJsonData getById(HttpServletRequest request, HttpServletResponse response)throws Exception {
        String id = ServletRequestUtils.getStringParameter(request, "id", "");
        if(StringUtils.isNotEmpty(id)) {
            return urlLogService.getById(id);
        }else {
            return new ReturnJsonData(DataCodeUtil.PARAM_ERROR,"传入Id为空",null);
        }
    }


    /**
     * 后台列表
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping("page")
    @ResponseBody
    @OperLog(operationType="访问日志",operationName="列表查询")
    public ReturnJsonData page(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> condition = new HashMap<>();
        String requestUrl = ServletRequestUtils.getStringParameter(request, "requestUrl", "");
        if (StringUtils.isNotEmpty(requestUrl)) {
            condition.put("requestUrl", requestUrl);
        }
        //创建开始时间
        String startTime = ServletRequestUtils.getStringParameter(request, "startTime", "");
        if (StringUtils.isNotEmpty(startTime)) {
            condition.put("startTime", startTime);
        }
        //创建结束时间
        String endTime = ServletRequestUtils.getStringParameter(request, "endTime", "");
        if (StringUtils.isNotEmpty(endTime)) {
            condition.put("endTime", endTime);
        }
        int current = ServletRequestUtils.getIntParameter(request, "current", 1);
        int pageSize = ServletRequestUtils.getIntParameter(request, "pageSize", PageHelper.pageSize);
        PageHelper pageHelper = new PageHelper();
        pageHelper.setPage(current);
        pageHelper.setRows(pageSize);
        return urlLogService.getList(condition,pageHelper);
    }



}
