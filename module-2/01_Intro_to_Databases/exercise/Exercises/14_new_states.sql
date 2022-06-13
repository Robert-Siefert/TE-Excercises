-- 14. The state name, nickname, and census region for states that start with the word "New" (4 rows)
select state_name, state_nickname, Census_region
from state
where state_name like 'New%'
