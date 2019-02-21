-- create database
CREATE DATABASE journeySharing;

-- create user_info table
create table user_info (
    `id` int not null auto_increment,
    `create_date` DATE not null,
    `update_date` date not null,
    `create_by` varchar (100) not null default 'sys',
    `update_by` varchar (100) not null default 'sys',
    `user_name` varchar (100) not null,
    `gender` varchar (1) not  null comment '1.female 2.male',
    `email` varchar (100),
    `phone_number` int not null,
    primary key (id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='user_ifo table';

-- login_info
create table login_info (
    `id` int not null auto_increment,
    `create_date` DATE not null ,
    `update_date` date not null ,
    `create_by` varchar (100) not null default 'sys',
    `update_by` varchar (100) not null default 'sys',
    `user_id` int not null comment 'id of table user_info',
    `user_status` int comment '1.active 2.inactive',
    `password33` varchar(100) not null ,
    `authorization_token` int not null,
    primary key (id),
    constraint login_FK foreign key (`user_id`) references `user_info` (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='login_info table';

create table rating(
    `id` int not null auto_increment,
    `create_date` DATE not null ,
    `update_date` date not null ,
    `create_by` varchar (100) not null default 'sys',
    `update_by` varchar (100) not null default 'sys',
    `user_id` int not null comment 'id of table user_info',
    `total_trips` int not null ,
    `total_ratings` int not null ,
    `average_rating` int not null ,
    primary key (id),
    constraint rating_foreign_key foreign key (`user_id`) references `user_info` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='rating table';

create table schedule(
    `id` int not null auto_increment,
    `create_date` DATE not null,
    `update_date` date not null,
    `create_by` varchar (100) not null default 'sys',
    `update_by` varchar (100) not null default 'sys',
    `user_id` int not null comment 'id of table user_info',
    `start_position` varchar(256),
    `start_position_longitude` varchar(100) not null ,
    `start_position_latitude` varchar(100) not null ,
    `end_position` varchar(256),
    `end_position_longitude` varchar(100) not null ,
    `end_position_latitude` varchar(100),
    `weekday` int not null comment '1-7: Monday-Sunday',
    `start_duration` date not null,
    `end_duration` date not null ,
    `start_duration2` date not null,
    `end_duration2` date not null ,
    `gender_preference` int null comment '1.female 2. male',
    `rating_preference` int null,
    `commute_type` int null comment '1.daily commute 2.real-time commute',
    `engage_time` timestamp null default now(),
    `status` int not null comment '0.initialization 1.fail 2.success',
    `current_server` varchar(100) null ,

    primary key (id),
    constraint schedule_foreign_key foreign key (`user_id`) references `user_info` (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='schedule table';


create table `trip` (
    `id` int not null auto_increment,
    `create_date` DATE not null ,
    `update_date` date not null,
    `create_by` varchar (100) not null default 'sys',
    `update_by` varchar (100) not null default 'sys',
    `schedule_id` int not null comment 'id of schedule table',
    `status` int not null comment '1.initialized 2.started 3.finished 4.cancelled',
    `start_position` varchar(100) not null ,
    `end_position` varchar(100) not null  ,
    `weekday` int not null comment '1-7: Monday-Sunday',

    primary key (id),
    constraint trip_foreign_key foreign key (`schedule_id`) references `schedule` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='trip table';