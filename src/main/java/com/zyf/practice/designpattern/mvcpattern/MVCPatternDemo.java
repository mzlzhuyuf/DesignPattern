package com.zyf.practice.designpattern.mvcpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.mvcpattern
 * @date 2019/8/8
 */
public class MVCPatternDemo {
    public static void main(String[] args) {

        //从数据可获取学生记录
        Student model = retriveStudentFromDatabase();

        //创建一个试图：把学生详细信息输出到控制台
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //更新模板数据
        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
