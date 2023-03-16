
/* Leetcode Solution URL: https://leetcode.com/problems/combine-two-tables/submissions/915094101/ 
 * 175. Combine Two Tables
 * */
select p.firstName,p.lastName, a.city, a.state 
from person p 
left join address a
on p.personId = a.personId;

