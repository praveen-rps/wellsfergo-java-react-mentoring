load data
infile 'd:\\emp.txt'
append into table emp
fields terminated by ","
(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
