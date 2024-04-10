-- 코드를 입력하세요
-- SELECT extract(month from start_date) as month, car_id, count(car_id) as records 
-- from car_rental_company_rental_history
-- where extract(month from start_date) between '08' and '10' 
-- group by car_id, extract(month from start_date)
-- having count(car_id) >= 5 and count(car_id) > 0
-- order by 1 asc, 2 desc
select *
from car_rental_company_rental_history
