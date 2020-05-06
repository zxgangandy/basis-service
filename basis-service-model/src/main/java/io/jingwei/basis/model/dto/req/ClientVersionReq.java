package io.jingwei.basis.model.dto.req;

//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

//@ApiModel
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientVersionReq {

    /**
     * 版本号
     */
    //@ApiModelProperty(value = "版本号")
    @NotNull
    private Integer version;

    /**
     * 系统
     */
    //@ApiModelProperty(value = "系统")
    @NotNull
    private Integer os;
}
