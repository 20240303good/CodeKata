-- 코드를 입력하세요
select a.author_id as AUTHOR_ID,a.author_name as AUTHOR_NAME    ,b.category as CATEGORY,
sum (b.price * bk.sales) as TOTAL_SALES
from BOOK b join author a join BOOK_SALES  bk
where b.AUTHOR_ID =a.AUTHOR_ID
and b.BOOK_id  = bk.BOOK_id
and bk.sales_date like '2022-01-%'
group by  a.author_id,b.category
order by a.AUTHOR_ID     , b.category desc