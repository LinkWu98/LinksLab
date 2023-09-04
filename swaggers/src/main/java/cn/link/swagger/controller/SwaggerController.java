package cn.link.swagger.controller;

import cn.link.swagger.newbie.common.RestResultResponse;
import cn.link.swagger.newbie.retail.BasalDiscParamsDTO;
import cn.link.swagger.newbie.retail.CustomerSaveAndActionDTO;
import cn.link.swagger.newbie.retail.PotentialRecordDto;
import cn.link.swagger.newbie.retail.refund.DepositRefundDTO;
import cn.link.swagger.newbie.retail.refund.FinanceAuditStatusLogVO;
import cn.link.swagger.newbie.retail.refund.FinanceAuditVO;
import cn.link.swagger.newbie.retail.slDeposit.SmallLargeDepositDTO;
import cn.link.swagger.utils.CommonUtils;
import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 90762
 * @version 1.0
 * @date 2023/8/9 下午 6:36
 */
@RestController("swagger")
@Api("swagger用Controller")
public class SwaggerController {

    //@ApiOperation("新增线索潜客")
    //@PostMapping({"/customerBusiness/insertPotenCus"})
    //RestResultResponse<CustomerSaveAndActionDTO> insertPotentialCustomer(@ApiParam(name = "潜客对象", value = "潜客对象", required = true) @RequestBody PotentialRecordDto recordDTO) {
    //    return null;
    //}
    //
    //@ApiOperation(
    //        value = "新增基盘客户",
    //        notes = "新增基盘客户",
    //        httpMethod = "POST"
    //)
    //@PostMapping({"/clueauditDisc/addAuditDists"})
    //RestResultResponse<Long> addAuditDists(@RequestBody List<BasalDiscParamsDTO> basalDiscParamsDTO) {
    //    return null;
    //}
    //
    //@ApiOperation(
    //        value = "根据订单类型查询该类订单是否大小定期间",
    //        notes = "根据订单类型查询该类订单是否大小定期间",
    //        httpMethod = "GET"
    //)
    //@GetMapping(value = "/saleType/{saleType}")
    //@ResponseBody
    //RestResultResponse<SmallLargeDepositDTO> isPeriodBySaleType(@PathVariable(value = "saleType") Integer saleType) {
    //    return null;
    //}
    //
    ///**
    // * 根据订单类型查询对应车型id
    // */
    //@ApiOperation(notes = "根据订单类型查询对应车型id", value = "根据订单类型查询对应车型--PC/APP")
    //@ApiImplicitParam(name = "saleType", value = "订单销售类型", dataType = "Integer", paramType = "query")
    //@GetMapping(value = "/model/saleType/{saleType}")
    //@ResponseBody
    //public RestResultResponse<List<Integer>> getModelIdsBySaleType(@PathVariable(value = "saleType") Integer saleType) {
    //    return null;
    //}

    /**
     * 直售退款审核-待审批
     */
    @ApiOperation(value = "直售退款审核-待审批")
    @PostMapping("/refund/approve")
    public RestResultResponse<IPage<FinanceAuditVO>> refundApprove(@RequestBody DepositRefundDTO depositRefundDto) {
        return null;
    }

    /**
     * 直售退款审核-已审批
     */
    @ApiOperation(value = "直售退款审批列表已审批查询")
    @PostMapping("/refund/approved")
    public RestResultResponse<IPage<FinanceAuditVO>> queryAuditedListBatch(@RequestBody DepositRefundDTO depositRefundDto) {
        return null;
    }


    /**
     * 根据业务单号获取直售退款审批历史列表
     */
    @ApiOperation(value = "根据业务单号获取直售退款审批历史列表")
    @GetMapping(value = "/auditRecord/{id}")
    public RestResultResponse<List<FinanceAuditStatusLogVO>> queryFinanceAuditRecordById(@PathVariable(value = "id") Long id) {
        return null;
    }

}
