package io.jingwei.basis.rest.controller.client;


import io.jingwei.base.utils.model.R;
import io.jingwei.basis.biz.bo.req.ClientVersionReqBO;
import io.jingwei.basis.biz.bo.resp.ClientVersionRespBO;
import io.jingwei.basis.biz.service.IClientVersionService;
import io.jingwei.basis.model.dto.req.ClientVersionReq;
import io.jingwei.basis.model.dto.resp.ClientVersionResp;
import io.jingwei.basis.rest.converter.client.ClientVersionReqConverter;
import io.jingwei.basis.rest.converter.client.ClientVersionRespConverter;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import javax.validation.Valid;

import static io.jingwei.base.utils.constant.ApiConstant.V_1;

/**
 * <p>
 * APP客户端版本表 前端控制器
 * </p>
 *
 * @author Andy
 * @since 2020-03-27
 */
@Controller
@RequestMapping("/client")
@AllArgsConstructor
public class ClientInfoController {
    private final IClientVersionService      clientVersionService;
    private final ClientVersionReqConverter  clientVersionReqConverter;
    private final ClientVersionRespConverter clientVersionRespConverter;

    @PostMapping(V_1 + "/version")
    public R<ClientVersionResp> getClientVersion(@RequestBody @Valid ClientVersionReq req) {
        ClientVersionReqBO   reqBO = clientVersionReqConverter.to(req);
        ClientVersionRespBO respBO = clientVersionService.getClientVersion(reqBO);

        return R.ok(clientVersionRespConverter.from(respBO));
    }

}
