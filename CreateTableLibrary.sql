use library;
CREATE TABLE genre (
    genreName VARCHAR(20) NOT NULL PRIMARY KEY
 );
CREATE TABLE book 
(
id INT PRIMARY KEY AUTO_INCREMENT, 
bookName varchar(50) NOT NULL, 
author_id INT,
genre varchar(20), 
ISBN varchar(20),  
printDate DATE,
   FOREIGN KEY (genre)
        REFERENCES genre (genreName)
) ;
alter table book add index par_ind(author_id);
CREATE TABLE author  
(
id INT PRIMARY KEY AUTO_INCREMENT, 
authorName varchar(50) NOT NULL,  
birthDate DATE,
CONSTRAINT author_id_fk
FOREIGN KEY (id)  REFERENCES book (author_id)
ON DELETE CASCADE
);
