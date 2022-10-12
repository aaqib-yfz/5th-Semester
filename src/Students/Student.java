package Students;

public class Student {

        private int roll;
        private String name;
        private double Cgpa;

        public Student(int r, String n) {
            roll = r;
            name = n;
        }

    public Student() {

    }


    public void setCgpa(double c)  throws Exception /* exception waha py bhejo jaha sy ye call kiya jayega*/
    {
            if (Cgpa >= 0 && Cgpa <= 4)
            Cgpa = c;
            else
                throw new Exception();
        }

        public void  getCgpa() {
            System.out.println( Cgpa) ;
        }

        public void setName(String n) {
            name = n;
        }

        public void getName() {
            System.out.println(name);

        }

        /**
         * @param args
         * @throws Exception
         */
        public static void main(String[] args) throws Exception {
            Student s1 = new Student(10, "aaqib");
            // System.out.println(s1.name);
            // System.out.println(s1.roll);
            s1.setCgpa(3.4);
            s1.getCgpa();
            s1.setName("qazi");
            s1.getName();

        }

    }


