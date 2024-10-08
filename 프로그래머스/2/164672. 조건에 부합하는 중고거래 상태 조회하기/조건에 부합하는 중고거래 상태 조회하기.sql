-- 코드를 입력하세요
SELECT BOARD_ID, WRITER_ID, TITLE, PRICE, 
    CASE WHEN STATUS = "SALE" then "판매중"
    WHEN STATUS = "RESERVED" then "예약중"
    WHEN STATUS = "DONE" then "거래완료"
    end as STATUS
FROM USED_GOODS_BOARD
WHERE 1=1
AND CREATED_DATE = "2022-10-05"
order by 1 desc