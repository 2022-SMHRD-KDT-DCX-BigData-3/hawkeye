CREATE TABLE member
(
    id VARCHAR2(20) NOT NULL,
    pw VARCHAR2(20) NOT NULL,
    nick VARCHAR2(20) NOT NULL,
    CONSTRAINT id_pk PRIMARY KEY (id)
);

drop table member;


insert into tblBoard(title, content, writer)
value('게시글 1','게시글 1','관리자');

insert into tblBoard(title, content, writer)
value('게시글 2','게시글 2','홍길동');

insert into tblBoard(title, content, writer)
value('게시글 3','게시글 3','김길동');

select * from tblBoard;

delete from tblBoard where idx = 17;
create table tblMember(
	memId varchar(30) not null,
	memPwd varchar(30) not null,
	memName varchar(30) not null,
	primary key(memId)
);

insert into tblMember values('smhrd01','smhrd01','관리자');
insert into tblMember values('smhrd02','smhrd02','홍길동');
insert into tblMember values('smhrd03','smhrd03','허아름');

select * from tblMember;



CREATE TABLE member
(
    id VARCHAR2(20) NOT NULL,
    pw VARCHAR2(20) NOT NULL,
    nick VARCHAR2(20) NOT NULL,
    CONSTRAINT id_pk PRIMARY KEY (id)
);

drop table member;


create table Board
(idx number,
title varchar2(20),
writer varchar2(20),
content varchar2(200),
constraint idx_pk primary key (idx)
);


insert into member values('crismoon','aa','아기곰');

select * from member;


