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
public class ClientVersionResp {

    /**
     * 是否更新
     */
    //@ApiModelProperty(value = "是否更新")
    private boolean update;
    /**
     * 是否强制更新
     */
    //@ApiModelProperty(value = "是否强制更新")
    private boolean forcedUpdate;
    /**
     * 最新版本
     */
    //@ApiModelProperty(value = "最新版本")
    private String newVersion;
    /***
     * 下载地址
     */
    //@ApiModelProperty(value = "下载地址")
    private String downloadUrl;
    /**
     * 更新描述
     */
    //@ApiModelProperty(value = "更新描述")
    private String summary;

}
