package com.wisdom.domain.fin.request;

import com.wisdom.domain.fin.dto.FinChargeDTO;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public class FinChargeSaveRequest {

    @NotNull(message = "账单汇总信息不能为空！")
    @Valid
    private FinChargeDTO finChargeDTO;

    @NotEmpty(message = "账单明细信息不能为空！")
    private List<@Valid FinChargeDTO> finChargeDetailsList;

    private List<@Valid FinChargeDTO> deleteFinChargeDetails;

    public FinChargeDTO getFinChargeDTO() {
        return finChargeDTO;
    }

    public void setFinChargeDTO(FinChargeDTO finChargeDTO) {
        this.finChargeDTO = finChargeDTO;
    }

    public List<FinChargeDTO> getFinChargeDetailsList() {
        return finChargeDetailsList;
    }

    public void setFinChargeDetailsList(List<FinChargeDTO> finChargeDetailsList) {
        this.finChargeDetailsList = finChargeDetailsList;
    }

    public List<FinChargeDTO> getDeleteFinChargeDetails() {
        return deleteFinChargeDetails;
    }

    public void setDeleteFinChargeDetails(List<FinChargeDTO> deleteFinChargeDetails) {
        this.deleteFinChargeDetails = deleteFinChargeDetails;
    }
}
