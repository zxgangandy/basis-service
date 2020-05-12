package io.jingwei.basis.biz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * APP客户端版本表
 * </p>
 *
 * @author Andy
 * @since 2020-03-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ClientVersion implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 渠道号
     */
    private String channel;

    /**
     * 系统类型：IOS、ANDROID
     */
    private String os;

    /**
     * 语言
     */
    private String lang;

    /**
     * 版本号
     */
    private Integer versionCode;

    /**
     * 版本号名称
     */
    private String versionName;

    /**
     * 下载地址
     */
    private String downloadUrl;

    /**
     * 更新描述
     */
    private String summary;

    /**
     * 是否强制更新：0-否、1-是
     */
    private Boolean forceUpdate;

    /**
     * 状态：WAITING-待审核、APPROVED-审核通过、FAILED-审核失败
     */
    private String auditStatus;

    /**
     * 创建时间
     */
    private LocalDateTime ctime;

    /**
     * 更新时间
     */
    private LocalDateTime utime;


}
