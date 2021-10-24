package com.oo_decision.decision.domain;

import com.oo_decision.common.annotation.Excel;
import com.oo_decision.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 决策变量对象 de_variable
 *
 * @author ruoyi
 * @date 2021-10-24
 */
public class DeVariable extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 变量主键
     */
    private Long vbId;

    /**
     * 主键名称
     */
    @Excel(name = "主键名称")
    private String vbName;

    /**
     * 标签
     */
    @Excel(name = "标签")
    private String tag;

    @Excel(name = "变量中文名")
    private String vbChName;

    /**
     * 变量类型，C字符 N数字
     */
    @Excel(name = "变量类型，C字符 N数字")
    private String vbType;

    public void setVbId(Long vbId) {
        this.vbId = vbId;
    }

    public Long getVbId() {
        return vbId;
    }

    public void setVbName(String vbName) {
        this.vbName = vbName;
    }

    public String getVbName() {
        return vbName;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public String getVbChName() {
        return vbChName;
    }

    public void setVbChName(String vbChName) {
        this.vbChName = vbChName;
    }

    public void setVbType(String vbType) {
        this.vbType = vbType;
    }

    public String getVbType() {
        return vbType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("vbId", getVbId())
                .append("vbName", getVbName())
                .append("tag", getTag())
                .append("vbChName", getVbChName())
                .append("vbType", getVbType())
                .append("remark", getRemark())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
