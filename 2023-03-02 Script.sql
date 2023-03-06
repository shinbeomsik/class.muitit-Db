CREATE TABLE "HR"."MEMBER" 
   (	"ID" VARCHAR2(100), 
	"PW" VARCHAR2(100), 
	"NAME" VARCHAR2(100), 
	"TEL" VARCHAR2(100)
  )
  
  CREATE TABLE "HR"."BBS"
(	"no" VARCHAR2(100),
"TITLE" VARCHAR2(100),
"CONTENT" VARCHAR2(100),
"WRITER" VARCHAR2(100)
)

CREATE TABLE "HR"."PRODUCT"(
ID VARCHAR2(200),
NAME VARCHAR2(200),
CONTENT VARCHAR2(200),
PRICE VARCHAR2(200),
COMPANY VARCHAR2(200),
IMG VARCHAR2(200)
)


-- 저장할 대상: 엔티티(회원정보, 게시판, 상품), 엔티티간의 관계: 회원이 상품을 주문하다(주문정보)
--           엔티티 + 관계 ==> 테이블로 만들자!

CREATE TABLE "HR"."orderList"(
	"no" VARCHAR2(100),
	"member_id" VARCHAR2(100),
	"product_id" VARCHAR2(100),
	"total_count" VARCHAR2(100)
)


CREATE TABLE "HR"."BBS2" 
( "no" VARCHAR2(100), 
	"TITLE" VARCHAR2(100), 
	"CONTENT" VARCHAR2(100), 
	"WRITER" VARCHAR2(100), 
	 CONSTRAINT "BBS_PK22" PRIMARY KEY ("no"),
	 CONSTRAINT "FK_MEMBER22" FOREIGN KEY ("WRITER")
	  REFERENCES "HR"."MEMBER" ("ID")
) 


CREATE TABLE "HR"."BBS3" 
(	"no" VARCHAR2(100), 
	"TITLE" VARCHAR2(100), 
	"CONTENT" VARCHAR2(100), 
	"WRITER" VARCHAR2(100) 
) 


--pk 제약조건 추가

ALTER TABLE HR.BBS3
ADD CONSTRAINT BBS3_PK PRIMARY KEY ("no")

--fk 제약조건 추가

ALTER TABLE HR.BBS3 
ADD CONSTRAINT FK_MEMBER33 
FOREIGN KEY (WRITER) REFERENCES HR."MEMBER"(ID);


CREATE TABLE "HR"."DEPART2" 
   (	"ID" VARCHAR2(100), 
	"NAME" VARCHAR2(100), 
	"INSTRUCTOR" VARCHAR2(100), 
	 CONSTRAINT "DEPART2_PK" PRIMARY KEY ("ID")
	) 
	 
	
CREATE TABLE "HR"."STUDENT2" 
   (	"ID" VARCHAR2(100), 
	"NAME" VARCHAR2(100) NOT NULL ENABLE, 
	"TEL" VARCHAR2(100), 
	"DEPART_ID" VARCHAR2(100)
	)

ALTER TABLE HR.STUDENT2
ADD CONSTRAINT STUDENT2_PK PRIMARY KEY (ID)
ENABLE;

ALTER TABLE HR.STUDENT2 
ADD CONSTRAINT FK_DEPART2 
FOREIGN KEY (DEPART_ID) REFERENCES HR.DEPART2(ID);

--테이블 복사

CREATE TABLE "HR"."member22"
AS SELECT * FROM member
 

INSERT INTO "member22" 
VALUES ('banana3','banana3','banana3','banana3',sysdate)

SELECT * FROM "member22" 

INSERT INTO "member22" 
VALUES ('banana4','banana4','banana4','banana4',sysdate,'aaa')

INSERT INTO bbs
VALUES (bbs_id_seq.nextval, 'happy' , 'happy day', 'ice')

INSERT INTO bbs
VALUES (bbs_id_seq.nextval, 'happy2' , 'happy day2', 'ice')


SELECT * FROM BBS

CREATE SEQUENCE pd_id_seq 
INCREMENT BY 1
START WITH 1

CREATE TABLE product2 (
	id number(38,0),
	name varchar2(100)
)

INSERT INTO PRODUCT2 
VALUES (pd_id_seq.nextval, 'shoes')

SELECT * FROM PRODUCT2

CREATE TABLE orderlist3(
	id number(38,0),
	title varchar2(100),
	price number(38,0)
)

CREATE SEQUENCE or_seq
INCREMENT BY 1
START WITH 1

INSERT INTO ORDERLIST3 
VALUES (or_seq.nextval, '짬뽕',12000)

SELECT * FROM ORDERLIST3

SELECT * FROM ORDERLIST3
ORDER BY id --오름차순

SELECT * FROM ORDERLIST3 
ORDER BY id DESC --내림차순

SELECT * FROM ORDERLIST3 
WHERE id >= 3 
ORDER BY id DESC 

CREATE TABLE "HR"."MEMBER4"(
	ID VARCHAR2(100) PRIMARY KEY,
	PW VARCHAR2(100),
	NAME VARCHAR2(100),
	TEL VARCHAR2(100),
	TEAM DATE,
	COMPANY VARCHAR2(100) DEFAULT 'multi' NOT NULL,
	LOCATION VARCHAR2(100) UNIQUE
)


