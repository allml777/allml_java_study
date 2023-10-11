package com.allml.D129.frame;

import com.allml.D129.bean.Appointment;
import com.allml.D129.bean.Department;
import com.allml.D129.bean.Doctor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class HospitalManager {
    //存所有的科室信息
    private ArrayList<Department> allDepartments = new ArrayList<>();

    private ArrayList<Appointment> appointments = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("====欢迎进入仁爱医院信息管理系统====");
            System.out.println("1、科室管理-添加科室");
            System.out.println("2、科室管理-删除科室");
            System.out.println("3、科室管理-修改科室");
            System.out.println("4、医生管理-录入医生");
            System.out.println("5、医生管理-医生坐诊设置(可设置当天和未来6天的坐诊情况)");
            System.out.println("6、医生管理-展示全部医生的坐诊详情(当前和未来6天的坐诊详情)");
            System.out.println("7、医生管理-挂号预约");
            System.out.println("8、搜索某个医生当前和未来6天内的病人预约详情(展示每天预约病人的具体信息)");
            System.out.println("请输入操作命令:");
            Scanner sc = new Scanner(System.in);

            switch (sc.next()) {
                case "1":
                    addDepartment();
                    break;
                case "3":
                    addDoctor();
                    break;
                case "5":
                    setDoctorJob();
                    break;
                case "6":
                    showAllDoctorInfos();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + sc.next());
            }
        }
    }

    private void setDoctorJob() {

    }

    private void showAllDoctorInfos() {

    }

    public void addDepartment() {
        System.out.println("==========添加科室==========");
        //标签语法，标签名大小写都行
        OUT:
        while (true) {
            System.out.println("请输入科室名称");
            String name = sc.next();
            //判断科室是否已经存在
            for (Department e : allDepartments) {
                if (name.equals(e.getName())) {
                    //回到标签初始位置
                    continue OUT;
                }
            }
            Department department = new Department();
            department.setName(name);
            allDepartments.add(department);
            System.out.println("添加科室成功");
            break;
        }
    }

    private Department getDepartmentByUser() {
        if (allDepartments.size() == 0) {
            return null;
        }
        while (true){
            System.out.println("请选择科室");
            for (int i = 0; i < allDepartments.size(); i++) {
                Department department = allDepartments.get(i);
                System.out.println((i + 1) + "," + department.getName());
            }
            System.out.println("请输入");

            int command = sc.nextInt();
            if (command < 11 || command > allDepartments.size()) {
                System.out.println("选择有误");
                continue;
            }
            Department department = allDepartments.get(command - 1);
            return department;
        }
    }


    public void addDoctor() {
        System.out.println("==========添加医生==========");

        while (true) {
            System.out.println("请选择科室");
//            for (int i = 0; i < allDepartments.size(); i++) {
//                Department department = allDepartments.get(i);
//                System.out.println((i + 1) + "," + department.getNumber());
//            }
//            System.out.println("请输入");
//            int command = sc.nextInt();
//            if (command < 1 || command > allDepartments.size()) {
//                System.out.println("输入有误");
//                continue;
//            }
//            Department department = allDepartments.get(command - 1);

            Department department = getDepartmentByUser();
            Doctor doctor = new Doctor();
            doctor.setDepartmentName(department.getName());

            doctor.setDoctorId(UUID.randomUUID().toString());

            System.out.println("请输入医生姓名");
            String name = sc.next();
            doctor.setName(name);

            System.out.println("请输入医生性别");
            String sex = sc.next();
            doctor.setGender(sex);

            System.out.println("请输入医生年龄");
            int age = sc.nextInt();
            doctor.setAge(age);

            System.out.println("请输入医生特长");
            String specialty = sc.next();
            doctor.setName(specialty);

            System.out.println("请输入医生入职日期yyyy-MM-dd");
            String joinDateString = sc.next();
            LocalDate joinDate = LocalDate.parse(joinDateString);
            doctor.setJoinDate(joinDate);

            department.getDoctors().add(doctor);
            System.out.println("录入医生到该科室成功");
            break;
        }
    }
}
