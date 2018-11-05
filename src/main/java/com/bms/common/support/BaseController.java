package com.bms.common.support;

import com.bms.common.util.StrUtil;
import net.sf.json.JSONObject;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BaseController {

    protected HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }

    protected HttpServletResponse getResponse() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
    }

    protected HttpSession getSession() {
        return getRequest().getSession();
    }

    protected String getStrParam(String key) {
        return getStrParam(key, "");
    }

    protected String getStrParam(String key, String defaultStr) {
        String param = getRequest().getParameter(key);
        return StrUtil.isEmpty(param) ? defaultStr : param;
    }

    protected int getIntParam(String key) {
        return getIntParam(key, 0);
    }

    protected int getIntParam(String key, int defaultInt) {
        String param = getRequest().getParameter(key);
        return StrUtil.isEmpty(param) ? defaultInt : Integer.valueOf(param);
    }

    protected double getDoubleParam(String key) {
        return getDoubleParam(key, 0);
    }

    protected double getDoubleParam(String key, int defaultDouble) {
        String param = getRequest().getParameter(key);
        return StrUtil.isEmpty(param) ? defaultDouble : Double.valueOf(param);
    }

    protected double getLongParam(String key) {
        return getLongParam(key, 0);
    }

    protected long getLongParam(String key, long defaultLong) {
        String param = getRequest().getParameter(key);
        return StrUtil.isEmpty(param) ? defaultLong : Long.valueOf(param);
    }

    protected String failure(String info) {
        JSONObject json = JSONObject.fromObject("{}");
        json.put("success", 0);
        json.put("info", info);
        return json.toString();
    }

    protected String success() {
        JSONObject json = JSONObject.fromObject("{}");
        json.put("success", 1);
        return json.toString();
    }

    protected String success(JSONObject json) {
        if (json == null) {
            return success();
        }
        json.put("success", 1);
        return json.toString();
    }


}
