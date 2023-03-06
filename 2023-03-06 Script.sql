INSERT INTO DEPARTMENT  VALUES ('전기공학과', '공학관111')

SELECT * FROM DEPARTMENT d 

SELECT  * FROM  "record" r  , SUBJECT s , STUDENT_INFORMATION si , "DEPARTMENT" d 
WHERE S."강좌이름"  = R."강좌이름" 

UPDATE hr."record"  SET 성적 = '3.5' WHERE 학생번호 = '402' 

SELECT si.학생번호, si.학생이름, si.주소, si.학과 , d.학과, s.강좌이름, s.강의실 , r.성적
FROM STUDENT_INFORMATION si 
INNER JOIN DEPARTMENT d ON d.학과  = si.학과 
INNER JOIN "record" r  ON r.학생번호 = si.학생번호 
INNER JOIN SUBJECT s ON s.강좌이름 = r.강좌이름 

SELECT * FROM "record" r 

SELECT *  FROM STUDENT_INFORMATION si , DEPARTMENT d 
WHERE  si."학과" = d."학과"

SELECT * FROM STUDENT_INFORMATION si , "record" r 
WHERE r.학생번호  = si.학생번호 

SELECT * FROM STUDENT_INFORMATION si 
LEFT OUTER JOIN "record" r 
ON r.학생번호  = si.학생번호 

SELECT * FROM STUDENT_INFORMATION si 
RIGHT  OUTER JOIN "record" r 
ON r.학생번호  = si.학생번호 

SELECT * FROM "record" r  , SUBJECT s 
WHERE s.강좌이름 = r.강좌이름 

SELECT  * FROM "record" r 
LEFT OUTER JOIN SUBJECT s 
ON (s.강좌이름 = r.강좌이름)

SELECT * FROM "record" r 
RIGHT OUTER JOIN SUBJECT s 
ON (s.강좌이름 = r.강좌이름)







SELECT * FROM STUDENT_INFORMATION si WHERE 학생번호 IN
(SELECT 학생번호 FROM "record" r WHERE 성적 = 4)

SELECT * FROM "record" r WHERE 강좌이름 =
(SELECT 강좌이름 FROM subject WHERE 강의실 = '공학관 110')


SELECT r.ID , r.제목, r.공개여부, ri.코드 , ri.이슈 , g.ID, g.NAME ,g.TEL  
FROM REPOSITORIES r 
INNER JOIN "repositories info" ri  ON r."NO" =ri."NO" 
INNER JOIN GITHUB g ON  r.ID = g.ID 



INSERT INTO "MEMBER" 
VALUES ('com','com','com','com')

UPDATE "MEMBER" SET tel = '999'
WHERE ID = 'com'

DELETE FROM "MEMBER" m 
WHERE id = 'com'

SELECT * FROM "MEMBER" m 