CREATE TABLE DEPT(
DEPTNO NUMBER(2),
DNAME VARCHAR2(14 BYTE),
LOC VARCHAR2(13 BYTE)
)

CREATE TABLE EMP(
EMPNO NUMBER(4),
ENAME VARCHAR2(10 BYTE),
JOB VARCHAR2(9 BYTE),
MGR NUMBER(4),
HIREDATE DATE,
SAL NUMBER(7,2),
COMM NUMBER(7,2),
DEPTNO NUMBER(2)
)

CREATE TABLE SALGRADE(
GRADE NUMBER,
LOSAL NUMBER,
HISAL NUMBER
)

ALTER TABLE DEPT ADD (
CONSTRAINT PK_DEPT
PRIMARY KEY
(DEPTNO));

 

ALTER TABLE EMP ADD (
CONSTRAINT PK_EMP
PRIMARY KEY
(EMPNO));

 

ALTER TABLE EMP ADD (
CONSTRAINT FK_DEPTNO
FOREIGN KEY (DEPTNO)
REFERENCES DEPT (DEPTNO));


SELECT * FROM EMP  --selection

SELECT deptno FROM EMP --projection

SELECT DISTINCT deptno FROM EMP

SELECT ename, sal * 12 AS yearsal FROM emp 

SELECT * FROM EMP
ORDER BY sal DESC

SELECT * FROM emp
WHERE deptno = 30
ORDER BY EMPNO desc

SELECT * FROM emp
WHERE NOT deptno = 30
ORDER BY EMPNO DESC

SELECT * FROM emp 
WHERE deptno = 30 AND job = 'SALESMAN'

SELECT * FROM emp 
WHERE deptno = 30 or job = 'SALESMAN'

SELECT * FROM emp 
WHERE sal >= 3000

SELECT * FROM emp 
WHERE sal != 3000

SELECT * FROM emp 
WHERE job IN ('SALESMAN', 'MANAGER')
ORDER BY JOB 

SELECT * FROM emp 
WHERE job NOT IN ('SALESMAN', 'MANAGER')
ORDER BY JOB 

SELECT * FROM emp 
WHERE SAL BETWEEN 2000 AND 3000 
ORDER BY EMPNO

SELECT * FROM emp 
WHERE SAL NOT BETWEEN 2000 AND 3000 
ORDER BY EMPNO

SELECT * FROM emp 
WHERE ENAME LIKE '_L%'

SELECT * FROM EMP
WHERE ENAME NOT LIKE '_L%'

SELECT * FROM EMP
WHERE COMM IS NULL

SELECT * FROM EMP
WHERE COMM IS NOT NULL

CREATE TABLE DEPT_TEMP2
AS SELECT * FROM dept

SELECT * FROM detp_temp2

UPDATE DEPT_TEMP2
SET LOC = 'SEOUL'

UPDATE DEPT_TEMP2
SET DNAME = 'DATABASE', LOC = 'BUSAN'
WHERE DEPTNO = 40

DELETE FROM DEPT_TEMP2 
WHERE DNAME = 'SALES'

-- 정리문제

SELECT * FROM PRODUCT2
ORDER BY PRICE DESC

SELECT NAME, CONTENT, PRICE FROM PRODUCT2
ORDER BY COMPANY

SELECT DISTINCT COMPANY FROM PRODUCT2

SELECT PRICE * 5 AS PRICE5 FROM PRODUCT2

SELECT NAME , COMPANY FROM PRODUCT2
WHERE PRICE = 5000

SELECT NAME, PRICE , COMPANY FROM PRODUCT2
WHERE  price BETWEEN 3000 AND 6000

SELECT COMPANY , NAME FROM PRODUCT2
WHERE  NOT  COMPANY = 'c100'

SELECT name , price FROM product2
WHERE company = 'c100' OR company = 'c200'

SELECT * FROM PRODUCT2
where name LIKE '%4'

SELECT * FROM PRODUCT2
WHERE content LIKE '%food%'

UPDATE product2
SET content  = '품절'
WHERE price = 5000

UPDATE product2
SET img = 'o.png' , price = 10000
WHERE id = '100' OR id = '102'

DELETE product2
WHERE company = 'c100'

DELETE product2

SELECT * FROM product2


--> insert, delete, update의 결과는 실행된 Row수!(정수)
--> select의 결과는 테이블이다.! 


--> varchar2, char의 차이 
--> varchar2(100) : var(변하다, variable) + char(문자)
-->           2글자이면 2글자들어갈 만큼만 저장공간을 사용
-->           100글자이면 100글자들어갈 만큼 저장공간을 저장 
--> char(100) : 저장공간이 고정, 주민번호, 전화번호, 우편번호, 사번 


--> 저장공간은 남겨두고, 데이터만 지움.
--> 데이터를 복구/취소(rollback, 롤백) 가능 
--> truncate로 지우면 저장공간도 남겨두지 않고, 복구/취소 불가능 


