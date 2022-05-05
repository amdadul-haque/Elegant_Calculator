public class branch_b1{
  String name;
  float cgpa;
  double income;

  branch_b1(String s, float c,double i){
  this.name = s;
  this.cgpa = c;
  this.income = i;
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

  public double getIncome(){
    return income;
  }
  public void setIncome(double income){
    this.income = income;
  }
}

