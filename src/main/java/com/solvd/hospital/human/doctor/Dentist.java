package com.solvd.hospital.human.doctor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.hospital.exception.InvalidNameException;
import com.solvd.hospital.human.doctor.function.ITooth;

import java.math.BigDecimal;

public class Dentist extends Doctor implements ITooth {

    private static final Logger LOGGER = LogManager.getLogger(Dentist.class);

    private static int countDentist;

    private String tooth;

    public Dentist(String name, String specialty, Spec spec, BigDecimal price) throws InvalidNameException {
        super(name, specialty, spec, price);
        countDentist++;
    }

    public void think() {
        LOGGER.info("thinks");
    }

    public String makeDiagnosis() {
        LOGGER.info(this.getSpecialty() + " " + super.getName() + " make diagnosis");
        return "diagnosis";
    }

    @Override
    public void makePrescription() {
        LOGGER.info(this.getSpecialty() + " " + super.getName() + " make prescription");
    }

    public String getTooth() {
        return tooth;
    }

    public void setTooth(String tooth) {
        this.tooth = tooth;
    }

    public static int getCountDentist() {
        return countDentist;
    }

    public static void setCountDentist(int countDentist) {
        Dentist.countDentist = countDentist;
    }

    @Override
    public void makeDentalFilling() {
        LOGGER.info(this.getSpecialty() + " " + super.getName() + " make dental filling");
    }

    @Override
    public void makePullOutTooth() {
        LOGGER.info(this.getSpecialty() + " " + super.getName() + " make pull out tooth");
    }
}