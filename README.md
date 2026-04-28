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
- **(/all-student)** getAllStudentsWithCourses() 970 ms → 374 ms (>50%)
- **(/highest-gpa)** findStudentWithHighestGpa() 120 ms →  70 ms (>40%)
- **(/all-student-name)** joinStudentNames() 126 ms → 96 ms (>20%)

## Write here

1. **What is the difference between the approach of performance testing with JMeter and
   profiling with IntelliJ Profiler in the context of optimizing application performance?**

   JMeter is used to simulate many users and measure how the application behaves under load, so it helps answer questions like how fast the system responds and how much traffic it can handle. IntelliJ Profiler, on the other hand, is used to inspect what happens inside the application while it runs, such as which methods consume the most CPU or memory. In short, JMeter measures the external result of performance, while IntelliJ Profiler helps find the internal cause of performance problems.

2. **How does the profiling process help you in identifying and understanding the weak points
   in your application?**

   Profiling shows where the application spends most of its time and resources. By looking at method calls, CPU usage, memory usage, and call frequency, we can see which parts of the code are inefficient, which methods are called too often, and where expensive operations happen. This makes it easier to locate bottlenecks and understand why an endpoint is slow before making targeted optimizations.

3. **Do you think IntelliJ Profiler is effective in assisting you to analyze and identify
   bottlenecks in your application code?**

   Yes, IntelliJ Profiler is effective for identifying bottlenecks in application code because it provides clear, detailed insights into runtime behavior. It helps pinpoint slow methods, unnecessary repeated work, and inefficient data processing, which makes optimization more focused and data-driven. For this project, it was very useful in improving the performance of the endpoints by showing exactly where changes were needed.
4. **What are the main challenges you face when conducting performance testing and
   profiling, and how do you overcome these challenges?**
   
   Sometimes, the result for each run for the same version might be inconsistent due to the fact that the JIT compiler needs several runs to be as optimal as it can on running the project. I dealt with this issue by running a program i want to profile several times (usually 4 times) first before profiling it. This way, every version of the program i profile will be run most optimally, and the performance comparison between each version will be more accurate.
5. **What are the main benefits you gain from using IntelliJ Profiler for profiling your
   application code?**

   The main benefits are that it helps me quickly find bottlenecks, understand which methods use the most time or memory, and verify whether an optimization really improves performance. It also gives a clear view of how the application behaves internally, so I can make improvements based on data instead of guessing.

6. **How do you handle situations where the results from profiling with IntelliJ Profiler are not
   entirely consistent with findings from performance testing using JMeter?**

   When the results are not fully consistent, I compare both tools carefully and repeat the tests several times to reduce noise from the JIT compiler, warm-up effects, and environment differences. I treat JMeter as a load-testing tool that shows user-facing performance, while IntelliJ Profiler shows internal code behavior, so I use both results together to get a more complete and accurate conclusion.
7. **What strategies do you implement in optimizing application code after analyzing results
   from performance testing and profiling? How do you ensure the changes you make do
   not affect the application's functionality?**

   For the strategies used, see the comments for each method (located in StudentService.java) mentioned in the above section. I ensure none of the changes i make affect the application's functionality by ensuring each change/refactor to the method i make does not change the body of the HTTP response compared to the previous version in Postman. This way I know exactly that the changed/refactored method still outputs the same thing given the same state. 

