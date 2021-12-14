public class ATM {

    public int countBanknotes(int sum){
        int i=0;
        while (sum>=500){
            sum=sum-500; i++;
        }
        while (sum>=200){
            sum=sum-200; i++;
        }
        while (sum>=100){
            sum=sum-100; i++;
        }
        while (sum>=50){
            sum=sum-50; i++;
        }
        while (sum>=20){
            sum=sum-20; i++;
        }
        while (sum>=10){
            sum=sum-10; i++;
        }
        while (sum>=5){
            sum=sum-5; i++;
        }
        while (sum>=2){
            sum=sum-2; i++;
        }
        while (sum>=1){
            sum=sum-1; i++;
        } return i;
    }

    public static void main(String[] args) {
        
    }

}
