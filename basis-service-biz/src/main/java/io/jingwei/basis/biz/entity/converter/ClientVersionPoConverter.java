package io.jingwei.basis.biz.entity.converter;



import io.jingwei.base.utils.model.BasicObjectMapper;
import io.jingwei.basis.biz.bo.resp.ClientVersionRespBO;
import io.jingwei.basis.biz.entity.ClientVersion;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientVersionPoConverter extends BasicObjectMapper<ClientVersion, ClientVersionRespBO> {

}
