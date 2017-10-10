package com.module.action;

import net.sf.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.HashMap;
import java.util.Map;

@Path("/getTime")
public class GetCurrentTime {

    @GET
    public String getTime() {
        long time=System.currentTimeMillis();
        Map<String,Object> jsontemp = new HashMap<String,Object>();
        jsontemp.put("time",time);
        JSONObject jsonresult = JSONObject.fromObject(jsontemp);
        return jsonresult.toString();
    }

}

