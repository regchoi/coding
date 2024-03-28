-- 코드를 입력하세요
SELECT b.author_id, c.author_name, b.category, sum(a.sales * b.price) as total_sales
from book_sales a, book b, author c
where to_char(a.sales_date, 'YYYY-MM') in '2022-01'
    and a.book_id = b.book_id
    and b.author_id = c.author_id
group by b.author_id, c.author_name, b.category
order by 1 asc, 3 desc

