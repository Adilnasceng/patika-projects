public class Fighter {
    String name;
    int health;
    int damage;
    int weight;
    int dodge;
    int lucky =50 ;
    Fighter (String name,int health,int damage,int weight,int dodge){
        this.name =name;
        this.health=health;
        this.damage=damage;
        this.weight=weight;
        this.dodge=dodge;
    }
   public int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " hasar vurdu.");

        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }

        if (foe.health - this.damage < 0)
            return 0;

        return foe.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }
    public boolean first(){
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= lucky;

    }
}


