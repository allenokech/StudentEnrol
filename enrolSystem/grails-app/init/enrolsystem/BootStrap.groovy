package com.enrol

class BootStrap {

    def init = { servletContext ->
	
	def Computing=new Course(

	department:'Computing',
	courseCode:'CS123',
	courseTitle:'BSc Hon Computing',
	courseLeader:'Dr Michelle Murphy',
	startDate:new Date('09/09/2019'),
	endDate:new Date('07/07/2023'),
	numberOfStudents:55,
	studyMode:'Fulltime',
	tuitionFees:9000.60,
	description:'Lorem ipsum dolor sit amet, cum sale error tantas ne. Te duo putant detracto. In duo sonet urbanitas, ad vim vide tacimates.').save()
 
    }
    def destroy = {
    }
}
