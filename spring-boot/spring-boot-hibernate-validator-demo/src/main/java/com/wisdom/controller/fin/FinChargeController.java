package com.wisdom.controller.fin;

import java.util.List;


import com.wisdom.domain.Result;
import com.wisdom.domain.fin.request.FinChargeSaveRequest;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

import javax.validation.Valid;

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

    @PostMapping(value = "/saveFinancialOrder")
    public Result saveFinancialOrder(@RequestBody @Valid FinChargeSaveRequest finChargeSaveRequest, BindingResult result) {
        if (result.hasErrors()) {
            return new Result(400, result.getAllErrors().get(0).getDefaultMessage(), result.getAllErrors());
        }
        return new Result(200, "OK");
    }
}
