package practice;

interface Aa {
    void good();

    boolean even(int n);


    class PracticeInterface {
        public void good(int num) {
            boolean result = even(num);
            System.out.println(result);
        }

        public boolean even(int num) {
            if (num % 2 == 0) {
                return true;
            }

            return false;
        }

        public static void main(String[] args) {
            PracticeInterface obj = new PracticeInterface();
            obj.good(500);
        }

    }
}