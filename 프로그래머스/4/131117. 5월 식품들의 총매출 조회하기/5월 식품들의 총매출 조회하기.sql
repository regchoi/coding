-- 코드를 입력하세요
SELECT fo.product_id, fp.product_name, sum(fo.amount * fp.price) as totalsales
from food_order fo, food_product fp
where to_char(fo.produce_date, 'YYYY-MM') = '2022-05'
and fo.product_id = fp.product_id
group by fo.product_id, fp.product_name
order by 3 desc, 1 asc

