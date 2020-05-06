package io.jingwei.basis.biz.support;

import io.jingwei.basis.biz.bo.req.ClientVersionReqBO;
import io.jingwei.basis.biz.bo.resp.ClientVersionRespBO;
import io.jingwei.basis.biz.entity.ClientVersion;

public class ClientVersionUtils {

    public static ClientVersionRespBO hasUpdate(ClientVersionReqBO req, ClientVersion oldVersion) {
        return ClientVersionRespBO.builder()
                .update(oldVersion.getVersionCode().compareTo(req.getVersion()) > 0)
                .downloadUrl(oldVersion.getDownloadUrl())
                .forcedUpdate(oldVersion.getForceUpdate())
                .newVersion(oldVersion.getVersionName())
                .summary(oldVersion.getSummary())
                .build();
    }

    public static ClientVersionRespBO noUpdate() {
        return ClientVersionRespBO.builder()
                .update(false)
                .build();
    }
}
