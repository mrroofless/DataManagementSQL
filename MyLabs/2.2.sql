CREATE TABLE chips
(
	digit_capacity  integer  NULL ,
	capacity  integer  NULL ,
	date_of_output  datetime  NULL ,
	access_time  integer  NULL ,
	popular  varchar(20)  NULL ,
	cost  integer  NULL ,
	marking  varchar(40)  NOT NULL ,
	 PRIMARY KEY (marking  ASC)
)
go


CREATE TABLE produsers
(
	home_country  varchar(40)  NULL ,
	date_of_beginning  datetime  NULL ,
	number_of_staff  integer  NULL ,
	annual_income  integer  NULL ,
	title  varchar(40)  NOT NULL ,
	 PRIMARY KEY (title  ASC)
)
go


CREATE TABLE orders
(
	title  varchar(40)  NULL ,
	number_of_chips  integer  NULL ,
	date_of_order  datetime  NULL ,
	execute  varchar(20)  NULL ,
	id_order  integer  NOT NULL ,
	marking  varchar(40)  NULL ,
	 PRIMARY KEY (id_order  ASC),
	 FOREIGN KEY (marking) REFERENCES chips(marking)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION,
 FOREIGN KEY (title) REFERENCES produsers(title)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION
)
go


