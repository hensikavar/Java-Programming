// Calculating the simple interest taking priciple amount, rate of interest and time period from user.

#include<stdio.h>

void  main()
{
	float p,r,t,si;
	
	printf("Enter the principle amount :");
	scanf("%f",&p);
	
	printf("Enter the rate of interest :");
	scanf("%f",&r);
	
	printf("Enter the time period(in years) :");
	scanf("%f",&t);
	
	si=(p*r*t)/100;
	
	printf("Simple interest will be %.2f.",si);
	return;
}
