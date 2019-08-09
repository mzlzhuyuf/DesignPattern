package com.zyf.practice.designpattern.mvcpattern;

/**
 * @author Hero
 * @description com.zyf.practice.designpattern.mvcpattern
 * @date 2019/8/8
 * 步骤 2
 * 创建视图
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
