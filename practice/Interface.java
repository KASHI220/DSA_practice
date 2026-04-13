package practice;

interface A {
    void show();
    void config();
    void jai();


    class Interface implements A {
        public void show() {
            System.out.println("in show");
        }

        public void config() {
            System.out.println("in config");
        }
        public void jai(){
            System.out.println("jai");
        }


        public static void main(String[] args) {
            A t =new Interface();
            t.show();
            t.config();
            t.jai();
        }
    }

}
