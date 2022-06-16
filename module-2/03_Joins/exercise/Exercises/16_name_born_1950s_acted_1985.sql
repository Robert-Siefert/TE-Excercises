-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985 (20 rows)

select distinct person_name, birthday
from person
join movie_actor on actor_id = person_id
join movie on movie.movie_id = movie_actor.movie_id
where person.birthday between'1950-1-1' and '1959-12-31' and release_date between '1985-1-1' and '1985-12-31'