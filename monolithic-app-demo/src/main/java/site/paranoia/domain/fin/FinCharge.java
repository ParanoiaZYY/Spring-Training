package site.paranoia.domain.fin;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName(value = "fin_charge")
@Data
@NoArgsConstructor
public class FinCharge {
    @TableId
    private Integer id;

    /**
     * 账单号billdh
     */
    @TableField(value = "forderId")
    private String forderId;

    /**
     * 业务仓单号/业务流水号
     */
    @TableField(value = "order_no")
    private String orderNo;

    /**
     * 委托客户id
     */
    @TableField(value = "delegation_customer_code")
    private Integer delegationCustomerCode;

    @TableField(value = "business_type")
    private String businessType;

    /**
     * 业务属性 DC=订舱 QD=签单 CD=舱单  关联cd_para attr=ywsx
     */
    @TableField(value = "business_attr")
    private String businessAttr;

    @TableField(value = "invoice_type")
    private String invoiceType;

    /**
     * 揽货人Id
     */
    private String canvasser;

    /**
     * 账单归属人
     */
    @TableField(value = "canvasser_value")
    private String canvasservalue;

    /**
     * 商务人
     */
    @TableField(value = "business_value")
    private String businessvalue;

    /**
     * 复核人
     */
    @TableField(value = "reviewer_value")
    private String reviewervalue;

    /**
     * 复核人
     */
    private String reviewer;

    /**
     * 商务人
     */
    @TableField(value = "business_id")
    private String businessId;

    /**
     * 结费方式 MD-买单 YJ-月结
     */
    @TableField(value = "settlement_method")
    private String settlementMethod;

    /**
     * 冲销标志(B=被冲账单 / R=红冲账单)
     */
    @TableField(value = "write_off_flag")
    private String writeOffFlag;

    /**
     * 红冲对应的billdh(charge id)
     */
    @TableField(value = "write_off_charge_id")
    private String writeOffChargeId;

    /**
     * 审核方案id
     */
    @TableField(value = "audit_process_id")
    private String auditProcessId;

    /**
     * 当前的审核进程 -1=已审批-2=被拒绝 -3=已转账 否则关联 cw_bill_sp的shxh
     */
    @TableField(value = "audit_progress")
    private Integer auditProgress;

    /**
     * 错误审批消息号 关联 cw_bill_sperr的errid
     */
    @TableField(value = "audit_error_id")
    private String auditErrorId;

    /**
     * 上传到账单交换系统的单号
     */
    @TableField(value = "charge_swap_id")
    private String chargeSwapId;

    /**
     * 转帐ID
     */
    @TableField(value = "bank_transfer_id")
    private String bankTransferId;

    /**
     * 冗余字段 转账日期
     */
    @TableField(value = "bank_transfer_date")
    private Date bankTransferDate;

    /**
     * 备注
     */
    private String remark;

    /**
     * wms账单归属期
     */
    @TableField(value = "account_period")
    private Long accountPeriod;

    /**
     * 普通账单和计费账单的标识，0=普通，1=计费账单
     */
    @TableField(value = "order_flag")
    private Integer orderFlag;

    /**
     * 制单人
     */
    private Integer originator;

    /**
     * 归属部门  制单人归属部门？
     */
    private Integer dept;

    @TableField(value = "assist_department")
    private Integer assistDepartment;

    /**
     * 辅助部门名称
     */
    @TableField(value = "assist_department_value")
    private String assistDepartmentvalue;

    /**
     * 揽货类型
     */
    @TableField(value = "canvasser_type")
    private Integer canvasserType;

    /**
     * 所属部门名
     */
    @TableField(value = "dept_value")
    private String deptvalue;

    /**
     * amend账单
     */
    private Integer amend;

    /**
     * 美元应收
     */
    @TableField(value = "dollar_receivable")
    private BigDecimal dollarReceivable;

    /**
     * 美元实收
     */
    @TableField(value = "dollar_receipt")
    private BigDecimal dollarReceipt;

    /**
     * 美元应付
     */
    @TableField(value = "dollar_payable")
    private BigDecimal dollarPayable;

    /**
     * 美元实付
     */
    @TableField(value = "dollar_paid")
    private BigDecimal dollarPaid;

    /**
     * 人民币应收
     */
    @TableField(value = "yuan_receivable")
    private BigDecimal yuanReceivable;

    /**
     * 人民币实收
     */
    @TableField(value = "yuan_receipt")
    private BigDecimal yuanReceipt;

    /**
     * 人民币应付
     */
    @TableField(value = "yuan_payable")
    private BigDecimal yuanPayable;

    /**
     * 人民币实付
     */
    @TableField(value = "yuan_paid")
    private BigDecimal yuanPaid;

    /**
     * 本位币应收
     */
    @TableField(value = "standard_money_receivable")
    private BigDecimal standardMoneyReceivable;

    /**
     * 本位币实收
     */
    @TableField(value = "standard_money_receipt")
    private BigDecimal standardMoneyReceipt;

    /**
     * 本位币应付
     */
    @TableField(value = "standard_money_payable")
    private BigDecimal standardMoneyPayable;

    /**
     * 本位币实付
     */
    @TableField(value = "standard_money_paid")
    private BigDecimal standardMoneyPaid;

    /**
     * 创建人
     */
    @TableField(value = "created_by")
    private Integer createdBy;

    /**
     * 创建时间
     */
    @TableField(value = "created_time")
    private Date createdTime;

    /**
     * 最后修改人
     */
    @TableField(value = "last_modified_by")
    private Integer lastModifiedBy;

    /**
     * 最后修改时间
     */
    @TableField(value = "last_modified_time")
    private Date lastModifiedTime;

    /**
     * 逻辑删除标记
     */
    @TableField(value = "delete_flag")
    @TableLogic
    private Integer deleteFlag;

    /**
     * 版本
     */
    @Version
    private Integer version;
}