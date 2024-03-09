-- 코드를 입력하세요
select food_type, rest_id, rest_name, favorites
from rest_info as main
where main.favorites = (
    SELECT max(favorites)
    from rest_info as sub
    where main.food_type = sub.food_type
    )
order by food_type desc
