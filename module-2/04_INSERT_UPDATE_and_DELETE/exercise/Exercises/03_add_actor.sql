-- 3. Did you know Eric Stoltz was originally cast as Marty McFly in "Back to the Future"? 
--Add Eric Stoltz to the list of actors for "Back to the Future" (1 row)


--insert into person (person_name)
--values('Eric Stoltz')

insert into movie_actor(
	movie_id, 
	actor_id)
values(
	select movie.movie_id from movie where movie.title = 'Back to the Future',
	select person.person_id from person where person.person_name = 'Eric Stoltz')
