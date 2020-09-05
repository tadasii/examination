-- 初始化cst_info表
CREATE TABLE cst_info (
  id int(100) NOT NULL COMMENT '主键',
  cst_id varchar(255) DEFAULT NULL COMMENT '客户id',
  tenant_id varchar(255) DEFAULT NULL COMMENT '租户id',
  user_id varchar(255) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (id)
) ;

INSERT INTO cst_info VALUES ('1', '1', 'ccb.com', 'tom');
INSERT INTO cst_info VALUES ('2', '1', 'ccb.com', 'jerry');
INSERT INTO cst_info VALUES ('3', '1', 'ccb.com', 'maliya');
INSERT INTO cst_info VALUES ('4', '2', 'ali.com', 'trump');
INSERT INTO cst_info VALUES ('5', '2', 'ali.com', 'mayun');
INSERT INTO cst_info VALUES ('6', '2', 'ali.com', 'mayun');
INSERT INTO cst_info VALUES ('7', '3', 'abc.com', 'tony');
INSERT INTO cst_info VALUES ('8', '3', 'ccc.com', 'jack');
INSERT INTO cst_info VALUES ('9', '3', 'abc.com', 'marry');
INSERT INTO cst_info VALUES ('10', '4', 'qq.com', 'tony');
INSERT INTO cst_info VALUES ('11', '4', 'qb.com', 'smith');
INSERT INTO cst_info VALUES ('12', '4', 'qq.com', 'm2');
INSERT INTO cst_info VALUES ('13', '4', 'qq.com', 'm2');
INSERT INTO cst_info VALUES ('14', '4', 'qq.com', 'm2');
COMMIT();


--题目如下
-- 1.备份 表cst_info ，备份的表名为cst_info_bak

-- 2.统计cst_info表中有多少个不同的cst_id

-- 3.找出cst_info表中重复数据  （说明：cst_id,tenant_id,user_id 三个都相同 就是重复数据)

-- 4.统计cst_info表中各个cst_id下不同的user_id的总数（比如：cst_id='4',下面有tony，smith，m2 三个user_id

-- 5.cst_id应该与tenant_id一一对应。找出有多个tenant_id的cst_id。
--   (比如cst_id='3'就有abc.com和ccc.com两个tenant_id,写sql找出这样的cst_id)



