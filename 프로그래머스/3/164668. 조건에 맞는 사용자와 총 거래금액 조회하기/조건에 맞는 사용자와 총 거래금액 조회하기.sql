-- 코드를 입력하세요
SELECT gu.user_id, gu.nickname, sum(gb.price) as total_sales
from used_goods_board gb
join used_goods_user gu on gb.writer_id = gu.user_id
where status = 'DONE'
group by gb.writer_id
having total_sales >= 700000
order by total_sales asc

