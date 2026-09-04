SELECT e1.employee_id , e1.name , COUNT(e2.reports_to IS NOT NULL) AS reports_count , ROUND(AVG(e2.age)) AS average_age 
FROM Employees e1
LEFT JOIN Employees e2
ON e1.employee_id = e2.reports_to
GROUP BY e1.employee_id,e1.name
HAVING COUNT(e2.employee_id)>0
ORDER BY e1.employee_id;