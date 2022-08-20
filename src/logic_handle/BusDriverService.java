package logic_handle;

import entity.Assignments;
import entity.BusDriver;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusDriverService {

    static List<BusDriver> busDriverList = new ArrayList<>();


    public static void inputNewBusDriver() {
        System.out.println();
       // int numberOfDrivers = Integer.parseInt(JOptionPane.showInputDialog("Mời nhập số lượng tài xế mới: "));
        System.out.println("Mời nhập số lượng tài xế mới: ");
        int numberOfDrivers = new Scanner(System.in).nextInt();
        for (int i = 0; i < numberOfDrivers; i++) {
            System.out.println("Mời nhập tên tài xế: ");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Mời nhập địa chỉ: ");
            String address = new Scanner(System.in).nextLine();
            System.out.println("Mời nhập số điện thoại: ");
            String phone = new Scanner(System.in).nextLine();
            BusDriver busDriver = new BusDriver(name, address, phone);
            busDriver.inputDrivingSkill();
            busDriverList.add(busDriver);
            Assignments assignments = new Assignments(busDriver); //tạo liên kết dữ liệu
            AssignmentsService.assignmentsList.add(assignments);

        }
    }

    public static void showBusDriver() {
        //for (BusDriver i : busDriverList) {
        //    System.out.println(i.toString()); // object.toString() biến dữ liệu của object thành một chuỗi
        busDriverList.forEach(busDriver -> System.out.println(busDriver.toString()));
        }
    //}
}
