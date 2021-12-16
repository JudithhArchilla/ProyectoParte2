CREATE EXTENSION IF NOT EXISTS pgcrypto;
INSERT INTO usser (username, password) VALUES ('user', crypt('pass123', gen_salt('bf')));

INSERT INTO anime(name, description, type, year, imageurl) VALUES
    ('Anime 1','Anime 1 description', 'TV', '2021', 'image1.jpg'),
    ('Anime 2','Anime 2 description', 'Film', '2020', 'image2.jpg');

INSERT INTO author(name, imageurl) VALUES
    ('Author 1','author.jpg'),
    ('Author 2','author2.jpg');

INSERT INTO genre(label, imageurl) VALUES
    ('Genre 1', 'imagen1.png'),
    ('Genre 2', 'imagen2.png');

INSERT INTO anime_author VALUES
    ((SELECT animeid FROM anime WHERE name='Anime 1'),(SELECT authorid FROM author WHERE name ='Author 1')),
    ((SELECT animeid FROM anime WHERE name='Anime 2'),(SELECT authorid FROM author WHERE name ='Author 2'));

INSERT INTO anime_genre VALUES
    ((SELECT animeid FROM anime WHERE name ='Anime 1'),(SELECT genreid FROM genre WHERE label='Genre 1')),
    ((SELECT animeid FROM anime WHERE name ='Anime 2'),(SELECT genreid FROM genre WHERE label='Genre 2'));

INSERT INTO favorite VALUES
    ((SELECT userid FROM usser WHERE username = 'user'),(SELECT animeid FROM anime WHERE name ='Anime 1'));
