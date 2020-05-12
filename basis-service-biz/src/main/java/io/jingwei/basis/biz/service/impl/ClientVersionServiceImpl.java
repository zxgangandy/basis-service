package io.jingwei.basis.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.jingwei.basis.biz.bo.req.ClientVersionReqBO;
import io.jingwei.basis.biz.bo.resp.ClientVersionRespBO;
import io.jingwei.basis.biz.entity.ClientVersion;
import io.jingwei.basis.biz.mapper.ClientVersionMapper;
import io.jingwei.basis.biz.service.IClientVersionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;
import java.util.Objects;

import static io.jingwei.base.utils.exception.LocalUtils.getLocale;
import static io.jingwei.basis.biz.constant.ClientVersionAuditStatus.APPROVED;
import static io.jingwei.basis.biz.support.ClientVersionUtils.hasUpdate;
import static io.jingwei.basis.biz.support.ClientVersionUtils.noUpdate;

/**
 * <p>
 * APP客户端版本表 服务实现类
 * </p>
 *
 * @author Andy
 * @since 2020-03-27
 */
@Service
public class ClientVersionServiceImpl extends ServiceImpl<ClientVersionMapper, ClientVersion> implements IClientVersionService {

    @Autowired
    private HttpServletRequest request;

    @Override
    public ClientVersionRespBO getClientVersion(ClientVersionReqBO req) {
        Locale locale = getLocale(request);

        QueryWrapper<ClientVersion> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(ClientVersion::getChannel, req.getChannel())
                .eq(ClientVersion::getOs, req.getOs())
                .eq(ClientVersion::getLang, locale.toLanguageTag())
                .eq(ClientVersion::getAuditStatus, APPROVED.getStatus());

        ClientVersion oldVersion = getOne(queryWrapper);
        return Objects.nonNull(oldVersion) ? hasUpdate(req, oldVersion) : noUpdate();
    }


}
