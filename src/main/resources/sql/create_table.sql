#创建数据库
CREATE DATABASE gabriel_invoicing;


#切换数据库
use gabriel_invoicing;



drop table if exists  user_info;


create table user_info(
	user_id int(20) not null auto_increment comment '用户Id',
	user_name varchar(64) comment '用户名',
	password varchar(200) comment '密码',
	status_cd varchar(4)  comment '用户状态',
	status_date  datetime comment '状态时间',
	role_id int(20)  default null comment '角色Id',
	create_staff varchar(200) default null comment '创建人',
	create_date  datetime comment '创建时间',
	update_staff varchar(200) default null comment '修改人',
	update_date  datetime comment '修改时间',
	remark  varchar(200) comment '备注',
	primary key(user_id)
)ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


create table operation_log_record(
   operation_log_record_id int(20) not null auto_increment comment '操作日志Id',
   method_name varchar(64) comment '调用方法的名字',
   req_param varchar(200) comment '请求入参信息',
   rsp_param varchar(200)  comment '返参信息',
   user_name varchar(200) comment '用户名',
   create_staff varchar(200) default null comment '创建人',
   create_date  datetime comment '创建时间',
   update_staff varchar(200) default null comment '修改人',
   update_date  datetime comment '修改时间',
   remark  varchar(200) comment '备注',
   primary key(operation_log_record_id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
