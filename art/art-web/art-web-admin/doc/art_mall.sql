/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2014/5/8 23:23:37                            */
/*==============================================================*/


drop table if exists auction_product;

drop table if exists auction_record;

drop table if exists club;

drop table if exists merchant;

drop table if exists orders;

drop table if exists product;

drop table if exists product_categroy;

drop table if exists product_picture;

drop table if exists product_price_record;

drop table if exists users;

/*==============================================================*/
/* Table: auction_product                                       */
/*==============================================================*/
create table auction_product
(
   auction_id           bigint not null auto_increment,
   product_id           bigint not null,
   merchant_id          bigint not null,
   club_id              bigint not null,
   user_id              bigint,
   start_time           datetime not null,
   end_time             datetime not null,
   current_user_id      bigint,
   current_price        double(11,2),
   lowest_price         double(11,2) not null,
   step_price           double(11,2) not null,
   times                int(5),
   primary key (auction_id)
)
engine=innodb default charset=utf8;

/*==============================================================*/
/* Table: auction_record                                        */
/*==============================================================*/
create table auction_record
(
   id                   bigint not null auto_increment,
   auction_id           bigint not null,
   product_id           bigint not null,
   user_id              bigint not null,
   price                double(11,2) not null,
   create_time          datetime not null,
   primary key (id)
)
engine=innodb default charset=utf8;

/*==============================================================*/
/* Table: club                                                  */
/*==============================================================*/
create table club
(
   club_id              bigint not null auto_increment,
   club_name            varchar(30) not null,
   parent_id            bigint not null,
   telephone            varchar(20),
   primary key (club_id)
)
engine=innodb default charset=utf8;

/*==============================================================*/
/* Table: merchant                                              */
/*==============================================================*/
create table merchant
(
   merchant_id          bigint not null auto_increment,
   club_id              bigint not null,
   nickname             varchar(30),
   login_name           varchar(30) not null,
   password             varchar(50) not null,
   real_name            varchar(30) not null,
   telephone            varchar(20),
   mobile_phone         int(20) not null,
   emall                varchar(20) not null,
   identity_card        varchar(20) not null,
   sex                  tinyint(1) not null,
   primary key (merchant_id)
)
engine=innodb default charset=utf8;

/*==============================================================*/
/* Table: orders                                                */
/*==============================================================*/
create table orders
(
   order_id             bigint not null auto_increment,
   order_code           varchar(20) not null,
   product_id           bigint not null,
   merchant_id          bigint not null,
   user_id              bigint not null,
   order_status         tinyint(1) not null comment '0：等待付款
            1：已支付
            2：超时未支付
            3：待发货
            4：已发货
            5：超时支付关闭订单
            6：正常关闭订单
            ',
   trade_mode           tinyint(1) not null comment '0：正常购买
            1：竞拍购买',
   is_pay               tinyint(1),
   pay_mode             tinyint(1) not null comment '0：支付宝
            1：银行',
   amount               double(11,2) not null,
   pay_time             datetime,
   last_pay_time        datetime not null,
   create_time          datetime not null,
   primary key (order_id)
)
engine=innodb default charset=utf8;

/*==============================================================*/
/* Table: product                                               */
/*==============================================================*/
create table product
(
   product_id           bigint not null auto_increment,
   categroy_id          bigint not null,
   merchant_id          bigint,
   club_id              bigint not null,
   product_name         varchar(20) not null,
   category_id          tinyint(1) not null,
   product_price        double(11,2) not null,
   storage_num          int(5),
   sell_num             int(6),
   status               tinyint(1) not null comment '0：下架；
            1：待上架；
            2：上架',
   create_time          datetime not null,
   keyword              varchar(50),
   short_desc           varchar(50),
   detail_desc          text,
   update_time          datetime,
   sort_order           int(2),
   is_freeze            tinyint(1),
   trade_model          tinyint(1) not null comment '0：买卖模式
            1：拍卖模式',
   primary key (product_id)
)
engine=innodb default charset=utf8;

