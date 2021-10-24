-- ----------------------------
-- 1、决策变量表
-- ----------------------------
drop table if exists de_variable;
create table de_variable
(
    vb_id       bigint      not null auto_increment comment '变量主键',
    vb_name     varchar(50) not null comment '变量名称',
    tag         varchar(10) not null comment '标签',
    vb_ch_name  varchar(50)  default '' comment '变量中文名',
    vb_type     char(1)      default '' comment '变量类型，C字符 N数字',
    remark      varchar(100) default '' comment '备注',
    create_by   varchar(64)  default '' comment '创建者',
    create_time datetime comment '创建时间',
    update_by   varchar(64)  default '' comment '更新者',
    update_time datetime comment '更新时间',
    primary key (vb_id)
) engine = innodb comment = '决策变量表';