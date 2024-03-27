-- 코드를 입력하세요
select a.car_id, a.car_type, a.daily_fee * 30 * (1 - b.discount_rate/100) as fee
from car_rental_company_car a,
    car_rental_company_discount_plan b
where a.car_type = b.car_type
    and a.car_type in ('세단', 'SUV')
    and b.duration_type = '30일 이상'
    and a.car_id not in (
        select c.car_id
        from car_rental_company_rental_history c
        where '202211' between to_char(start_date, 'YYYYMM') and to_char(end_date, 'YYYYMM') and a.car_id = c.car_id
    )
    and a.daily_fee * 30 * (1 - b.discount_rate/100) between 500000 and 2000000 - 1
order by 3 desc, 2 asc, 1 desc