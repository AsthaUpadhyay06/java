


class parent{
    void sum(int a){
        System.out.println(a);
    }
    void sum(int a,int b){
        System.out.println(a*b);
    }
    void sum(int a,int b,int c){
        System.out.println(a*b*c);
    }
}

class methodoverloading {
    public static void main(String[] args) {
        parent obj=new parent();
        obj.sum(34);
        obj.sum(12,3);
        obj.sum(12,4,5);
    }
}
