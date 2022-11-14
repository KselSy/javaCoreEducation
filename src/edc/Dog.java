package edc;

public class Dog extends Animal{
        String poroda;

        public Dog(int age, String name, String poroda) {
                super(age, name);
                this.poroda = poroda;
        }

        public String getPoroda() {
                return poroda;
        }

        public void setPoroda(String poroda) {
                this.poroda = poroda;
        }
        public void bork(){
                System.out.println("Dog borking");
        }

        @Override
        public String toString() {
                return "Age = " + age + ", name is " + name + ", poroda is " + poroda;
        }
}
