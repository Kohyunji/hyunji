--sal 컬럼을 기준으로 오름차순 - 작은 것 부터 큰 것 순서로
select * from emp
order by sal;

-- sal 컬럼 기준으로 내림차순 - 큰 것부터
select * from emp
order by sal desc;

-- 가장 먼저 입사한 순서로 출력
select * from emp
order by hiredate asc;

select * from emp
order by ename desc;


select * from emp
order by deptno asc, sal desc;

select distinct deptno from emp;

-- deptno asc, sal desc; 이 상황에서 연봉이 같으면 사원번호 내림차순 정렬

select * from emp
order by deptno asc, sal desc, empno desc;


select *
from emp
where deptno = 30
order by sal;

--sal이 1600인 사람만 출력
select * from emp where sal = 1600

--초과
select * from emp where sal > 1600;

--이하
select *from emp where sal <= 1600;   --=이 오른쪽

-- 부정
select * from emp where deptno !=30;
select * from emp where deptno; 

select * from emp where deptno = 30 and job = 'SALESMAN';

--OR
/*
    emp 테이블에서 부서번호deptno가 30 이거나(또는) job이 CLERK인 사원의
    모든 정보를 출력하라
*/
select *
from emp
where
   deptno = 30 or job = 'CLERK';


/*
    job이 CLERK이고 sal이 2000초과 이거나 depno가 10인 사원 조회
*/
select * from emp
where job = 'CLERK' or sal > 1000 and deptno = 10;

-- 부서 10번을 사원번호 내림차순desc으로 정렬하여 출력
select * from emp where deptno = 10;
order by empno desc;
-- 부서 20번을 사원번호 오름차순으로 정렬하여 출력
select * from emp where deptno = 20
order by empno asc;

-- substr
select job, substr(job,1,2), substr(job,3,2), substr(job,5) from emp;
--사원 이름을 두번째 부터 3글자만 출력
select substr(ename, 2, 30) from emp;
-- 이름의 마지막 3글자만 출력하기
 

SELECT '010-1234-5678' AS REPLACE_BEFORE,
REPLACE('010-1234-5678', '-', ' ') AS REPLACE_1,
REPLACE('010-1234-5678', '-') AS REPLACE_2
FROM DUAL;

select lpad(ename, 5, '+') from emp;
--lpad
--넘어가면 자르고
--모자르면 채우고

-- 문제1
-- ename에 앞에 두글자만 출력
SELECT ename, SUBSTR(ename, 1, 2),
rpad(ename, 2) from emp;

-- 문제2
-- 앞에 두글자만 원본은 출력하고 나머지는 4개의 *로 표시


SELECT '  ab c   ', trim('  ab c   ') from dual;

-- round
select
     round(14.46, 0)-- 하나만 입력하면 소수점 첫째자리 반올림
     round(14.46, 1), -- 소수점 두번쨰 자리부터 1
     round(14.46, -1) -- 음수일 때 정수로 거슬러 올라간다
from dual;

select
     trunc(14.46),
trunc(14.46, 1),
trunc(14.46, -1),
trunc(-14.46)
from dual;

select
    ceil(3.14),
    floor(3.14),
    ceil(-3.14),
    floor(-3.14),
    trunc(-3.14)
from dual;

select 7 / 3 from dual;
select 7 / 0 from dual;

select mod(7, 3) from dual;
select mod(8, 3) from dual;
select mod(9, 3) from dual;
select mod(6, 3) from dual;

select sysdate from dual;

select to_char(sysdate, 'yyyy"년" mm"월" dd"일" hh24"시" mi"분" ss"초"') from dual;
select to_char(hiredate, 'yyyy"년" mm"월" dd"일" hh24"시" mi"분" ss"초"') from emp;

select to_date('2025-05-15', 'yyyy-mm-dd') - to_date('1996-04-01', 'yyyy-mm-dd');

-- 각 사원의 연봉을 출력
-- 월급 * 12 + comm
-- ename, total_pay 출력

select ename,sal*12 + comm, sal*12 + NVL(COMM, 0) AS TOTAL_PAY from emp;

SELECT EMPNO, ENAME, JOB, SAL,
DECODE(JOB,
'MANAGER', SAL*1.1,
'SALESMAN', SAL*1.05,
'ANALYST' , SAL,
SAL*1.03) AS UPSAL
FROM EMP;

SELECT EMPNO, ENAME, JOB, SAL,
CASE JOB
WHEN 'MANAGER' THEN SAL*1.1
WHEN 'SALESMAN' THEN SAL*1.05
WHEN 'ANALYST' THEN 
SAL
ELSE SAL*1.03
END AS UPSAL
FROM EMP;
 
 --nvl 사용하지 않고
 --decode, case로 nvl이랑 동일한 결과 출력하기
 
-- where comm = null
select comm,
case
when comm is null then '해당 없음'
when comm = 0 then '0원'
when comm > 0 then '수당 : ' || comm
end as case
from emp;

select
empno, ename, sal,
trunc(sal / 21.5, 2) day_pay,
round((sal / 21.5) / 8, 1) as time_pay
from emp;

-- Q4
select empno, ename, mgr,
case
when mgr is null then '0000'
when substr(mgr, 1,2) = 75 then '5555' 
when substr(mgr, 1,2) = 76 then '6666'
when substr(mgr, 1,2) = 77 then '7777' 
when substr(mgr, 1,2) = 78 then '8888'
else to_char(mgr)
end
from emp;

select
sum(sal)
from emp;

select sum(comm) from emp;

select count(*), sum(sal)
from emp;

select count(sal), count(comm) from emp;

select max(sal), min(sal), min(hiredate), min(comm) from emp;

--이름에 a가 들어가는 사람은 몇 명?
select * from emp
where ename like '%A%';

select avg(sal) from emp;

--다중행 함수(집계 함수)는 where에서 사용할 수 없다
--select *
--from emp
--where sal > avg(sal);

select deptno, sum(sal), count(*)
from emp
group by deptno;

select job
from emp
where deptno = 10
group by job
order by job desc;

select job, deptno, avg(sal)
from emp
group by deptno, job
having avg(sal) > 2000;

select job, count(*) as cnt 
from emp
where sal > 1000-- and cnt >= 3 -- and count (*) >= 3
group by job
having count(*) >= 3
order by cnt desc;





