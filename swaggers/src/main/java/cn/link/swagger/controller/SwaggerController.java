package cn.link.swagger.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.TemplateExportParams;
import cn.hutool.core.util.ObjectUtil;
import cn.link.swagger.newbie.common.RestResultResponse;
import cn.link.swagger.newbie.retail.InvoiceApplyQueryDTO;
import cn.link.swagger.newbie.retail.InvoiceApplyResultVo;
import cn.link.swagger.newbie.retail.MaterialDTO;
import cn.link.swagger.newbie.retail.MaterialVO;
import cn.link.swagger.newbie.retail.OemImportSalesOrderExcelVO;
import cn.link.swagger.newbie.retail.OemRetailOrderCreateDTO;
import cn.link.swagger.newbie.retail.OrderCancelReasonsParamDTO;
import cn.link.swagger.newbie.retail.PotentialForOrderDTO;
import cn.link.swagger.newbie.retail.SalesOrdersDTO;
import cn.link.swagger.newbie.retail.SmallOrderEnableVO;
import cn.link.swagger.newbie.retail.SmallOrderQueryDTO;
import cn.link.swagger.newbie.retail.TcStrongWeakAgentVO;
import cn.link.swagger.newbie.retail.importClazz.ImportResultDto;
import cn.link.swagger.newbie.retail.refund.QueryRetailOrderDTO;
import cn.link.swagger.utils.StreamUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.spire.xls.FileFormat;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

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

