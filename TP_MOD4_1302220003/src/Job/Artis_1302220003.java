package Job;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Artis_1302220003 {
   private String name;
   private LocalDate birthdate;
   private int age;

   public Artis_1302220003(String name, String birthdate) {
      this.name = name;
      this.birthdate = LocalDate.parse(birthdate);
      this.age = this.calculateAge(this.birthdate);
   }
   
   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getBirthdate() {
      return this.birthdate.format(DateTimeFormatter.ofPattern("D MMMM YYYY"));
   }

   public void setBirthdate(String birthdate) {
      this.birthdate = LocalDate.parse(birthdate);
      this.age = this.calculateAge(this.birthdate);
   }

   public int getAge() {
      return this.age;
   }

   public void displayInfo() {
      System.out.println("Artis Name: " + this.name);
      System.out.println("Birthdate: " + this.birthdate);
      System.out.println("Age: " + this.age);
   }

   private int calculateAge(LocalDate birthdate) {
      return LocalDate.now().getYear() - birthdate.getYear();
   }
}
