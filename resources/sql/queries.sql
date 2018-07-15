-- :name create-user! :! :n
-- :doc creates a new user record
INSERT INTO users
(id, first_name, last_name, email, pass)
VALUES (:id, :first_name, :last_name, :email, :pass)

-- :name update-user! :! :n
-- :doc updates an existing user record
UPDATE users
SET first_name = :first_name, last_name = :last_name, email = :email
WHERE id = :id

-- :name get-user :? :1
-- :doc retrieves a user record given the id
SELECT * FROM users
WHERE id = :id

-- :name delete-user! :! :n
-- :doc deletes a user record given the id
DELETE FROM users
WHERE id = :id

-- :name get-category :? :1
-- :doc retrieves a category record given the id
SELECT * FROM categories
WHERE id = :id

-- :name category-by-link :? :1
-- :doc Get character by case-insensitive name
select * from categories
where link = :link

-- :name get-categories :? :*
-- :doc selects all available categories
SELECT * from categories

-- :name article-by-link :? :1
-- :doc get article by link field
select * from articles
where link = :link

-- :name article-by-title :? :1
-- :doc get article by link field
select * from articles
where title = :title