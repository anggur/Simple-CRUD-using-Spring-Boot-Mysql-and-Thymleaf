Create simple CRUD web application using Spring boot, hibernate, Maven and JQuery. Below is the table structure that you can utilize

for the application. Please put the necessary validations during user inputs, with good validation technique.

 

TABLE test.student (

  id int(10) unsigned NOT NULL AUTO_INCREMENT,

  name varchar(45) NOT NULL,

  address varchar(45) DEFAULT NULL,

  gender char(1) DEFAULT 'M',

  dob datetime DEFAULT NULL,

  email varchar(45) DEFAULT NULL,

  mobile varchar(15) DEFAULT NULL,

  phone varchar(15) DEFAULT NULL,

  PRIMARY KEY (id)

)