//    /**
//     * 厂端代创客户订单
//     */
//    @ApiOperation(value = "厂端代创客户订单")
//    @PostMapping("/oem/add")
//    public RestResultResponse<Integer> oemAddManufacturerOrder(@ApiParam(name = "厂端代创客户订单", value = "厂端代创客户订单") @RequestBody OemRetailOrderCreateDTO oemRetailOrderCreateDTO) {
//        return null;
//    }
//
//    /**
//     * 厂端导入客户订单
//     */
//    @ApiOperation(value = "厂端导入客户订单")
//    @PostMapping("/oem/import")
//    public ImportResultDto<OemImportSalesOrderExcelVO> oemImportManufacturerOrder(@RequestParam(value = "file") MultipartFile multipartFile) {
//        return null;
//    }

    //
    //@ApiOperation(value = "厂端选择线索(客户)", notes = "厂端选择线索(客户)")
    //@GetMapping(value = "/queryPotentialForOrderOem", produces = "application/json")
    //@ApiImplicitParams({
    //        @ApiImplicitParam(name = "pageNum", value = "当前页"),
    //        @ApiImplicitParam(name = "limit", value = "分页大小"),
    //        @ApiImplicitParam(name = "consult", value = "顾问"),
    //        @ApiImplicitParam(name = "queryStr", value = "客户姓名或手机号"),
    //        @ApiImplicitParam(name = "customerName", value = "客户姓名"),
    //        @ApiImplicitParam(name = "mobilePhone", value = "手机号"),
    //        @ApiImplicitParam(name = "menuId", value = "菜单id"),
    //        @ApiImplicitParam(name = "deliveryOwnerCode", value = "订车门店code"),
    //        @ApiImplicitParam(name = "customerNos", value = "客户编号")
    //})
    //public RestResultResponse<IPage<PotentialForOrderDTO>> queryPotentialForOrderOem(@RequestParam("pageNum") Long current, @RequestParam("limit") Long size,
    //                                                             @RequestParam(value = "consult", required = false) String consult,
    //                                                             @RequestParam(value = "queryStr", required = false) String queryStr,
    //                                                             @RequestParam(value = "customerName", required = false) String customerName,
    //                                                             @RequestParam(value = "mobilePhone", required = false) String mobilePhone,
    //                                                             @RequestParam(value = "menuId", required = false) String menuId,
    //                                                             @RequestParam(value = "deliveryOwnerCode", required = false) String deliveryOwnerCode,
    //                                                             @RequestParam(value = "customerNos", required = false) String customerNos) {
    //    return null;
    //}


    //@GetMapping("/list")
    //@ApiOperation(value = "根据车型年款配置，查询强弱代理配置")
    //@ApiImplicitParams({
    //        @ApiImplicitParam(value = "车型ID", name = "modelId", required = true),
    //        @ApiImplicitParam(value = "年款", name = "modelYear", required = false),
    //        @ApiImplicitParam(value = "配置ID", name = "configId", required = false),
    //})
    //public RestResultResponse<List<TcStrongWeakAgentVO>> strongWeakAgentByCondition(@RequestParam(value = "modelId") Integer modelId,
    //                                                                                @RequestParam(value = "modelYear", required = false) Integer modelYear,
    //                                                                                @RequestParam(value = "configId", required = false) Integer configId) {
    //    return null;
    //}
    //@ApiOperation("车型ID查询预售配置")
    //@PostMapping("/presale/list")
    //public RestResultResponse<List<SmallOrderEnableVO>> getPreSaleConfigListByModelIds(@RequestBody SmallOrderQueryDTO smallOrderQueryDTO) {
    //    return null;
    //}

    ///**
    // * 根据物料级别查询物料信息
    // * <p>
    // * 目前主要用于查询车型物料数据，包含了订单类型对应的车型的过滤逻辑、短促车型的过滤逻辑
    // */
    //@ApiOperation(notes = "根据物料级别查询物料信息", value = "根据物料级别查询物料信息")
    //@GetMapping("/level/{materialLevel}")
    //@ApiImplicitParams({
    //        @ApiImplicitParam(name = "materialLevel", required = true, dataType = "int", paramType = "query", value = "物料level"),
    //        @ApiImplicitParam(name = "materialDTO", required = true, dataType = "MaterialDTO", paramType = "query", value = "物料参数"),
    //        @ApiImplicitParam(name = "isNew", required = true, dataType = "String", paramType = "query", value = "isNew")
    //})
    //RestResultResponse<List<MaterialVO>> listSuperiorMaterialsById(@PathVariable("materialLevel") Integer materialLevel,
    //                                           MaterialDTO materialDTO,
    //                                           @RequestParam(value = "isNew", required = false) String isNew){
    //    return null;
    //}

    /**
     * 根据id获取这个id下的所有物料
     *
     * 目前主要用于查询年款和配置，包含了短促过滤年款配置逻辑
     */
    //@ApiOperation(notes = "根据id获取这个id下的所有物料", value = "根据id获取这个id下的所有物料")
    //@GetMapping("/{materialId}/items")
    //@ApiImplicitParams({
    //        @ApiImplicitParam(name = "materialId", required = true, dataType = "String", paramType = "query", value = "materialId"),
    //        @ApiImplicitParam(name = "materialDTO", required = true, dataType = "MaterialDTO", paramType = "query", value = "物料参数")
    //})
    //RestResultResponse<List<MaterialVO>> listMaterialsById(@PathVariable("materialId") String materialId, MaterialDTO materialDTO) {
    //    return null;
    //}

    /**
     * 分页查询开票申请
     * @param params
     * @return
     */
    //@ApiOperation(value = "分页查询开票申请")
    //@PostMapping(value = "/invoiceApply/listByPage")
    //public RestResultResponse<IPage<InvoiceApplyResultVo>> listByPage(@RequestBody InvoiceApplyQueryDTO params) {
    //    return null;
    //}

    ///**
    // * 取消客户订单
    // *
    // * @param queryRetailOrderDTO
    // * @return java.lang.Integer
    // * @author jhy
    // * @since 2020-06-23
    // */
    //@ApiOperation(value = "取消客户订单-进入审批")
    //@PostMapping("/orders/orderAudit/countermandRetailOrder")
    //public RestResultResponse<Integer> countermandRetailOrder(@RequestBody QueryRetailOrderDTO queryRetailOrderDTO) {
    //    return null;
    //}

    //@Test
    //public void test() {
    //    String str1 = "hello";
    //    String str2 = str1;
    //    String str3 = "world";
    //    String str4 = str1 + str3;
    //    String str5 = str1 + str3 + new String("!");
    //    // 使用 == 比较字符串的引用相等
    //    System.out.println(str1 == str2);
    //    System.out.println(str1 == "hello");
    //    System.out.println(str1 == str3);
    //    // 使用 equals 方法比较字符串的相等
    //    System.out.println(str1.equals(str2));
    //    System.out.println(str1.equals(str3));
    //    StringBuilder sb = new StringBuilder();
    //}
    //
    //@Test
    //public void test2() {
    //    String testa = "{\"data\":[],\"elapsedMilliseconds\":0,\"resultCode\":200,\"success\":true}";
    //    JSONObject jsonObject = JSONObject.parseObject(testa);
    //    JSONArray data = jsonObject.getJSONArray("data");
    //    Map<Integer, List<Object>> collect = Collections.emptyList().stream()
    //            .collect(Collectors.groupingBy(Object::hashCode));
    //    System.out.println(collect);
    //}
    //
    //@Test
    //public void test3() throws Exception {
        //String filePath = "";
        //File topFolder = new File(filePath);
        //Path topPath = FileSystems.getDefault().getPath(filePath);
        //File[] files = topFolder.listFiles();
        //if (files == null || files.length == 0) {
        //    return;
        //}
        //删除torrent
        //Stream.of(files)
        //        .filter(file -> !file.isDirectory() && ObjectUtil.contains(file.getName(), "torrent"))
        //        .forEach(file -> {
        //            String name = file.getName();
        //            boolean delete = file.delete();
        //            System.out.println("删除：" + name + (delete ? " 成功" : " 失败"));
        //        });

        //移动视频文件到外层
        //if (topFolder.isDirectory() && ObjectUtil.isNotEmpty(files)) {
        //    //获取要移动的文件所在的文件夹
        //    List<File> directoryList = Stream.of(files)
        //            .filter(file -> file.isDirectory() && ObjectUtil.contains(file.getName(), "-"))
        //            .filter(file -> ObjectUtil.isNotEmpty(file.listFiles()) && file.listFiles().length == 2)
        //            .collect(Collectors.toList());
        //
        //    System.out.println("文件夹数量"+ directoryList.size());
        //
        //    if (ObjectUtil.isEmpty(directoryList)) {
        //        System.out.print("暂无要移动的文件");
        //        return;
        //    }
        //
        //    //获取要移动的文件
        //    List<File> moveFileList = directoryList.stream()
        //            .map(file -> Stream.of(file.listFiles())
        //                    .filter(childFile -> (!childFile.isDirectory()
        //                            && ObjectUtil.contains(childFile.getName(), "-")
        //                            && !ObjectUtil.contains(childFile.getName(), "torrent")))
        //                    .findFirst()
        //                    .orElse(null))
        //            .filter(Objects::nonNull)
        //            .collect(Collectors.toList());
        //
        //    System.out.print("文件数量" + moveFileList.size() + "文件名：" + "\n" + moveFileList.stream().map(File::getAbsolutePath).collect(Collectors.joining("\n")));

        //moveFileList.forEach(file -> {
        //    //移动后的路径
        //    Path targetPath = topPath.resolve(file.getName());
        //    Path sourcePath = FileSystems.getDefault().getPath(file.getAbsolutePath());
        //    try {
        //        Files.move(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
        //    } catch (IOException e) {
        //        e.printStackTrace();
        //    }
        //});
        //获取要删除的文件所在的文件夹
        //List<File> directoryList = Stream.of(files)
        //        .filter(file -> file.isDirectory() && ObjectUtil.contains(file.getName(), "-"))
        //        .filter(file -> ObjectUtil.isNotEmpty(file.listFiles()) && file.listFiles().length == 1 && ObjectUtil.contains(file.listFiles()[0].getName(), "torrent"))
        //        .collect(Collectors.toList());
        //
        //System.out.println("文件夹数量" + directoryList.size() + "文件夹名：" + "\n" + directoryList.stream().map(File::getAbsolutePath).collect(Collectors.joining("\n")));
        //
        //directoryList.forEach(directory -> {
        //    directory.listFiles()[0].delete();
        //    directory.delete();
        //});

    /**
     * 新增订单取消原因
     */
    @PostMapping("/order/cancelReason/save")
    @ApiOperation("新增订单取消原因")
    public RestResultResponse<Boolean> saveOrderCancelReasons(@ApiParam(name = "订单取消原因DTO", value = "订单取消原因DTO")
                                          @RequestBody @Validated OrderCancelReasonsParamDTO orderCancelReasonsParamDTO) {
        return null;
    }

    //}
    //public static void main(String[] args) throws Exception {
    //
    //
    //    /**
    //     * Spire注册许可证密钥Key
    //     */
    //    com.spire.license.LicenseProvider.setLicenseKey("E9QacOJzHgEAh+Oi//nJLO+QKHSf5qg9NzKDNwzvrbIW06cfle3NiCMFdMmI66ZYRrRvU4g4qQKiFnS1PCvGfN78KErMUeO50TPh8hAPYT56H7MZavxO35xWtfavzRWpdWgY8ZZvo7VYQEP+U/ohJGy5P8JbAjtnpanjdDkkGDijZxUgqlbs8PQ7iMI2a1Qzinf+i4S/48zeHBAvITCpKH0jBBlktRPSu6bZGoWBfVcgGTN/BuDLdFLOHeepfdg+H470v52fQ5KqC8qlw5wEdTO13TJqC1RPzSY6AWFftOd43pSOJ1YdqmSBALikejcFL3IxvlAlVG1lsvA9mQICyy1c9bZPC/W6SS12RT/VFQi6Ye188TP+iY5T170g+mlDLSerdVmahV8iVuyiiXR280rJghEDJg4Dg9lFDJGSVC1J3smAMcheXUm0m97hgG53ygwMDMqriKq1uJt+rRv5+fyAX88g/PDgc5Q6seDBJ93FKMesXXwGvmqigyeeCRLZJwafX3EK/0TQIzdGpws6h+V+DWalEquwFzC0XKl6jrylqO+SzpL3wlijlLNZgVUMYXojXsNh9n4/N50Uc9Ac9eayZDELKBiwuCyp6lPB/4LxeCjiS5mIwkOZ31FM01/m2Ylpwi5fr6HY2tK+bghwq9S5QDkJ76G1NNFp1lekSxgvBp5L140xb60UT3aSu1+nlCcvTOUvf5AFwZOEXq/vuiNr1cvwAbpSE4SvZcWg+44hO/cZ0hzTLyQE7oMykopquE7uj45ZnklHbruvNg7IJuAEuv7YlJfN3cFp/O3QY3wGcqhVrcouIEih5WZfSjIJvYtrWcN4ajTdjghZGykQpNBXdboNNS46QXW26VtIB8pbeHOnx3pLRzgXtBH/Mfe05UNGOVFIKRnCRqN5fkfhAv+FjFF3ne1gSzqRT/2CYvsq/mwbd+aVqbd/5NoeJ+ZsKLtHuldcNld8jxwWwUGDu31S+ZafW5KyHMKhHohx9zos4zugBvyeNfIMuMmcreuiirWUS2+6Y/svdo6EhMmTj8cSU2ESWD5rKh6XUgwQSlF2CLVwhOyuqkclYFXzHCZAhDp7Yc716YxcvirGOngjg06gaBCm0yovprBfKWLy00M0sMKpvI7TAd+257LVGBy3hmY+p5ZnJne/l9ahBvbAHWhPVDuzxM5gtux87jAOlAGwL/IUfOsYkqSndsy4molOrBao17GWqvrKeo5Xo8rGGVlWlJnNiIN3z8xV4EgEc/fhXC+9gsNM0KZ7FKby0Bo0/JsvAIB42/XSIjZdC4kBD51bi/j9+YkFHPqov4UvOloyEkPd8m0cXzNraCrGaU3E135oU5BydeYFVnbolKNSQgs4Pbsd/22AESUQiBY+MREwc5I8Yx4s9coobX9wu0Ns6igD2ahSrUjiMdsnIj0EYs5SKOQifHudO5NqCJNLDIsEbkJlOHE3tEET9Y1AiIF98IPvB8ZDB0VupWlMSvZu2ZHD7u9SzFb+08mIT1GJSldUMR2+jN7ZSB25eomKDh2ruBymqH+ya3Wv4jRrsBzMyagJ6ZNlPOrG1IXIYQ6usCkFN4O3QcS0UiNhL91jqyqdeI2dffu5s/Dw80fkCeLn6teTZNGP2mvt3HPcyAPAfjC90MysE14TCwQpUODLyugc9+Lt6jh5vBhVR8I5OCTQyvc8fWobrMemjw9ITCkF8ar/cmx79nrJjMvF5ipAMQkvbf4vMwoj/+o3M4kHF9BnZQhaa/G/p+yhTDA+TXOilH479nT31fgGAbGw8ZShBaFJs3i10bKfTcsOXA8WzMNuTAGQGOh7SrZBrhyVZPPqH4r1P6HLQ1rDF2fmni5Oc2V0Ov1MasG8l5ifOfW+I0NMLpgz63ztFiW4+9uQAv1jyAKW2VIMjMwOLdVjw2kjm4QF15Op1UArdP+gBr2MlhKeYg==");
    //    Workbook workbookTemplate = WorkbookFactory.create(Files.newInputStream(Paths.get("/Users/link/Downloads/客户订单导入模板2024-01-11 13-33-13.xlsx")));
    //    TemplateExportParams templateExportParams = new TemplateExportParams();
    //    templateExportParams.setTemplateWb(workbookTemplate);
    //    templateExportParams.setScanAllsheet(true);
    //    Workbook workbook = ExcelExportUtil.exportExcel(templateExportParams, Collections.emptyMap());
    //
    //    com.spire.xls.Workbook spire = new com.spire.xls.Workbook();
    //    spire.loadFromStream(StreamUtils.workbookConvertorStream(workbook));
    //    for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
    //        spire.getWorksheets().get(i).getPageSetup().setFitToPagesWide(1);
    //    }
    //    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    //    spire.saveToStream(byteArrayOutputStream, FileFormat.PDF);
    //    Files.write(Paths.get("/Users/link/Downloads/客户订单导入模板2024-01-11 13-33-13.pdf"), byteArrayOutputStream.toByteArray());
    //    Arrays.toString(byteArrayOutputStream.toByteArray());
    //        try {
    //            byteArrayOutputStream.close();
    //        } catch (IOException ioe) {
    //        }
    //
    //}

}
