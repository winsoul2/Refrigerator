package ClassIceBox;

import java.time.LocalDate;

public class ChilledFood extends ClassFood{



    public ChilledFood(String name, String type, String amount, String unitName, String exp, String pic, String slot, String select) {
        super(name, type, amount, unitName, exp, pic, slot, select);
    }

    public ChilledFood(String name, String type, String amount, String unitName, String exp, String pic, String slot, String select, String first) {
        super(name, type, amount, unitName, exp, pic, slot, select, first);
    }

    public ChilledFood(String Name, String Type, String Amount, String unitName, String Time, String Exp) {
        super(Name, Type, Amount, unitName, Time, Exp);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getAmount() {
        return super.getAmount();
    }

    @Override
    public String getExp() {
        return super.getExp();
    }

    @Override
    public String getFirst() {
        return super.getFirst();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getPic() {
        return super.getPic();
    }

    @Override
    public String getSelect() {
        return super.getSelect();
    }

    @Override
    public String getSlot() {
        return super.getSlot();
    }

    @Override
    public String getTime() {
        return super.getTime();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public String getUnitName() {
        return super.getUnitName();
    }

}
