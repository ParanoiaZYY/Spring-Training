package site.paranoia.module.fin.mapstruct;

import site.paranoia.module.fin.domain.FinCharge;
import site.paranoia.module.fin.domain.dto.FinChargeDTO;
import site.paranoia.utils.EntityMapper;
import org.mapstruct.Mapper;

/**
 * Mapper for the entity FinCharge and its DTO FinChargeDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface FinChargeMapStruct extends EntityMapper<FinChargeDTO, FinCharge> {

}
