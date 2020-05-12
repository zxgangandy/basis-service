package io.jingwei.basis.biz.service;

import io.jingwei.basis.biz.bo.req.ClientVersionReqBO;
import io.jingwei.basis.biz.bo.resp.ClientVersionRespBO;
import io.jingwei.basis.biz.entity.ClientVersion;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * APP客户端版本表 服务类
 * </p>
 *
 * @author Andy
 * @since 2020-03-27
 */
public interface IClientVersionService extends IService<ClientVersion> {
    ClientVersionRespBO getClientVersion(ClientVersionReqBO req);
}
