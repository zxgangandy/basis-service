package io.jingwei.basis.biz.bo.resp;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientVersionRespBO {
    /**
     * 是否更新
     */
    private boolean update;
    /**
     * 是否强制更新
     */
    private boolean forcedUpdate;
    /**
     * 最新版本
     */
    private String newVersion;
    /***
     * 下载地址
     */
    private String downloadUrl;
    /**
     * 更新描述
     */
    private String summary;
}
