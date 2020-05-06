package io.jingwei.basis.model.dto.resp;

//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@ApiModel
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SystemTimeResp {

    /**
     * 更新描述
     */
    //@ApiModelProperty(value = "系统时间")
    private long systemTime;

}
