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

