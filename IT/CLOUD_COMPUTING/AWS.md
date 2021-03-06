# AWS - (Amazon Web Service)

* 목차
  1. 클라우드 컴퓨팅이란?
     * 클라우드 컴퓨팅 정의 및 특징
     * 클라우드 컴퓨팅 유형
     * 클라우드 컴퓨팅의 장단점
     
  2. AWS란?
     * AWS의 개념 및 5대원칙
     * AWS의 입지
     * AWS 제공 서비스 종류
     
  3. AWS 적용기업사례
  
     * 성공 사례
     * 장애 사례
  
  4. AWS 국내 공공부문 확장 가능성
  
     * 국외의 경우
     * 국내에서의 경우와 도입 가능성
  
     
  
* 참고 레퍼런스

  1. [참고](URL)
  2. [참고](URL)
  3. [참고](URL)
  4. [AWS 산업 분포 척도](https://www.c-sharpcorner.com/article/top-10-cloud-service-providers/)



## 1. 클라우드 컴퓨팅이란 ?

### 역사

클라우드 컴퓨팅은 갑자기 생겨난 기술이 아니다. 60년대부터 가상화, 그리드, 병렬 컴퓨팅이라는 다양한 기술 등으로 존재하였고, 이러한 기술들을 2006년 구글의 회장 `에릭 슈미츠`에 의해 처음 `클라우드 컴퓨팅`이라는 단어로 통합하면서 진화하게 되었다. 



### 정의

이전에는 사용자가 IT 리소스(소프트웨어, 하드웨어, 데이터 등)을 직접 보유하고 관리하였다. 만약 1억개의 서버를 증축해야 한다면 이에 대한 기간과 비용은 어마무시할 것이다. 클라우드 컴퓨팅은 이러한 문제를 해결한다.  

클라우드 컴퓨팅은 다양한 IT 자원들을 직접 구매하지 않고 대여받아 자원을 사용한 만큼 비용을 지불한다. 임대의 개념과 비슷하다고 보면 된다. 



### 특징

* 자원 접근성 : 네트워크 연결만 있으면 클라우드 자원들을 언제나 사용 가능하다.
* 사용량 제어 : 자신이 필요로 하는 만큼만의 자원을 대여받을 수 있고 사용하는 자원만큼의 사용료만 지불한다.
* 컴퓨팅 자원의 표준화 : 사용자가 일반적으로 많이 사용하는 OS, 언어, DB를 표준화하여 제공한다. 최근에 클라우드는 LAMP(Linux, Apache, MongoDB, Python)을 주로 지원한다.



### 장점

* 민첩성

  : 클라우드를 통해 광범위한 기술에 쉽게 접근하여 리소스를 더욱 빠르게 구축 및 구동할 수 있다.

* 확장성

  : 필요한 만큼의 리소스를 대여하고, 이후 증축이 필요할 때는 리소스를 추가로 늘릴수 있다.

* 합리적 요금제

  : 서버, DB 등에 필요한 하드웨어/소프트웨어 환경을 직접 구축 하는데에는 인적비용, 물적비용이 많이 발생한다. 클라우드 컴퓨팅을 통해 세부적인 환경을 구축한다면 훨씬 저렴한 비용으로 구축할 수 있다.

* 접근성

  : 전문적인 하드웨어에 대한 지식이 없어도 쉽게 사용이 가능하다.



### 단점

* 보안성 

  : 클라우드 서버의 관리 부실 또는 보안 취약으로 인해 정보가 노출되면 개인 정보가 유출될 수 있다.

* 데이터 보관의 불안함

  : 위와 같은 경우로 데이터가 손실됐을 경우, 미리 백업하지 않은 정보는 되 살리지 못할 수 있다.

* 이식성

  : 국제적 표준 또는 산업 표준 없이 독점적인 서비스로 제공하기 때문에 종속된 솔루션이 구축되어 다른 제공자로 이식이 어렵다.



### 클라우드 컴퓨팅 유형

* IaaS (Infrastructure as a Service)
  * 기존 물리 장비를 미들웨어와 함께 묶어둔 추상화 서비스
  * 가상머신, 스토리지, 네트워크, 운영체제 등 클라우드 IT의 기본 인프라 대여 서비스
  * AWS의 EC2, S3 등이 해당.
* PaaS (Platform as a Service)
  * IaaS를 한 번 더 추상화한 서비스(DB 또는 Application 서버, 보안 서버 등) 많은 기능이 자동화 되어 있다.
  * AWS의 Heroku, Beanstalk 등이 해당 된다.
* SaaS (Software as a Service)
  * 완전한 소프트웨어 솔루션이다.
  * 공급업체가 모든 물리적 및 가상 핵심 인프라, 미들웨어, DB 관리, 개발 툴 등을 제공하고 호스팅 함
  * 구글 드라이브, MyBOX, iCloud 등이 해당된다.



## 2. AWS란

### AWS 개념

> 아마존에서 개발한 클라우드 컴퓨팅 플랫폼이다.  
>
> 네트워킹을 기반으로 가상 컴퓨터와 스토리지, 네트워크 인프라 등 다양한 서비스를 제공한다.



### AWS 5대 원칙

> 5대원칙은 AWS의 가이드를 보고 적었다.



*  보안
  * 클라우드에서 인프라를 보호하는 방법에 중점을 둔다.
  * 보안과 규정 준수는 AWS와 사용자가 공동 책임이 있다. 
* 성능 효율
  * 클라우드 서비스를 효율적이고 확장 가능하도록 실행하는 방법에 중점을 둠.
  * AWS는 모든 규모의 트래픽을 감당할 수 있는 수단을 제공해야 한다.
  * 사용자는 확장을 염두하고 서비스를 선택 및 구성해야 한다.
* 안정성
  * 서비스 및 인프라 중단 시 복원할 수 있는 서비스의 구축 방법에 중점을 둔다.
  * AWS는 복원력이 있는 서비스를 구축하기 위한 수단을 제공해야 한다.
  * 사용자는 안정성을 염두하고 서비스의 구조를 설계해야 한다.
* 운영 우수성
  * 자동화의 측면에서 시스템 운영, 향상된 절차 개발 및 통찰력 확보 역량을 지속적으로 향상 시킨다.
* 비용 최적화
  * 비용을 최소화하는 동시에 비즈니스 결과를 달성할 수 있도록 한다.



