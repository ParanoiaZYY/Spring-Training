package site.paranoia.module.fin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import site.paranoia.module.fin.domain.FinCharge;

import java.util.Map;

import site.paranoia.module.fin.domain.dto.FinChargeDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Generator
 * @date 2020-08-19 11:56:14.
 */
@Repository
public interface FinChargeMapper extends BaseMapper<FinCharge> {
    /**
     * selectPage
     * @param map condition
     * @return list
     */
    IPage<FinChargeDTO> selectPage(@Param("map") Map map);
}