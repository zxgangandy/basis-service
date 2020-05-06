package io.jingwei.basis.rest.converter.client;



import io.jingwei.base.utils.model.BasicObjectMapper;
import io.jingwei.basis.biz.bo.req.ClientVersionReqBO;
import io.jingwei.basis.model.dto.req.ClientVersionReq;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientVersionReqConverter extends BasicObjectMapper<ClientVersionReq, ClientVersionReqBO> {

}
