CREATE TABLE chips
(
	digit_capacity  integer  NULL ,
	capacity  integer  NULL ,
	date_of_output  datetime  NULL ,
	access_time  integer  NULL ,
	popular  varchar(20)  NULL ,
	cost  integer  NULL ,
	marking  varchar(40)  NOT NULL ,
	CONSTRAINT  XPKchips PRIMARY KEY   NONCLUSTERED (marking  ASC)
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
	CONSTRAINT  XPKorders PRIMARY KEY   NONCLUSTERED (id_order  ASC)
)
go


CREATE TABLE produsers
(
	home_country  varchar(40)  NULL ,
	date_of_beginning  datetime  NULL ,
	number_of_staff  integer  NULL ,
	annual_income  integer  NULL ,
	title  varchar(40)  NOT NULL ,
	CONSTRAINT  XPKprodusers PRIMARY KEY   NONCLUSTERED (title  ASC)
)
go



ALTER TABLE orders
	ADD CONSTRAINT  R_2 FOREIGN KEY (marking) REFERENCES chips(marking)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION
go


ALTER TABLE orders
	ADD CONSTRAINT  R_3 FOREIGN KEY (title) REFERENCES produsers(title)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION
go



CREATE TRIGGER tD_chips ON chips FOR DELETE AS
/* ERwin Builtin 27 но€бр€ 2011 г. 12:56:46 */
/* DELETE trigger on chips */
BEGIN
  DECLARE  @errno   int,
           @errmsg  varchar(255)
    /* ERwin Builtin 27 но€бр€ 2011 г. 12:56:46 */
    /* chips R/2 orders on parent delete no action */
    /* ERWIN_RELATION:CHECKSUM="0000ec7f", PARENT_OWNER="", PARENT_TABLE="chips"
    CHILD_OWNER="", CHILD_TABLE="orders"
    P2C_VERB_PHRASE="R/2", C2P_VERB_PHRASE="R/2", 
    FK_CONSTRAINT="R_2", FK_COLUMNS="marking" */
    IF EXISTS (
      SELECT * FROM deleted,orders
      WHERE
        /*  %JoinFKPK(orders,deleted," = "," AND") */
        orders.marking = deleted.marking
    )
    BEGIN
      SELECT @errno  = 30001,
             @errmsg = 'Cannot delete chips because orders exists.'
      GOTO ERROR
    END


    /* ERwin Builtin 27 но€бр€ 2011 г. 12:56:46 */
    RETURN
ERROR:
    raiserror @errno @errmsg
    rollback transaction
END
go

CREATE TRIGGER tU_chips ON chips FOR UPDATE AS
/* ERwin Builtin 27 но€бр€ 2011 г. 12:56:46 */
/* UPDATE trigger on chips */
BEGIN
  DECLARE  @NUMROWS int,
           @nullcnt int,
           @validcnt int,
           @insmarking varchar(40),
           @errno   int,
           @errmsg  varchar(255)

  SELECT @NUMROWS = @@rowcount
  /* ERwin Builtin 27 но€бр€ 2011 г. 12:56:46 */
  /* chips R/2 orders on parent update no action */
  /* ERWIN_RELATION:CHECKSUM="0001087b", PARENT_OWNER="", PARENT_TABLE="chips"
    CHILD_OWNER="", CHILD_TABLE="orders"
    P2C_VERB_PHRASE="R/2", C2P_VERB_PHRASE="R/2", 
    FK_CONSTRAINT="R_2", FK_COLUMNS="marking" */
  IF
    /* %ParentPK(" OR",UPDATE) */
    UPDATE(marking)
  BEGIN
    IF EXISTS (
      SELECT * FROM deleted,orders
      WHERE
        /*  %JoinFKPK(orders,deleted," = "," AND") */
        orders.marking = deleted.marking
    )
    BEGIN
      SELECT @errno  = 30005,
             @errmsg = 'Cannot update chips because orders exists.'
      GOTO ERROR
    END
  END


  /* ERwin Builtin 27 но€бр€ 2011 г. 12:56:46 */
  RETURN
ERROR:
    raiserror @errno @errmsg
    rollback transaction
END
go


