# ANTLR4를 사용하여 mini C 문법의 구문 분석기(parser) 생성
## ANTLR4
- ANTLR는 구조화된 문장을 인식하는 구문 분석기를 생성하는 프로그램이며, ANTLR에 의해 생성된 구문 분석기는 LL 파싱을 이용하여 구문 분석한다. LL 파싱은 입력 문자열의 왼쪽부터 구문 분석을 시작하여
좌측 유도 방식으로 동작한다. 또한 ANTLR 실행 시 타겟언어를 설정하여 C#, Java, Python등 다양한 언어로 작성된 구문 분석기를 생성할 수 있다.  

- 문법 파일 작성법
  1. 문법 이름 정의
      - ANTLR를 사용하여 구문 분석기를 생성하기 위하여 가장 먼저 해야할 일은 문법파일인 g4파일을 작성하는 것이다. g4파일은 구문 분석기가 인식할 문장의 문법 규칙들을 정의한다. g4파일의 첫번째 줄은 반드시 문법의 이름으로 시작하여야 하며 문법의 이름과 g4파일의 이름이 동일하여야 한다.
      - miniC.g4파일의 첫번째 문장:

         ```sh
         grammar miniC;
         ```

  2. Parser rule 정의
      - parser와 lexer rule은 정규 표현식을 이용하여 문맥자유문법으로 정의한다.
      - 문법으로 정의된 언어의 기본적인 기호를 terminal symbol이라고 하며, terminal symbol은 추가적인 연산이나 유도가 필요없는 기호이다. 
      - parser rule에 의해 유도된 중간 단계의 기호를 nonterminal symbol이라고 하며, nonterminal symbol은 다른 nonterminal symbol로 유도될 수 있다.
      - 아래와 같은 parser rule이 있을 경우 두 개의 nonterminal symbol인 function_header와 compound_st이 하나의 nonterminal인 function_def으로 유도된다는 뜻이다.
        ```sh
        function_def		: function_header compound_st
        ```
      - 하나의 parser rule의 왼쪽에는 반드시 하나의 nonterminal symbol만이 존재해야 하며, 오른쪽에는 하나 이상의 terminal symbol 또는 nonterminal symbol이 나타날 수 있다. 
        ```sh
        dcl_specifiers  : dcl_specifier
			 	| dcl_specifiers dcl_specifier;
        declarator      : IDENT									
			 	| IDENT '[' opt_number ']';
        
        ```
  3. Lexer rule 정의
      - lexer rule은 반드시 파일의 마지막에 정의해야한다.
      - 의미를 가진 최소한의 단위인 토큰의 타입을 정의해야 하고, 각 토큰의 이름은 반드시 대문자로 정의해야 한다.
      - 왼쪽에 토큰의 이름을 정의하고 콜론과 토큰의 타입을 작성하고 세미콜론으로 문장의 끝을 나타낸다.
        ```sh
        INTEGER: [0-9]+;
        IDENTIFIER: [a-zA-Z_] [a-zA-Z_0-9]*;
        ```
- 문법 테스트(구문 분석기 생성후 테스트)
  1. java org.antlr.v4.Tool을 이용하여 Parser 생성
     ```sh
     java org.antlr.v4.Tool grammar.g4
     ```
  2. javac 명령어를 통해 컴파일
     ```sh
     javac grammar*.java
     ```
  4. java org.antlr.v4.gui.TestRig를 이용하여 생성된 parser의 문법 규칙을 테스트
     ```sh
     java org.antlr.v4.gui.TestRig grammar root -gui
     ```
  5. 구문 분석을 할 input을 입력하면 파스트리가 출력
     ```sh
     int main() {
         int i = 0;
     }
     ```
     ![image](https://user-images.githubusercontent.com/59434021/125972618-fbd25559-e1dc-4447-a16d-28dc3deb9f29.png)

