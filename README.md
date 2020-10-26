# MemoryManagement
In order to analyze heap space
install VisualVM, Memory Analyzer (https://www.eclipse.org/mat/downloads.php)

1.run VisualVm -> install Visual GC plugin(Tools -> Available Plugins)
2.Running app run VisualVm in monitor tab press Heap Dump, then copy path to the dump
run memory analyzer and open dump (file->open Heap Dump). There you may see the used heap. 
  
  -Xmx -set the maximum heap size(-Xmx512m)
  -Xms -set the starting heap size 
  -XX:MaxPermSize -set the size of the permgen up to Java 8 (-XX:MaxPermSize=256M)
  
  -Xmn -set the size of the young generation but it should be 1/3 of whole heap(-Xmn256m, -Xmx768m)
  
  -XX:HeapDumpOnOutOfMemory -creates a heap dump file. Very useful in order analyze it at Memory Analyzer application.
   
Types of GC: https://docs.oracle.com/javase/8/docs/technotes/guides/vm/gctuning/collectors.html

Types of collector:

1.Serial - One threaded collector for the small amount of data.
-XX:+UseSerialGC

2.Parallel 
-XX:+UseParallelGC

3.Mostly Concurrent 
-XX:+UseConcMarkSweepGC
-XX:+UseG1GC

Use java -XX:+PrintCommandLineFlags to find out which is- your by default.

In order to simulate and perform lots of requests to the end point we may use Apache JMeter
1.right click on TestPlan-> Add-> Threads(Users)->Thread Group
inorder to make it concurrently we need set Number of Thread 200, Loop Count ->Forever.  

2.right click on ThreadGoup -> Add -> Config Element-> HTTP Cookie Manger(avoiding creation of additional sessions )

3.right click on ThreadGoup -> Add -> Sampler -> HTTP Request
Configure HTTP request : request Method: POST
Path: url path http://localhost:8080/mywebapp/myapp.html
in parameters section add parameters names and values

4.Add listener right click on TestPlan-> Add-> Listener->View Results in Table

Additional information we may look at youtube for Matt Greencroft  -> Hunting for memory leaks - part 7 of Java Memory Management 
   
Made by Ivan Myrotiuk
