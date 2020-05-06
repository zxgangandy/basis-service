package io.jingwei.basis.biz.bo.req;

import lombok.Data;

@Data
public class ClientVersionReqBO {
    private String os;
    private String channel;
    private Integer version;
}
