
SELECT upper(ename) FROM emp 

SELECT LENGTH (ename) FROM EMP 

SELECT substr(ename , 2) FROM EMP

SELECT substr(ename ,1,2) FROM EMP

SELECT substr(ename , -2) FROM EMP

SELECT replace(ename, 'l','n') FROM EMP

SELECT LPAD(ename , 8 , '*') FROM emp 

SELECT CONCAT(EMPNO ,ename) FROM EMP 

SELECT CONCAT(CONCAT(EMPNO ,':') , ename) FROM EMP 

SELECT EMPNO || ':' || ENAME FROM EMP 

SELECT LENGTH(ENAME) FROM EMP

SELECT LENGTH(TRIM(ENAME)) FROM EMP

SELECT TRIM(BOTH 'A' from ename) FROM emp -- 양쪽 끝에 A를 제거

SELECT TRIM(LEADING 'A' from ename) FROM emp -- 앞쪽에 A를 제거

SELECT TRIM(TRAILING 'A' from ename) FROM emp -- 뒤쪽에 A를 제거

SELECT REPLACE (ENAME , ' ' , '') FROM EMP


SELECT * FROM EMP

UPDATE EMP
SET COMM = 0
WHERE COMM IS NULL

SELECT * FROM EMP

SELECT SAL + COMM AS TOTAL FROM EMP



--ENAME의 글자수 검색
SELECT LENGTH(ENAME)  FROM EMP

--JOB이 MANAGER인 사람의 ENAME 글자수 검색
SELECT LENGTH(ENAME) FROM EMP
WHERE JOB = 'MANAGER' 

--COMM이 null인 사람의 ENAME, JOB 검색

SELECT ENAME , JOB FROM EMP
WHERE COMM IS NULL

--COMM이 null이 아닌 사람의 HIREDATE 검색

SELECT HIREDATE FROM EMP
WHERE COMM IS NOT NULL

--ENAME의 2번째글자부터 끝까지 검색

SELECT SUBSTR(ENAME , 2) FROM EMP 

--JOB의 1번째 글자부터 3번째 글자까지 검색

SELECT SUBSTR(JOB , 1 , 3) FROM EMP

--ENAME의 글자 중 K를 P으로 변경하여 검색

SELECT REPLACE(ENAME , ' K' , 'P') FROM EMP

--ENAME과 ENPNO을 이용하여 ‘7369번은 SMITH입니다'로 출력

SELECT ENAME || '번은' || EMPNO || '입니다.' FROM EMP

--HIREDATE 이용하여 입사한 월과 요일을 출력

SELECT   HIREDATE ,
TO_CHAR(HIREDATE , 'month') AS MONTH,
TO_CHAR(HIREDATE , 'day')  AS DAY
FROM EMP


--JOB이 MANAGER이면 level1, SALESMAN이면 level2, 기타이면 level3라고 LEVEL_RESULT컬럼에 출력

SELECT job , 
CASE job
 	WHEN 'MANAGER' THEN 'level1'
 	WHEN 'SALESMAN' THEN 'level2'
 	ELSE 'level3'
END AS level_result
FROM emp


------------------------------------

SELECT COUNT(*) FROM EMP

SELECT COUNT(SAL) FROM EMP

SELECT COUNT(SAL), sum(SAL), AVG(SAL) , MIN(SAL) , MAX(SAL) FROM EMP
WHERE JOB = 'SALESMAN'

SELECT job, COUNT(SAL), sum(SAL), AVG(SAL) , MIN(SAL) , MAX(SAL) FROM EMP
GROUP BY JOB 

SELECT job, COUNT(SAL), sum(SAL), round(AVG(SAL)) , MIN(SAL) , MAX(SAL) FROM EMP --round 소수점제거
GROUP BY JOB

SELECT job, COUNT(SAL), sum(SAL), round(AVG(SAL)) , MIN(SAL) , MAX(SAL) FROM EMP 
GROUP BY JOB
HAVING COUNT(sal) >= 4  --그룹을 지어서 검색 후 필터링을 하고자 하는 경우
ORDER BY job DESC -- 이미  모든 검색이 끝난후 그 결과를 정렬하고자 하는 경우


--전체 직원수 출력

SELECT COUNT(*) FROM EMP

--DEPTNO가 20이거나 MGR이 7700이하인 직원수 출력
SELECT count(*) FROM EMP
WHERE deptno = 20 OR MGR <= 7700

--DEPTNO가 10 또는 20인 직원의 SAL최저 출력

SELECT MIN(sal) FROM EMP
WHERE deptno = 10 OR deptno = 20

--직원의 SAL 최저, 최고, 합계 출력

SELECT MIN(sal) , MAX(sal) , SUM(sal) FROM emp  

--DEPTNO별  SAL 평균 출력

SELECT AVG(sal) FROM EMP
GROUP BY DEPTNO 

