public class Employee {
    String name ;
    double salary ;
    int workHours ;
    int hireYear ;
    Employee(String name, double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    public double tax(){
        if (this.salary >= 1000){
           double a =  (this.salary*(3.0/100));
            return a;
        }
        return 0 ;
    }
    public double bonus(){
        if (this.workHours>=40){
             int bon=(this.workHours-40)*30;
             return bon;
        }
        return 0;
    }
    public double raiseSalary(){
        double a;
        if ((2021-this.hireYear)<10){
            a=(this.salary*(5.0/100));
         return a;
        } else if ((2021-this.hireYear)<20&&(2021-this.hireYear>9)) {
            a=(this.salary*(10.0/100));
            return a;
        } else  {
            a=(this.salary*(15.0/100));
            return a;

        }}
        public String toString(){


            return "Adı :" +this.name+"\n"+"Maaşı : "+this.salary+"\n"+"Çalışma Saati : "+this.workHours+"\n"+"Başlangıç Yılı : "+this.hireYear+"\n"+"Vergi : "+this.tax()+"\n"+
                    "Bonus : "+this.bonus()+"\n"+"Maaş Artışı : "+this.raiseSalary()+"\n"+"Vergi ve Bonuslar ile birlikte maaş : "+((this.salary+this.bonus())-this.tax())+"\n"+
                    "Toplam Maaş : "+(((this.salary+this.bonus())-this.tax())+this.raiseSalary());
        }
}
