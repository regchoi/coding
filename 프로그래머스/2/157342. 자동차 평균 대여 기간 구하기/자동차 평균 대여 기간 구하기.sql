SELECT car_id, round(avg(datediff(end_date, start_date) + 1), 1)
from car_rental_company_rental_history
group by car_id
having avg(datediff(end_date, start_date) + 1) >= 7
order by 2 desc, 1 desc