SELECT DEPTNO ,round(AVG(sal)) FROM EMP
GROUP BY DEPTNO  -- 소수점 제거

--DEPTNO별  SAL 합계를 DEPTNO 오름차순으로 출력

SELECT DEPTNO ,SUM(sal) FROM EMP
GROUP BY DEPTNO 
ORDER BY DEPTNO  

--DEPTNO별  SAL 평균이 2000이상인 SAL평균을 DEPTNO역순으로 출력

SELECT DEPTNO,AVG(sal) FROM EMP
GROUP BY DEPTNO 
HAVING avg(sal) >= 2000
ORDER BY deptno DESC 

--JOB이 MANAGER인 직원의 전체 수, 월급의 평균 검색

SELECT COUNT(*) , AVG(sal) FROM EMP
WHERE job = 'MANAGER'

--ENAME에 S를 포함하는 직원의 전체 수를 검색

SELECT COUNT(*) FROM EMP
WHERE ENAME LIKE '%S%'

--SAL이 3000이상이고,  COMM이 null이 아닌 직원의 전체 수 검색, SAL의 역순으로 출력

SELECT COUNT(*) FROM EMP
WHERE SAL >= 3000 AND COMM IS NOT NULL
ORDER BY SAL DESC



-- join : 왜 하는가? => 검색을 하고 싶은데 항목들이 여러개의 테이블에 흩어져 있는경우
--		  테이블을 모아서 검색
-- 2개의 테이블의 공통된 값들만 조인해서 검색
SELECT * FROM "MEMBER" m  , BBS b
WHERE m.ID = B.WRITER 

SELECT B."no", TITLE , NAME FROM "MEMBER" m  , BBS b
WHERE m.ID = B.WRITER 

----- Inner join: 테이블 간 공통된 값만 추출
----- emp 테이블과 dept 테이블을 조인하세요.
----- 하나의 컬럼 이상이 동일 해야한다.

SELECT e.EMPNO , e.ENAME , e.JOB  , d.DEPTNO , d.loc  FROM DEPT d  , EMP e 
WHERE d.deptno = e.DEPTNO 

SELECT * FROM "MEMBER" m  
left OUTER JOIN BBS b 
ON (m.id = b.WRITER)

SELECT * FROM "MEMBER" m  
right OUTER JOIN BBS b 
ON (m.id = b.WRITER)


SELECT * FROM EMP e 
RIGHT OUTER JOIN DEPT d 
ON (e.DEPTNO = d.DEPTNO)

SELECT * FROM EMP e 
LEFT OUTER JOIN DEPT d 
ON (e.DEPTNO = d.DEPTNO)

SELECT * FROM "MEMBER" m ,BBS b 
WHERE b.WRITER = m.ID 

SELECT * FROM "MEMBER" m 
LEFT OUTER JOIN BBS b 
ON (m.ID = b.WRITER)

SELECT * FROM  "MEMBER" m 
RIGHT OUTER JOIN BBS b 
on(m.id = b.WRITER)

CREATE TABLE company(
	id varchar2(200) primary KEY,
	name varchar2(200),
	addr varchar2(200),
	tel varchar2(200)
)

INSERT INTO company VALUES ('c100', 'good', 'seoul','011')

INSERT INTO company VALUES ('c200', 'joa', 'busan','012')

INSERT INTO company VALUES ('c300', 'maria', 'ulsan','013')

INSERT INTO company VALUES ('c400', 'my', 'kwangju','014')

SELECT * FROM company

SELECT * FROM company , PRODUCT
WHERE company.ID  = product.COMPANY 
]

SELECT * FROM COMPANY c 
RIGHT OUTER JOIN PRODUCT p 
ON(c.id = p.COMPANY)

SELECT * FROM COMPANY c 
LEFT OUTER JOIN PRODUCT p 
on(c.id = p.COMPANY)


--SQL을 3가지로 구분, 각각을 간단 설명, 예를 들어보세요.
 --DDL:데이터 항목정리 DML:데이터조작 DCL:DBMS제어

--DML로 할 수 있는 조작 4가지를 부르는 말
 -- creat read update delete

--DML의 조작 4가지에 해당하는 각 SQL문
 -- insert select update delete

--정형데이터 베이스란?
 --항목을 정해서 저장하는 데이터베이스

--스키마란?
 --데이터를 저장하기위한 틀

--제약조건이란? 예 1개 이상 Not null pk fk unique

--primary key를 왜 설정하는가?
-- Not null unique

--foreign key를 왜 설정하는가?
 --문제가 있는 데이터가 들어가지않게 자동체크

--저장할 대상을 부르는 말? 한글/영어
 -- 개체 , 엔티티

--varchar2와 char의 차이
 -- 가변  /    불변

--join을 왜 하는가?
 -- 검색할 내용이 여러 테이블에 합해서 검색해야하기 때문에


--join의 3가지 종류 비교 
 --inner join , left ,right



