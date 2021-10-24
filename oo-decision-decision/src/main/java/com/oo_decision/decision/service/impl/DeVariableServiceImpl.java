package com.oo_decision.decision.service.impl;

import java.util.List;
import com.oo_decision.common.utils.DateUtils;
import com.oo_decision.decision.domain.DeVariable;
import com.oo_decision.decision.mapper.DeVariableMapper;
import com.oo_decision.decision.service.IDeVariableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 决策变量Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-10-24
 */
@Service
public class DeVariableServiceImpl implements IDeVariableService
{
    @Autowired
    private DeVariableMapper deVariableMapper;

    /**
     * 查询决策变量
     * 
     * @param vbId 决策变量主键
     * @return 决策变量
     */
    @Override
    public DeVariable selectDeVariableByVbId(Long vbId)
    {
        return deVariableMapper.selectDeVariableByVbId(vbId);
    }

    /**
     * 查询决策变量列表
     * 
     * @param deVariable 决策变量
     * @return 决策变量
     */
    @Override
    public List<DeVariable> selectDeVariableList(DeVariable deVariable)
    {
        return deVariableMapper.selectDeVariableList(deVariable);
    }

    /**
     * 新增决策变量
     * 
     * @param deVariable 决策变量
     * @return 结果
     */
    @Override
    public int insertDeVariable(DeVariable deVariable)
    {
        deVariable.setCreateTime(DateUtils.getNowDate());
        return deVariableMapper.insertDeVariable(deVariable);
    }

    /**
     * 修改决策变量
     * 
     * @param deVariable 决策变量
     * @return 结果
     */
    @Override
    public int updateDeVariable(DeVariable deVariable)
    {
        deVariable.setUpdateTime(DateUtils.getNowDate());
        return deVariableMapper.updateDeVariable(deVariable);
    }

    /**
     * 批量删除决策变量
     * 
     * @param vbIds 需要删除的决策变量主键
     * @return 结果
     */
    @Override
    public int deleteDeVariableByVbIds(Long[] vbIds)
    {
        return deVariableMapper.deleteDeVariableByVbIds(vbIds);
    }

    /**
     * 删除决策变量信息
     * 
     * @param vbId 决策变量主键
     * @return 结果
     */
    @Override
    public int deleteDeVariableByVbId(Long vbId)
    {
        return deVariableMapper.deleteDeVariableByVbId(vbId);
    }
}
