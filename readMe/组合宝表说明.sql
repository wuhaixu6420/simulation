--组合详情
用户id，组合id，组合名称，组合简介，组合余额，总收益，月收益，周收益，今日收益，总市值，创建时间，更新时间

--组合历史收益率
组合id，总收益，月收益，周收益，今日收益，总市值，创建时间，更新时间

--组合持仓
组合id，股票名称，股票代码，股票市场，可用股数，持仓股数，初始仓位，结束仓位，成本价，现价，盈亏金额，盈亏比，创建时间，更新时间

--交易记录
组合id，买卖标志，股票名称，股票代码，股票市场，买卖股数，买卖价格，交易标志（委托中，已成），创建时间，更新时间

--组合详情
create table combination_details(
`id` bigint unsigned AUTO_INCREMENT,
`user_id` varchar(20) not null comment '用户id',
`combination_name` varchar(50) not null comment '组合名称',
`combination_synopsis` varchar(200) not null comment '组合简介',
`combination_balance` varchar(20) not null comment '组合余额',
`total_profit` varchar(20) comment '总收益',
`month_profit` varchar(20) comment '月收益',
`week_profit` varchar(20) comment '周收益',
`today_profit` varchar(20) comment '今日收益',
`total_market_value` varchar(20) comment '总市值',
`create_time` timestamp comment '创建时间',
`update_time` timestamp comment '更新时间',
PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '组合详情';

--组合历史收益率
create table combination_historica_profit(
`id` bigint unsigned AUTO_INCREMENT,
`combination_id` varchar(20) not null comment '组合id',
`total_profit` varchar(20) not null comment '总收益',
`month_profit` varchar(20) not null comment '月收益',
`week_profit` varchar(20) not null comment '周收益',
`today_profit` varchar(20) not null comment '今日收益',
`total_market_value` varchar(20) not null comment '总市值',
`create_time` timestamp comment '创建时间',
`update_time` timestamp comment '更新时间',
PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '组合历史收益';

--组合持仓
create table combination_position(
`id` bigint unsigned AUTO_INCREMENT,
`combination_id` varchar(20) not null comment '组合id',
`stock_name` varchar(10) not null comment '股票名称',
`stock_code` varchar(10) not null comment '股票代码',
`stock_market` varchar(3) not null comment '股票市场',
`usable_stock_num` varchar(20) not null comment '可用股数',
`position_stock_num` varchar(20) not null comment '持仓股数',
`initial_position` varchar(6) not null comment '初始仓位',
`end_position` varchar(6) not null comment '结束仓位',
`cost_price` varchar(10) not null comment '成本价',
`market_price` varchar(10) comment '现价',
`profit_loss_amount` varchar(20) comment '盈亏金额',
`profit_loss_ratio` varchar(20) comment '盈亏比',
`create_time` timestamp comment '创建时间',
`update_time` timestamp comment '更新时间',
PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '组合持仓';

--交易记录
create table combination_transaction(
`id` bigint unsigned AUTO_INCREMENT,
`combination_id` varchar(20) not null comment '组合id',
`business_sign` varchar(1) not null comment '买卖标志',
`stock_name` varchar(20) not null comment '股票名称',
`stock_code` varchar(20) not null comment '股票代码',
`stock_market` varchar(3) not null comment '股票市场',
`business_num` varchar(20) not null comment '买卖股数',
`business_price` varchar(20) not null comment '买卖价格',
`transaction_sign` varchar(1) not null comment '交易标志（委托中，已成）',
`create_time` timestamp comment '创建时间',
`update_time` timestamp comment '更新时间',
PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '组合交易记录';













