class PalindromeExample{  
 public static void main(String args[]){  
  int r,sum=0,temp;   

  int n=323;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println(n+" is a palindrome number ");    
  else    
   System.out.println(n+" is not a palindrome");    
}  
}  
