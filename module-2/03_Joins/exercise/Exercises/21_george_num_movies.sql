-- 21. For every person in the person table with the first name of "George", list the number of movies they've been in--include all Georges, even those that have not appeared in any movies. Display the names in alphabetical order. (59 rows)
select count(movie.movie_id) as num_of_movies, person.person_name
from person
left join movie_actor on actor_id = person.person_id
left join movie on movie_actor.movie_id = movie.movie_id
where person_name like 'George %'
group by person_id
order by person.person_name ASC;
