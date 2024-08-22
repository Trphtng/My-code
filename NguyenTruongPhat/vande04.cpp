#include<iostream>
#include<ctime>
#include <stdlib.h>
using namespace std;
int BinarySearch(int a[],int left,int right,int x);
int LinearSearch(int a[], int n, int x);
void PhatSinhMang(int a[], int n);

int main(){ 
	int n = 100000;
	int a[n];
	PhatSinhMang(a,n);
	int x=5;
	clock_t start_L= clock(); BinarySearch(a,0,n-1,x); clock_t end = clock();
	cout<<"Time BinarySearch= "<<(end-start_L)/CLOCKS_PER_SEC<<"(s)"<<endl;
	////////////////////////////
	clock_t start_B= clock(); LinearSearch(a,n,x); clock_t end_dq = clock();
	cout<<"Time LinearSearch= "<<(end_dq-start_B)/CLOCKS_PER_SEC<<"(s)"<<endl;
}
int LinearSearch(int a[], int n, int x)
{
	int i=0;
	while(i<n && a[i]!=x)
		i++;
	if (i<n)
		return i;
	return -1;
}
int BinarySearch(int a[],int left,int right,int x)
{
	if(left>right)
		return-1;
	int mid=(left+right)/2;
	if(x==a[mid])
		return mid;
	if(x<a[mid])
		return BinarySearch(a,left,mid-1,x);
	if(x>a[mid])
		return BinarySearch(a,mid+1,right,x);
}
void PhatSinhMang(int a[], int n){
	srand(time(NULL));
	for(int i=0; i<n; i++){
		a[i] = rand()%50;
	}
}
