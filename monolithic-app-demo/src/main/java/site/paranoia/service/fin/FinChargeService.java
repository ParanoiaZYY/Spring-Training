package site.paranoia.service.fin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import site.paranoia.controller.mapstruct.fin.FinChargeMapStruct;
import site.paranoia.domain.fin.FinCharge;
import site.paranoia.domain.fin.dto.FinChargeDTO;
import site.paranoia.mapper.fin.FinChargeMapper;
import site.paranoia.security.SecurityUtils;
import com.wisdom.utils.*;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import site.paranoia.utils.*;

@Service
@Transactional(rollbackFor = Exception.class)
@RequiredArgsConstructor
@Slf4j
public class FinChargeService {
    private final FinChargeMapper finChargeMapper;
    private final FinChargeMapStruct finChargeMapStruct;


    /**
     * 写入记录
     *
     *
     * @param record {@link FinChargeDTO }
     *
     * @return int
     */
    public int insert(FinChargeDTO record) {
        FinCharge finCharge = finChargeMapStruct.toEntity(record);

        Integer userId = SecurityUtils.getCurrentUserId();
        finCharge.setDeleteFlag(DeleteFlagEnum.NOT_DELETED.getStatus());
        finCharge.setCreatedTime(new Date());
        finCharge.setCreatedBy(userId);
        finCharge.setLastModifiedBy(userId);
        finCharge.setLastModifiedTime(new Date());

        int num = finChargeMapper.insert(finCharge);
        Preconditions.checkArgument(num > 0, ApplicationErrorEnum.COMMON_FAIL);

        return num;
    }

    /**
     * 批量写入记录
     *
     *
     * @param records {@link List<FinChargeDTO> }
     *
     * @return int
     */
    public int insertBatch(List<FinChargeDTO> records) {
        List<FinCharge> recordList = finChargeMapStruct.toEntity(records);

        Integer userId = SecurityUtils.getCurrentUserId();
        recordList.forEach(record -> {
            record.setDeleteFlag(DeleteFlagEnum.NOT_DELETED.getStatus());
            record.setCreatedTime(new Date());
            record.setCreatedBy(userId);
            record.setLastModifiedBy(userId);
            record.setLastModifiedTime(new Date());
            int num = finChargeMapper.insert(record);
            Preconditions.checkArgument(1 == num, ApplicationErrorEnum.COMMON_FAIL);
        });
//        int num = finChargeMapper.insertList(recordList);
        return 1;
    }

    /**
     * 根据主键-ID查询
     *
     *
     * @param id {@link Integer }
     *
     * @return {@link FinChargeDTO }
     */
    public FinChargeDTO selectByPrimaryKey(Integer id) {

        FinCharge finCharge = finChargeMapper.selectById(id);
        Preconditions.checkNotNull(finCharge, ApplicationErrorEnum.COMMON_DATA_NOT_FOUND);

        return finChargeMapStruct.toDto(finCharge);
    }

    /**
     * 根据字段选择性查询
     *
     *
     * @param record {@link FinChargeDTO }
     *
     * @return {@link List<FinChargeDTO> }
     */
    public List<FinChargeDTO> selectSelective(FinChargeDTO record) {
        FinCharge finCharge = finChargeMapStruct.toEntity(record);

        List<FinCharge> finChargeList = finChargeMapper.selectList(new QueryWrapper<>(finCharge));
        return finChargeMapStruct.toDto(finChargeList);
    }

    /**
     * 根据主键选择性更新
     *
     *
     * @param record {@link FinChargeDTO }
     *
     * @return int
     */
    public int updateByPrimaryKeySelective(FinChargeDTO record) {
        FinCharge finCharge = finChargeMapStruct.toEntity(record);

        Integer userId = SecurityUtils.getCurrentUserId();
        finCharge.setLastModifiedBy(userId);
        finCharge.setLastModifiedTime(new Date());

        int num = finChargeMapper.updateById(finCharge);
        Preconditions.checkArgument(num == 1, ApplicationErrorEnum.COMMON_FAIL);

        return num;
    }

    /**
     * 根据主键删除记录
     *
     *
     * @param id {@link Integer }
     *
     * @return int
     */
    public int deleteByPrimaryKey(Integer id) {
        int num = finChargeMapper.deleteById(id);
        Preconditions.checkArgument(num == 1, ApplicationErrorEnum.COMMON_FAIL);

        return num;
    }

    /**
     * 根据主键逻辑删除记录
     *
     *
     * @param id {@link Integer }
     *
     * @return int
     */
    public int deleteLogicByPrimaryKey(Integer id) {
        return finChargeMapper.deleteById(id);
    }

    /**
     * 根据主键删除多条记录
     *
     *
     * @param ids {@link List<String> }
     *
     * @return int
     */
    public int deleteMore(List<String> ids){
        return finChargeMapper.deleteBatchIds(ids);
    }

    /**
     * 根据主键逻辑删除多条记录
     *
     *
     * @param ids {@link List<String> }
     *
     * @return int
     */
    public int deleteMoreLogic(List<String> ids){
        return finChargeMapper.deleteBatchIds(ids);
    }

    /**
     * 根据条件分页查询
     *
     *
     * @param gridPageRequest {@link GridPageRequest }
     *
     * @return {@link GridReturnData<FinChargeDTO> }
     */
    public IPage<FinChargeDTO> selectPage(GridPageRequest gridPageRequest){
        List<GridFilterInfo> filterList = gridPageRequest.getFilterList();
        Map<String, Object> map = new HashMap<>(2);
        filterList.forEach(gridFilterInfo -> {
            if(gridFilterInfo.getFilterKey() != null && gridFilterInfo.getFilterValue() != null){
                map.put(gridFilterInfo.getFilterKey(), gridFilterInfo.getFilterValue());
            }
        });
        map.put("searchKey", gridPageRequest.getSearchKey());
        // 对map中的参数的合法性进行校验

        String sortMyBatisByString = gridPageRequest.getSortMybatisString();

        IPage<FinChargeDTO> list = finChargeMapper.selectPage(map);
        return list;
    }
}
