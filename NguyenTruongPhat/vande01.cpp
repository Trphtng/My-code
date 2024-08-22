#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

void NhapMang(int a[], int n)
{
	for(int i=0; i<n; i++){
		printf("a[%d]=", i);
		scanf("%d", &a[i]);
	}
}
void PhatSinhMang(int a[], int n){
	srand(time(NULL));
	for(int i=0; i<n; i++){
		a[i] = rand();
	}
}
void XuatMang(int a[], int n){
	printf("\n");
	for(int i=0; i<n; i++){
		printf("%10d", a[i]);
	}
}

int GhiMangVaoFileText(char* filename, int a[], int n){
	FILE* f = fopen(filename, "w");
	if(!f)
		return 0;
	for(int i=0; i<n; i++)
		fprintf(f ,"%d\n",a[i]);
	fclose(f);
	return 1;
}

int DocFileTextVaoMang(char* filename, int a[], int&n){
	FILE* f = fopen(filename, "r");
	if(!f)
		return 0;
	int i=0;
	while(!feof(f)){
		fscanf(f,"%d",&a[i]); 
		i++;
	}
	n = i-1;
}
int main (){
	int n;
	scanf("%d",&n);
	int a[n];
	//PhatSinhMang(a,n);
	DocFileTextVaoMang("test_vd1.txt",a,n);
	XuatMang(a,n);
}
