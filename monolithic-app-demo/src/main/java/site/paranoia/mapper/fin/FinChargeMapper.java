package site.paranoia.mapper.fin;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import site.paranoia.domain.fin.FinCharge;

import java.util.Map;

import site.paranoia.domain.fin.dto.FinChargeDTO;
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