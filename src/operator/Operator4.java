package operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;     // (2 * 2) + (3 * 3)
        int sum4 = (2 * 2) + (3 * 3); // sum3와 같다. 연산자의 우선순위가 있기 때문
                                      // 하지만 복잡해지면 괄호를 넣어주어 명확하게 보이게 해주자

        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

        /**
         * 연산자의 우선순위
         * : 하나의 식에서 연산자가 둘 이상 있을 때,
         *   어떤 연산을 먼저 수행할지를 자동 결정하는 것
         *
         * - 수동으로 결정하려면? => 괄호 활용 ( )
         *
         * 우선순위
         * 1. 단항 연산자   ++ -- + - ~ !
         *
         * 2. 산술 연산자   * / %
         *                + -
         *                >> <<
         *
         * 3. 비교 연산자   < > <= >= instanceof
         *                == !=
         *
         * 4. 논리 연산자   &
         *                ^
         *                |
         *                &&
         *                ||
         *
         * 5. 상함 연산자   ?:
         *
         * 6. 대입 연산자   = += -= *= /= %=
         *                <<= >>= &= ^= !=
         *
         */

        /**
         * 실무에서는 우선순위를 외우지 않는다. 헷갈릴경우 검색해서 다시 확인한다.
         * 1. 상식선에서의 우선순위를 사용한다. ex) +보다 *가 우선순위가 높음
         * 2. 복잡해지거나 애매해지면 괄호()를 명시적으로 사용하자.
         */
    }
}
