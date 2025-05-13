select * from emp;
select * from dept;
select * from salgrade;
select empno, ename, deptno
from emp;
select ename, sal
from emp;
--부서번호로 오름차순, 겹치면 sal 내림차순
select*from emp
order by deptno asc, sal desc; 
