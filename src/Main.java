public class Main {
    public static void main(String[] args){
        int moneyAmount=100;
        boolean ok=false;
        Drink drinks[]={new Drink("kapuccino",120),new Drink("latte",140),new Drink("water",20)};

        for(int i=0; i<drinks.length ; i++){
            if(drinks[i].getSum()<=moneyAmount){
                System.out.println("Достаточно средств, чтоб купить "+drinks[i].getName());
                ok=true;
            }
        }
        if(!ok){
            System.out.println(" Не хватает денег!!");
        }

        MyDate.mainn();
    }
}

