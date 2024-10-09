package Prova1;

public class TestaSaida{
    public static void main(String[] args) {
        TestaSaida ts = new TestaSaida();
        ts.faz();


    }
    void faz(){
        int a = 10;
        for (int i = 1; i<8; i++){
            a++;
            if (i>4){
                System.out.println(++a +"");
            }

            if(a>17){
                System.out.println("i = "+ (float)i);
            
            break;
            }


        }
    }
}