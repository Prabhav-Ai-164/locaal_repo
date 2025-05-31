
class prg 
{ 
    void enter (int a , int b , int c ,int d )
{
    int e = a > b ? a : b ; 
    int f = c > e ? c : e ;
    int g = d > f ? d : f ;
    System.out.println("the greater number in this four number is  "+ g ); 
}
}  