CREATE TRIGGER tD_orders ON orders FOR DELETE AS
/* ERwin Builtin 27 но€бр€ 2011 г. 12:56:46 */
/* DELETE trigger on orders */
BEGIN
  DECLARE  @errno   int,
           @errmsg  varchar(255)
    /* ERwin Builtin 27 но€бр€ 2011 г. 12:56:46 */
    /* chips R/2 orders on child delete no action */
    /* ERWIN_RELATION:CHECKSUM="00024590", PARENT_OWNER="", PARENT_TABLE="chips"
    CHILD_OWNER="", CHILD_TABLE="orders"
    P2C_VERB_PHRASE="R/2", C2P_VERB_PHRASE="R/2", 
    FK_CONSTRAINT="R_2", FK_COLUMNS="marking" */
    IF EXISTS (SELECT * FROM deleted,chips
      WHERE
        /* %JoinFKPK(deleted,chips," = "," AND") */
        deleted.marking = chips.marking AND
        NOT EXISTS (
          SELECT * FROM orders
          WHERE
            /* %JoinFKPK(orders,chips," = "," AND") */
            orders.marking = chips.marking
        )
    )
    BEGIN
      SELECT @errno  = 30010,
             @errmsg = 'Cannot delete last orders because chips exists.'
      GOTO ERROR
    END

    /* ERwin Builtin 27 но€бр€ 2011 г. 12:56:46 */
    /* produsers R/3 orders on child delete no action */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="produsers"
    CHILD_OWNER="", CHILD_TABLE="orders"
    P2C_VERB_PHRASE="R/3", C2P_VERB_PHRASE="R/3", 
    FK_CONSTRAINT="R_3", FK_COLUMNS="title" */
    IF EXISTS (SELECT * FROM deleted,produsers
      WHERE
        /* %JoinFKPK(deleted,produsers," = "," AND") */
        deleted.title = produsers.title AND
        NOT EXISTS (
          SELECT * FROM orders
          WHERE
            /* %JoinFKPK(orders,produsers," = "," AND") */
            orders.title = produsers.title
        )
    )
    BEGIN
      SELECT @errno  = 30010,
             @errmsg = 'Cannot delete last orders because produsers exists.'
      GOTO ERROR
    END


    /* ERwin Builtin 27 но€бр€ 2011 г. 12:56:46 */
    RETURN
ERROR:
    raiserror @errno @errmsg
    rollback transaction
END
go

CREATE TRIGGER tU_orders ON orders FOR UPDATE AS
/* ERwin Builtin 27 но€бр€ 2011 г. 12:56:46 */
/* UPDATE trigger on orders */
BEGIN
  DECLARE  @NUMROWS int,
           @nullcnt int,
           @validcnt int,
           @insid_order integer,
           @errno   int,
           @errmsg  varchar(255)

  SELECT @NUMROWS = @@rowcount
  /* ERwin Builtin 27 но€бр€ 2011 г. 12:56:46 */
  /* chips R/2 orders on child update no action */
  /* ERWIN_RELATION:CHECKSUM="0002d655", PARENT_OWNER="", PARENT_TABLE="chips"
    CHILD_OWNER="", CHILD_TABLE="orders"
    P2C_VERB_PHRASE="R/2", C2P_VERB_PHRASE="R/2", 
    FK_CONSTRAINT="R_2", FK_COLUMNS="marking" */
  IF
    /* %ChildFK(" OR",UPDATE) */
    UPDATE(marking)
  BEGIN
    SELECT @nullcnt = 0
    SELECT @validcnt = count(*)
      FROM inserted,chips
        WHERE
          /* %JoinFKPK(inserted,chips) */
          inserted.marking = chips.marking
    /* %NotnullFK(inserted," IS NULL","select @nullcnt = count(*) from inserted where"," AND") */
    select @nullcnt = count(*) from inserted where
      inserted.marking IS NULL
    IF @validcnt + @nullcnt != @NUMROWS
    BEGIN
      SELECT @errno  = 30007,
             @errmsg = 'Cannot update orders because chips does not exist.'
      GOTO ERROR
    END
  END

  /* ERwin Builtin 27 но€бр€ 2011 г. 12:56:46 */
  /* produsers R/3 orders on child update no action */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="produsers"
    CHILD_OWNER="", CHILD_TABLE="orders"
    P2C_VERB_PHRASE="R/3", C2P_VERB_PHRASE="R/3", 
    FK_CONSTRAINT="R_3", FK_COLUMNS="title" */
  IF
    /* %ChildFK(" OR",UPDATE) */
    UPDATE(title)
  BEGIN
    SELECT @nullcnt = 0
    SELECT @validcnt = count(*)
      FROM inserted,produsers
        WHERE
          /* %JoinFKPK(inserted,produsers) */
          inserted.title = produsers.title
    /* %NotnullFK(inserted," IS NULL","select @nullcnt = count(*) from inserted where"," AND") */
    select @nullcnt = count(*) from inserted where
      inserted.title IS NULL
    IF @validcnt + @nullcnt != @NUMROWS
    BEGIN
      SELECT @errno  = 30007,
             @errmsg = 'Cannot update orders because produsers does not exist.'
      GOTO ERROR
    END
  END


  /* ERwin Builtin 27 но€бр€ 2011 г. 12:56:46 */
  RETURN
