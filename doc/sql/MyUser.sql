-- auto Generated on 2016-12-15 22:34:58 
-- DROP TABLE IF EXISTS `my_user`; 
CREATE TABLE `my_user`(
    `id` INTEGER(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `cookie` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'cookie',
    `type` INTEGER(12) NOT NULL DEFAULT -1 COMMENT 'type',
    `user_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'userName',
    `password` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'password',
    `age` INTEGER(12) NOT NULL DEFAULT -1 COMMENT 'age',
    `remaining_amount` DECIMAL(14,4) NOT NULL DEFAULT 0 COMMENT 'remainingAmount',
    `add_time` DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'addTime',
    `serial_id` BIGINT NOT NULL DEFAULT -1 COMMENT 'serialId',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`my_user`';
