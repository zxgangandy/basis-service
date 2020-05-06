package io.jingwei.basis.rest.controller.client;


import io.jingwei.base.utils.model.R;
import io.jingwei.basis.biz.service.ISystemService;
import io.jingwei.basis.model.dto.resp.SystemTimeResp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static io.jingwei.base.utils.constant.ApiConstant.V_1;

/**
 * <p>
 * 系统信息控制器
 * </p>
 *
 * @author Andy
 * @since 2020-03-27
 */
@Controller
@RequestMapping("/system")
@AllArgsConstructor
public class SystemInfoController {
    private final ISystemService systemService;

    @GetMapping(V_1 + "/time")
    public R<SystemTimeResp> getClientVersion() {
        long systemTime = systemService.getSystemTime();
        return R.ok(SystemTimeResp.builder().systemTime(systemTime).build());
    }

}
