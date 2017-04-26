IF NOT EXISTS(
CREATE TABLE `CUSTOMER` (
  `id` mediumint(8) unsigned NOT NULL,
  `firstName` varchar(255) default NULL,
  `lastName` varchar(255) default NULL,
  `birthdate` varchar(255),
  PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;)

IF NOT EXISTS(create table Course
              (
              	CourseId bigint not null auto_increment
              		primary key,
              	Code varchar(100) not null,
              	TypeCode varchar(100) not null,
              	SubTypeCode varchar(100) not null,
              	SiteCode varchar(25) not null,
              	RevisionDate bigint not null,
              	Title varchar(300) not null,
              	description varchar(2000) not null,
              	ContactHours double null,
              	LastModifiedBy varchar(100) null,
              	LastModifiedOn datetime null,
              	CreatedBy varchar(100) null,
              	CreatedOn datetime null,
              	constraint `Course$IndxUnq`
              		unique (TypeCode, Code, RevisionDate)
              );
)