-- 코드를 입력하세요
select flavor
from(
    select flavor, sum(total) as total
    from (
        SELECT flavor, sum(total_order) as total
        from july 
        group by flavor

        union all

        SELECT flavor, sum(total_order) as total
        from first_half
        group by flavor
    ) total
    group by flavor
    order by total desc
)
where rownum <= 3