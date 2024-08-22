#include <stdio.h>
#include <stdlib.h>

void NhapMang(int a[], int n)
{
	for(int i=0; i<n; i++){
		printf("a[%d]=", i);
		scanf("%d", &a[i]);
	}
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
int main(){
	int a[100];
	int n, x;
	printf("Nhap so phan tu cua mang: ");
	scanf("%d", &n);
	NhapMang(a, n);
	printf("Nhap khoa can tim: ");
	scanf("%d", &x);
	int kq = LinearSearch(a, n, x);
	if(kq == -1){
		printf("Khong tim thay !.");
	}
	else
		printf("Tim thay tai vi tri %d", kq);
}
