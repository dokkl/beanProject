CREATE TABLE `board` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `board_type` varchar(255) DEFAULT NULL,
  `contents` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_at` datetime DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `view_count` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=134 DEFAULT CHARSET=utf8;

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `encoded_password` varchar(255) NOT NULL,
  `nick` varchar(255) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  `authority_id` bigint(20) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_ld22ky2pkjx9k6l1meeby3fko` (`authority_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

CREATE TABLE `authorities` (
  `authority_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `authority` varchar(255) NOT NULL,
  PRIMARY KEY (`authority_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

CREATE TABLE `hello` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*
DROP TABLE people;

CREATE TABLE people  (
    person_id BIGINT NOT NULL auto_increment,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    PRIMARY KEY (person_id)
);


DROP TABLE member;
DROP TABLE connect;
    */
    /*
CREATE TABLE member (
    id bigint not null auto_increment,
	  mail varchar(30) not null,
	  password varchar(14) not null,
    name varchar(20),
    sex varchar(1),
    phone varchar(20),
    birthday varchar(8),
	  device_reg_id varchar(255),
	  phone_auth varchar(6),
    age integer(3),
	  kakao_id varchar(20),
    address1 varchar(20),
	  address2 varchar(20),
    create_at datetime,
	  update_at datetime,
	  nick_name varchar(20),
	  job varchar(40),
	  character_type varchar(80),
	  height integer(3),
	  body_type varchar(80),
	  religion varchar(10),
    blood_type varchar(2),
	  self_introduction varchar(255),
	  hobby varchar(160),
    ideal_type varchar(120),
    my_appeal varchar(120),
    drink_and_smoke varchar(40),
    want_date varchar(100),
 	  first_point varchar(40),
	  image1 varchar(40),
	  image2 varchar(40),
	  image3 varchar(40),
	  image4 varchar(40),
	  last_connect_date datetime,
	  last_connect_count int,
	  push_ok boolean,
	  connect_ok boolean,
    PRIMARY KEY (id),
	  index(mail),
	  index(name),
	  index(create_at),
    index(update_at)
);

create table connect (
    id bigint not null auto_increment,
    connect_day date,
    my_id bigint,
    target_id bigint,
		my_response varchar(20),
		target_response varchar(20),
		viewed boolean,
		my_point bigint,
		temp1 varchar(50),
    temp2 varchar(50),
    create_at datetime,
		update_at datetime,
    PRIMARY KEY (id),
		index(connect_day),
		index(my_id),
		index(target_id)
);
   */

