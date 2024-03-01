-- 코드를 작성해주세요
select item_id, item_name, rarity
from item_info
where item_id in (
    select it.item_id
    from item_tree it
    left join item_info ii on it.parent_item_id = ii.item_id
    where rarity = 'RARE'
    )
order by item_id desc
