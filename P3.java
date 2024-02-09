class temo{
        public static void main(String[] args){
                int num =  13;
                if(num%2==0 && num<10)
                        System.out.println(num+" is even number and smaller than 10");
		else if(num%2==0 && num==10)
                        System.out.println(num+" is even number and equal to 10");
		else if(num%2==0 && num>10)
                        System.out.println(num+" is even number and greater than 10");
		else if(num%2!=0 && num<10)
                        System.out.println(num+" is odd number and smaller than 10");
		else if(num%2!=0 && num==10)
                        System.out.println(num+" is odd number and equal to 10");
		else
                        System.out.println(num+" is odd number and greater than 10");
	}
}
