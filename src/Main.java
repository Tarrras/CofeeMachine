public class Main {
    public static void main(String[] args){
        int moneyAmount=100;
        boolean ok=false;
        Cofee drinks[]={new Cofee("kapuccino",120),new Cofee("latte",140),new Cofee("water",20)};

        for(int i=0; i<drinks.length ; i++){
            if(drinks[i].getSum()<=moneyAmount){
                System.out.println("Достаточно средств, чтоб купить "+drinks[i].getName());
                ok=true;
            }
        }
        if(!ok){
            System.out.println(" Не хватает денег!");
        }

        MyDate.mainn();
    }
}

