package site.paranoia.module.fin.controller;

import java.util.List;


import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.web.bind.annotation.*;

import site.paranoia.module.fin.domain.dto.FinChargeDTO;
import site.paranoia.module.fin.service.FinChargeService;
import site.paranoia.utils.GridPageRequest;
import site.paranoia.utils.Result;

import lombok.RequiredArgsConstructor;

/**
 * 对FinCharge的操作
 *
 *
 * @version        Enter version here..., 17/10/11
 * @author         Enter your name here...
 */
@RestController
@RequestMapping("/api/fin_charge")
@RequiredArgsConstructor
public class FinChargeController {
    private final FinChargeService finChargeService;


    /**
     * 根据主键ID删除
     *
     *
     * @param id {@link Integer }
     *
     * @return {@link Result }
     */
    @DeleteMapping(value = "/{id}")
    public Result deleteByPrimaryKey(@PathVariable Integer id) {
        finChargeService.deleteByPrimaryKey(id);

        return new Result();
    }

    /**
     * 根据主键ID删除多条记录
     *
     *
     * @param ids {@link List<String> }
     *
     * @return {@link Result }
     */
    @DeleteMapping
    public Result deleteMoreByIds(@RequestBody List<String> ids) {
        finChargeService.deleteMore(ids);

        return new Result();
    }

    /**
     * 新增记录
     *
     *
     * @param finChargeDTO {@link FinChargeDTO }
     *
     * @return {@link Result }
     */
    @PostMapping
    public Result insert(@RequestBody FinChargeDTO finChargeDTO) {
        finChargeService.insert(finChargeDTO);

        return new Result();
    }

    /**
     * 根据主键查询记录
     *
     *
     * @param id {@link Integer }
     *
     * @return {@link Result }
     */
    @GetMapping(value = "/{id}")
    public Result selectByPrimaryKey(@PathVariable Integer id) {
        FinChargeDTO finChargeDTO = finChargeService.selectByPrimaryKey(id);

        return new Result(finChargeDTO);
    }

    /**
     * 分页查询记录
     *
     *
     * @param gridPageRequest {@link GridPageRequest }
     *
     * @return {@link Result }
     */
    @PostMapping(value = "/page")
    public Result selectPage(@RequestBody GridPageRequest gridPageRequest) {
        IPage<FinChargeDTO> records = finChargeService.selectPage(gridPageRequest);

        return new Result(records);
    }

    /**
     * 更新记录
     *
     *
     * @param finChargeDTO {@link FinChargeDTO }
     *
     * @return {@link Result }
     */
    @PutMapping
    public Result updateByPrimaryKey(@RequestBody FinChargeDTO finChargeDTO) {
        finChargeService.updateByPrimaryKeySelective(finChargeDTO);

        return new Result();
    }
}
