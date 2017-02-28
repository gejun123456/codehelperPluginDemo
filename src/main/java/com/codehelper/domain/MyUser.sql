-- auto Generated on 2017-02-28 15:57:31 
-- DROP TABLE IF EXISTS `my_user`; 
CREATE TABLE `my_user`(
    `id` INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `cookie` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'cookie',
    `type` INT (11) NOT NULL DEFAULT -1 COMMENT 'type',
    `user_name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'userName',
    `password` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'password',
    `age` INT (11) NOT NULL DEFAULT -1 COMMENT 'age',
    `remaining_amount` DECIMAL (13,4) NOT NULL DEFAULT -1 COMMENT 'remainingAmount',
    `add_time` DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'addTime',
    `serial_id` BIGINT (15) NOT NULL DEFAULT -1 COMMENT 'serialId',
    `global_id` BIGINT (15) NOT NULL DEFAULT -1 COMMENT 'globalId',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`my_user`';
