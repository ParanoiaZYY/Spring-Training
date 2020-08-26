package site.paranoia;

import org.mapstruct.Mapper;

/**
 * Created by Paranoia on 2020/6/24 人间不值得
 **/
@Mapper
public interface SUserMapStruct {
    SUserDTO toDTO(SUser sUser);

    SUser toEntity(SUserDTO sUserDTO);
}
