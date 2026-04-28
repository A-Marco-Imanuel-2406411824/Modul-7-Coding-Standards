## Profiling results:
- /all-student-name
(GUI)
![img.png](profiling-img/all-student-name/img.png)
![img_1.png](profiling-img/all-student-name/img_1.png)
![img_2.png](profiling-img/all-student-name/img_2.png)
![img_3.png](profiling-img/all-student-name/img_3.png)
(CLI)
![cli.png](profiling-img/all-student-name/cli.png)

- /highest-gpa
(GUI)
![img.png](profiling-img/highest-gpa/img.png)
![img_1.png](profiling-img/highest-gpa/img_1.png)
![img_2.png](profiling-img/highest-gpa/img_2.png)
![img_3.png](profiling-img/highest-gpa/img_3.png)
(CLI)
![cli.png](profiling-img/highest-gpa/cli.png)

## Method optimizations for each endpoint
(/all-student) getAllStudentsWithCourses() 970 ms → 374 ms (>50%)
(/highest-gpa) findStudentWithHighestGpa() 120 ms →  70 ms (>40%)
(/all-student-name) joinStudentNames() 126 ms → 96 ms (>20%)
