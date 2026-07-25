# Write your MySQL query statement below
SELECT contest_id ,ROUND((COUNT(DISTINCT user_id)/
(
    SELECT COUNT(*) FROM Users )
    *100),2) as percentage

FROM Register
GROUP BY Contest_id
ORDER BY percentage desc,
Contest_id;