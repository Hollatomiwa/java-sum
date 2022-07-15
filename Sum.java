class Sum{
    public static void main (String [] args){
        int odd = 0, even = 0, prime = 0;

        for (int i = 1; i <= 100; i++){
            if (i % 2 != 0){
                odd = odd + i;
            }
        }
        for (int i = 101; i <= 200; i++){
            if (i % 2 == 0){
                even = even + i;
            }
        }
        for (int num = 201; num <= 300; num++){
            boolean primeCheck = false;
            for (int i = 2; i < num; i++){
                if (num % i == 0){
                    primeCheck = false;
                    break;
                } else if (num % i != 0){
                    primeCheck = true;
                }

            }
            if(primeCheck){
                prime = prime + num;
            }

        }
        int sum = odd + even + prime;
        System.out.println(sum);
    }
}
