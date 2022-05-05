public class master_class{
  String name;
  float cgpa;

  master_class(String s, float c){
  this.name = s;
  this.cgpa = c;
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

}

