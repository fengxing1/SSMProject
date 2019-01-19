package dao;

import com.soecode.lyf.BaseTest;
import com.soecode.lyf.dao.AppointmentDao;
import com.soecode.lyf.entity.Appointment;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AppointmentDaoTest extends BaseTest {

    @Autowired
    private AppointmentDao appointmentDao;

    @Test
    public void  testInsertAppointment () throws Exception{
        long bookId = 1000;
        long studentId = 123456789L;
        int inset = appointmentDao.insertAppointment(bookId,studentId);
        System.out.println("intert="+inset);
    }

    @Test
    public void testQueryByKeyWithBook() throws Exception {
        long bookId = 1000;
        long studentId = 123456789L;
        Appointment appointment = appointmentDao.queryByKeyWithBook(bookId,studentId);
        System.out.println(appointment);
        System.out.println(appointment.getBook());

    }


}
