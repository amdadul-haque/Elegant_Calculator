public class branch_b1{
  String name;
  float cgpa;

  int number_of_classes;

  branch_b1(String s, float c,int n){
  this.name = s;
  this.cgpa = c;
  this.number_of_classes = n;
  }

  public float getCgpa(){
    return cgpa;
  }
  public void setCgpa(float cgpa){
    this.cgpa = cgpa;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public int getNumber_of_classes(){
    return number_of_classes;
  }
  public void setNumber_of_classes(int number_of_classes){
    this.number_of_classes = number_of_classes;
  }
}

