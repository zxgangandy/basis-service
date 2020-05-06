package io.jingwei.basis.rest.converter.client;


import io.jingwei.base.utils.model.BasicObjectMapper;
import io.jingwei.basis.biz.bo.resp.ClientVersionRespBO;
import io.jingwei.basis.model.dto.resp.ClientVersionResp;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientVersionRespConverter extends BasicObjectMapper<ClientVersionResp, ClientVersionRespBO> {

}
