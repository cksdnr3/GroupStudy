package SeventhHomeWork;
class multiNum{
    int num;
    int num2;
    int num3;
    int num4;

    public void setNum(int num) {
        for(int i=num;i< 21;i++){
           if(i % 2 ==0) {
               System.out.println("값 출력 :" + i);
           }

        }
        this.num = num;
    }

    public void setNum2(int num2) {
        for(int i=num2;i< 21;i++){
            if(i %2 ==0 && i %3 ==0){
                System.out.println("2 와 3의 배수 : "+ i);
            }
        }
        this.num2 = num2;
    }


    public void setNum3(int num3) {
        for(int i=num3;i<34;i++){
            if(i %2 ==0 || i %3 ==0 ){
            System.out.println("2 또는 3의 배수 : "+i );
            }
        }
        this.num3 = num3;
    }







}


public class HomeWork3 {
    public static void main(String[] args) {
        System.out.printf("3) 1 ~ 20 까지의 숫자중 2 의 배수를 출력하도록 매서드를 만들어보자!\n");
        multiNum mn = new multiNum();
        mn.setNum(1);
    }
}
