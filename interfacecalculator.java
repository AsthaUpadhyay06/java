

interface bank{
    float rateofinterest();

}
class SBI implements bank{
    public float rateofinterest(){
        return 234.5f;
    }
}
class HDFC implements bank{
    public float rateofinterest(){
        return 2564.54f;
    }
}
class ICICI implements bank{
    public float rateofinterest(){
        return 23456.555f;
    }
}

public class interfacecalculator {
    public static void main(String[] args) {
       bank b1=new SBI();
       bank b2=new HDFC();
       bank b3=new ICICI();
       System.out.println("SBI rate " + b1.rateofinterest() );
       System.out.println("HDFC rate " + b2.rateofinterest() );

       System.out.println("ICICI rate " + b3.rateofinterest() );


    }
}
