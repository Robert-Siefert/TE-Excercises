-- 13. The directors of the movies in the "Harry Potter Collection" (4 rows)
select distinct person_name
from person
join movie on person.person_id = movie.director_id
join collection on collection.collection_id = movie.collection_id
where collection_name = 'Harry Potter Collection'
