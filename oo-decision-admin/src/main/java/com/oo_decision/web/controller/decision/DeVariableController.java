package com.oo_decision.web.controller.decision;

import java.util.List;

import com.oo_decision.decision.domain.DeVariable;
import com.oo_decision.decision.service.IDeVariableService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.oo_decision.common.annotation.Log;
import com.oo_decision.common.core.controller.BaseController;
import com.oo_decision.common.core.domain.AjaxResult;
import com.oo_decision.common.enums.BusinessType;
import com.oo_decision.common.utils.poi.ExcelUtil;
import com.oo_decision.common.core.page.TableDataInfo;

/**
 * 决策变量Controller
 * 
 * @author ruoyi
 * @date 2021-10-24
 */
@RestController
@RequestMapping("/decision/variable")
public class DeVariableController extends BaseController
{
    @Autowired
    private IDeVariableService deVariableService;

    /**
     * 查询决策变量列表
     */
    @PreAuthorize("@ss.hasPermi('decision:variable:list')")
    @GetMapping("/list")
    public TableDataInfo list(DeVariable deVariable)
    {
        startPage();
        List<DeVariable> list = deVariableService.selectDeVariableList(deVariable);
        return getDataTable(list);
    }

    /**
     * 导出决策变量列表
     */
    @PreAuthorize("@ss.hasPermi('decision:variable:export')")
    @Log(title = "决策变量", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(DeVariable deVariable)
    {
        List<DeVariable> list = deVariableService.selectDeVariableList(deVariable);
        ExcelUtil<DeVariable> util = new ExcelUtil<DeVariable>(DeVariable.class);
        return util.exportExcel(list, "决策变量数据");
    }

    /**
     * 获取决策变量详细信息
     */
    @PreAuthorize("@ss.hasPermi('decision:variable:query')")
    @GetMapping(value = "/{vbId}")
    public AjaxResult getInfo(@PathVariable("vbId") Long vbId)
    {
        return AjaxResult.success(deVariableService.selectDeVariableByVbId(vbId));
    }

    /**
     * 新增决策变量
     */
    @PreAuthorize("@ss.hasPermi('decision:variable:add')")
    @Log(title = "决策变量", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DeVariable deVariable)
    {
        return toAjax(deVariableService.insertDeVariable(deVariable));
    }

    /**
     * 修改决策变量
     */
    @PreAuthorize("@ss.hasPermi('decision:variable:edit')")
    @Log(title = "决策变量", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DeVariable deVariable)
    {
        return toAjax(deVariableService.updateDeVariable(deVariable));
    }

    /**
     * 删除决策变量
     */
    @PreAuthorize("@ss.hasPermi('decision:variable:remove')")
    @Log(title = "决策变量", businessType = BusinessType.DELETE)
	@DeleteMapping("/{vbIds}")
    public AjaxResult remove(@PathVariable Long[] vbIds)
    {
        return toAjax(deVariableService.deleteDeVariableByVbIds(vbIds));
    }
}
