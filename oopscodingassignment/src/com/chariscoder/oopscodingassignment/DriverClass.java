package com.chariscoder.oopscodingassignment;

public class DriverClass {

	public static void main(String[] args) {

		// Create objects for all classes

		AdminDepartment adminDeptObj = new AdminDepartment();
		HrDepartment hrDeptObj = new HrDepartment();
		TechDepartment techDeptObj = new TechDepartment();

		// Admin Department Functionality

		System.out.println(adminDeptObj.departmentName());
		System.out.println(adminDeptObj.getTodaysWork());
		System.out.println(adminDeptObj.getWorkDeadline());
		System.out.println(adminDeptObj.isTodayAHoliday());
		System.out.println();


		// HR Department Functionality

		System.out.println(hrDeptObj.departmentName());
		System.out.println(hrDeptObj.doActivity());
		System.out.println(hrDeptObj.getTodaysWork());
		System.out.println(hrDeptObj.getWorkDeadline());
		System.out.println(hrDeptObj.isTodayAHoliday());
		System.out.println();


		// Tech Department Functionality

		System.out.println(techDeptObj.departmentName());
		System.out.println(techDeptObj.getTodaysWork());
		System.out.println(techDeptObj.getWorkDeadline());
		System.out.println(techDeptObj.getTechStackInformation());
		System.out.println(techDeptObj.isTodayAHoliday());

	}

}
