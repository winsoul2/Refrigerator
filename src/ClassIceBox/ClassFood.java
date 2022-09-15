package ClassIceBox;


import java.time.LocalDate;

public class ClassFood  {



    private String name;
    private String type;
    private String amount;
    private String unitName;
    private String exp;
    private String pic;
    private String slot;
    private String first;
    private String time;

    // บน หรือ ล่าง (เลือก)
    private String select ;


    public ClassFood(String name, String type, String amount, String unitName, String exp, String pic,String slot,String select) {
        this.name = name;
        this.type = type;
        this.amount = amount; // ปริมาณ
        this.unitName = unitName; // หน่วย
        this.exp = exp;
        this.pic = pic;
        this.slot = slot;
        this.select = select;
        this.first = LocalDate.now().toString();

    }

    public ClassFood(String name, String type, String amount, String unitName, String exp, String pic,String slot,String select,String first) {
        this.name = name;
        this.type = type;
        this.amount = amount; // ปริมาณ
        this.unitName = unitName; // หน่วย
        this.exp = exp;
        this.pic = pic;
        this.slot = slot;
        this.select = select;
        this.first = first;

    }



    public ClassFood (String Name, String Type, String Amount, String unitName, String Time, String Exp){
        this.name = Name;
        this.type = Type;
        this.amount= Amount;
        this.unitName = unitName;
        this.time = Time;
        this.exp = Exp;
    }

    public String getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getAmount() {return amount;}

    public String getUnitName() {
        return unitName;
    }

    public String getExp() {
        return exp;
    }

    public String getPic() {
        return pic;
    }

    public String getSlot() {    return slot;    }

    public String getSelect() {  return select;   }

    public String getFirst() { return first;  }



    public String toString() {
        return name +"," + type + "," + amount + "," + unitName + "," + exp + "," + pic + "," +slot + "," + select + ","+ first;
    }
}



