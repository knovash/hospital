package root.human.doctor;

import root.human.doctor.function.IRescue;
import root.human.property.Address;
import root.human.property.Phone;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Emergency extends Doctor implements IRescue {

    private static int countEmergency;

    private String aid;

    public Emergency(LocalDate dateOfBirth, String name, Address address, Phone phone, String specialty, BigDecimal price) {
        super(dateOfBirth, name, address, phone, specialty, price);
        countEmergency++;
    }

    public void think() {
        System.out.println("thinks");
    }

    public void doFirstAid() {
        System.out.println("Emergency do first aid " + this.aid);
    }

    public String makeDiagnosis() {
        System.out.println(this.getSpecialty() + " " + super.getName() + " make diagnosis");
        return "diagnosis";
    }

    @Override
    public void makePrescription() {
        System.out.println(this.getSpecialty() + " " + super.getName() + " make prescription");
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public static int getCountEmergency() {
        return countEmergency;
    }

    public static void setCountEmergency(int countEmergency) {
        Emergency.countEmergency = countEmergency;
    }

    @Override
    public void makeFirstAid() {

    }
}