ERROR:
    raiserror @errno @errmsg
    rollback transaction
END
go


CREATE TRIGGER tD_produsers ON produsers FOR DELETE AS
/* ERwin Builtin 27 но€бр€ 2011 г. 12:56:46 */
/* DELETE trigger on produsers */
BEGIN
  DECLARE  @errno   int,
           @errmsg  varchar(255)
    /* ERwin Builtin 27 но€бр€ 2011 г. 12:56:46 */
    /* produsers R/3 orders on parent delete no action */
    /* ERWIN_RELATION:CHECKSUM="0000f824", PARENT_OWNER="", PARENT_TABLE="produsers"
    CHILD_OWNER="", CHILD_TABLE="orders"
    P2C_VERB_PHRASE="R/3", C2P_VERB_PHRASE="R/3", 
    FK_CONSTRAINT="R_3", FK_COLUMNS="title" */
    IF EXISTS (
      SELECT * FROM deleted,orders
      WHERE
        /*  %JoinFKPK(orders,deleted," = "," AND") */
        orders.title = deleted.title
    )
    BEGIN
      SELECT @errno  = 30001,
             @errmsg = 'Cannot delete produsers because orders exists.'
      GOTO ERROR
    END


    /* ERwin Builtin 27 но€бр€ 2011 г. 12:56:46 */
    RETURN
ERROR:
    raiserror @errno @errmsg
    rollback transaction
END
go

CREATE TRIGGER tU_produsers ON produsers FOR UPDATE AS
/* ERwin Builtin 27 но€бр€ 2011 г. 12:56:46 */
/* UPDATE trigger on produsers */
BEGIN
  DECLARE  @NUMROWS int,
           @nullcnt int,
           @validcnt int,
           @institle varchar(40),
           @errno   int,
           @errmsg  varchar(255)

  SELECT @NUMROWS = @@rowcount
  /* ERwin Builtin 27 но€бр€ 2011 г. 12:56:46 */
  /* produsers R/3 orders on parent update no action */
  /* ERWIN_RELATION:CHECKSUM="000109eb", PARENT_OWNER="", PARENT_TABLE="produsers"
    CHILD_OWNER="", CHILD_TABLE="orders"
    P2C_VERB_PHRASE="R/3", C2P_VERB_PHRASE="R/3", 
    FK_CONSTRAINT="R_3", FK_COLUMNS="title" */
  IF
    /* %ParentPK(" OR",UPDATE) */
    UPDATE(title)
  BEGIN
    IF EXISTS (
      SELECT * FROM deleted,orders
      WHERE
        /*  %JoinFKPK(orders,deleted," = "," AND") */
        orders.title = deleted.title
    )
    BEGIN
      SELECT @errno  = 30005,
             @errmsg = 'Cannot update produsers because orders exists.'
      GOTO ERROR
    END
  END


  /* ERwin Builtin 27 но€бр€ 2011 г. 12:56:46 */
  RETURN
ERROR:
    raiserror @errno @errmsg
    rollback transaction
END
go

