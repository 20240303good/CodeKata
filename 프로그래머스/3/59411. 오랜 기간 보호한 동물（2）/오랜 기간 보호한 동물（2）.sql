-- 코드를 입력하세요
SELECT a.ANIMAL_ID, a.NAME
FROM (SELECT o.ANIMAL_ID, o.NAME,datediff(o.DATETIME,i.DATETIME)+1 as datediff 
      from ANIMAL_INS as i, ANIMAL_OUTS as o
      where i.ANIMAL_ID=o.ANIMAL_ID
      order by 3 desc
      limit 2
      ) a