/*==============================================================*/
/* Table: product_categroy                                      */
/*==============================================================*/
create table product_categroy
(
   categroy_id          bigint not null auto_increment,
   categroy_name        varchar(20) not null,
   level                tinyint(1) not null,
   parent_id            bigint,
   status               tinyint(1) not null comment '0：不启用
            1：启用',
   create_time          datetime not null,
   update_time          datetime,
   primary key (categroy_id)
)
engine=innodb default charset=utf8;

/*==============================================================*/
/* Table: product_picture                                       */
/*==============================================================*/
create table product_picture
(
   id                   bigint not null auto_increment,
   product_id           bigint not null,
   picture_url          varchar(50) not null,
   is_enable            tinyint(1) not null comment '0：不启用
            1：启用',
   sort                 tinyint(1) not null,
   primary key (id)
)
engine=innodb default charset=utf8;

/*==============================================================*/
/* Table: product_price_record                                  */
/*==============================================================*/
create table product_price_record
(
   id                   bigint not null auto_increment,
   history_price        double(11,2) not null,
   history_time         datetime not null,
   product_id           bigint not null,
   primary key (id)
)
engine=innodb default charset=utf8;

/*==============================================================*/
/* Table: users                                                 */
/*==============================================================*/
create table users
(
   user_id              bigint not null auto_increment,
   login_name           varchar(20) not null,
   password             varchar(50) not null,
   nickname             varchar(20),
   real_name            varchar(20),
   sex                  tinyint(1) not null,
   primary key (user_id)
)
engine=innodb default charset=utf8;

alter table auction_product add constraint fk_auction_product_ref_club foreign key (club_id)
      references club (club_id) on delete restrict on update restrict;

alter table auction_product add constraint fk_auction_product_ref_merchant foreign key (merchant_id)
      references merchant (merchant_id) on delete restrict on update restrict;

alter table auction_product add constraint fk_auction_product_ref_product foreign key (product_id)
      references product (product_id) on delete restrict on update restrict;

alter table auction_product add constraint fk_auction_product_ref_users foreign key (user_id)
      references users (user_id) on delete restrict on update restrict;

alter table auction_record add constraint fk_auction_record_ref_auction_product foreign key (auction_id)
      references auction_product (auction_id) on delete restrict on update restrict;

alter table auction_record add constraint fk_auction_record_ref_product foreign key (product_id)
      references product (product_id) on delete restrict on update restrict;

alter table auction_record add constraint fk_auction_record_ref_users foreign key (user_id)
      references users (user_id) on delete restrict on update restrict;

alter table merchant add constraint fk_merchant_ref_club foreign key (club_id)
      references club (club_id) on delete restrict on update restrict;

alter table orders add constraint fk_orders_ref_merchant foreign key (merchant_id)
      references merchant (merchant_id) on delete restrict on update restrict;

alter table orders add constraint fk_orders_ref_product foreign key (product_id)
      references product (product_id) on delete restrict on update restrict;

alter table orders add constraint fk_orders_ref_users foreign key (user_id)
      references users (user_id) on delete restrict on update restrict;

alter table product add constraint fk_product_ref_categroy foreign key (categroy_id)
      references product_categroy (categroy_id) on delete restrict on update restrict;

alter table product add constraint fk_product_ref_club foreign key (club_id)
      references club (club_id) on delete restrict on update restrict;

alter table product add constraint fk_product_ref_merchant foreign key (merchant_id)
      references merchant (merchant_id) on delete restrict on update restrict;

alter table product_picture add constraint fk_product_picture_ref_product foreign key (product_id)
      references product (product_id) on delete restrict on update restrict;

alter table product_price_record add constraint fk_product_price_record_ref_product foreign key (product_id)
      references product (product_id) on delete restrict on update restrict;

