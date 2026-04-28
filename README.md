## Profiling results:
- /all-student-name
(GUI)
- Before optimization: ![img.png](profiling-img/all-student-name/img.png)
- After optimization: ![img_opti.png](profiling-img/all-student-name/img_opti.png)
(CLI)
![cli.png](profiling-img/all-student-name/cli.png)

- /highest-gpa
(GUI)
- Before optimization: ![img.png](profiling-img/highest-gpa/img.png)
- After optimization: ![img_opti.png](profiling-img/highest-gpa/img_opti.png)
(CLI)
![cli.png](profiling-img/highest-gpa/cli.png)

## Conclusion:
From the table results attached in the readme of these two endpoints, 
it is clear that the optimizations done 
have reduced the sample time for each thread execution dramatically.

## Method optimizations for each endpoint
(/all-student) getAllStudentsWithCourses() 970 ms → 374 ms (>50%)
(/highest-gpa) findStudentWithHighestGpa() 120 ms →  70 ms (>40%)
(/all-student-name) joinStudentNames() 126 ms → 96 ms (>20%)
