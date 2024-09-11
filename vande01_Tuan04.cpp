#include <iostream>
using namespace std;

struct Node 
{
    float heso;
    int somu;
    Node * next;
}; typedef struct Node* node;

struct List
{
    Node *first, *last;
};

void init(List &L);
node createNode (float heso, int somu);
void AddLast (List&L, node new_ele);
node InsertLast(List& L, float heso, int somu);
void NhapDaThuc(List& L);
void XuatDanhSach(List L);
void CongDaThuc(List d1, List d2, List&d3);
void InterchangeSort ( List& L);


int main (){
    List d1, d2, d3;
    init(d1);
    init(d2);
    init(d3);
    NhapDaThuc(d1);
    printf("\nDanh sach bieu dien da thuc d1: ");
    XuatDanhSach(d1);
    NhapDaThuc(d2);
    printf("\nDanh sach bieu dien da thuc d2: ");
    XuatDanhSach(d2);
    CongDaThuc(d1, d2, d3);
    printf("\nDanh sach bieu dien đa thuc tong: ");
    InterchangeSort(d3);
    XuatDanhSach(d3);
}
void init(List &L)
{
    L.first = L.last = NULL;
}
node createNode (float heso, int somu)
{
    node p = new Node;
    if (p == NULL)
        return NULL;
    p->heso = heso;
    p->somu = somu;
    p->next = NULL;
    return p;
}
void AddLast (List&L, node new_ele)
{
    if(L.first == NULL) //danh sách rỗng
    {
        L.first = L.last = new_ele;
    }
    else
    {
        L.last->next= new_ele;
        L.last = new_ele;
    }
}
node InsertLast(List& L, float heso, int somu)
{
    node e = createNode(heso,somu);
    if(L.first == NULL)
    {
        L.first = e;
        L.last = e;
    }
    else
    {
        AddLast(L,e);
    }
}
void NhapDaThuc(List& L)
{
    float heSo;
    int soMu;
    printf("\nBat dau nhap da thuc (nhap he so 0 de ket thuc): \n");
    do
    {
        printf("\nNhap he so: ");
        scanf("%f", &heSo);
        if (heSo == 0)
        break;
        printf("\nNhap so mu:");
        scanf("%d", &soMu);
        InsertLast(L, heSo, soMu);
    } while (heSo != 0);
    printf("\nDa nhap da thuc xong: \n");
}
void XuatDanhSach(List L)
{
    Node *p;
    p = L.first;
    printf("\n");
    while (p!= NULL)
    {
        if(p->heso > 0)
            printf("+ %.0f*x^%d ", p->heso, p->somu);
        else
            printf("- %.0f*x^%d ", (-1.0)*p->heso, p->somu);
        p = p->next;
    }
}
void CongDaThuc(List d1, List d2, List&d3)
{
    init(d3);
    node p = d1.first, q = d2.first;
    float tongHeSo;
    while(p&&q)
    {
        if(p->somu == q->somu)
        {
            tongHeSo = p->heso + q->heso;
            if(tongHeSo != 0)
            InsertLast(d3, tongHeSo, p->somu);
            p = p->next;
            q = q->next;
        }
        else
        {
            if(p->somu > q->somu)
            {
                InsertLast(d3, p->heso, p->somu);
                p = p->next;
            }
            else
            {
                if(p->somu < q->somu)
                {
                    InsertLast(d3, q->heso, q->somu);
                    q = q->next;
                }
            }
        }
    }
    while(q)
    {
        InsertLast(d3, q->heso, q->somu);
        q = q->next;
    }
    while(p)
    {
        InsertLast(d3, p->heso, p->somu);
        p = p->next;
    }
}

void swapfloat(float & a, float &b){
    float temp = a;
    a = b;
    b= temp;
}
void swapint(int & a, int &b){
    int temp = a;
    a = b;
    b= temp;
}
void InterchangeSort ( List& L)
{
    for ( node p = L.first ; p != L.last ; p=p->next )
        for ( node q =p->next; q!=NULL ; q=q->next)
            if ( p->somu< q->somu )
            {
                swapfloat(p->heso, q->heso);
                swapint(p->somu , q->somu );
            }
} 
