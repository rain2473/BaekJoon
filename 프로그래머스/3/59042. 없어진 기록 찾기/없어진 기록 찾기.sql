-- 코드를 입력하세요
SELECT A.ANIMAL_ID
     , A.NAME
  FROM ANIMAL_OUTS A, ANIMAL_INS B
 WHERE A.ANIMAL_ID = B.ANIMAL_ID(+)
   AND B.ANIMAL_ID IS NULL
 ORDER BY ANIMAL_ID
;