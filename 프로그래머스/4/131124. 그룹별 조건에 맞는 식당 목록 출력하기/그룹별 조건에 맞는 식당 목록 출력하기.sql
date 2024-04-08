-- 코드를 입력하세요
select member_name, review_text, to_char(review_date, 'YYYY-MM-DD') as review_date
from member_profile mf, rest_review rr
where mf.member_id = rr.member_id
and mf.member_id in(
    select member_id
    from rest_review
    group by member_id
    having count(*) = (
        SELECT max(count(member_id))
        from rest_review
        group by member_id
    )
)
order by 3 asc, 2 asc