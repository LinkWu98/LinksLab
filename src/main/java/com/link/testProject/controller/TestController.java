package com.link.testProject.controller;

import com.link.testProject.dto.newbie.common.RestResultResponse;
import com.link.testProject.dto.newbie.retail.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 90762
 * @version 1.0
 * @date 2023/8/9 下午 6:36
 */
@RestController("test")
@Api("test")
public class TestController {

    @ApiOperation("新增线索潜客")
    @PostMapping({"/customerBusiness/insertPotenCus"})
    RestResultResponse<CustomerSaveAndActionDTO> insertPotentialCustomer(@ApiParam(name = "潜客对象", value = "潜客对象", required = true) @RequestBody PotentialRecordDto recordDTO) {
        return null;
    }

    @ApiOperation(
            value = "新增基盘客户",
            notes = "新增基盘客户",
            httpMethod = "POST"
    )
    @PostMapping({"/clueauditDisc/addAuditDists"})
    RestResultResponse<Long> addAuditDists(@RequestBody List<BasalDiscParamsDTO> basalDiscParamsDTO) {
        return null;
    }

}
