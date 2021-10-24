package com.oo_decision.decision.service;

import com.oo_decision.decision.domain.DeVariable;

import java.util.List;

/**
 * 决策变量Service接口
 * 
 * @author ruoyi
 * @date 2021-10-24
 */
public interface IDeVariableService 
{
    /**
     * 查询决策变量
     * 
     * @param vbId 决策变量主键
     * @return 决策变量
     */
    public DeVariable selectDeVariableByVbId(Long vbId);

    /**
     * 查询决策变量列表
     * 
     * @param deVariable 决策变量
     * @return 决策变量集合
     */
    public List<DeVariable> selectDeVariableList(DeVariable deVariable);

    /**
     * 新增决策变量
     * 
     * @param deVariable 决策变量
     * @return 结果
     */
    public int insertDeVariable(DeVariable deVariable);

    /**
     * 修改决策变量
     * 
     * @param deVariable 决策变量
     * @return 结果
     */
    public int updateDeVariable(DeVariable deVariable);

    /**
     * 批量删除决策变量
     * 
     * @param vbIds 需要删除的决策变量主键集合
     * @return 结果
     */
    public int deleteDeVariableByVbIds(Long[] vbIds);

    /**
     * 删除决策变量信息
     * 
     * @param vbId 决策变量主键
     * @return 结果
     */
    public int deleteDeVariableByVbId(Long vbId);
}
