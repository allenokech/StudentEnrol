package com.enrol

class Lecturer {
	String fullName
	String post
	String subject
	String lecturerEmail
	String office
	String bio

    static constraints = {
	fullName nullable: false, blank:false
	post nullable: false, blank:false
	subject nullable: false, blank:false
	lectureEmail nullable: false, blank:false, email: true
	office nullable: false, blank:false
	bio nullable: false, maxSize: 5000, widget: 'textarea'
    }
}
