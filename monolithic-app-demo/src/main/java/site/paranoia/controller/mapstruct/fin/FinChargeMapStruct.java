package site.paranoia.controller.mapstruct.fin;

import site.paranoia.domain.fin.FinCharge;
import site.paranoia.domain.fin.dto.FinChargeDTO;
import site.paranoia.utils.EntityMapper;
import org.mapstruct.Mapper;

/**
 * Mapper for the entity FinCharge and its DTO FinChargeDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface FinChargeMapStruct extends EntityMapper<FinChargeDTO, FinCharge> {

}
