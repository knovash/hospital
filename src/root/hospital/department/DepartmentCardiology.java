package root.hospital.department;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import root.human.doctor.Doctor;

import java.math.BigDecimal;
import java.util.List;

public class DepartmentCardiology extends Department {

    private static final Logger LOGGER = LogManager.getLogger(DepartmentCardiology.class);

    public DepartmentCardiology(String name) {
        super(name);
    }

    public void calculateDoctorsPrice() {
        BigDecimal result = new BigDecimal("0");
        List<Doctor> doctors = super.getDoctor();
        for (Doctor doctor : doctors) {
            result = result.add(doctor.getPrice());
            LOGGER.info(doctor.getName() + " " + doctor.getPrice());
        }
        LOGGER.info(this.getName() + " total price: " + result);
    }
}
