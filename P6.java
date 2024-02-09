class vemo{
        public static void main(String[] args){
                int num=15;
                if(num%7==0 && num%3==0)
                        System.out.println(num+" is divisble by 3 and 7");
		else if(num%7!=0 && num%3==0)
                        System.out.println(num+" is divisble by 3");
		else if(num%7==0 && num%3!=0)
                        System.out.println(num+" is divisble 7");
		else
			System.out.println(num+" is not divisble by 3 and  7");
        }
}
