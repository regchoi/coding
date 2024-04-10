-- 코드를 입력하세요
-- SELECT extract(month from start_date) as month, car_id, count(car_id) as records 
-- from car_rental_company_rental_history
-- where extract(month from start_date) between '08' and '10' 
-- group by car_id, extract(month from start_date)
-- having count(car_id) >= 5
-- order by 1 asc, 2 desc
select extract(month from start_date) as month, car_id, count(*) as records
from car_rental_company_rental_history
where car_id in (
    select car_id
    from car_rental_company_rental_history
    where extract(month from start_date) between '08' and '10'
    group by car_id
    having count(*) > 4
) 
    and extract(month from start_date) >= 8
    and extract(month from start_date) < 11
group by extract(month from start_date), car_id
having count(*) <> 0
order by 1 asc, 2 desc
