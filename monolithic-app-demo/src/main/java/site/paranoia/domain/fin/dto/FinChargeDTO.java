package site.paranoia.domain.fin.dto;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FinChargeDTO {
    private Integer id;

    /**
     * 账单号billdh
     */
    private String forderId;

    /**
     * 业务仓单号/业务流水号
     */
    private String orderNo;

    /**
     * 委托客户id
     */
    private Integer delegationCustomerCode;

    private String businessType;

    /**
     * 业务属性 DC=订舱 QD=签单 CD=舱单  关联cd_para attr=ywsx
     */
    private String businessAttr;

    private String invoiceType;

    /**
     * 揽货人Id
     */
    private String canvasser;

    /**
     * 账单归属人
     */
    private String canvasserName;

    /**
     * 商务人
     */
    private String businessName;

    /**
     * 复核人
     */
    private String reviewerName;

    /**
     * 复核人
     */
    private String reviewer;

    /**
     * 商务人
     */
    private String businessId;

    /**
     * 结费方式 MD-买单 YJ-月结
     */
    private String settlementMethod;

    /**
     * 冲销标志(B=被冲账单 / R=红冲账单)
     */
    private String writeOffFlag;

    /**
     * 红冲对应的billdh(charge id)
     */
    private String writeOffChargeId;

    /**
     * 审核方案id
     */
    private String auditProcessId;

    /**
     * 当前的审核进程 -1=已审批-2=被拒绝 -3=已转账 否则关联 cw_bill_sp的shxh
     */
    private Integer auditProgress;

    /**
     * 错误审批消息号 关联 cw_bill_sperr的errid
     */
    private String auditErrorId;

    /**
     * 上传到账单交换系统的单号
     */
    private String chargeSwapId;

    /**
     * 转帐ID
     */
    private String bankTransferId;

    /**
     * 冗余字段 转账日期
     */
    private Date bankTransferDate;

    /**
     * 备注
     */
    private String remark;

    /**
     * wms账单归属期
     */
    private Long accountPeriod;

    /**
     * 普通账单和计费账单的标识，0=普通，1=计费账单
     */
    private Integer orderFlag;

    /**
     * 制单人
     */
    private Integer originator;

    /**
     * 归属部门  制单人归属部门？
     */
    private Integer dept;

    private Integer assistDepartment;

    /**
     * 辅助部门名称
     */
    private String assistDepartmentName;

    /**
     * 揽货类型
     */
    private Integer canvasserType;

    /**
     * 所属部门名
     */
    private String deptName;

    /**
     * amend账单
     */
    private Integer amend;

    /**
     * 美元应收
     */
    private BigDecimal dollarReceivable;

    /**
     * 美元实收
     */
    private BigDecimal dollarReceipt;

    /**
     * 美元应付
     */
    private BigDecimal dollarPayable;

    /**
     * 美元实付
     */
    private BigDecimal dollarPaid;

    /**
     * 人民币应收
     */
    private BigDecimal yuanReceivable;

    /**
     * 人民币实收
     */
    private BigDecimal yuanReceipt;

    /**
     * 人民币应付
     */
    private BigDecimal yuanPayable;

    /**
     * 人民币实付
     */
    private BigDecimal yuanPaid;

    /**
     * 本位币应收
     */
    private BigDecimal standardMoneyReceivable;

    /**
     * 本位币实收
     */
    private BigDecimal standardMoneyReceipt;

    /**
     * 本位币应付
     */
    private BigDecimal standardMoneyPayable;

    /**
     * 本位币实付
     */
    private BigDecimal standardMoneyPaid;

    /**
     * 创建人
     */
    private Integer createdBy;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 最后修改人
     */
    private Integer lastModifiedBy;

    /**
     * 最后修改时间
     */
    private Date lastModifiedTime;

    /**
     * 逻辑删除标记
     */
    private Integer deleteFlag;

    /**
     * 版本
     */
    private Integer version;
}