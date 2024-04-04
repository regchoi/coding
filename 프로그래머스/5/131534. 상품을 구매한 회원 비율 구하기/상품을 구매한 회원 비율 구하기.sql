-- 코드를 입력하세요
select to_char(os.sales_date, 'yyyy') as YEAR,
    to_number(to_char(os.sales_date, 'mm')) as MONTH,
    count(distinct os.user_id) as puchased_users,
    round(count(distinct os.user_id) / (SELECT count(distinct user_id)
    from user_info
    where to_char(joined, 'y') = 1), 1) as puchased_ratio
from online_sale os
where os.user_id in (
    SELECT user_id
    from user_info
    where to_char(joined, 'yyyy') = 2021
)
group by to_char(os.sales_date, 'yyyy'), to_char(os.sales_date, 'mm')
order by to_char(os.sales_date, 'mm')