
CREATE TABLE "HR"."NOTICE" 
   (	"BOARDNO" NUMBER(38,0), 
	"TITLE" VARCHAR2(100), 
	"CONTENTS" VARCHAR2(100), 
	"WRITER" VARCHAR2(100), 
	"WRITEDATE" DATE, 
	"RECOMMEND" NUMBER(38,0), 
	"VIEW_COUNT" NUMBER(38,0)
   )
   
  --  추천게시판(recommend)
  -- re_no 숫자
  -- title, content, writer ==> 문자
   
   CREATE TABLE "HR"."RECOMMEND" 
   ( "RE_NO" NUMBER(38,0),
   	"TITLE" VARCHAR2(100),
   	"CONTENT" VARCHAR2(100),
   	"WRITER" VARCHAR2(100)
   )
   
  DROP TABLE RECOMMEND  -- 테이블 통째로 던져버림
  
   CREATE TABLE "HR"."RECOMMEND" 
   ( "RE_NO" NUMBER(38,0),
   	"TITLE" VARCHAR2(100),
   	"CONTENT" VARCHAR2(100),
   	"WRITER" VARCHAR2(100)
   )
  
  ALTER TABLE HR.RECOMMEND ADD VIEWCOUNT NUMBER(38,0) NULL;
 
   ALTER TABLE HR.RECOMMEND  DROP COLUMN VIEWCOUNT;
 
CREATE TABLE "HR"."BOARD3" 
   (	"BOARDNO" NUMBER(38,0), 
	"TITLE" VARCHAR2(100), 
	"CONTENTS" VARCHAR2(100), 
	"WRITER" VARCHAR2(100), 
	"WRITEDATE" DATE, 
	"RECOMMEND" NUMBER(38,0), 
	"VIEW_COUNT" NUMBER(38,0)
   )
   
   ALTER TABLE BOARD3 MODIFY WRITER VARCHAR2(200)
  
   ALTER TABLE BOARD3 DROP COLUMN VIEWCOUNT
   
   ALTER TABLE BOARD3 ADD VIEWCOUNT VARCHAR2(100)
   
   ALTER TABLE HR.BOARD3 ADD TEST VARCHAR2(100) NULL;
  
   ALTER TABLE HR.BOARD3 ADD TEST2 VARCHAR2(100) NULL;
  
   ALTER TABLE HR.BOARD3 ADD TEST3 VARCHAR2(100) NULL;
  
  ALTER TABLE HR.BOARD3 DROP COLUMN TEST;

   ALTER TABLE HR.BOARD3 DROP COLUMN TEST2;
   
  ALTER TABLE HR.BOARD3 DROP COLUMN TEST3;
  
 DROP TABLE BOARD3
 
 -- DCL : DB 관리/제어해주는 문법(계정생성, 계정권한부여, 백업, 복구)
 
 
 CREATE USER apple IDENTIFIED BY a1234
 
 GRANT CONNECT, resource, dba TO apple
 
 
 
 INSERT INTO MEMBER VALUES ('100', '100','PARK','011')

 INSERT INTO MEMBER VALUES ('200', '200','PARK','011')
 
 INSERT INTO MEMBER VALUES ('300', '300','PARK','011')
 
 SELECT * FROM  MEMBER
 
 SELECT * FROM MEMBER WHERE ID = '100' -- ID가 100인 모든 컬럼
 
 SELECT ID FROM MEMBER WHERE ID = '100' -- ID가 100인 ID 컬럼
 
 SELECT ID, NAME FROM MEMBER WHERE ID = '100' -- ID가 100인 ID, NAME 컬럼
 
 SELECT NAME, ID FROM MEMBER WHERE ID = '100' -- ID가 100인 NAME, ID 컬럼

 SELECT NAME, ID AS 아이디 FROM MEMBER WHERE ID = '100' -- ID가 100인 NAME, ID 컬럼
 
 SELECT TEL FROM MEMBER WHERE NAME  = 'PARK'

 UPDATE MEMBER SET NAME ='kim' WHERE ID = '100'
 
 UPDATE MEMBER SET NAME ='yang' WHERE ID = '200'
 
 UPDATE MEMBER SET NAME ='lee' WHERE ID = '300'
 
 SELECT * FROM  MEMBER
 
 UPDATE MEMBER SET tel = '999', pw = '8888' WHERE id = 'ice'
 
 DELETE FROM MEMBER WHERE id = '100'
 
 DELETE FROM MEMBER WHERE tel = '011'
 
 SELECT * FROM MEMBER WHERE id ='200' AND tel = '011'
 
 SELECT * FROM MEMBER WHERE id ='200' OR  tel = '011'
 
 SELECT * FROM MEMBER ORDER BY id  -- 오름차순
  
 SELECT * FROM MEMBER ORDER BY id DESC -- 내림차순
 
 CREATE TABLE product (
  id varchar2(200),
  name varchar2(200),
  content varchar2(200),
  price varchar2(200),
  company varchar2(200),
  img varchar2(200)
 )
 
 -- price로 내림차순 정렬하여 전체컬럼 검색
 
SELECT * FROM PRODUCT ORDER BY PRICE DESC

 -- company로 오름차순 정렬하여 제품의 이름, 내용, 가격 검

 SELECT NAME, CONTENT, PRICE FROM PRODUCT ORDER BY COMPANY
 
 -- id가 100인 제품의 이름과 가격 검색
 
 SELECT NAME, PRICE FROM PRODUCT WHERE ID = '100'
 
 -- price가 5000인 제품명과 회사명
 
 SELECT NAME, COMPANY FROM PRODUCT WHERE PRICE = '5000'
 
 -- id가 100이고 가격이 1000인 제품명과 이미지 검색
 
 SELECT NAME, IMG FROM PRODUCT WHERE ID = '100' AND PRICE = '1000'
 
 -- 회사명이 c100인 회사명과 제품명
 
 SELECT COMPANY, PRICE FROM PRODUCT WHERE COMPANY = 'c100'
 
 --회사명이 c100, c200인 제품명과 가격
 
 SELECT name, price FROM product WHERE company = 'c100' OR company = 'c200'
 
 --price가 5000원인 제품의 content를 품절로 수정
 
 UPDATE product SET content = '품절' WHERE price = '5000'
 
 
 --id가 100, 102번 제품의 img를 o.png로, price를 10000으로 수정
 
 UPDATE product SET img = 'o.png' , price = '10000' WHERE id = '100' OR id = '102'
 
 
 --id가 101번 제품의 company를 apple, name은 appleshoes로 수정
 
 UPDATE product SET company = 'apple' , name = 'appleshoes' WHERE id = '101'
 
 --name이 shoes1이거나 id가 107인 제품 삭제
 
 DELETE FROM product WHERE name = 'shoes1' OR id = '107'
 
 --회사명이 c100인 경우 모든 정보 삭제
 
 DELETE FROM product WHERE company = 'c100'
 
 --테이블의 모든 정보 삭제
 
 DELETE FROM product 
 
 --테이블삭제
 
 DROP TABLE product
 