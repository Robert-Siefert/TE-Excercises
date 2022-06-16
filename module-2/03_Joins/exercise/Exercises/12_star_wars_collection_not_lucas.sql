-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas (5 rows)

select title
from movie
join collection on collection.collection_id = movie.collection_id
join person on movie.director_id = person.person_id
where collection_name = 'Star Wars Collection' and person_name <> 'George Lucas'

