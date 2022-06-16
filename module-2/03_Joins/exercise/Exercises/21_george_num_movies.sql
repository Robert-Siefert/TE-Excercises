
select count(movie.title) as num_of_movies, person_name
from movie
join movie_actor on movie_actor.movie_id = movie.movie_id
join person on person_id = movie_actor.actor_id or person_id = movie.director_id
where person_name like 'George %'
group by person_id
order by person.person_name asc;
--