public class test {
    public class Prog1{

        public  void main(String[] args){

            int n = 10;

            System.out.println("第"+n+"个月兔子总数为"+fun(n));

        }

        private  int fun(int n){

            if(n==1 || n==2)

                return 1;

            else

                return fun(n-1)+fun(n-2);

        }

    }

}
