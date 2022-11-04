
package javaprojects;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info {
  int AuthorId();

  String Date();

  String Time();

  double Version();
}

@info(AuthorId = 1002, Date = "02-feb-2023", Time = "5:30", Version = 0.8)
class Developer {
  int size;

  String Date;

  String Time;

  double Version;

public Developer(int size, String date, String time, double version) {

this.size = size;
this.Date = date;
this.Time = time;
this.Version = version; 
  }

}
