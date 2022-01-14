package cs682.samples;

import cs682.samples.protos.StudentInfo;

/**
 * An example to demonstrate how to create Student and Phone objects defined in
 * protos/studentinfo.proto.
 */
public class StudentRecord {

    public static void main(String[] args) {

        StudentInfo.Phone phone = StudentInfo.Phone.newBuilder()
                .setCountryCode(1)
                .setAreaCode(415)
                .setNumber(4222024)
                .build();

        StudentInfo.Student student = StudentInfo.Student.newBuilder()
                .setFirstName("Juan")
                .setLastName("Brilliant")
                .addScore(95)
                .addScore(83.6)
                .addScore(94)
                .setPhone(phone)
                .build();

        System.out.println(student);
    }
}
