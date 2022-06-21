start transaction;
CREATE SEQUENCE member_serial;
CREATE TABLE MEMBERS (
	member_id int NOT NULL DEFAULT nextval ('member_serial'),
	last_name varchar(40) NOT NULL,
	first_name varchar(40) NOT NULL,
	email_address varchar(200) NOT NULL,
	phone_number varchar(20),
	date_of_birth date NOT NULL,
	reminder_emails boolean NOT NULL,
	
	CONSTRAINT pk_member PRIMARY KEY (member_id)
);

CREATE SEQUENCE group_serial;
CREATE TABLE INTEREST_GROUP(
	group_number int NOT NULL DEFAULT nextval ('group_serial'),
	group_name varchar(40) not null,
	
	CONSTRAINT unique_group_name UNIQUE(group_name),   
	CONSTRAINT pk_interest_group PRIMARY KEY (group_number)
);

CREATE SEQUENCE event_serial;
CREATE TABLE EVENTS(
	event_number int NOT NULL DEFAULT nextval ('event_serial'),
	description varchar(200) NOT NULL,
	start_date date NOT NULL,
	start_time time NOT NULL,
	duration_minutes int NOT NULL CHECK (duration_minutes >= 30),
	group_number int NOT NULL,
	
	CONSTRAINT pk_events PRIMARY KEY (event_number),
	CONSTRAINT fk_group_number FOREIGN KEY (group_number) references interest_group(group_number)
);

 
CREATE TABLE GROUP_MEMBER(
	group_number int NOT NULL,
	member_id int NOT NULL,
	CONSTRAINT pk_group_member PRIMARY KEY (group_number, member_id),
	CONSTRAINT fk_group_member_group FOREIGN KEY (group_number) references interest_group(group_number),
	CONSTRAINT fk_group_member_member FOREIGN KEY (member_id) references members(member_id)
	
);

CREATE TABLE EVENT_MEMBER(
	event_number int NOT NULL,
	member_id int NOT NULL,
	CONSTRAINT pk_event_member PRIMARY KEY (event_number, member_id),
	CONSTRAINT fk_event_member_event FOREIGN KEY (event_number) references events(event_number),
	CONSTRAINT fk_event_member_member FOREIGN KEY (member_id) references members(member_id)


);

INSERT INTO MEMBERS(first_name,last_name,email_address, date_of_birth,reminder_emails) 
VALUES('Tony','Stark','ironMan@starkindustries.com','1970-5-9',true);
INSERT INTO MEMBERS(first_name,last_name,email_address, date_of_birth,reminder_emails) 
VALUES('Steve','Rogers','FirstAvenger@gmail.com','1918-7-4',true);
INSERT INTO MEMBERS(first_name,last_name,email_address, date_of_birth,reminder_emails) 
VALUES('Thor','Odinson','StrongestAvenger@gmail.com','1047-1-1',false);
INSERT INTO MEMBERS(first_name,last_name,email_address, date_of_birth,reminder_emails) 
VALUES('Bruce','Banner','HulkSmash@gmail.com','1969-12-18',true);
INSERT INTO MEMBERS(first_name,last_name,email_address, date_of_birth,reminder_emails) 
VALUES('Peter','Parker','WebSlinger@gmail.com','2001-8-11',true);
INSERT INTO MEMBERS(first_name,last_name,email_address, date_of_birth,reminder_emails) 
VALUES('Steven','Strange','DoctorStrange@gmail.com','1964-4-15',false);
INSERT INTO MEMBERS(first_name,last_name,email_address, date_of_birth,reminder_emails) 
VALUES('Wanda','Maximoff','ScarletWitch@gmail.com','1980-1-1',false);
INSERT INTO MEMBERS(first_name,last_name,email_address, date_of_birth,reminder_emails) 
VALUES('Thanos','Thanos','Inevitable@gmail.com','1012-3-14',false);

INSERT INTO INTEREST_GROUP(group_name)VALUES('Space guys');
INSERT INTO INTEREST_GROUP(group_name)VALUES('Magic guys');
INSERT INTO INTEREST_GROUP(group_name)VALUES('Science guys');

INSERT INTO EVENTS(description,start_date,start_time,duration_minutes,group_number)
VALUES ('Science fair','2022-2-2','12:00:00',180,(SELECT group_number from interest_group where group_name = 'Science guys'));
INSERT INTO EVENTS(description,start_date,start_time,duration_minutes,group_number)
VALUES ('Magic convention','2022-9-11','16:00:00',600,(SELECT group_number from interest_group where group_name = 'Magic guys'));
INSERT INTO EVENTS(description,start_date,start_time,duration_minutes,group_number)
VALUES ('Space party','2525-2-5','00:00:00',60,(SELECT group_number from interest_group where group_name = 'Space guys'));
INSERT INTO EVENTS(description,start_date,start_time,duration_minutes,group_number)
VALUES ('Avengers club meetup','2022-6-21','09:00:00',240,(SELECT group_number from interest_group where group_name = 'Space guys'));

INSERT INTO GROUP_MEMBER(group_number, member_id)Values((SELECT group_number from interest_group where group_name = 'Space guys'),(SELECT member_id from members where first_name = 'Thor'));
INSERT INTO GROUP_MEMBER(group_number, member_id)Values((SELECT group_number from interest_group where group_name = 'Space guys'),(SELECT member_id from members where first_name = 'Thanos'));
INSERT INTO GROUP_MEMBER(group_number, member_id)Values((SELECT group_number from interest_group where group_name = 'Magic guys'),(SELECT member_id from members where first_name = 'Wanda'));
INSERT INTO GROUP_MEMBER(group_number, member_id)Values((SELECT group_number from interest_group where group_name = 'Magic guys'),(SELECT member_id from members where first_name = 'Steven'));
INSERT INTO GROUP_MEMBER(group_number, member_id)Values((SELECT group_number from interest_group where group_name = 'Science guys'),(SELECT member_id from members where first_name = 'Tony'));
INSERT INTO GROUP_MEMBER(group_number, member_id)Values((SELECT group_number from interest_group where group_name = 'Science guys'),(SELECT member_id from members where first_name = 'Peter'));

INSERT INTO EVENT_MEMBER(member_id,event_number)VALUES((SELECT member_id from members where first_name = 'Peter'),(SELECT event_number from events where description = 'Science fair'));
INSERT INTO EVENT_MEMBER(member_id,event_number)VALUES((SELECT member_id from members where first_name = 'Steven'),(SELECT event_number from events where description = 'Magic convention'));
INSERT INTO EVENT_MEMBER(member_id,event_number)VALUES((SELECT member_id from members where first_name = 'Thor'),(SELECT event_number from events where description = 'Space party'));
INSERT INTO EVENT_MEMBER(member_id,event_number)VALUES((SELECT member_id from members where first_name = 'Steve'),(SELECT event_number from events where description = 'Avengers club meetup'));
