load data
infile "d:\\dept1.txt"
append into table dept
fields terminated by "|"
(deptno,dname,loc)