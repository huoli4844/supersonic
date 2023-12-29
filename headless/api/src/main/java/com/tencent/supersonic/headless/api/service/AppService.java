package com.tencent.supersonic.headless.api.service;


import com.github.pagehelper.PageInfo;
import com.tencent.supersonic.auth.api.authentication.pojo.User;
import com.tencent.supersonic.headless.common.model.request.AppQueryReq;
import com.tencent.supersonic.headless.common.model.request.AppReq;
import com.tencent.supersonic.headless.common.model.response.AppDetailResp;
import com.tencent.supersonic.headless.common.model.response.AppResp;

public interface AppService {

    AppDetailResp save(AppReq app, User user);

    AppDetailResp update(AppReq app, User user);

    void online(Integer id, User user);

    void offline(Integer id, User user);

    void delete(Integer id, User user);

    PageInfo<AppResp> pageApp(AppQueryReq appQueryReq, User user);

    AppDetailResp getApp(Integer id, User user);

    AppDetailResp getApp(Integer id);
}