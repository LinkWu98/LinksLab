package cn.link.swagger.controller;

import cn.link.swagger.newbie.common.RestResultResponse;
import cn.link.swagger.newbie.retail.ConfirmDeliveryReqDto;
import cn.link.swagger.newbie.retail.OemImportSalesOrderExcelVO;
import cn.link.swagger.newbie.retail.OemRetailOrderCreateDTO;
import cn.link.swagger.newbie.retail.importClazz.ImportResultDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.junit.Test;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.ArrayList;
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

    ///**
    // * 直售退款审核-待审批
    // */
    //@ApiOperation(value = "直售退款审核-待审批")
    //@PostMapping("/refund/approve")
    //public RestResultResponse<IPage<FinanceAuditVO>> refundApprove(@RequestBody DepositRefundDTO depositRefundDto) {
    //    return null;
    //}
    //
    ///**
    // * 直售退款审核-已审批
    // */
    //@ApiOperation(value = "直售退款审批列表已审批查询")
    //@PostMapping("/refund/approved")
    //public RestResultResponse<IPage<FinanceAuditVO>> queryAuditedListBatch(@RequestBody DepositRefundDTO depositRefundDto) {
    //    return null;
    //}
    //
    //
    ///**
    // * 根据业务单号获取直售退款审批历史列表
    // */
    //@ApiOperation(value = "根据业务单号获取直售退款审批历史列表")
    //@GetMapping(value = "/auditRecord/{id}")
    //public RestResultResponse<List<FinanceAuditStatusLogVO>> queryFinanceAuditRecordById(@PathVariable(value = "id") Long id) {
    //    return null;
    //}

    //@ApiOperation(value = "客户订单查询—(导出使用)-支持批量查询")
    //@PostMapping("/getSalesRetailOrder")
    //public IPage<PageManufacturerVO> getSalesRetailOrderBatch(@RequestBody QueryRetailOrderDTO retailOrderDTO) {
    //    return null;
    //}

    ///**
    // * 预售订单，C端支付大定后，小转大完善订单信息
    // */
    //@ApiOperation(value = "预售订单，C端支付大定后，小转大完善订单信息")
    //@ApiImplicitParams({
    //            @ApiImplicitParam(name = "modifyC40OrderDTO", value = "完善订单信息所需参数", required = true, dataType = "UpdatePresaleOrderDTO", paramType = "body")
    //})
    //@PostMapping("/updatePreSaleOrder")
    //public RestResultResponse<AppletDataResponse> updatePreSaleOrder(@RequestBody @Validated UpdatePresaleOrderDTO updatePresaleOrderDTO) {
    //    return null;
    //}

    /**
     * @description 交车管理查询--APP
     * @param deliveryManageAppDTO
     * @return
     */
    //@ApiOperation(value = "交车管理查询--APP")
    //@PostMapping(value = "/ordermanage/retailOrders/qryDeliveryManageAppPage")
    //public IPage<DeliveryManageVO> qryDeliveryManageAppPageBatch(@RequestBody DeliveryManageAppDTO deliveryManageAppDTO) {
    //    return null;
    //
    //}

    /**
     * 交车操作--APP/PC
     * @param salesOrdersDTO
     * @return Integer
     * @author xuxiaoyang
     * @since 2020-06-29
     */
    //@ApiOperation(value = "交车上报")
    //@PostMapping(value = "/deliveryVehicle")
    //public RestResultResponse<Integer> deliveryVehicle(@RequestBody SalesOrdersDTO salesOrdersDTO) {
    //    return null;
    //}
//    @ApiOperation(value = "根据经销商代码和主体代码，查询POS机")
//    @GetMapping("/getPos/{dealerCode}")
//    public RestResultResponse<List<String>> savePayment(@ApiParam(name = "dealerCode", value = "经销商code") @PathVariable("dealerCode") String dealerCode,
//                                                        @ApiParam(name = "mainType", value = "主体类型") @RequestParam(value = "mainType", required = false) Integer mainType) {
//        return null;
//    }

//    @ApiOperation(value = "根据经销商代码和主体代码，查询POS机")
//    @GetMapping("/getPos/{dealerCode}")
//    public RestResultResponse<List<String>> savePayment(@ApiParam(name = "dealerCode", value = "经销商code") @PathVariable("dealerCode") String dealerCode,
//                                                        @ApiParam(name = "mainType", value = "主体类型") @RequestParam(value = "mainType", required = false) Integer mainType) {
//        return null;
//    }

    ///**
    // * 直售交车上报，更新交车资料，开启审批流
    // *
    // * @param salesOrdersDTO
    // * @return
    // */
    //@ApiOperation(value = "直售交车上报")
    //@PostMapping(value = "/directSaleDeliveryVehicle")
    //public RestResultResponse<Object> directSaleDeliveryVehicle(@RequestParam(value = "param1", required = false) Integer param1) {
    //    System.out.println(param1);
    //    return null;
    //}
    //@ApiOperation(value = "确认交车确认函")
    //@PostMapping("/confirmDeliveryInvitation")
    //public RestResultResponse<Integer> confirmDeliveryInvitation(@RequestBody ConfirmDeliveryReqDto confirmDeliveryReqDto) {
    //    return null;
    //}
    //
    //@ApiOperation(value = "查询交车确认函")
    //@GetMapping("/getConfirmDeliveryInvitation")
    //public RestResultResponse<ConfirmDeliveryReqDto> getConfirmDeliveryInvitation(@RequestParam("vin") String vin) {
    //    return null;
    //}

    /**
     * 厂端代创客户订单
     */
    @ApiOperation(value = "厂端代创客户订单")
    @PostMapping("/oem/add")
    public RestResultResponse<Integer> oemAddManufacturerOrder(@ApiParam(name = "厂端代创客户订单", value = "厂端代创客户订单") @RequestBody OemRetailOrderCreateDTO oemRetailOrderCreateDTO) {
        return null;
    }

    /**
     * 厂端导入客户订单
     */
    @ApiOperation(value = "厂端导入客户订单")
    @PostMapping("/oem/import")
    public ImportResultDto<OemImportSalesOrderExcelVO> oemImportManufacturerOrder(@RequestParam(value = "file") MultipartFile multipartFile) {
        return null;
    }

    @Test
    public void test() {
        String str1 = "hello";
        String str2 = str1;
        String str3 = "world";
        String str4 = str1 + str3;
        String str5 = str1 + str3 + new String("!");
        // 使用 == 比较字符串的引用相等
        System.out.println(str1 == str2);
        System.out.println(str1 == "hello");
        System.out.println(str1 == str3);
        // 使用 equals 方法比较字符串的相等
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        StringBuilder sb = new StringBuilder();
    }

    @Test
    public void test2(){
        List<BigDecimal> list = new ArrayList<>();
        list.add(BigDecimal.valueOf(1));
        list.add(BigDecimal.valueOf(2));
        list.add(BigDecimal.valueOf(3));
        list.add(BigDecimal.valueOf(4));
        BigDecimal optionPackagePrice = BigDecimal.ZERO;
        System.out.println(list.stream().reduce(optionPackagePrice, BigDecimal::add));
    }

}
